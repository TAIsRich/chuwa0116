### Spring AOP

##### 1. List all of the annotations you learned from class and homework to `annotaitons.md`
All the updates have been included in that file.

##### 2. Briefly Reading

##### 3. What is the Aspect Oriented Programming?
Aspect Oriented Programming is actually a paradigm which increases the modularity by allowing the separtion of cross-cutting concerns. Without modifying the existing code, the developers just need to identify which code needs to be modified by speficying the 'pointcut', and then add the operations to those pointcut.

##### 4. What are the advantages and disadvantages of Spring AOP?
Advantages:
- It is easy to configure.
- Spring AOP is implemented in pure Java, so separate compilation unit or separate class loader are not required.
- It utilizes Spring's IOC container for dependency injection.
- Can create aspects using @AspectJ annotation based or using XML based.
- It integrates cross-cutting concerns into the classes,.
Disadvantages:
- Debugging the AOP framework-based application code is a little challenge.
- Only methods with a public visibility will be recommended, not those with a private, protected, or default visibility.
- Aspects cannot be advised by other aspects. This is because once a class is marked as an aspect (using XML or annotation), Spring prevents it from being auto-proxied.


##### 5. What is Aspect in Spring AOP?
Aspect is actually a cross-cutting module which includes both the Advices and Pointcuts

##### 6. What is Pointcut in Spring AOP?
Pointcuts actually are the expressions that could select one or more join points to give advice

##### 7. What is the Join point in Spring AOP?
JoinPoint is actually a place in the application where AOP aspect is applied to.

##### 8. What does it mean by Advice and its types in Spring AOP?
The advice is actually the action we take before or after a specific join point. The types of Advice are: before, after, after-returning, after-throwing, and around advice

##### 9. Reading

##### 10. When to use Spring Batch?
Actually, SpringBatch could help you execute your job batch periodically even 24/7, and you could let the jobs work parallelly or sequenetialy at your discretion. 

##### 11. How Spring Batch works?
Spring Batch follows the traditional batch architecture where a job repository does the work of scheduling and interacting with the job. A job can have more than one step. And every step typically follows the sequence of reading data, processing it and writing it.

##### 12. How can we schedule a Spring Batch Job?
We could use CRON expressions to schedule a Spring Batch Job

##### 13. What is the cron expression?
The cron command-line utility is a job scheduler on Unix-like operating systems. Users who set up and maintain software environments use cron to schedule jobs(commands or shell scripts), also known as cron jobs, to run periodically at fixed times, dates, or intervals. It typically automates system maintenance or administration—though its general-purpose nature makes it useful for things like downloading files from the Internet and downloading email at regular intervals.

##### 14. What is the spring task?
Spring task scheduling for a task/job is a time based scheduled process which runs automatically as per the configuration supplied. 
##### 15. When to use Spring task? 
When we want to schedule a job in a specific time to execute, we could set a Spring task for us to achieve this.
##### 16. What is Filter and any filter example?
Java Servlet Filter is used to intercept the client request and do some pre-processing. It can also intercept the response and do post-processing before sending to the client in web application. For example, we could use filter to check if one user has the necessary credentials to access our system, if not, we could block his requests in the filter.
##### 17. What is the Interceptor? What we can do with interceptor?
The Interceptor in Spring is actually used to intercept every client requests, and is very similar to the filter. We could do some pre-processing and post-processing.
##### 18. In Interceptor, What is preHandle? What is postHandle?
preHandle will be executed once the interceptor intercepts the requests, however, the postHandle will be executed once all the interceptors have successfully executed their takss.
##### 19. What is Swagger?
Swagger is actually used to give you a summary of APIs used in your system.