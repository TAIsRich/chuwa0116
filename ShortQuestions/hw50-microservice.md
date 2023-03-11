## Document the microservice architecture and components/tools/dependencies

1. Sprint Cloud
2. Zuul API Gateway
3. Eureka
4. Ribbon (Load Balancer)
5. Hystrix (Circuit Breaker)
6. Config Server
7. Kafka
8. Docker

## What are Resilience patterns? What is circuit breaker?

**Time out**

- A **timeout** prevents a microservice from waiting too long for another 
  microservice.

**Fail fast**

- Fail Fast describes a similar pattern. It is better to generate an error as 
  quickly as possible.

**Bulkhead**

- Hystrix can use its own thread pool for each type of request. For 
  example, a separate thread pool can be set up for each called 
  microservice.

**Circuit breaker**

- If a **system call results in an error, the circuit breaker is opened** 
  **and does not allow any calls to pass through**

  

## Read this article, then list the important questions, then write your answers 
https://www.interviewbit.com/microservices-interview-questions/#main-features-of-microservicesf

### Main components of Microservices.

Some of the main components of microservices include: 

- Containers, Clustering, and Orchestration 

- IaC [Infrastructure as Code Conception] 

- Cloud Infrastructure 

- API Gateway 

- Enterprise Service Bus 

- Service Delivery

  

### What are the benefits and drawbacks of Microservices?

**Benefits:** 

- Self-contained, and independent deployment module. 
- Independently managed services.  
- In order to improve performance, the demand service can be deployed on multiple servers.  
- It is easier to test and has fewer dependencies.  
- A greater degree of scalability and agility.  
- Simplicity in debugging & maintenance.  
- Better communication between developers and business users.  
- Development teams of a smaller size.

**Drawbacks:** 

- Due to the complexity of the architecture, testing and monitoring are more difficult.  
- Lacks the proper corporate culture for it to work.  
- Pre-planning is essential.  
- Complex development.  
- Requires a cultural shift.  
- Expensive compared to monoliths.  
- Security implications. 
- Maintaining the network is more difficult. 

## how to do load balance in microservice? Write a long Summary by yourself.

1. https://www.geeksforgeeks.org/load-balancer-system-design-interview-question/
2.  https://www.fullstack.cafe/blog/load-balancing-interview-questions



**What is a load balancer?**

A load balancer works as a “traffic cop” sitting in front of your server and routing client requests across all servers. It simply distributes the set of requested operations (database write requests, cache queries) effectively across multiple servers and ensures that no single server bears too many requests that lead to degrading the overall performance of the application. A load balancer can be a physical device or a virtualized instance running on specialized hardware or a software process. 

**Types of Load Balancer**

1. Software Load Balancer in Clients
2. Software Load Balancer in Services
3. Hardware Load Balancers

**Load Balancing Algorithm**

1. Round Robin
2. Weighted Round Robin
3. Least Connection Method
4. Least Response Time Method
5. Source IP Hash

**Summay**

-  A load balancer enables elastic scalability which improves the performance and throughput of data. It allows you to keep many copies of data (redundancy) to ensure the availability of the system. In case a server goes down or fails you’ll have the backup to restore the services. 
- Load balancers can be placed at any software layer.
- Many companies use both hardware and software to implement the load balancers, depending on the different scale points in their system.