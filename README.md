```

  __    __       __        ________  __    __       ___      ___   _______                       
 /" |  | "\     /""\      /"       )/" |  | "\     |"  \    /"  | /"     "|                      
(:  (__)  :)   /    \    (:   \___/(:  (__)  :)     \   \  //   |(: ______)                      
 \/      \/   /' /\  \    \___  \   \/      \/      /\\  \/.    | \/    |                        
 //  __  \\  //  __'  \    __/  \\  //  __  \\     |: \.        | // ___)_                       
(:  (  )  :)/   /  \\  \  /" \   :)(:  (  )  :)    |.  \    /:  |(:      "|                      
 \__|  |__/(___/    \___)(_______/  \__|  |__/     |___|\__/|___| \_______)                      
                                                                                                 
```

# Verteilte Hashtabelle für Netsimlan
Selbststabilisierende Hashtabelle (bestehend aus konsistentem Hashing auf dem Skip+-Graphen) mit combine&amp;split und den Operationen Join, einfaches Leave, Insert, Delete und Search

# ⚒️ Tools
## NetSimLan Script Watcher
Der NetSimLan Script Watcher ist ein PowerShell Skript, welches zum **automatischen Neustarten** von NetSimLan genutzt werden kann, sobald ein definiertes Skript gespeichert wird. 

Ggf. muss zum Ausführen des Skripts vorher die **Execution Policy** von PowerShell angepasst werden. (Auf eigene Gefahr)
```PowerShell
Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope LocalMachine
```
Nachdem der Pfad zum Skript und zur NetSimLan Launchar.Jar angegeben wurde, kann das Skript einfach gestartet werden. Gestoppt werden kann der Watcher mit `Ctrl + C`.

# Details zu NetSimLan
```

  _   _      _    _____ _           _                 
 | \ | |    | |  / ____(_)         | |                
 |  \| | ___| |_| (___  _ _ __ ___ | |     __ _ _ __  
 | . ` |/ _ \ __|\___ \| | '_ ` _ \| |    / _` | '_ \ 
 | |\  |  __/ |_ ____) | | | | | | | |___| (_| | | | |
 |_| \_|\___|\__|_____/|_|_| |_| |_|______\__,_|_| |_|
           | |                            | |         
   ___   __| | ___ _ __    __ _ _   _  ___| |__       
  / _ \ / _` |/ _ \ '__|  / _` | | | |/ __| '_ \      
 | (_) | (_| |  __/ |    | (_| | |_| | (__| | | |     
  \___/ \__,_|\___|_|     \__,_|\__,_|\___|_| |_|     
  _   _      _    _____        _____      _ _         
 | \ | |    | |  / ____|      / ____|    (_) |        
 |  \| | ___| |_| (___   ___ | |  __  ___ _| |        
 | . ` |/ _ \ __|\___ \ / _ \| | |_ |/ _ \ | |        
 | |\  |  __/ |_ ____) | (_) | |__| |  __/ | |        
 |_| \_|\___|\__|_____/ \___/ \_____|\___|_|_|        
```
