#!/usr/bin/env python3

import socket
import time
import sys
import random

PORT = 5000
SIZE = 10 # Anzahl an Knoten

def raw_api_query(reader, writer, command):
    """
        Dokumentation s. https://netsimlan.org/tutorial/api.html
    """
    writer.write(str(command) + "\n")
    writer.flush()
    line = reader.readline().strip('\n')
    ans = []
    if line == '' or line[0] != "+":
        print("error: " + command + " returned " + str(line), file=sys.stderr)
        raise RuntimeError(str(line))
    if line == '+ list begin':
        while line != '+ list end':
            line = reader.readline().strip('\n')
            if line != '' and line != '+ list end':
                ans.append(line)
    else:
        ans = line.split(' ')[1:]
    return ans

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
    s.connect(('127.0.0.1', PORT))
    with s.makefile(mode = 'r') as r, s.makefile(mode = 'w') as w:
    
        # Skip Nodes erstellen und ids speichern     
        ids = []      
        for i in range(SIZE):
            ans = raw_api_query(r, w, "new SkipNode myNode")
            ids.append(ans[1])
            raw_api_query(r, w, "start " + i)
            raw_api_query(r, w, "link " + i + " " + random.choice(ids)) #zufällig schwach zusammenhängenden Graphen erstellen

        # close connection
        raw_api_query(r, w, "exit")