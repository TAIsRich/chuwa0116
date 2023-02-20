# Q2

```@Configuration``` indicates that the class has ```@Bean``` definition methods, so Spring container can process the class and generate Spring Beans to be used in the application. 
```@Bean``` is a method-level annotation and a direct analog of the XML <bean/> element. 

# Q3

To handle the exception in Spring, we can create a new class and annotate it with ```@ControllerAdvice```. We then create methods in it and annotate them with ```@ExceptionHandler```. Those method bodies are where we handle the exceptions and return the results.

# Q4

- import dependency
- add validation rule to payload
- add ```@valid``` to controller to apply the rule

# Q5

Spring Boot Actuator is used to expose operational information about the running application — health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.

====================================================================================================================================================================================================

# Q2

# Q3

IoC (Inversion of control) is a software design principle that asserts a program can benefit in terms of pluggability, testability, usability and loose coupling if the management of an application's flow is transferred to a different part of the application. Spring IoC Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.

# Q4

In spring, we use the ```@ComponentScan``` annotation along with the ```@Configuration``` annotation to specify the packages that we want to be scanned.

# Q6

Spring Boot @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.

# Q8

- ```@Component``` uses the class name and convert the first letter to lowercase.
- ```@Bean``` uses the method name as the bean name.

# Q9

No big difference, they just helps developers to tell what they do.

# Q10

- ```@Autowired```
- ```@Resource```
- ```@Inject```

# Q11

- constructor injection

- setter injection

- field injection
  Normally, constructor injection is the better choice.
  
  # Q12
  
  We use ```@Primary``` to set primary bean. We use ```@Qulaifier``` to pick one explicitly.
  
  # Q14

- Singleton

- Prototype

- Request

- Session

- Application

- Websocket
