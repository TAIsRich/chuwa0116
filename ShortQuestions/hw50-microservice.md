##### 1. Document the microservice architeture and components/tools/dependencies
**API Gateway:** This is typically used to forward the external requests to the specific service in the servers of Spring Cloud.
**Service Discovery:** Eureka: This is actually the registry where different services register their information, and Eureka would check if the specific service is alive by maintaining the heartbeats with the services.
**Load Balancing:** Ribbon: Ribbon in Spring Cloud is actually used to support the load balancing mechanism to help you you choose the service to execute.
**Resilience:** Hystrix(Circuit Breaker): This is actually used to use time-out mechanism to prevent one microservice waiting too long for another problematic microservice, which could prevent the delay from spreding

##### 2. What are Resilience patterns? What is circuit breaker?
Resilience Pattern: 
Timeout: this actually prevents one microservice from waiting too long for another problematic microservice.
Fail Fast: This is actually used to make the responding processing faster by generating errors.

CircuitBreaker:
When a circuitbreaker is opened because of too many failed requests, the incoming requests would be automatically blocked. And it will wait for a cool period so as to resume its service.

##### 3. Important Questions:
- Write main features of Microservices:
All the services of microservices clusters are decoupled so that the whole application could be easily constructed, altered and scaled. In addition, each team could develop futures independently, which could facilitate the development process. Then, microservices could support agile development, and you could develop new futures quickly, and could reverse the development at any time.

- Write difference between Monolithic, SOA and Microservices Architecture:
Monolithic typicall means all the services are mixed together, forming a large single system. 
SOA means a group of services interacting or communicating with each other. Depending on the nature of the communication, it can be simple data exchange or it could involve several services coordinating some activity. 
Microservice Architecture: It involves structuring an application in the form of a cluster of small, autonomous services modeled around a business domain. The functional modules can be deployed independently, are scalable, are aimed at achieving specific business goals, and communicate with each other over standard protocols. 

##### 5. How to do load balance in microservice? Write a long Summary by yourself?
Two types of load balancing microservices architecture are used: server side load balancing and client side load balancing. Server side load balancing involves the classical load balancing approach wherein the traffic is distributed using a load distributor that is placed in front of the servers. This distributor routes the load equally or according to certain rules to the servers which then perform the work. In client side load balancing, the client handles the entire load balancing and the client API is expected to know all the instances of server API addresses that are available hard-coded within a service registry. Using this method, it is possible to escape bottlenecks and single points of failure that may occur. When using service discovery, you don’t have to know any information about the server API except the registered name of the API. The server registry mechanism provides all the information about the server API.