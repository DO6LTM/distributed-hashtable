#!/usr/bin/env python

import socket
import time
import sys
import random
import os

PORT = 5000
SIZE = 5 # Anzahl an Knoten

def raw_api_query(reader, writer, command):
    """
        Dokumentation s. https://netsimlan.org/tutorial/api.html
    """
    writer.write(str(command) + "\n")
    writer.flush()
    line = reader.readline().strip('\n')
    ans = []
    if line == '' or line[0] != "+":
        print("error: " + command + " returned " + str(line))
        raise RuntimeError(str(line))
    if line == '+ list begin':
        while line != '+ list end':
            line = reader.readline().strip('\n')
            if line != '' and line != '+ list end':
                ans.append(line)
    else:
        ans = line.split(' ')[1:]
    return ans

def print_cpu_usage(nodes):
    print("CPU-Auslastung fur " + str(nodes) + " Knoten: " + str(round(float(os.popen('''grep 'cpu ' /proc/stat | awk '{usage=($2+$4)*100/($2+$4+$5)} END {print usage }' ''').readline()),2)) + "%")
    
os.popen("netsimlan project -g off -v off -a 5000 &").readline()

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect(("127.0.0.1", PORT))
    with s.makefile(mode = 'r') as r, s.makefile(mode = 'w') as w:
    
        # Skip Nodes erstellen und ids speichern     
        print_cpu_usage(0);
        ids = []      
        for i in range(SIZE):
            ans = raw_api_query(r, w, "new SkipNode myNode")
            print(ans)
            ids.append(ans[1])
            
            raw_api_query(r, w, "start " + str(ans[1]))
            raw_api_query(r, w, "link " + str(ans[1]) + " " + random.choice(ids)) #zufaellig schwach zusammenhaengenden Graphen erstellen
            print_cpu_usage(ans[1]);

        # close connection
        os.popen("kill $(ps -e | grep netsimlan | awk '{print $1}')")
        os.popen("kill $(ps -e | grep java | awk '{print $1}')")
        raw_api_query(r, w, "exit")
        