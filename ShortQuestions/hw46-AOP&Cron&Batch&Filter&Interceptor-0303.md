1. List all of the annotations you learned from class and homework to annotaitons.md
    
   Completed

2. Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-interview-questions
   
   Completed

3. What is the Aspect Oriented Programming?
   
    Aspect Oriented Programming (AOP) is a programming paradigm that allows developers to modularize cross-cutting concerns in their application. A cross-cutting concern is a concern that affects multiple parts of an application, such as logging, caching, or security. AOP provides a way to separate these concerns from the main business logic of the application and to encapsulate them into separate modules called aspects.

4. What are the advantages and disadvantages of Spring AOP?

    Advantages of Spring AOP include reduced code duplication, improved modularity, increased maintainability, and improved code readability. Disadvantages include increased complexity, possible performance overhead, and potential interference with other aspects of the application.

5. What is Aspect in Spring AOP?

    In Spring AOP, an aspect is a module that encapsulates a cross-cutting concern. Aspects are defined using advice and pointcut expressions, and can be applied to specific join points in the application.

6. What is Pointcut in Spring AOP?

    In Spring AOP, a pointcut is an expression that identifies one or more join points in the application where advice can be applied. Pointcuts are defined using a combination of language constructs, such as method names, annotations, or method parameters.

7. What is the Join point in Spring AOP?

    A join point in Spring AOP is a specific point in the application where an aspect can be applied. Examples of join points include method invocations, exception handling, or field access.

8. What does it mean by Advice and its types in Spring AOP?

    Advice in Spring AOP refers to the action taken by an aspect at a particular join point in the application. There are several types of advice in Spring AOP, including before advice, after returning advice, after throwing advice, and around advice.

9.  Reading: https://www.javainuse.com/spring/sprbatch_interview

    Completed

10. When to use Spring Batch?

    Spring Batch is used for processing large volumes of data in batch jobs. It is ideal for situations where data needs to be read from multiple sources, processed, and written back to multiple destinations in a batch-like manner.

11. How Spring Batch works?

    Spring Batch works by dividing large data sets into smaller, more manageable chunks, and processing them in a parallel and scalable manner. It also provides a set of built-in components for reading and writing data from and to various sources, as well as for processing and transforming the data.

12. How can we schedule a Spring Batch Job?

    A Spring Batch job can be scheduled using the @Scheduled annotation or by configuring a cron expression in the job configuration file.

13. What is the cron expression?

    A cron expression is a string that defines the schedule for a Spring Batch job. It consists of six fields that define the schedule for seconds, minutes, hours, day of month, month, and day of week, respectively.

14. What is the spring task?

    Spring task is a component of the Spring Framework that provides support for scheduling tasks in a Spring application. It is similar to the @Scheduled annotation, but provides additional functionality such as asynchronous execution, error handling, and dynamic scheduling.

15. When to use Spring task? 

    Spring task is typically used when there is a need to schedule tasks that are not related to batch processing, such as sending email notifications, cleaning up data, or triggering other background processes.

16. What is Filter and any filter example?

    A filter in Spring is a component that is used to intercept incoming requests and outgoing responses in a web application. It can be used to perform various tasks such as logging, caching, and security. An example of a filter is the CharacterEncodingFilter, which sets the character encoding of incoming requests.

17. What is the Interceptor? What we can do with interceptor?

    An interceptor in Spring is a component that is used to intercept requests and responses at the controller level. It can be used to perform various tasks such as logging, authentication, and authorization. With an interceptor, you can add additional behavior before or after a request is handled by a controller.

18. In Interceptor, What is preHandle? What is postHandle?

    The preHandle method is called before the request handling and allows us to perform some operations before the request is processed, such as pre-processing the request or intercepting the request. In the preHandle method, we can modify the model or view as needed or decide to abort the request processing flow based on certain conditions.

    The postHandle method is called after the request handling and allows us to perform some operations after the request is processed, such as modifying the model or view, adding extra response headers, or logging. In the postHandle method, we can modify the model or view as needed or decide to abort the request processing flow based on certain conditions.

19. What is Swagger?

    Swagger is an API development tool that can automatically generate API documentation based on API code and provides an interactive UI for users to easily test and debug APIs through the browser. Swagger can not only generate API documentation, but also generate client code, server mockups, request validation, and authentication, etc. Swagger can help developers to develop and test APIs faster, and can improve the reliability and maintainability of APIs. Swagger can also be used with many different programming languages and frameworks, such as Java, Python, Node.js, etc.