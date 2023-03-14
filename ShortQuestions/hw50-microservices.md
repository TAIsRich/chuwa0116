# HW50-Microservices

## 1. list all of the new annotations you learned to your annotations.md
see annotation.md

## 2. Document the microservice architecture and components/tools/dependencies
- Zuul API gateway:

  In the context of microservices, the API gateway is responsible for handling various cross-cutting concerns such as security, rate limiting, caching, load balancing, and routing.
  It provides a range of features such as dynamic routing, service discovery, and request filtering.

- Eureka: 

  It provides a centralized directory where all the microservices can register themselves and discover the locations of other services in the system. Eureka also continuously monitors the status of the registered services and removes services that are no longer available.

- Ribbon:

  Ribbon is used to distribute incoming client requests across multiple instances of a service, which helps to improve the availability and reliability of the service.
  Ribbon maintains a registry of available instances of a service and dynamically adjusts the load-balancing algorithm to distribute traffic based on factors such as server availability, latency, and load.

- Hystrix:

  It provides fault tolerance. Hystrix is typically used to add a layer of protection to microservices by using circuit breaker pattern. When a service is experiencing a high rate of errors or latency, Hystrix can open the circuit, redirecting the traffic to a fallback service, and preventing the errors from propagating through the system.

- Config Server:

  a central component that provides a way to manage and distribute configuration information to other microservices. It helps in decoupling the configuration data from the application code and makes it possible to manage the configuration of multiple services in a centralized location.

- Kafka:

  In a microservices architecture, different services may need to communicate with each other in real-time, and Kafka provides a way to enable this communication. Services can publish messages to Kafka topics, which are essentially named feeds or channels, and other services can subscribe to those topics to receive those messages.

- Docker:

  Provides all dependencies of a service

## 3. What are Resilience patterns? What is circuit breaker?
Resilience patterns are design patterns that are used to improve the resilience and fault tolerance of microservices-based systems. These patterns help ensure that a system remains operational even in the face of partial failures and other types of disruptions.

One such pattern is the circuit breaker pattern. In microservices, a circuit breaker is a mechanism that helps to prevent cascading failures when one or more services fail. The circuit breaker monitors requests to a particular service and, if a certain number of requests fail, it will "trip" and stop forwarding requests to that service. This helps to isolate the failure and prevent it from affecting other parts of the system.

When the circuit breaker is tripped, it can perform a variety of actions, such as returning a cached response, returning an error message to the user, or retrying the request after a certain period of time has passed. Once the underlying service has recovered, the circuit breaker can be reset and begin forwarding requests again.

## 4. Read this article, then list the important questions, then write your answers
### main components of Microservices.
- Containers, Clustering, and Orchestration
- IaC [Infrastructure as Code Conception]
- Cloud Infrastructure
- API Gateway
- Enterprise Service Bus
- Service Delivery

### main features of Microservices
- Decoupling: Within a system, services are largely decoupled. The application as a whole can therefore be easily constructed, altered, and scalable
- Componentization: Microservices are viewed as independent components that can easily be exchanged or upgraded
- Business Capabilities: Microservices are relatively simple and only focus on one service
- Team autonomy: Each developer works independently of each other, allowing for a faster project timeline
- Continuous Delivery: Enables frequent software releases through systematic automation of software development, testing, and approval
- Responsibility: Microservices are not focused on applications as projects. Rather, they see applications as products they are responsible for
- Decentralized Governance: Choosing the right tool according to the job is the goal. Developers can choose the best tools to solve their problems
- Agility: Microservices facilitate agile development. It is possible to create new features quickly and discard them again at any time.

### drawbacks of Microservices
- Due to the complexity of the architecture, testing and monitoring are more difficult.  
- Lacks the proper corporate culture for it to work.   
- Pre-planning is essential.  
- Complex development.  
- Requires a cultural shift.  
- Expensive compared to monoliths.   
- Security implications.
- Maintaining the network is more difficult.

### Explain spring cloud and spring boot
Spring Cloud: In Microservices, the Spring cloud is a system that integrates with external systems. This is a short-lived framework designed to build applications quickly. It contributes significantly to microservice architecture due to its association with finite amounts of data processing.

### What is the role of actuator in spring boot?
A spring boot actuator is a project that provides restful web services to access the current state of an application that is running in production. In addition, you can monitor and manage application usage in a production environment without having to code or configure any of the applications.

### What issues are generally solved by spring clouds?
- Complicated issues caused by distributed systems: This includes network issues, latency problems, bandwidth problems, and security issues.
- Service Discovery issues: Service discovery allows processes and services to communicate and locate each other within a cluster.
- Redundancy issues: Distributed systems can often have redundancy issues.
- Load balancing issues: Optimize the distribution of workloads among multiple computing resources, including computer clusters, central processing units, and network links.
- Reduces performance issues: Reduces performance issues caused by various operational overheads.

###

## 5. how to do load balance in microservice? Write a long Summary by yourself.
Load balance typically happens at

  - In between the client application/user and the server
  - In between the server and the application/job servers
  - In between the application servers and the cache servers
  - In between the cache servers the database servers

Ribbon uses round robbing / random algorithm. 

Round‑robin load balancing is one of the simplest methods for distributing client requests across a group of servers. Going down the list of servers in the group, the round‑robin load balancer forwards a client request to each server in turn. When it reaches the end of the list, the load balancer loops back and goes down the list again (sends the next request to the first listed server, the one after that to the second server, and so on).

Variant algorithms include Weighted Round-Robin and Dynamic Round-Robin.

## 6. Udemy: Theory + CLI
watched

## 7 Optional, omitted


