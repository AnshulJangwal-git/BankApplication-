                                              Overview
-> Designed and developed a Banking Application backend using Spring Boot and Microservices architecture to simulate real-world banking operations such as account management, loan services, and card services.

-> Implemented service decomposition into independently deployable modules for scalability, maintainability, and easier testing.

-> Adopted Spring Cloud components to enable centralized configuration, service discovery, and gateway-based routing.

-> Utilized Docker for containerization and docker-compose for local orchestration of all services.

                                          Microservices Structure & Responsibilities
1. Accounts Service

   a) Manages customer account details such as account creation, updates, balance inquiries, and transaction history.

   b) Exposes RESTful endpoints for operations related to accounts.

   c) Connected to its own database to follow Database-per-Service design pattern

2. Cards Service

    a) Handles credit and debit card-related features like card issuance, updates, blocking, and card transactions.

    b) Provides API endpoints for card queries and management.

3. Loans Service

    a) Manages loan records, EMI schedules, repayments, and interest calculations.

    b) Provides endpoints for loan status checks and repayment history.

3. Message Service

    a) Acts as an inter-service communication layer to send messages or notifications between services.

    b) Could be extended to handle asynchronous messaging (Kafka/RabbitMQ) if needed.

                                       Infrastructure & Supporting Services

1. Config Server (configserver)

    a) Centralized configuration management using Spring Cloud Config Server.

    b) Stores configuration files in a Git repository for version-controlled and environment-specific configurations.

    c) Reduces deployment errors by ensuring all services pull their configs from a single source of truth.

2. Eureka Server (eurekaserver)
   
   a) mplemented service discovery using Netflix Eureka.

   b) Allows services to dynamically register and discover each other without hardcoding hostnames/ports.

   c) Improves scalability by enabling load-balanced communication between services.

3. API Gateway (gatewayserver)

   a) Built with Spring Cloud Gateway.

        -> Handles client requests, routes them to appropriate microservices, and performs cross-cutting concerns like:
        -> Authentication & Authorization
        -> Rate Limiting
   b) Acts as a single entry point for all external clients.

4. Docker & Docker-Compose (docker-compose)

   a) Containerized each microservice for consistent deployment environments.
   
   b) Used docker-compose to orchestrate all services, making local setup quick and reliable.
   
   c) Enabled simple docker-compose up to launch the full application stack.


                                          Technical Highlights
   
Backend: Java, Spring Boot, Spring Data JPA

Microservices Support: Spring Cloud Config, Eureka Server, Spring Cloud Gateway

Database: MySQL

Containerization: Docker, Docker-Compose

Build Tool: Maven
