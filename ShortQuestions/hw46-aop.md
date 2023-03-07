1. List all of the annotations you learned from class and homework to annotaitons.md

2. Briefly reading: <https://www.techgeeknext.com/spring-boot/spring-aop-interview-questions>

3. What is the Aspect Oriented Programming?

AOP is typically used to implement cross-cutting concerns, which implies that it defines functionality that is required in multiple places across an application in one place. You can add new functionality before or after a method is executed like transaction management, logging or security which cut across multiple types and objects (often termed crosscutting concerns).

4. What are the advantages and disadvantages of Spring AOP?

Advantages of Spring AOP

- It is easy to configure.
- Spring AOP is implemented in pure Java, so separate compilation unit or separate class loader are not required.
- It utilizes Spring's IOC container for dependency injection.

Disadvantages of Spring AOP

- Debugging the AOP framework-based application code is a little challenge.
- Only methods with a public visibility will be recommended, not those with a private, protected, or default visibility.
- Aspects cannot be advised by other aspects. This is because once a class is marked as an aspect (using XML or annotation), Spring prevents it from being auto-proxied.

5. What is Aspect in Spring AOP?

An aspect is a cross-cutting module that combines advice and pointcuts. A standard class tagged with the @Aspect annotation can be used to implement an aspect.

6. What is Pointcut in Spring AOP?

A pointcut is an expression that chooses one or more join points at which advice is given. Pointcuts can be defined using expressions or patterns. It supports a number of expressions that correspond to the join points.

7. What is the Join point in Spring AOP?

A join point is a place in the application where an AOP aspect is applied. It could also be a specific advice execution instance. A join point in AOP can be a method execution, exception handling, changing the value of an object variable, and so on.

8. What does it mean by Advice and its types in Spring AOP?

The advice is an action which we take before or after the method execution. In the Spring AOP framework, there are five types of advice: before, after, after-returning, after-throwing, and around advice. Advice is taken at a specific join point.

9. Reading: <https://www.javainuse.com/spring/sprbatch_interview>

10. When to use Spring Batch?

Consider an environment where users have to do a lot of batch processing. This will be quite different from a typical web application which has to work 24/7. But in classic environments it's not unusual to do the heavy lifting for example during the night when there are no regular users using your system. Batch processing includes typical tasks like reading and writing to files, transforming data, reading from or writing to databases, create reports, import and export data and things like that.

11. How Spring Batch works?

- step - A Step that delegates to a Job to do its work. This is a great tool for managing dependencies between jobs, and also to modularise complex step logic into something that is testable in isolation. The job is executed with parameters that can be extracted from the step execution, hence this step can also be usefully used as the worker in a parallel or partitioned execution.
- ItemReader - Strategy interface for providing the data. Implementations are expected to be stateful and will be called multiple times for each batch, with each call to read() returning a different value and finally returning null when all input data is exhausted. Implementations need not be thread-safe and clients of a ItemReader need to be aware that this is the case. A richer interface (e.g. with a look ahead or peek) is not feasible because we need to support transactions in an asynchronous batch.
- ItemProcessor - Interface for item transformation. Given an item as input, this interface provides an extension point which allows for the application of business logic in an item oriented processing scenario. It should be noted that while it's possible to return a different type than the one provided, it's not strictly necessary. Furthermore, returning null indicates that the item should not be continued to be processed.
- ItemStreamWriter - Basic interface for generic output operations. Class implementing this interface will be responsible for serializing objects as necessary. Generally, it is responsibility of implementing class to decide which technology to use for mapping and how it should be configured. The write method is responsible for making sure that any internal buffers are flushed. If a transaction is active it will also usually be necessary to discard the output on a subsequent rollback. The resource to which the writer is sending data should normally be able to handle this itself.

12. How can we schedule a Spring Batch Job?

To schedule a Spring Batch job, you can use the built-in scheduling capabilities provided by Spring Framework. Here are the steps you can follow:

- Add the Spring Batch and Spring Scheduler dependencies to your project.
- Create a Spring Batch job by defining a Job instance, which includes a set of Step instances that define the work to be done.
- Create a SchedulerFactoryBean bean in your Spring configuration file and set its properties to define the scheduling details, such as the start time, end time, and frequency of the job.

13. What is the cron expression?

A cron expression is a string consisting of six or seven fields, separated by spaces or tabs, that represent individual values for the second, minute, hour, day of the month, month, day of the week, and (optionally) year. It is used to define the schedule of a recurring job in the Spring Scheduler, and it allows you to specify the exact times at which the job should run.

You can also use special characters to define specific ranges of values, such as "-" to indicate a range of values, "," to specify multiple values, and "/" to specify increments. For example, "0 0 12-18 ? * MON-FRI" means "every weekday between 12:00 PM and 6:00 PM".

14. What is the spring task?

Spring Task is a feature of the Spring Framework that allows you to schedule tasks or jobs to run at a specific time or at regular intervals. It provides a simple and easy-to-use API for scheduling tasks within a Spring application context.

Spring Task is built on top of the Java Executor framework and provides a way to execute tasks in a separate thread pool. This ensures that the main thread of the application is not blocked while the task is being executed. The task can be a simple method call or a complex job that requires more processing.

15. When to use Spring task?

You can use Spring Task when you need to schedule tasks or jobs to run at a specific time or at regular intervals within a Spring application context. Here are some examples of when you might want to use Spring Task:

- Running batch jobs: Spring Task is ideal for running batch jobs that need to be executed at a specific time or at regular intervals, such as generating reports or processing data.
- Sending emails: If your application needs to send out emails at specific times or intervals, Spring Task can be used to schedule the sending of these emails.

16. What is Filter and any filter example?

In web development, a filter is a component that intercepts and processes HTTP requests and responses in a web application. Filters are used to perform tasks such as authentication, logging, and data compression, and they can be applied to any servlet or JSP in a web application.

Filters are implemented as Java classes that implement the javax.servlet.Filter interface, and they can be configured in the web.xml deployment descriptor file of a web application.

17. What is the Interceptor? What we can do with interceptor?

In web development, an interceptor is a component that intercepts and processes HTTP requests and responses in a web application. Interceptors are similar to filters, but they are more specialized and typically used for handling specific types of requests or actions.

Interceptors are implemented as Java classes that implement the org.springframework.web.servlet.HandlerInterceptor interface, and they can be configured in the Spring MVC framework to intercept requests and responses.

Overall, interceptors are a powerful tool for intercepting and processing HTTP requests and responses in a Spring MVC web application. They allow you to perform a wide range of tasks, from authentication and logging to error handling and performance optimization.

18. In Interceptor, What is preHandle? What is postHandle?

In Spring MVC's HandlerInterceptor interface, there are three methods that allow you to intercept and process HTTP requests and responses at different stages of the request processing pipeline: preHandle(), postHandle(), and afterCompletion().

The preHandle() method is called before the actual handler method is invoked, and it allows you to perform actions before the request is processed by the controller method. The method signature looks like this:

```java
boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception;
```

19. What is Swagger?

Swagger is an open-source software framework for designing, building, and documenting RESTful APIs. It provides a set of tools for developers to create APIs in a standardized way, using a common language and structure.

With Swagger, developers can define APIs using a simple and intuitive YAML or JSON format, which can be easily read and understood by both humans and machines. The Swagger tools then use this definition to generate documentation, client libraries, and server stubs, which can significantly reduce development time and improve API quality.

Swagger also provides a user-friendly interface, known as Swagger UI, which allows developers to explore and test APIs directly from their web browsers. This interface displays the API documentation in a clear and organized way, making it easy for developers to understand the API's capabilities and parameters.
