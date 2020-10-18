#!/bin/sh

SECONDS=0

if [ "$1" = "native" ];
then
  docker build -f src/main/docker/Dockerfile.native -t docker.mycompany.com/micronaut-elasticsearch-native:1.0.0 .
else
  ./mvnw compile jib:dockerBuild
fi

duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."
