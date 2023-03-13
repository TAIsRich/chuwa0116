1. list all of the new annotations you learned to your annotations.md

    Completed

2. Document the microservice architeture and components/tools/dependencies

    Microservice Architecture:
    Microservice architecture is a software design pattern that structures applications as independent, small, and modular services that communicate with each other over APIs. Each microservice is focused on a single business capability and can be deployed, scaled, and maintained independently.

    Service registry and discovery: Eureka and Zookeeper
    API gateway: Netflix Zuul(Routing, load blancer, Auth)
    Load balancer: Netflix Ribbon
    Containerization: Docker
    Messaging systems: Kafka, RabbitMQ
    Configuration management: Spring cloud, config
    Rest call: Feign
    Circuit Break: Netflix Hystrix

3. What are Resilience patterns? What is circuit breaker?

    Resilience patterns refer to a set of patterns and techniques that help distributed systems withstand and recover from failures. Circuit breaker is a design pattern that is used to prevent cascading failures in a distributed system. It allows services to fail fast and respond to failure by returning a fallback response instead of waiting for the request to time out.

4. Read this article, then list the important questions, then write your answers
    Microservice

    Maintainable and testable
    Loosely coupled
    Independently deployable
    Designed or organized around business capabilities
    Managed by a small team

    Write main features of Microservices:

    Decoupling: Within a system, services are largely decoupled. The application as a whole can therefore be easily constructed, altered, and scalable
    Componentization: Microservices are viewed as independent components that can easily be exchanged or upgraded
    Business Capabilities: Microservices are relatively simple and only focus on one service
    Team autonomy: Each developer works independently of each other, allowing for a faster project timeline
    Continuous Delivery: Enables frequent software releases through systematic automation of software development, testing, and approval
    Responsibility: Microservices are not focused on applications as projects. Rather, they see applications as products they are responsible for
    Decentralized Governance: Choosing the right tool according to the job is the goal. Developers can choose the best tools to solve their problems
    Agility: Microservices facilitate agile development. It is possible to create new features quickly and discard them again at any time.

    What are the benefits and drawbacks of Microservices?
    
    Benefits: 

    Self-contained, and independent deployment module. 
    Independently managed services.   
    In order to improve performance, the demand service can be deployed on multiple servers.   
    It is easier to test and has fewer dependencies.  
    A greater degree of scalability and agility.   
    Simplicity in debugging & maintenance.  
    Better communication between developers and business users.   
    Development teams of a smaller size.
    
    Drawbacks: 

    Due to the complexity of the architecture, testing and monitoring are more difficult.  
    Lacks the proper corporate culture for it to work.   
    Pre-planning is essential.  
    Complex development.  
    Requires a cultural shift.  
    Expensive compared to monoliths.   
    Security implications. 
    Maintaining the network is more difficult.

    Write difference between Monolithic, SOA and Microservices Architecture.

    Monolithic Architecture: It is "like a big container" where all the software components of an application are bundled together tightly.  It is usually built as one large system and is one code-base. 

    SOA (Service-Oriented Architecture): It is a group of services interacting or communicating with each other. Depending on the nature of the communication, it can be simple data exchange or it could involve several services coordinating some activity.   

    SOA与微服务架构有很多共同点，但SOA通常是基于XML和Web服务协议的，而微服务则更加面向轻量级的协议，例如REST和HTTP。

    Microservice Architecture: It involves structuring an application in the form of a cluster of small, autonomous services modeled around a business domain. The functional modules can be deployed independently, are scalable, are aimed at achieving specific business goals, and communicate with each other over standard protocols. 

5. how to do load balance in microservice? Write a long Summary by yourself.

    How to Use Load Balancing During System Design Interviews?
    In your system design interview, you’ll be asked some sort of scalability question where you’ll have to explain how load balancers help distribute the traffic and how it ensures scalability and availability of services in your application. The overall concept that you need to keep in mind from this article is…

    A load balancer enables elastic scalability which improves the performance and throughput of data. It allows you to keep many copies of data (redundancy) to ensure the availability of the system. In case a server goes down or fails you’ll have the backup to restore the services. 
    Load balancers can be placed at any software layer.
    Many companies use both hardware and software to implement the load balancers, depending on the different scale points in their system.

6. Udemy: Theory + CLI

    Completed