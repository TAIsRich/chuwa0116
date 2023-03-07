# hw46-AOP&Cron&Batch&Filter&Interceptor-0303

## 1. List all of the annotations you learned from class and homework to annotaitons.md
see annotation.md

## 2. Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-interview-questions
read

## 3. What is the Aspect Oriented Programming?
Aspect-oriented programming (AOP) is a programming paradigm that aims to increase modularity and separation of concerns in software development by allowing developers to separate cross-cutting concerns (i.e., functionality that cuts across multiple modules or layers of an application) from the core business logic of the application.

## 4. What are the advantages and disadvantages of Spring AOP?
Advantages:

Modularity: With Spring AOP, you can modularize your code by separating the cross-cutting concerns from the core business logic. This makes the code easier to maintain and extend.

Reusability: AOP can be applied to multiple modules of an application, which reduces code duplication and increases reusability.

Improved performance: By separating cross-cutting concerns, you can improve the performance of your application by reducing redundant code and eliminating unnecessary method calls.

Easy to use: Spring AOP provides a simple and easy-to-use way to separate cross-cutting concerns.

Interception of Method Calls: Using AOP, you can intercept method calls and perform actions before and after the method call. This can be useful for implementing features such as logging, caching, and security.

Disadvantages:

Limited scope of use: Spring AOP is not suitable for all types of cross-cutting concerns. Some concerns may require more powerful tools such as AspectJ.

Complexity: AOP can add complexity to your code, making it harder to debug and understand. The use of pointcuts and join points can also add to the complexity.

Performance overhead: Using AOP can add a performance overhead to your application, especially if you use AOP to intercept method calls.

Configuration: Configuring AOP can be challenging, especially if you are new to Spring or AOP. You need to have a good understanding of the Spring framework and AOP concepts.

Runtime issues: If AOP is not configured correctly, it can cause runtime issues, such as unexpected behavior or exceptions.

## 5. What is Aspect in Spring AOP?
Aspect - class to define all aop self methods

## 6. What is Pointcut in Spring AOP?
expression to find all main application methods to insert AOP

## 7. What is the Join point in Spring AOP?
In Spring AOP, a join point is a specific point in the flow of a program's execution at which advice can be applied to alter the program's behavior. Join points can be thought of as points in the code where an aspect can be applied.

## 8. What does it mean by Advice and its types in Spring AOP?
Advice in Spring AOP refers to the additional behavior that is executed before, after, or around a method execution, in order to add functionality to an application. In other words, advice allows you to add custom logic to specific points in your code without modifying the code itself.

## 9. Reading: https://www.javainuse.com/spring/sprbatch_interview
read

## 10. When to use Spring Batch?
Batch processing refers to the processing of a large amount of data at once, typically without user intervention. Here are some situations where Spring Batch may be a good fit:

Large Data Processing: Spring Batch is designed to handle the processing of large volumes of data efficiently. If you have a task that requires processing a large amount of data, Spring Batch can help you achieve this without running into memory or performance issues.

Repeated Data Processing: Spring Batch can be used to automate repeated data processing tasks, such as generating reports, running backups, or cleaning up data. This can save you time and resources in the long run.

Complex Data Processing: Spring Batch provides a range of features for complex data processing, such as error handling, retries, and transaction management. If you have a complex data processing task, Spring Batch can help you manage it more easily.

Scalability: Spring Batch is designed to be scalable, which means that it can handle an increasing volume of data processing without impacting performance. If your data processing needs are likely to grow over time, Spring Batch can be a good choice.

Integration: Spring Batch integrates well with other Spring frameworks, such as Spring Boot and Spring Integration. If you are already using these frameworks in your application, it may make sense to use Spring Batch for batch processing as well.

## 11. How Spring Batch works?
At a high level, Spring Batch works by defining a series of steps that are executed in a specific order to process a batch job. A batch job can be defined as a set of related tasks that are processed together, such as a payroll run or a daily sales report.

Reading data

Processing data

Writing data

Execution

Monitoring and reporting

## 12. How can we schedule a Spring Batch Job?
Using Cron Expressions

Using fixed delay

Using fixed rate

Using Spring's TaskScheduler

## 13. What is the cron expression?
Seconds Minutes Hours DayofMonth Month DayofWeek

## 14. What is the spring task?
efers to a scheduled task or a background job that needs to be executed periodically or at specific intervals.

## 15. When to use Spring task?
Scheduling recurring tasks、

Asynchronous processing

Batch processing

Triggering events

## 16. What is Filter and any filter example?
a filter is a component that intercepts incoming HTTP requests and outgoing HTTP responses to perform some processing on them. Filters can be used to modify the request or response, or to perform some additional tasks such as logging, authentication, or caching.

## 17. What is the Interceptor? What we can do with interceptor?
An Interceptor is a component before controller and after servlet that allows you to intercept incoming HTTP requests and outgoing HTTP responses. It provides a way to add cross-cutting concerns such as authentication, logging, and auditing to your application.

## 18. In Interceptor, What is preHandle? What is postHandle?
preHandle(): This method is called before the request is handled by the controller. It can be used to perform pre-processing of the request such as checking for authentication, validating the request parameters, etc.

postHandle(): This method is called after the request is handled by the controller but before the response is sent to the client. It can be used to perform post-processing of the response such as adding headers, modifying the response body, etc.

## 19. What is Swagger?
At its core, Swagger provides a set of APIs that can be used to generate documentation and client libraries automatically.

