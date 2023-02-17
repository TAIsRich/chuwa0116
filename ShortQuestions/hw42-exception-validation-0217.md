# hw42-exception-validation-0217

## 1. List all of the annotations you learned from class and homework to annotations.md
see annotation.md

## 2. what is the @configuration and @bean?
@Configuration: This annotation
marks a class as a Configuration class in Java-based
configuration, it allows to register extra beans in the context
or import additional configuration classes

@Bean annotation is used when you want to
explicitly declare and register a bean into application
context, so that it will be managed by Spring.

## 3. How do you handle the exception in Spring?

Solution 1: the Controller-Level @ExceptionHandler

Solution 2: the HandlerExceptionResolver

Solution 3: @ControllerAdvice

Solution 4: ResponseStatusException (Spring 5 and Above)

## 4. How do you do the validations in Spring?
@Valid and @Notnull annotations in DTO class attributes.


## 5. What is the actuator?
In essence, Actuator brings production-ready features to our application.

Monitoring our app, gathering metrics, understanding traffic, or the state of our database become trivial with this dependency.

## 6 watch videos, omitted...


# hw43-Spring-Basics

## 1 update annotations.md

## 2. What is Spring and Springboot? What is the benefits of using Srpingboot?
The key difference or key feature of Spring is dependency injection and for spring boot it's autoconfiguration, with the help of Spring Boot Framework developers can reduce development time, Developer Effort, and increase productivity.

## 3. What is IOC and What is DI?
Spring IoC (Inversion of Control) Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.

## 4. What is @CompnonentScan ?
With Spring, we use the @ComponentScan annotation along with the @Configuration annotation to specify the packages that we want to be scanned. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.

## 5. How to define which package spring need to scan in xml and annotation?
we should remember that annotations are useless unless we activate them. In order to activate them, we can add either <context:annotation-config> or <context:component-scan> on top of our XML file.

## 6. What is @SpringbootApplication ?
@SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.

## 7. How many ways wo can define a bean?
Using @Bean annotation

Using @ComponentScan and @Component annotations

Using XML configuration

Using @Autowired and @Qualifier annotations

## 8. What is default bean name for @Component and @Bean ?
Default component name is class name, default bean name is method name.

## 9. What is the difference between @component and @service,@repository ?
@Component is a generic stereotype for any Spring-managed component. @Service annotates classes at the service layer. @Repository annotates classes at the persistence layer, which will act as a database repository.

## 10. How many annotation we can use to inject the bean?
@Autowired @Qualifier @Resource and @Inject

## 11. Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
Constructor injection, Setter injection, Field injection. Of these three types of dependency injection, constructor injection is generally considered the best because it ensures that objects are always created with all required dependencies, making the code easier to understand and test.

## 12. If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primary.
you can mark one bean as the primary bean for a particular type by using the @Primary annotation.

If there is no primary bean defined, Spring will use a fallback strategy to determine which bean to inject. The strategy depends on the type of injection being used:

For @Autowired or constructor injection, Spring will try to match the type of the parameter to a bean in the application context. If there are multiple beans of that type, an exception will be thrown.

For @Resource or setter injection, Spring will try to match the name of the property to a bean in the application context. If there are multiple beans with the same name, an exception will be thrown.

## 13. What is the difference between BeanFactory and ApplicationContext in Spring?
if you need a lightweight container with basic dependency injection support, you can use BeanFactory. If you need more advanced features such as AOP, internationalization, and event propagation, you should use ApplicationContext.

## 14. What is the Scope of a Bean? and list the examples for each scope.
The scope of a bean determines the lifecycle and visibility of the object within the Spring application context. There are several bean scopes available in Spring, and each one defines a different way of managing the lifecycle of a bean.

Singleton: In this scope, there is only one instance of the bean throughout the entire application context. This is the default scope for Spring beans.

Prototype: In this scope, a new instance of the bean is created each time it is requested by the application.

