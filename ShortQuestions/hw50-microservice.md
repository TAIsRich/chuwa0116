# hw50-microservice - Hao Jia

### Document the microservice architeture and components/tools/dependencies
+ Spring Cloud
+ Zuul API Gateway (balancing loads of the micro-services)
+ Eureka (Service Registry Center)
+ Ribbon Load Balancer -> balancing loads of the providers
+ Hystrix Circuit Breaker
+ Config Server
+ Kafka (Event based asynchronous communication between two services)
+ Docker (Deployment of services)

### What are Resilience patterns? What is circuit breaker?
+ Definition: resilience patterns are a type of service that help to prevent cascading failures and to preserve functionality in the event of service failures
+ Circuit breaker is one of the patterns that opens when a system call results in an error and does not allow any calls to pass through

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

### how to do load balance in microservice? Write a long Summary by yourself.
Load balancing is simple technique for distributing workloads across multiple machines or clusters. The most common and simple load balancing algorithm is Round Robin. In this type of load balancing the request is divided in circular order ensuring all machines get equal number of requests and no single machine is overloaded or underloaded.

The Purpose of load balancing is to
+ Optimize resource usage (avoid overload and under-load of any machines)
+ Achieve Maximum Throughput
+ Minimize response time

Most common load balancing techniques in web based applications are

1. Round Robin
2. Weighted Round Robin
3. Least Connection Method
4. Least Response Time Method
5. Source IP Hash

