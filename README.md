# Discription

Elementary java programs for education and training java-programming, regexp and shell scripts. Commit contain folders of source code, jar-files, log-file and shell-script.

# FilePie

It is program for split a log file of several parts. 
For running FilePie.jar use that command in terminal:
```sh
$ java -jar FilePie.jar (logfile name) (constant part name of fileout name) (number of parts)
```
# RegexpFinder
It is program for find a line of log file by means regexp and writing that lines into new file.
For running RegexpFinder.jar use that command in terminal:
```sh
$ java -jar RegexpFinder.jar (regexp) (logfile name) (fileout name) 
```
# Split
It is program for replace space between parametrs on ";" or other symbol in log file and writing new scv-file.
For running Split.jar use that command in terminal:
```sh
$ java -jar Split.jar (separator) (logfile name) (fileout name) 
```

# LogFind
It is shell-script for find last edit logfile in Linux and output 10 last lines.
For running logfind use that command in terminal:
```sh
$ chmod +x logfind.sh
$./logfind.sh
```
