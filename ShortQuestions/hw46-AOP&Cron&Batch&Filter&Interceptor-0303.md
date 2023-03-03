### 3. What is the Aspect Oriented Programming?
Aspect oriented programming(AOP) as the name suggests uses aspects in programming. It can be defined as the breaking of code into different modules, also known as modularisation, where the aspect is the key unit of modularity. Aspects enable the implementation of crosscutting concerns such as- transaction, logging not central to business logic without cluttering the code core to its functionality. It does so by adding additional behaviour that is the advice to the existing code. For example- Security is a crosscutting concern, in many methods in an application security rules can be applied, therefore repeating the code at every method, define the functionality in a common class and control were to apply that functionality in the whole application.

### 4. What are the advantages and disadvantages of Spring AOP?
**Advantages:**
- It is easy to configure.
- Spring AOP is implemented in pure Java, so separate compilation unit or separate class loader are not required.
- It utilizes Spring's IOC container for dependency injection.
- Can create aspects using @AspectJ annotation based or using XML based.
- It integrates cross-cutting concerns into the classes.


**Disadvantages:**
- Debugging the AOP framework-based application code is a little challenge.
- Only methods with a public visibility will be recommended, not those with a private, protected, or default visibility.
- Aspects cannot be advised by other aspects. This is because once a class is marked as an aspect (using XML or annotation), Spring prevents it from being auto-proxied.

### 5. What is Aspect in Spring AOP?
Aspect is a class that implements the application concerns that cuts across multiple classes, such as transaction management and logging. Aspects can be a normal class configured through Spring XML configuration or we can use @Aspect annotation.

### 6. What is Pointcut in Spring AOP?
Pointcut is an expression that is matched with join points to determine whether advice needs to be applied or not.

### 7. What is the Join point in Spring AOP?
A point during the execution of a program, such as the execution of a method or the handling of an exception. In Spring AOP, a join point always represents a method execution.

### 8. What does it mean by Advice and its types in Spring AOP?
Advices are actions that are taken for a particular join point. There are different types of advices, like, before, after and around advice.

### 10. When to use Spring Batch?
Consider an environment where users have to do a lot of batch processing. This will be quite different from a typical web application which has to work 24/7. But in classic environments it's not unusual to do the heavy lifting for example during the night when there are no regular users using your system. Batch processing includes typical tasks like reading and writing to files, transforming data, reading from or writing to databases, create reports, import and export data and things like that. Often these steps have to be chained together or you have to create more complex workflows where you have to define which job steps can be run in parallel or have to be run sequentially etc. That's where a framework like Spring Batch can be very handy. Spring Boot Batch provides reusable functions that are essential in processing large volumes of records, including logging/tracing, transaction management, job processing statistics, job restart, skip, and resource management. It also provides more advanced technical services and features that will enable extremely high-volume and high performance batch jobs though optimization and partitioning techniques.Simple as well as complex, high-volume batch jobs can leverage the framework in a highly scalable manner to process significant volumes of information.

### 11. How Spring Batch works?
- **step** - A Step that delegates to a Job to do its work. This is a great tool for managing dependencies between jobs, and also to modularise complex step logic into something that is testable in isolation. The job is executed with parameters that can be extracted from the step execution, hence this step can also be usefully used as the worker in a parallel or partitioned execution.
- **ItemReader** - Strategy interface for providing the data. Implementations are expected to be stateful and will be called multiple times for each batch, with each call to read() returning a different value and finally returning null when all input data is exhausted. Implementations need not be thread-safe and clients of a ItemReader need to be aware that this is the case. A richer interface (e.g. with a look ahead or peek) is not feasible because we need to support transactions in an asynchronous batch.
- **ItemProcessor** - Interface for item transformation. Given an item as input, this interface provides an extension point which allows for the application of business logic in an item oriented processing scenario. It should be noted that while it's possible to return a different type than the one provided, it's not strictly necessary. Furthermore, returning null indicates that the item should not be continued to be processed.
- **ItemStreamWriter** - Basic interface for generic output operations. Class implementing this interface will be responsible for serializing objects as necessary. Generally, it is responsibility of implementing class to decide which technology to use for mapping and how it should be configured. The write method is responsible for making sure that any internal buffers are flushed. If a transaction is active it will also usually be necessary to discard the output on a subsequent rollback. The resource to which the writer is sending data should normally be able to handle this itself.

### 12. How can we schedule a Spring Batch Job?
Spring Batch can be scheduled using Cron Job.

### 13. What is the cron expression?
A cron expression is a string consisting of six or seven fields, separated by spaces or tabs, that represent individual values for the second, minute, hour, day of the month, month, day of the week, and (optionally) year. It is used to define the schedule of a recurring job in the Spring Scheduler, and it allows you to specify the exact times at which the job should run.

```<second> <minute> <hour> <day-of-month> <month> <day-of-week> <year (optional)>```

### 14. What is the spring task?
SpringTask is a lightweight timing task tool independently developed by Spring, which is simpler and more convenient than Quartz, and can be used without introducing other dependencies. Just add a `@EnableScheduling` annotation to the configuration class to enable SpringTask's scheduled task capability.


### 15. When to use Spring task?
When we need to schedule tasks or jobs to run at a specific time or at regular intervals within a Spring application context. For example: 
- Running batch jobs
- Performing maintenance tasks
- Running background tasks
- Performing system health checks

### 16. What is Filter and any filter example?
A filter is an object that performs filtering tasks on either the request to a resource (a servlet or static content), or on the response from a resource, or both.

Some of the common use cases of filters are：

- Logging requests and response
- Logging request processing time
- Formatting of request body or header
- Verifying authentication tokens
- Compressing response
- Performing Image conversions


### 17. What is the Interceptor? What we can do with interceptor?
An Interceptor is a function that is invoked by the framework BEFORE or AFTER an action invocation. It allows a form of Aspect Oriented Programming, which is useful for some common concerns such as: Request logging.

We can use the Interceptor in Spring Boot to perform operations under the following situations − Before sending the request to the controller; Before sending the response to the client.
For example, we can use an interceptor to add the request header before sending the request to the controller and add the response header before sending the response to the client.

To work with interceptor, we need to create `@Component` class that supports it and it should implement the HandlerInterceptor interface.

### 18. In Interceptor, What is preHandle? What is postHandle?
- preHandle() method − This is used to perform operations before sending the request to the controller. This method should return true to return the response to the client.

- postHandle() method − This is used to perform operations before sending the response to the client.

### 19. What is Swagger?
Swagger is a set of open-source tools for writing REST-based APIs. It simplifies the process of writing APIs starkly, specifying the standards and providing the tools required to write robust, secure, performant and scalable APIs.
