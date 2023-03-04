1. List all of the annotations you learned from class and homework to annotaitons.md
2. Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-interview-questions
3. What is the Aspect Oriented Programming?
Aspect-oriented programming entails breaking down program logic into distinct parts (so-called concerns, cohesive areas of functionality).
4. What are the advantages and disadvantages of Spring AOP?
Advantages:
    * Modularity: Spring AOP enables you to modularize the concerns that are common to multiple objects in your application. This approach simplifies the code and makes it more maintainable, extensible, and reusable.

    * Increased productivity: Developers can focus on the core business logic of an application rather than the cross-cutting concerns such as logging, security, transaction management, and error handling. This separation of concerns increases productivity and saves time.

    * Reusability: Spring AOP allows developers to write aspects that can be applied to multiple objects, which promotes code reuse and eliminates the need to duplicate code.

    * Better maintainability: By separating concerns, Spring AOP makes it easier to maintain and modify the codebase. This approach also makes it easier to add new features or modify existing ones without affecting the rest of the code.
Disadvantages:
    * Complexity: Spring AOP can be complex and difficult to understand, especially for developers who are new to the Spring framework. Understanding the concepts of cross-cutting concerns and aspect-oriented programming can take time and effort.

    * Performance overhead: Spring AOP uses proxies to intercept method calls and apply aspects, which can add some performance overhead to the application. However, this overhead is typically negligible in most applications.

    * Limited cross-cutting concerns: Spring AOP is limited to cross-cutting concerns that can be applied at the method level, which can be a limitation for some applications. For example, if a concern needs to be applied at the object level, Spring AOP may not be the best solution.

5. What is Aspect in Spring AOP?
An aspect is a class that contains advice, pointcut, and other configurations. Advice is the code that is executed when a join point, which is a point in the application at which an aspect can be applied, is reached. Pointcut is an expression that identifies the join points where advice should be applied.

6. What is Pointcut in Spring AOP?
In Spring AOP, a pointcut is a predicate that selects join points (a specific point during the execution of a program, such as the execution of a method or the handling of an exception) where advice should be applied.

7. What is the Join point in Spring AOP?
In Spring AOP, a join point is a specific point during the execution of a program, such as the execution of a method or the handling of an exception.

8. What does it mean by Advice and its types in Spring AOP?
In Spring AOP, advice is the code that is executed when a join point is reached in the execution of a program. Advice is the aspect's implementation of the cross-cutting concern that is being addressed.
9. Reading: https://www.javainuse.com/spring/sprbatch_interview
10. When to use Spring Batch?
Spring Batch is a framework for building batch processing applications in Java. It provides a set of reusable components that can be used to develop batch applications that process large volumes of data, typically in the background.
11. How Spring Batch works?
    * Job
    * Step
    * JobLauncher
    * ItemReader
    * ItemProcessor
    * ItemWriter
    * JobRepository
12. How can we schedule a Spring Batch Job?
Spring Batch can be scheduled using Cron Job.
13. What is the cron expression?
<minute> <hour> <day-of-month> <month> <day-of-week> <command>
14. What is the spring task?
Spring task scheduling for a task/job is a time based scheduled process which runs automatically as per the configuration supplied。
15. When to use Spring task?
When we need to execute code asynchronously or on a schedule.
16. What is Filter and any filter example?
Filter: When there are a bunch of requests, we only want the expected requests to come in.

17. What is the Interceptor? What we can do with interceptor?
Interceptor: Intends to interfere with expected requests.
    * Authentication and Authorization: Interceptors can be used to authenticate and authorize users before allowing them to access specific resources or pages within the application.

    * Logging: Interceptors can be used to log requests and responses to track performance, debug errors and monitor system usage.

    * Caching: Interceptors can be used to cache frequently used data or responses to improve performance.

    * Localization: Interceptors can be used to set the user’s preferred language or locale for displaying localized content.

18. In Interceptor, What is preHandle? What is postHandle?
preHandle: This method is called before the handler method is executed. It can be used to perform operations such as pre-processing of the request, logging, and authentication. This method returns a boolean value, which indicates whether the request should be processed further or not. If it returns true, then the handler method is executed, else it is stopped.
postHandle: This method is called after the handler method has been executed but before the response is sent to the client. It can be used to perform operations such as post-processing of the response, logging, and adding additional data to the model. This method is only called if the preHandle method returns true.

19. What is Swagger?
Swagger is an open-source framework used for designing, building, documenting, and testing RESTful APIs. It provides a set of tools that allows developers to create API documentation in a machine-readable format, which can be used to generate documentation for different programming languages and platforms.