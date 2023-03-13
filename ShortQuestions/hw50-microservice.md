### 2. Document the microservice architeture and components/tools/dependencies
**Microservice Architecture:**

It involves structuring an application in the form of a cluster of small, autonomous services modeled around a business domain. The functional modules can be deployed independently, are scalable, are aimed at achieving specific business goals, and communicate with each other over standard protocols. 
- Spring Cloud
- Zuul API Gateway
- Eureka
- Ribbon Load Balancer 
- Hystrix Circuit Breaker
- Kafka 
- Docker
- Some main components
    - Containers, Clustering, and Orchestration 
    - IaC [Infrastructure as Code Conception] 
    - Cloud Infrastructure 
    - API Gateway 
    - Enterprise Service Bus 
    - Service Delivery 
    
### 3. What are Resilience patterns? What is circuit breaker?
- Time out
    - A timeout prevents a microservice from waiting too long for another
microservice. 

- Fail fast
    - Fail Fast describes a similar pattern. It is better to generate an error as quickly as possible. 
    
- Bulkhead
    - Hystrix can use its own thread pool for each type of request. For example, a separate thread pool can be set up for each called microservice.
    
- Circuit breaker
    - If a system call results in an error, the circuit breaker is opened and does not allow any calls to pass through.

### 4. Read this article, then list the important questions, then write your answers
1. Write main features of Microservices.
- Decoupling: Within a system, services are largely decoupled. The application as a whole can therefore be easily constructed, altered, and scalable
Componentization: Microservices are viewed as independent components that can easily be exchanged or upgraded
- Business Capabilities: Microservices are relatively simple and only focus on one service
- Team autonomy: Each developer works independently of each other, allowing for a faster project timeline
- Continuous Delivery: Enables frequent software releases through systematic automation of software development, testing, and approval
- Responsibility: Microservices are not focused on applications as projects. Rather, they see applications as products they are responsible for
- Decentralized Governance: Choosing the right tool according to the job is the goal. Developers can choose the best tools to solve their problems
- Agility: Microservices facilitate agile development. It is possible to create new features quickly and discard them again at any time.

3. What are the benefits and drawbacks of Microservices?
- Benefits: 
    - Self-contained, and independent deployment module. 
    - Independently managed services.   
    - In order to improve performance, the demand service can be deployed on multiple servers.   
    - It is easier to test and has fewer dependencies.  
    - A greater degree of scalability and agility.   
    - Simplicity in debugging & maintenance.  
    - Better communication between developers and business users.   
    - Development teams of a smaller size.
    
- Drawbacks: 
    - Due to the complexity of the architecture, testing and monitoring are more difficult.  
    - Lacks the proper corporate culture for it to work.   
    - Pre-planning is essential.  
    - Complex development.  
    - Requires a cultural shift.  
    - Expensive compared to monoliths.   
    - Security implications. 
    - Maintaining the network is more difficult.  

4. Name three common tools mostly used for microservices.
- Wiremock 
- Docker 
- Hystrix 

5. Explain the working of Microservice Architecture.
- Clients: Different users send requests from various devices. 
- Identity Provider: Validate a user's or client's identity and issue security tokens. 
- API Gateway: Handles the requests from clients. 
- Static Content: Contains all of the system's content. 
- Management: Services are balanced on nodes and failures are identified. 
- Service Discovery: A guide to discovering the routes of communication between microservices. 
- Content Delivery Network: Includes distributed network of proxy servers and their data centers. 
- Remote Service: Provides remote access to data or information that resides on networked computers and devices. 

6. Write difference between Monolithic, SOA and Microservices Architecture.
- Monolithic Architecture: It is "like a big container" where all the software components of an application are bundled together tightly.  It is usually built as one large system and is one code-base. 
- SOA (Service-Oriented Architecture): It is a group of services interacting or communicating with each other. Depending on the nature of the communication, it can be simple data exchange or it could involve several services coordinating some activity.   
- Microservice Architecture: It involves structuring an application in the form of a cluster of small, autonomous services modeled around a business domain. The functional modules can be deployed independently, are scalable, are aimed at achieving specific business goals, and communicate with each other over standard protocols. 

7. Explain spring cloud and spring boot.

Spring Cloud: In Microservices, the Spring cloud is a system that integrates with external systems. This is a short-lived framework designed to build applications quickly. It contributes significantly to microservice architecture due to its association with finite amounts of data processing.

Spring Boot: Spring Boot is an open-sourced, Java-based framework that provides its developers with a platform on which they can create stand-alone, production-grade Spring applications. In addition to reducing development time and increasing productivity, it is easily understood.  

10. What issues are generally solved by spring clouds?

- Complicated issues caused by distributed systems: This includes network issues, latency problems, bandwidth problems, and security issues. 
- Service Discovery issues: Service discovery allows processes and services to communicate and locate each other within a cluster. 
- Redundancy issues: Distributed systems can often have redundancy issues. 
- Load balancing issues: Optimize the distribution of workloads among multiple computing resources, including computer clusters, central processing units, and network links. 
- Reduces performance issues: Reduces performance issues caused by various operational overheads. 

11. What do you mean by Cohesion and Coupling?

Coupling: It is defined as a relationship between software modules A and B, and how much one module depends or interacts with another one. Couplings fall into three major categories. Modules can be highly coupled (highly dependent), loosely coupled, and uncoupled from each other. The best kind of coupling is loose coupling, which is achieved through interfaces. 

Cohesion: It is defined as a relationship between two or more parts/elements of a module that serves the same purpose. Generally, a module with high cohesion can perform a specific function efficiently without needing communication with any other modules. High cohesion enhances the functionality of the module.

13. Write the fundamental characteristics of Microservice Design.

- Based on Business Capabilities: Services are divided and organized around business capabilities. 
- Products not projects: A product should belong to the team that handles it.  
- Essential messaging frameworks: Rely on functional messaging frameworks: - Eliminate centralized service buses by embracing the concept of decentralization.  
- Decentralized Governance: The development teams are accountable for all aspects of the software they produce.  
- Decentralized data management: Microservices allow each service to manage its data separately.  
- Automated infrastructure: These systems are complete and can be deployed independently.   
- Design for failure: Increase the tolerance for failure of services by focusing on continuous monitoring of the applications. 

14. What are the challenges that one has to face while using Microservices?

**Functional Challenges:**

- Require heavy infrastructure setup. 
- Need Heavy investment. 
- Require excessive planning to handle or manage operations overhead.

**Technical Challenges:**

- Microservices are always interdependent. Therefore, they must communicate with each other.   
- It is a heavily involved model because it is a distributed system.   
- You need to be prepared for operations overhead if you are using Microservice architecture.   
- To support heterogeneously distributed microservices, you need skilled professionals.    
- It is difficult to automate because of the number of smaller components. For that reason, each component must be built, deployed, and monitored separately. 
- It is difficult to manage configurations across different environments for all components. 
- Challenges associated with deployment, debugging, and testing. 


### 5. how to do load balance in microservice? Write a long Summary by yourself.
* Server Side Load Balancing

Server side load balancing is a classical load balancing. The traffic is distributed by a load distributor placed in front of the servers and distributed to the servers that will perform the main work equally or according to certain rules. As examples most common used server side load balancers nginx, netscaler etc.

* Client Side Load Balancing

In client side load balancing, client handles the load balancing. In this case client api should know all instance of server api addresses via hard coded or with a service registry.
With this method you can escape bottlenecks and single point of failures. If you use service discovery you don’t have to know any information about server api except api registered name, server registry mechanism will give all information about server api.
