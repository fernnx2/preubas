#!/bin/bash

sleep 59

java -jar ./payara/payara-micro-4.1.2.181.jar --addjars ./payara/mysql-connector-java-5.1.46.jar --domainConfig ./payara/domain.xml --deploy ./payara/MantenimientoEquipo-1.0-SNAPSHOT.war
