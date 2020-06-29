# Hiberus-coding

Hiberus-coding is the server that use eureka server of netflix to managed the microservices
and make easy to identify each microservice and communicate each others.

## Installation

Use the package manager gradle to install dependecies of the build gradle.

```bash
gradle clean build
```

Note: needs a gradle version 6.0 or higher

## Dependecies

spring-cloud-starter-netflix-eureka-server: eureka server to managed microservices.


## Usage

- Import project as gradle project.
- rigth click in HiberusCodingApplication and Run as a Java application
- ingress http://localhost:8761/, you find a dashboard with the microservices actives and registered.