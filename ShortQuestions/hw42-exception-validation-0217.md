1.  List all of the annotations you learned from class and homework to
    annotaitons.md
2.  what is the `@configuration` and `@bean`?
    * `@Configuration` annotation is normally applied on the class definition, and indicates that the class contains
        `@Bean` definition methods
    * `@Bean` means that an object that is instantiated, assembled, and managed by a Spring IoC container
3.  How do you handle the exception in Spring?
    * In Spring Boot, we would define a class called `GloabalExceptionHandler` to handle exceptions thrown by the service
      layer with `@ExceptionHandler` annotation
4.  How do you do the validations in Spring?
    * First we add `@NotEmpty` or `@Size()` in payload class definition
    * Second apply the rule in controller by providing `@Valid` keyword in the parameters
5.  What is the actuator?
    * It's a tool / library that we can use to monitor and application
6.  watch those videos(泛泛地看一遍，能理解多少是多少。千万千万不要看其它的视
    频，会走火入魔晕乎乎的)