#!/bin/bash

for i in {1..10} 
do 
date +"%T" 
ps -e | wc -l 
sleep 5
done

lscpu > processor_info.txt

for i in {50..100} 
do 
touch "$i.txt"
done

cat /etc/os-release | grep "NAME" | cut -d "=" -f2 > os_info.txt
cat /etc/os-release | grep "NAME" | cut -d "=" -f2 | sed 's/"//g' >> os_info.txt
