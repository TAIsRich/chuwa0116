1. List all of the annotations you learned from class and homework to annotaitons.md
2. Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-intervie w-questions
3. What is the Aspect Oriented Programming?
    * AOP addresses the problem of cross-cutting concerns, which would be any kind of code that is repeated in different methods and can't normally be completely refactored into its own module, like with logging or verification.
4. What are the advantages and disadvantages of Spring AOP?
    * advantages: 
      * Service or Domain classes get advice by the aspects (cross-cutting concerns) without adding Spring AOP related classes or interfaces into the service or domain classes.
      * It uses Spring’s IOC container for dependency injection:
    * disadvantages:
      * Since it uses proxy based AOP, only method level advising is supported, doesn’t support field level interception
      * A little runtime overhead, but its negligible
      * Aspects cannot advise other Aspects
      * Local or internal method calls within an advised class don’t get intercepted by proxy, so the advice method of the aspect does not get fired or invoked.
5. What is Aspect in Spring AOP?
    * Aspect: a modularization of a concern that cuts across multiple classes.
6. What is Pointcut in Spring AOP?
    * Pointcut: a predicate that matches join points.
7. What is the Join point in Spring AOP?
    * Join point: a point during the execution of a program, such as the execution of a method or the handling of an exception. In Spring AOP, a join point always represents a method execution.
8. What does it mean by Advice and its types in Spring AOP?
    * Advice: action taken by an aspect at a particular join point.
    * Types: After, before, AfterThrowing, AfterReturning, Around
9. Reading: https://www.javainuse.com/spring/sprbatch_interview
10. When to use Spring Batch?
   *  Batch processing includes typical tasks like reading and writing to files, transforming data, reading from or writing to databases, create reports, import and export data and things like that. Often these steps have to be chained together or you have to create more complex workflows where you have to define which job steps can be run in parallel or have to be run sequentially etc. That's where a framework like Spring Batch can be very handy.
11. How Spring Batch works?
   * step - A Step that delegates to a Job to do its work. 
   * ItemReader - Strategy interface for providing the data. 
   * ItemProcessor - Interface for item transformation. 
   * ItemStreamWriter - Basic interface for generic output operations. 
12. How can we schedule a Spring Batch Job?
   * Spring Batch can be scheduled using Cron Job.
13. What is the cron expression?
   * <minute> <hour> <day-of-month> <month> <day-of-week> <command>
14. What is the spring task?
   * Spring task scheduling for a task/job is a time based scheduled process which runs automatically as per the configuration supplied.
15. When to use Spring task?
   * when we want to schedule a task/job for time-based process and run it automatically.
16. What is Filter and any filter example?
   * A filter is an object used to intercept the HTTP requests and responses of your application.
   * @WebFilter annotation is used to define a Filter in a web application. This annotation is specified on a class and contains metadata about the filter being declared.
17. What is the Interceptor? What we can do with interceptor?
   * The Interceptor globally catches every outgoing and in coming request at a single place. 
   * We can use it to add custom headers to the outgoing request, log the incoming response, etc.
18. In Interceptor, What is preHandle? What is postHandle?
   * prehandle() – called before the execution of the actual handler. 
   * postHandle() – called after the handler is executed.
19. What is Swagger?
   * Swagger allows you to describe the structure of your APIs so that machines can read them. 
