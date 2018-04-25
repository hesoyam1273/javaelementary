#!/bin/bash
find /var/log -type f -printf '%TY-%Tm-%Td %TT %p\n' | sort -r | head -n1>lastlog.txt
path=`grep -o "\/.*" lastlog.txt`
cat $path | tail -n 10