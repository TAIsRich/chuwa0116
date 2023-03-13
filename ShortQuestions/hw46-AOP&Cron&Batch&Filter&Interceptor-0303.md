# hw46-AOP&Cron&Batch&Filter&Interceptor-0303 - Hao Jia

### What is the Aspect Oriented Programming?
Aspect-oriented programming (AOP) is a programming technique that supports the separation of cross-cutting concerns in order to increase modularity.

### What are the advantages and disadvantages of Spring AOP?
Advantages of Spring AOP
+ It is easy to configure.
+ Spring AOP is implemented in pure Java, so separate compilation unit or separate class loader are not required.
+ It utilizes Spring's IOC container for dependency injection.
+ Can create aspects using @AspectJ annotation based or using XML based.
+ It integrates cross-cutting concerns into the classes,.

Disadvantages of Spring AOP
+ Debugging the AOP framework-based application code is a little challenge.
+ Only methods with a public visibility will be recommended, not those with a private, protected, or default visibility.
+ Aspects cannot be advised by other aspects. This is because once a class is marked as an aspect (using XML or annotation), Spring prevents it from being auto-proxied.

### What is Aspect in Spring AOP?
An aspect is a cross-cutting module that combines advice and pointcuts. A standard class tagged with the @Aspect annotation can be used to implement an aspect.

### What is Pointcut in Spring AOP?
A pointcut is an expression that chooses one or more join points at which advice is given. Pointcuts can be defined using expressions or patterns. It supports a number of expressions that correspond to the join points.

### What is the Join point in Spring AOP?
A join point is a place in the application where an AOP aspect is applied. It could also be a specific advice execution instance. A join point in AOP can be a method execution, exception handling, changing the value of an object variable, and so on.

### What does it mean by Advice and its types in Spring AOP?
The advice is an action which we take before or after the method execution. In the Spring AOP framework, there are five types of advice: before, after, after-returning, after-throwing, and around advice. Advice is taken at a specific join point.

### When to use Spring Batch?
Consider an environment where users have to do a lot of batch processing. This will be quite different from a typical web application which has to work 24/7. But in classic environments it's not unusual to do the heavy lifting for example during the night when there are no regular users using your system. Batch processing includes typical tasks like reading and writing to files, transforming data, reading from or writing to databases, create reports, import and export data and things like that. Often these steps have to be chained together or you have to create more complex workflows where you have to define which job steps can be run in parallel or have to be run sequentially etc. That's where a framework like Spring Batch can be very handy. Spring Boot Batch provides reusable functions that are essential in processing large volumes of records, including logging/tracing, transaction management, job processing statistics, job restart, skip, and resource management. It also provides more advanced technical services and features that will enable extremely high-volume and high performance batch jobs though optimization and partitioning techniques.Simple as well as complex, high-volume batch jobs can leverage the framework in a highly scalable manner to process significant volumes of information.

### How Spring Batch works?
![This is an image](https://www.javainuse.com/boot13_1.jpg)

### How can we schedule a Spring Batch Job?
Spring Batch can be scheduled using Cron Job.

### What is the cron expression?
https://tobebetterjavaer.com/springboot/springtask.html#%E5%85%B3%E4%BA%8E-cron-%E8%A1%A8%E8%BE%BE%E5%BC%8F

### What is the spring task?
Spring Task 是 Spring 提供的轻量级定时任务工具，也就意味着不需要再添加第三方依赖了，相比其他第三方类库更加方便易用。



### When to use Spring task?
+ Periodic tasks
+ Time-based tasks
+ Asynchronous tasks
+ Batch jobs
### What is Filter and any filter example?
a filter is a component that intercepts and processes requests and responses between a client and a server. Filters are used to perform operations on the request or response, such as modifying headers, logging requests, or enforcing security constraints.

### What is the Interceptor? What we can do with interceptor?
+ an interceptor is a component that intercepts and processes requests and responses similar to a filter. However, unlike a filter, an interceptor is typically associated with a specific controller or handler method.
+ Interceptors are used to perform operations on the request or response that are specific to a particular controller or handler method, such as checking if the user is authenticated or authorized, adding common attributes to the model, or logging requests.

### In Interceptor, What is preHandle? What is postHandle?
+ preHandle(): This method is called before the controller or handler method is invoked. It can be used to perform pre-processing tasks on the request, such as checking if the user is authenticated or authorized.
+ postHandle(): This method is called after the controller or handler method is invoked, but before the view is rendered. It can be used to add common attributes to the model or modify the response.

### What is Swagger?
Swagger is an open-source framework for designing, building, and documenting RESTful APIs. It provides a set of tools and standards for describing the structure and behavior of APIs, making it easier for developers to consume and integrate with them.