1.  List all of the annotations you learned from class and homework to
    annotations.md
2.  Briefly reading: https://www.techgeeknext.com/spring-boot/spring-aop-intervie
    w-questions
3.  What is the Aspect Oriented Programming?
    * It addresses the problem of cross-cutting concerns, which will be any kind of code that is repeated in different 
      methods and can't normally be refactored into own module, like logging or verification.
4.  What are the advantages and disadvantages of Spring AOP?
    * Pros:
      1. Make code more modularized
      2. Reduce coupling of dependencies
      3. Make code more repeatable and maintainable
    * Cons:
      1. AOP needs libraries to function
      2. Debugging could be difficult since more coded needs to be meets the standards
5.  What is Aspect in Spring AOP?
    * It's a class that defines all aop self methods
6.  What is Pointcut in Spring AOP?
    * It's an expression to find all main application methods to insert AOP
7. What is the Join point in Spring AOP?
   * It's a candidate point in the Program Execution of the application where an aspect can be plugged in. This point 
     can be considered as a method being called, an exception being thrown, or a field being modified.
8.  What does it mean by Advice and its types in Spring AOP?
   * Decides when to execute aop methods when the application pointcut is found
9.  Reading: https://www.javainuse.com/spring/sprbatch_interview
10. When to use Spring Batch?
    * Use Spring Batch under the scenario when a lot of batch processing is required, it often includes typical tasks
      such as reading and writing to files, transforming data,reading from or writing to databases.
11. How Spring Batch works?
    * It follows the traditional batch architecture. A job can have more than one stop, and every step typically 
      follows the sequence of reading data, processing it and writing it.
12. How can we schedule a Spring Batch Job?
    * By using the `@EnableScheduling` annotation
    * Creating a method annotated with `@Scheduled` and provide recurrence details with the job
13. What is the cron expression?
    * `cron` is a standard Unix utility that is used to schedule commands for automatic execution at specific intervals.
14. What is the spring task?
    * It's a lightweight timed execution tools that can run a task in a set time period with specified frequency
15. When to use Spring task?
    * You use Spring task when you want your software to perform some timed task, for example: data backup, count down
      for order, crawling web data, push news feed and notification, post article at a certian time.
16. What is Filter and any filter example?
    * Filter sensitive word (i.e. sql injection)
    * Set up character encodings
    * Compress response message
17.  What is the Interceptor? What we can do with interceptor?
    * Block a certain process and perform some operations, example:
        1. log in verification
     2. authorization check
     3. handling cookie
18. In Interceptor, What is preHandle? What is postHandle?
    * preHandle will be executed before the Controller method is executed
    * postHandle will be executed after the Controller method is executed
19. What is Swagger?
    * Swagger allows user to generate, describe, call, and visualize RESTful Web services and documentation generation.