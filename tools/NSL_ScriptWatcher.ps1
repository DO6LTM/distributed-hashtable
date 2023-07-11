# Bitte hier den Pfad des Directories angeben, in dem das Skript liegt
$PathOfScriptDir="..."

# Bitte hier den Namen (inkl. Dateiendung) des NSL Skripts hinterlegen
$FileName="..."

# Bitte hier den Pfad zu NetSimLan Launcher.Jar hinterlegen
$PathToNetSimLan="..."

function Invoke-SomeAction
{
  Write-Warning 'Change detected -> restarting NetSimLan'
  
  try {
    Get-Process -Name "Java" | Stop-Process
  } catch {
  }

  Start-Process -FilePath java.exe -ArgumentList @(
    "-jar $PathToNetSimLan"
    "$PathOfScriptDir\$FileName"
    )

}

try
{
  Write-Warning "FileSystemWatcher is now monitoring $PathOfScriptDir\$FileName"
  
  # create a filesystemwatcher object
  $watcher = New-Object -TypeName IO.FileSystemWatcher -ArgumentList @($PathOfScriptDir,$FileName)

  # start monitoring in a loop:
  do
  {
    $result = $watcher.WaitForChanged([System.IO.WatcherChangeTypes]::Changed, 1000)
    # if there was a timeout, continue monitoring:
    if ($result.TimedOut) { continue }
    
    Invoke-SomeAction
  } while ($true)
}
finally
{
  # release the watcher and free its memory:
  $watcher.Dispose()
  Write-Warning 'FileSystemWatcher removed.'
}
