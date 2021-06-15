#!/bin/sh

docker build -t klee:1.0 . &&

kubectl delete deployment -n prod klee-deployment &&

kubectl create -f pod.yaml &&

sleep 10s

docker rmi -f $(docker images | grep "none" | awk '{print $3}')
