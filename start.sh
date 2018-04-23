#!/bin/bash

docker rm -f db_mtto
docker rmi mtto:2.0 

chmod 777 ./payara/domain.xml

rm ./payara/MantenimientoEquipo-1.0-SNAPSHOT.war

docker-compose up --build -d
