2. Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-intervie
    w-questions
3. What is the Aspect Oriented Programming?  
   Aspect-oriented programming (AOP) is a programming paradigm that aims to increase modularity and separation of concerns by allowing cross-cutting concerns to be defined as aspects. In traditional object-oriented programming (OOP), objects are organized into classes that encapsulate data and behavior. However, there may be additional behavior that does not fit into a single class and may be scattered across multiple classes.

4. What are the advantages and disadvantages of Spring AOP?  
* Advantages of Spring AOP:
  * Spring AOP allows you to separate your application logic from cross-cutting concerns, such as logging, transaction management, security, and performance monitoring. This improves the overall maintainability and modularity of your code. 
  * AOP enables you to write cleaner, more concise code by reducing the amount of boilerplate code needed for cross-cutting concerns. 
  * Spring AOP is flexible and can be easily applied to different layers of your application, including the presentation layer, service layer, and persistence layer. 
  * It integrates seamlessly with other Spring components, such as Spring MVC and Spring Security, making it easy to use in a Spring-based application.
* Disadvantages of Spring AOP:
  * AOP introduces additional complexity to your application, which can make it more difficult to understand and debug. 
  * Spring AOP does not provide the full range of AOP features available in other frameworks, such as AspectJ. 
  * There is a performance overhead associated with using AOP, especially for complex pointcuts or when intercepting methods that are called frequently. 
  * As with any framework or tool, there is a learning curve associated with using Spring AOP effectively.
5. What is Aspect in Spring AOP?  
   Aspect: An aspect is a class that implements enterprise application concerns that cut across multiple classes, such as transaction management. Aspects can be a normal class configured through Spring XML configuration or we can use Spring AspectJ integration to define a class as Aspect using @Aspect annotation.
6. What is Pointcut in Spring AOP?  
   Pointcut: Pointcut is expressions that are matched with join points to determine whether advice needs to be executed or not. Pointcut uses different kinds of expressions that are matched with the join points and Spring framework uses the AspectJ pointcut expression language.
7. What is the Join point in Spring AOP?  
   A Joinpoint is a point in Spring AOP during the execution of a program, such as the execution of a method or the handling of an exception, etc. This symbolizes a point in your web application where you can easily plug in the AOP aspect of your software. In Spring AOP, a JoinPoint always represents a method execution.
8. What does it mean by Advice and its types in Spring AOP?  
   In Spring AOP a join point is always the execution of a method. Advice: Advices are actions taken for a particular join point. In terms of programming, they are methods that get executed when a certain join point with matching pointcut is reached in the application.
9. Reading: https://www.javainuse.com/spring/sprbatch_interview
10. When to use Spring Batch?  
    You can use Spring Batch in both simple use cases (such as reading a file into a database or running a stored procedure) and complex, high volume use cases (such as moving high volumes of data between databases, transforming it, and so on).
11. How Spring Batch works?  
    Spring Batch follows the traditional batch architecture where a job repository does the work of scheduling and interacting with the job. A job can have more than one step. And every step typically follows the sequence of reading data, processing it and writing it.
12. How can we schedule a Spring Batch Job?   
We have two ways
* Using the @EnableScheduling annotation.
* Creating a method annotated with @Scheduled and providing recurrence details with the job. Then add the job execution logic inside this method.
14. What is the cron expression?  
    Cron expressions are used to configure instances of CronTrigger, a subclass of org.quartz.Trigger. A cron expression is a string consisting of six or seven subexpressions (fields) that describe individual details of the schedule.
15. What is the spring task?  
    Spring task scheduling for a task/job is a time based scheduled process which runs automatically as per the configuration supplied. Once scheduling is enabled in application, a scheduled task can execute automatically in Spring application.
16. When to use Spring task?  
    Spring Task is useful when you need to run background jobs or periodic tasks, such as sending emails, generating reports, or updating caches. Instead of writing custom scheduling code, you can use Spring Task to schedule these tasks, making your code simpler and more manageable.
17. What is Filter and any filter example?  
    In Spring, a filter is a component that can be used to intercept incoming requests and responses before they reach the actual resource being accessed. Filters are used for various purposes, such as logging, authentication, authorization, caching, and more.
```java
@Component
public class LoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        
        String method = req.getMethod();
        String uri = req.getRequestURI();
        
        System.out.println("Incoming request: " + method + " " + uri);
        
        chain.doFilter(request, response);
    }

}
```
18. What is the Interceptor? What we can do with interceptor?  
    The Interceptor is a river going vessel that extracts river debris autonomously using river currents and a conveyer belt system.  
    Interceptors allow us to “intercept” incoming (or outgoing) HTTP requests using the HttpClient . By intercepting an HTTP request, we can modify or change the value of the request.
19. In Interceptor, What is preHandle? What is postHandle?  
    The HandlerInterceptor contains three main methods: 
* prehandle() – called before the execution of the actual handler. 
* postHandle() – called after the handler is executed. 
* afterCompletion() – called after the complete request is finished and the view is generated.
20. What is Swagger?  
    Swagger is a set of open-source tools built around the OpenAPI Specification that can help you design, build, document and consume REST APIs. 