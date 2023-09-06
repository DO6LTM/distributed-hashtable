#!/usr/bin/env python3

import socket
import time
import sys
import os

PORT = 5000
SIZE = 20 # Anzahl an Knoten
RECEIVER = 2 # ID of the node, that should receive the message
SENDER = 15 # ID of the node, that sends the message

# netsimlan starten
os.popen("netsimlan project -a 5000 -i 2000 -v off -g off -l run.log")
time.sleep(5)

def raw_api_query(reader, writer, command):
    """
        Dokumentation s. https://netsimlan.org/tutorial/api.html
    """
    writer.write(str(command) + "\n")
    writer.flush()
    line = reader.readline().strip('\n')
    print(line)
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
        for i in range(1, SIZE + 1):
            ans = raw_api_query(r, w, "new SkipNode myNode")
            ids.append(ans[1])
            raw_api_query(r, w, "start " + str(i))
            if (i > 1):
                # Schwach zusammenhängenden Graphen erstellen
                raw_api_query(r, w, "call 1 entry " + str(i))

        # Register the sender to all nodes
        for i in range (1, SIZE + 1):
            raw_api_query(r, w, "call " + str(i) + " setSender " + str(SENDER))

        time.sleep(10)

        benchmark_end = False
        print("### START BENCHMARK ###")
        startTime = time.time()
        
        # Generate messages
        for i in range (5):
            for i in range(1, SIZE + 1):
                if (i != SENDER):
                    raw_api_query(r, w, "call " + str(i) + " insert 42")

        raw_api_query(r, w, "call " + str(SENDER) + " insertQueue 42")

        for i in range(5):
            for i in reversed(range(SIZE + 1, 1)):
                if (i != SENDER):
                    raw_api_query(r, w, "call " + str(i) + " insert 42")

        # get log file path
        absolute_path = os.path.dirname(__file__)
        relative_path = "run.log"
        full_path = os.path.join(absolute_path, relative_path)

        # setup regex
        import re
        regex = re.compile('.*BENCHMARK STOP.*')

        while (time.time() - startTime < 15):
            with open(full_path) as f:
                log_text = f.read()
                if (regex.search(log_text)):
                    endTime = time.time()
                    benchmark_end = True
                    break
            time.sleep(0.01)
        # close connection
        raw_api_query(r, w, "exit")
        os.popen("kill $(ps -e | grep netsimlan | awk '{print $1}')")
        os.popen("kill $(ps -e | grep java | awk '{print $1}')")
if (benchmark_end == True):
    print("TIME: " + str((endTime - startTime)))
else:
    print("Error: TIMEOUT")