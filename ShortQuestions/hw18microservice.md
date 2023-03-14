## 2. Document the microservice architeture and components/tools/dependencies

- **Clients**: Different users send requests from various devices.
- **Identity Provider**: Validate a user's or client's identity and issue security tokens.
- **API Gateway:** Handles the requests from clients.
- **Static Content:** Contains all of the system's content.
- **Management:** Services are balanced on nodes and failures are identified.
- **Service Discovery:** A guide to discovering the routes of communication between microservices.
- **Content Delivery Network:** Includes distributed network of proxy servers and their data centers.
- **Remote Service:** Provides remote access to data or information that resides on networked computers and devices.
+ Spring Cloud
+ Zuul API Gateway (balancing loads of the micro-services)
+ Eureka (Service Registry Center)
+ Ribbon Load Balancer -> balancing loads of the providers
+ Hystrix Circuit Breaker
+ Config Server
+ Kafka (Event based asynchronous communication between two services)
+ Docker (Deployment of services)
## 3 What are Resilience patterns? What is circuit breaker?

+ Definition: resilience patterns are a type of service that help to prevent cascading failures and to preserve functionality in the event of service failures
+ Circuit breaker is one of the patterns that opens when a system call results in an error and does not allow any calls to pass through
## 4 Read this article, then list the important questions, then write your answers

### Write main features of Microservices.
+ Maintainable and testable
  + Loosely coupled
  + Independently deployable
  + Designed or organized around business capabilities
  + Managed by a small team

### Write main components of Microservices.
+ Containers, Clustering, and Orchestration
  + IaC [Infrastructure as Code Conception]
  + Cloud Infrastructure
  + API Gateway
  + Enterprise Service Bus
  + Service Delivery


### What are the benefits and drawbacks of Microservices?

Good/Advantage of Microservice
+ You can update/modify one service without downtime of the entire application.
  ie. amazon prime: prime day service
  + You can easily scale up to add more services
  + For each service, you can use different tech stacks

Bad/Drawbacks of Microservice
+ Communication between services requires more time and resources
  + DevOps – need more server and people to maintain each servers

### Components of microservices.
Spring Cloud, Zuul API Gateway, Eureka, Ribbon Load Balancer, Hystrix Circuit Breaker, Config Server, Kafka, Docker

### Explain the working of Microservice Architecture.

### Explain spring cloud and spring boot.
Spring Cloud is a collection of extensions for Spring Boot which are useful for cloud
applications and for microservices

### What is the role of actuator in spring boot?
A spring boot actuator is a project that provides restful web services to access the current state of an application that is running in production. In addition, you can monitor and manage application usage in a production environment without having to code or configure any of the applications.

### Explain the term Eureka in Microservices.
Eureka Server, also referred to as Netflix Service Discovery Server, is an application that keeps track of all client-service applications. As every Microservice registers to Eureka Server, Eureka Server knows all the client applications running on the different ports and IP addresses. It generally uses Spring Cloud and is not heavy on the application development process.
## 5. how to do load balance in microservice? Write a long Summary by yourself.

Server Side Load Balancing

Server side load balancing is a classical load balancing. The traffic is distributed by a load distributor placed in front of the servers and distributed to the servers that will perform the main work equally or according to certain rules. As examples most common used server side load balancers nginx, netscaler etc.

Client Side Load Balancing

In client side load balancing, client handles the load balancing. In this case client api should know all instance of server api addresses via hard coded or with a service registry.
With this method you can escape bottlenecks and single point of failures. If you use service discovery you don’t have to know any information about server api except api registered name, server registry mechanism will give all information about server api.

Load Balancing Algorithms

1. Round Robin

2. Weighted Round Robin

3. Least Connection Method

4. Least Response Time Method

5. Source IP Hash