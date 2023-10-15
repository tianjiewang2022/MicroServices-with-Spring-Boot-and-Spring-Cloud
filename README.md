# MicroServices-with-Spring-Boot-and-Spring-Cloud

# MicroServices with Spring Cloud, Spring Boot, Docker, and GKE on GCP

This repository contains a comprehensive implementation of a scalable Currency Exchange service using Spring Cloud, Spring Boot, Docker, and Kubernetes (GKE) on Google Cloud Platform (GCP). 

The project, developed from February 2023 to May 2023, encompasses various microservices and technologies to create a robust and resilient system for currency exchange.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Microservices Architecture](#microservices-architecture)
- [API Endpoints](#api-endpoints)
- [Database](#database)
- [Configuration](#configuration)
- [Docker](#docker)
- [Kubernetes (GKE) Deployment](#kubernetes-deployment)
- [Logging and Monitoring](#logging-and-monitoring)
- [Contributing](#contributing)
- [License](#license)

## Introduction
This project aims to create a highly scalable and resilient Currency Exchange service. The key features include efficient RESTful API development, optimized database retrieval, service discovery, load balancing, resilience, and containerized microservices deployment.

## Features
1. **Scalable Currency Exchange Service**: Developed with Spring Cloud microservices and Feign for RESTful API, ensuring scalability.

2. **Optimized Database Retrieval**: Achieved a 50% optimization in database retrieval using Spring Data JPA and Hibernate.

3. **Efficient Service Discovery and Load Balancing**: Implemented service discovery and load balancing with Spring Eureka and Feign.

4. **Spring Cloud API Gateway**: A gateway with LoggingFilter as GlobalFilter and Routing Logic.

5. **Resilience4j Circuit Breaking**: Strengthened system resilience with circuit breaking and utilized Zipkin for distributed tracing.

6. **Docker Containerization**: Containerized microservices using Docker, enabling portability and easy deployment.

7. **Kubernetes (GKE) Orchestration**: Orchestrated microservices deployment on Google Kubernetes Engine (GKE) for scalability and management.

## Technologies Used
- Spring Boot
- Spring Cloud
- Spring Data JPA
- Hibernate
- Spring Eureka
- Feign
- Resilience4j
- Docker
- Kubernetes (GKE)
- Google Cloud Platform (GCP)
- Zipkin
- H2 and MySQL

## Learning Note by Author

- [Learning Notes](https://sallymicroservices.notion.site/sallymicroservices/MicroServices-with-Spring-Cloud-Spring-Boot-Docker-and-GKE-GCP-815c38848f064f51ba853b0d01d662d2): Detailed notes, explanations, and insights on the development of this project.

## Getting Started
To get started with this project, follow the installation and setup instructions in the [Getting Started](/docs/GETTING_STARTED.md) document.

## Microservices Architecture
![Architecture Image](https://your-architecture-image-url.com)

This project consists of multiple microservices, each serving a specific purpose. For detailed information on the microservices architecture, consult the [Microservices Architecture](/docs/MICROSERVICES_ARCHITECTURE.md) document.

## API Endpoints
Detailed information on API endpoints and how to interact with the services can be found in the [API Endpoints](/docs/API_ENDPOINTS.md) document.

## Database
The project uses H2 and MySQL databases. You can find information on database setup and schema in the [Database](/docs/DATABASE.md) document.

## Configuration
Customize and configure your project using the instructions in the [Configuration](/docs/CONFIGURATION.md) document.

## Docker
Learn how to build Docker images and run the microservices as containers in the [Docker](/docs/DOCKER.md) document.

## Kubernetes Deployment
Find guidance on deploying microservices using Kubernetes (GKE) in the [Kubernetes Deployment](/docs/KUBERNETES_DEPLOYMENT.md) document.

## Logging and Monitoring
To understand how logging and monitoring work in this project, please consult the [Logging and Monitoring](/docs/LOGGING_AND_MONITORING.md) document.

---

**Disclaimer:** This repository is a demonstration of a currency exchange service built with specific technologies. It is not intended for production use without further customization and security considerations. Use it as a reference or starting point for your projects.

Enjoy building scalable microservices with Spring Cloud, Spring Boot, Docker, and GKE on GCP! :partying_face:
