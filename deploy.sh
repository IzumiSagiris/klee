#!/bin/sh

docker build -t klee:1.0 .

docker rmi $(docker images | grep "none" | awk '{print $3}')

kubectl delete deployment -n prod klee-deployment

kubectl create -f pod.yaml
