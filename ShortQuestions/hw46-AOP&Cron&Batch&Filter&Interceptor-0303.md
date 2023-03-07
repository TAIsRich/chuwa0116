### What is the Aspect Oriented Programming?

AOP is typically used to implement **cross-cutting concerns**, which implies that it defines functionality that is required in multiple places across an application in one place. You can add new functionality before or after a method is executed like transaction management, logging or security which cut across multiple types and objects (often termed crosscutting concerns).

### What are the advantages and disadvantages of Spring AOP?

##### Advantages of Spring AOP

1. It is easy to configure.
2. Spring AOP is implemented in pure Java, so separate compilation unit or separate class loader are not required.
3. It utilizes Spring's IOC container for dependency injection.
4. Can create aspects using `@AspectJ` annotation based or using XML based.
5. It integrates cross-cutting concerns into the classes,.

##### Disadvantages of Spring AOP

1. Debugging the AOP framework-based application code is a little challenge.
2. Only methods with a public visibility will be recommended, not those with a private, protected, or default visibility.
3. Aspects cannot be advised by other aspects. This is because once a class is marked as an aspect (using XML or annotation), Spring prevents it from being auto-proxied.

### What is Aspect in Spring AOP?

> *An aspect is a* **cross-cutting module that combines advice and pointcuts***. A standard class tagged with the* `@Aspect` *annotation can be used to implement an aspect.*

[![Spring Boot AOP Aspect](https://www.techgeeknext.com/img/aop/aop-concepts.PNG)](https://www.techgeeknext.com/img/aop/aop-concepts.PNG)

Aspects are mostly used to enable cross-cutting concerns like logging, profiling, caching, and transaction management.



### What is Pointcut in Spring AOP?

*A pointcut is an* **expression** *that chooses one or more join points at which advice is given. Pointcuts can be defined using* **expressions or patterns***. It supports a number of expressions that correspond to the join points*

### What is the Join point in Spring AOP?

*A join point is a place in the application where an* **AOP aspect** *is applied. It could also be a specific advice execution instance. A join point in AOP can be a method execution, exception handling, changing the value of an object variable, and so on.*

### What does it mean by Advice and its types in Spring AOP?

The advice is an **action which we take before or after the method execution**. In the Spring AOP framework, there are five types of advice: **before**, **after**, **after-returning**, **after-throwing**, and **around advice**. Advice is taken at a specific join point.

[![Spring Boot AOP Advice Types](https://www.techgeeknext.com/img/aop/aop-advice.PNG)](https://www.techgeeknext.com/img/aop/aop-advice.PNG)

### When to use Spring Batch?

Consider an environment where users have to do a lot of batch processing. This will be quite different from a typical web application which has to work 24/7. But in classic environments it's not unusual to do the heavy lifting for example during the night when there are no regular users using your system. Batch processing includes typical tasks like reading and writing to files, transforming data, reading from or writing to databases, create reports, import and export data and things like that. Often these steps have to be chained together or you have to create more complex workflows where you have to define which job steps can be run in parallel or have to be run sequentially etc. That's where a framework like Spring Batch can be very handy. Spring Boot Batch provides reusable functions that are essential in processing large volumes of records, including logging/tracing, transaction management, job processing statistics, job restart, skip, and resource management. It also provides more advanced technical services and features that will enable extremely high-volume and high performance batch jobs though optimization and partitioning techniques.Simple as well as complex, high-volume batch jobs can leverage the framework in a highly scalable manner to process significant volumes of information.

### How Spring Batch works?

![boot13_1](https://www.javainuse.com/boot13_1.jpg)

- **step -** A Step that delegates to a Job to do its work. This is a great tool for managing dependencies between jobs, and also to modularise complex step logic into something that is testable in isolation. The job is executed with parameters that can be extracted from the step execution, hence this step can also be usefully used as the worker in a parallel or partitioned execution.
- **ItemReader -** Strategy interface for providing the data. Implementations are expected to be stateful and will be called multiple times for each batch, with each call to read() returning a different value and finally returning null when all input data is exhausted. Implementations need not be thread-safe and clients of a ItemReader need to be aware that this is the case. A richer interface (e.g. with a look ahead or peek) is not feasible because we need to support transactions in an asynchronous batch.
- **ItemProcessor -** Interface for item transformation. Given an item as input, this interface provides an extension point which allows for the application of business logic in an item oriented processing scenario. It should be noted that while it's possible to return a different type than the one provided, it's not strictly necessary. Furthermore, returning null indicates that the item should not be continued to be processed.
- **ItemStreamWriter -** Basic interface for generic output operations. Class implementing this interface will be responsible for serializing objects as necessary. Generally, it is responsibility of implementing class to decide which technology to use for mapping and how it should be configured. The write method is responsible for making sure that any internal buffers are flushed. If a transaction is active it will also usually be necessary to discard the output on a subsequent rollback. The resource to which the writer is sending data should normally be able to handle this itself.

### How can we schedule a Spring Batch Job?



### What is the cron expression?

Cron expressions are used to configure instances of CronTrigger, a subclass of org.quartz.Trigger. A cron expression is a string consisting of six or seven subexpressions (fields) that describe individual details of the schedule.



https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm

### What is the spring task?

Spring task scheduling for a task/job is a time based scheduled process which runs automatically as per the configuration supplied. Once scheduling is enabled in application, a scheduled task can execute automatically in Spring application.

### When to use Spring task? 

- 数据备份
- 订单未支付则自动取消
- 定时爬取数据
- 定时推送信息
- 定时发布文章
- 定时生成报表



### What is Filter and any filter example?

过滤器的创建和销毁都由 Web 服务器负责，Web 应用程序启动的时候，创建过滤器对象，为后续的请求过滤做好准备。

过滤器可以有很多个，一个个过滤器组合起来就成了 FilterChain，也就是过滤器链。

在 Spring 中，过滤器都默认继承了 OncePerRequestFilter，顾名思义，OncePerRequestFilter 的作用就是确保一次请求只通过一次过滤器，而不重复执行。



```java
JwtAuthenticationTokenFilter extends OncePerRequestFilter
```



### What is the Interceptor? What we can do with interceptor?

Interceptor can run some function before an api is called, or after. 

implement HandlerInterceptor interface.

preHandle, postHandle, afterCompletion.

- 登录验证，判断用户是否登录
- 权限验证，判断用户是否有权限访问资源，如校验token
- 日志记录，记录请求操作日志（用户ip，访问时间等），以便统计请求访问量
- 处理cookie、本地化、国际化、主题等
- 性能监控，监控请求处理时长等



### In Interceptor, What is preHandle? What is postHandle?



一个拦截器必须实现 HandlerInterceptor 接口，preHandle 方法是 Controller 方法调用前执行，postHandle 是 Controller 方法正常返回后执行，afterCompletion 方法无论 Controller 方法是否抛异常都会执行。

只有 preHandle 返回 true 的话，其他两个方法才会执行。

如果 preHandle 返回 false 的话，表示不需要调用Controller方法继续处理了，通常在认证或者安全检查失败时直接返回错误响应。



### What is Swagger?

It generate an API document of the project. So development can understand the api without looking at the source code.

