Developed a Banking Application backend using Spring Boot and Microservices architecture to handle core banking operations such as Accounts, Loans, and Cards.

Implemented service decomposition into modules:

accounts – Manages customer account details and transactions.

cards – Handles credit/debit card information and operations.

loans – Maintains loan records and repayment schedules.

message – Provides inter-service communication and notifications.

configserver – Centralized configuration management using Spring Cloud Config Server.

eurekaserver – Service discovery and registration with Netflix Eureka.

gatewayserver – API Gateway for routing, load balancing, and security using Spring Cloud Gateway.

Containerized all services with Docker and managed orchestration using docker-compose.

Enabled centralized service configuration and service discovery to support scalability and maintainability.

Applied RESTful API design principles for efficient client-server communication.

Integrated API Gateway for authentication, routing, and rate limiting.
