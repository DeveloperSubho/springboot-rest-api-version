# SpringBoot REST API Versioning
This project illustrates versioning in Springboot.

## Definition:
Versioning is the most important and difficult part of the API as it takes backward API compatible. 
Versioning helps us to iterate faster when the changes are identified. We should always version our Web API.

The most commonly used approaches fall into three categories:

- URI Versioning
- Versioning using Custom Request Header
- Versioning using Accept Header

## What You Will Need?

- Java 8
- Eclipse/IntelliJ
- Maven
- Embedded Tomcat
- Postman REST Services Client

## Versions Used:
- Java 1.8
- SpringBoot 2.6

## Useful Resources

- POSTMAN - http://www.getpostman.com

## Links used:

- Versioning
  - http://localhost:9091/v1/car
  - http://localhost:9091/v2/car
  - http://localhost:9091/car/param
     - params=[version=1]
  - http://localhost:9091/car/param
     - params=[version=2]
  - http://localhost:9091/car/header
     - headers=[X-API-VERSION=1]
  - http://localhost:9091/car/header
     - headers=[X-API-VERSION=2]
  - http://localhost:9091/car/produces
     - produces=[application/vnd.company.app-v1+json]
  - http://localhost:9091/car/produces
  	 - produces=[application/vnd.company.app-v2+json]
