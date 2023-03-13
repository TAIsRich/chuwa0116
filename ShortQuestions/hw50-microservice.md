1.  list all of the new annotations you learned to your annotations.md
2.  Document the microservice architecture and components/tools/dependencies
    1. API gateway(Spring Cloud Gateway): handle all requests and perform the dynamic routing of microservice applications.
       * dependency: spring-cloud-starter-gateway, spring-cloud-starter-netflix-eureka-client
    2. Service recovery(Eureka): register service by serviceId, monitor service health status, auto-register new services
       * dependency: spring-cloud-starter-netflix-eureka-server, dependencyManagement
    3. LoadBalancer(Nginx): enables our service to scale well and stay high-available when the traffic load increases. Distribute heavy traffic load across servers.
    4. Resilience(Hystrix/resilience4j): When one service calls another, but the another service has a problem, Hystrix can catch all problems of underlying services and process a fallback plan
       * dependency: hystrix_starter & hystrix_dashboard
    5. Config Server(Consul): Spring Cloud offers support for Consul as a server for configurations. The examples in this course use application.properties files for configuration because they are relatively easy to handle.
    6. Message Queue(Kafka): producer sent message to kafka, server and kafka server dispatch message to different queue based on routing key, consumer will get message from queue
    7. Docker(Container): build, share, and run applications/services.
3.  What are Resilience patterns? What is circuit breaker?\
    Resilience Patterns:
    1. Time out: A timeout prevents a microservice from waiting too long for another microservice. 
    2. Fail fast: Fail Fast describes a similar pattern. It is better to generate an error as quickly as possible. 
    3. Bulkhead: Hystrix can use its own thread pool for each type of request. For example, a separate thread pool can be set up for each called microservice.\
       In a bulkhead architecture, elements of an application are isolated into pools so that if one fails, the others will continue to function.
    4. Circuit Breaker:  The Circuit Breaker pattern prevents an application from performing an operation that is likely to fail.

4.  Read this article, then list the important questions, then write your answers
a. https://www.interviewbit.com/microservices-interview-questions/#main-features-of-microservices
   1. Write main features of Microservices.
    Decoupling, Componentization, Business Capabilities, Team autonomy, Continuous Delivery, Responsibility, Decentralized Governance, Agility.
   2. What are the benefits and drawbacks of Microservices?
      Benefits: You can update/modify one service without downtime of the entire application. ie. amazon prime: prime day service.You can easily scale up to add more services. For each service, you can use different tech stacks.
      Drawbacks: Communication between services requires more time and resources. DevOps – need more server and people to maintain each server.
   3. Write difference between Monolithic, SOA and Microservices Architecture.
      * Monolithic Architecture: All services are in one application.
      * SOA: It is a group of services interacting or communicating with each other.
      * Microservice: It involves structuring an application in the form of a cluster of small, autonomous services modeled around a business domain.
   4. Spring Cloud and Spring Boot:
      * Spring Cloud: In Microservices, the Spring cloud is a system that integrates with external systems. This is a short-lived framework designed to build applications quickly.
      * Spring Boot: Spring Boot is an open-sourced, Java-based framework that provides its developers with a platform on which they can create stand-alone, production-grade Spring applications.
   5. Acutator:
      A spring boot actuator is a project that provides restful web services to access the current state of an application that is running in production. In addition, you can monitor and manage application usage in a production environment without having to code or configure any of the applications.
   6. What do you mean by Cohesion and Coupling?
      * Coupling: It is defined as a relationship between software modules A and B. Modules can be highly coupled (highly dependent), loosely coupled, and uncoupled from each other.
      * Cohesion: It is defined as a relationship between two or more parts/elements of a module that serves the same purpose. Generally, a module with high cohesion can perform a specific function efficiently without needing communication with any other modules.
   7. Challenge in microservice:
      Functional Challenges:
        * Require heavy infrastructure setup. 
        * Need Heavy investment. 
        * Require excessive planning to handle or manage operations overhead.
      Technical Challenges:
        * services need to communicate with each other.
        * prepared for operations overhead if you are using Microservice architecture
        * It is difficult to automate because of the number of smaller components. For that reason, each component must be built, deployed, and monitored separately.
        * Challenges associated with deployment, debugging, and testing.
   8. Explain how independent microservices communicate with each other.
        * HTTP/REST with JSON or binary protocol for request-response
        * Websockets for streaming.
        * A broker or server program that uses advanced routing algorithms.(RabbitMQ, Kafka)
   9. Explain CDC
      CDC (Consumer-Driven Contract) basically ensures service communication compatibility by establishing an agreement between consumers and service providers regarding the format of the data exchanged between them. An agreement like this is called a contract. Basically, it is a pattern used to develop Microservices so that they can be efficiently used by external systems.
   10. Explain the term Eureka in Microservices
       Eureka Server, also referred to as Netflix Service Discovery Server, is an application that keeps track of all client-service applications. As every Microservice registers to Eureka Server, Eureka Server knows all the client applications running on the different ports and IP addresses.
   11. What is the main role of docker in microservices?
        * Docker generally provides a container environment, in which any application can be hosted.
   12. Explain Container in Microservices.
        * Using Docker, you may also encapsulate a microservice along with its dependencies in a container image, which can then be used to roll on-demand instances of the microservice without any additional work.
5.  how to do load balance in microservice? Write a long Summary by yourself.
a. https://www.geeksforgeeks.org/load-balancer-system-design-interview
-question/
b. https://www.fullstack.cafe/blog/load-balancing-interview-questions
    Load Balancer enables our service to scale well and stay high-available when the traffic load increases. Distribute heavy traffic load across servers. \
There are mainly two problems we need to tackle with. The first is single point failure:If the server goes down or something happens to the server the whole application will be interrupted and it will become unavailable for the users for a certain period. Another is overloadded servers: There will be a limitation on the number of requests that a web server can handle.  
To solve these problems we can add the number of web servers in the network and add a load balancer in front of the web servers. The load balancer can spread requests across multiple servers. If one of the servers goes offline the service will be continued. The load balancer also do regular health check on the machines in the cluster.
    There are 3 types of load balancers. 
    1. Client-side Software Load Balancers: the client application will be provided with a list of web servers/application servers to interact with. The application chooses the first one in the list and requests data from the server.
    2. Service-side Software Load Balancers: These load balancers are the pieces of software that receive a set of requests and redirect these requests according to a set of rules.
    3. Hardware Load Balancer: When a request comes from a client application, it forwards the connection to the most appropriate real server doing bi-directional network address translation (NAT). These load balancers are also known as Layer 4-7 Routers.
    There are 5 types of algorithms for load balancers.
    1. Round Robin: Requests are distributed across the servers in a sequential or rotational manner. 
    2. Weighted Round Robin: It is much similar to the round-robin technique. The only difference is, that each of the resources in a list is provided a weighted score.
    3. Least Connection Method: In this method, the request will be directed to the server with the fewest number of requests or active connections. 
    4. Least Response Time Method: This technique is more sophisticated than the Least connection method.  In this method, the request is forwarded to the server with the fewest active connections and the least average response time. 
    5. Source IP Hash: In this method, the request is sent to the server based on the client’s IP address.