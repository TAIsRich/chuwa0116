1. List all of the annotations you learned from class and homework to
   annotaitons.md
2. Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-interview-questions
3. What is the Aspect Oriented Programming?

   AOP is typically used to imply that it defines functionality that is required in multiple places across an application in one place.such as logging, security, and transaction management, that cut across different parts of the application.
4. What are the advantages and disadvantages of Spring AOP?

   The advantages of using Spring AOP include the ability to modularize cross-cutting concerns, enhance code readability and maintainability, and reduce boilerplate code. 

   However, it can also lead to increased complexity, reduced performance, and hard to debug.
5. What is Aspect in Spring AOP?

   An aspect is a cross-cutting module that combines advice and pointcuts. A standard class tagged with the @Aspect annotation can be used to implement an aspect.
6. What is Pointcut in Spring AOP?

   A pointcut in Spring AOP is an expression that identifies a set of join points, where advice can be applied.
7. What is the Join point in Spring AOP?

   A join point in Spring AOP is a specific point in the execution of a program, such as the execution of a method or the handling of an exception. Join points are identified by pointcuts, and advice can be applied at these points.
8. What does it mean by Advice and its types in Spring AOP?

   An advice in Spring AOP is an action taken by an aspect at a particular join point. 

   There are several types of advice in Spring AOP, including before advice, after returning advice, after throwing advice, and around advice.
9. Reading: https://www.javainuse.com/spring/sprbatch_interview
10. When to use Spring Batch?

   Spring Batch is used when processing large volumes of data, such as in ETL (extract-transform-load) jobs, batch processing of financial transactions, or generating reports.
11. How Spring Batch works?

   Spring Batch works by dividing a large job into smaller, independent units of work called steps. The job is executed by a JobLauncher, which starts the steps in the correct order and manages their execution.
12. How can we schedule a Spring Batch Job?

    @Scheduled annotation or the TaskScheduler interface.
13. What is the cron expression?

   A cron expression is a string that specifies a schedule for recurring tasks. 
   > Seconds Minutes Hours DayofMonth Month DayofWeek
14. What is the spring task?

   Spring task is a module in Spring Framework that provides scheduling support for running asynchronous or periodic tasks. It allows for the creation of tasks that run on a schedule, as well as tasks that run after a specified delay.
15. When to use Spring task?

   Spring task is typically used when there is a need to run tasks on a periodic or scheduled basis
16. What is Filter and any filter example?

   A Filter is an interface in Java Servlet API that can be used to intercept and process incoming requests and outgoing responses. 

   example
   1. Authentication filter: This filter checks whether the incoming request is from an authenticated user or not. If the user is not authenticated, the filter can redirect the user to a login page.
   2. Logging filter: This filter logs information about incoming requests and outgoing responses, including the HTTP method, URL, request headers, response status code, and more.
   3. Compression filter: This filter compresses the response body before sending it back to the client, reducing the amount of data that needs to be transferred over the network.
   4. Caching filter: This filter caches frequently requested resources, such as images or CSS files, in memory or on disk, reducing the number of requests that need to be handled by the server.
   5. Encryption filter: This filter encrypts the request or response body using a secure encryption algorithm, providing an additional layer of security for sensitive data.
17. What is the Interceptor? What we can do with interceptor?

   An Interceptor is an interface in Spring MVC that allows for the interception of HTTP requests and responses. Interceptors can be used for various purposes, such as logging, authentication, or caching. With interceptors, it's possible to add custom logic to the request processing pipeline without modifying the application code.
18. In Interceptor, What is preHandle? What is postHandle?

- preHandle() is a method that is executed before the actual handler method is executed. It can be used to perform tasks such as authentication or validation. 
- postHandle() is a method that is executed after the handler method is executed, but before the view is rendered.
19. What is Swagger?

   Swagger is an open-source toolset for designing, building, and documenting APIs. It provides a framework for describing APIs using a JSON or YAML format, which can be used to automatically generate client libraries, API documentation, and other tools. It helps developers create APIs that are easy to understand, test, and consume.