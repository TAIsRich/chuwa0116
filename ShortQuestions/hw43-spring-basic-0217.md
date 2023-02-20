1. List all of the annotations you learned from class and homework to
    annotaitons.md
2. What is Spring and Springboot? What is the benfits of using Srpingboot?  
   Spring and Spring Boot are two related frameworks for building Java applications. Spring is a popular framework for building enterprise Java applications, while Spring Boot is a tool that simplifies the process of building and deploying Spring applications.  
   Some of the benefits of using Spring Boot include:
* Simplified configuration: Spring Boot provides auto-configuration that automatically configures many of the commonly used Spring modules, reducing the amount of boilerplate code you need to write. 
* Embedded web server: Spring Boot includes an embedded web server, so you can run your application as a standalone executable JAR file without needing to deploy it on a separate server. 
* Easy dependency management: Spring Boot uses Maven or Gradle to manage dependencies, making it easy to add and manage third-party libraries. 
* Production-ready features: Spring Boot includes a range of production-ready features, such as health checks, metrics, and tracing, that make it easy to monitor and manage your application in a production environment. 
* Active community: Spring Boot has a large and active community, which means there is a wealth of documentation, examples, and support available.
3. What is IOC and What is DI?  
   IOC stands for Inversion of Control, which is a design principle in software development that aims to invert the flow of control in a software system. In traditional programming, the programmer controls the flow of execution by calling functions or methods in a specific order to accomplish a task.  
   DI stands for Dependency Injection, which is a software design pattern used to implement IOC. In DI, the dependencies of a class or object are passed in as parameters or set via properties, rather than being instantiated within the class itself.
4. What is  @CompnonentScan?  
   @ComponentScan is an annotation in Spring that is used to enable component scanning in your application.
5. How to define which package spring need to scan in xml and annotaiton?  
   In Spring, we could define which packages to scan for components (such as controllers, services, repositories, and entities) using either XML configuration or annotations.

In XML configuration, we could use the <context:component-scan> element to define which packages to scan.
6. What is  @SpringbootApplication?  
   @SpringBootApplication is a convenience annotation that combines three other annotations commonly used in Spring Boot applications: @Configuration, @EnableAutoConfiguration, and @ComponentScan. It is typically used to annotate the main class of a Spring Boot application, as it enables auto-configuration and component scanning for the application.
7. How many ways wo can define a bean?  
* XML configuration: You can define beans using XML configuration files, using the <bean> element. 
* Java configuration: You can define beans using Java configuration classes, annotated with @Configuration, and define bean methods using @Bean. 
* Component scanning: You can use component scanning to automatically detect beans in the classpath, using annotations like @Component, @Service, @Repository, and @Controller. 
* Singleton beans: You can define a bean as a singleton, which means there is only one instance of the bean in the application context. This is the default scope for beans. 
* Prototype beans: You can define a bean as a prototype, which means a new instance of the bean is created each time it is requested from the application context. 
* Lazy initialization: You can specify that a bean should be lazily initialized, which means it will only be created when it is first requested from the application context. 
* Conditional bean registration: You can conditionally register beans based on certain conditions, using annotations like @ConditionalOnProperty, @ConditionalOnClass, and @ConditionalOnMissingBean.
8. What is default bean name for  @Component and  @Bean?  
   For @Component, the default bean name is the uncapitalized non-qualified class name. For example, if you have a class MyComponent, the default bean name will be myComponent.

For @Bean, the default bean name is the name of the method that is annotated. For example, if you have a method createMyBean annotated with @Bean, the default bean name will be createMyBean.  
```java
@Component("myCustomName")
public class MyComponent {
   // ...
}

@Bean("myCustomName")
public MyBean createMyBean() {
   // ...
}
```
9. What is the difference between  @component and  @service,@repository?  
  @Component is a general-purpose stereotype annotation that can be used to annotate any class, indicating that it is a Spring-managed component. It is typically used to indicate that a class is a simple POJO (Plain Old Java Object) that does not fall into any of the other stereotype categories.  
  @Service is a specialization of @Component and is used to annotate classes that perform a service in the application. It is typically used to indicate that a class is a business service or logic layer that sits between the controller and the data access layer.   
  @Repository is also a specialization of @Component and is used to annotate classes that perform data access operations in the application. It is typically used to indicate that a class is a DAO (Data Access Object) that interacts with a database or other data storage mechanism.
10. How many annotaitons we can use to inject the bean?  
* @Autowired: This is the most commonly used annotation for dependency injection. It can be used to inject a bean into a class by type, by name, or by qualifier.
* @Resource: This annotation can be used to inject a bean into a class by name or by type. 
* @Inject: This annotation is similar to @Autowired and can be used to inject a bean by type. 
* @Value: This annotation can be used to inject a value from a property file or an environment variable into a class. 
* @Qualifier: This annotation can be used in conjunction with @Autowired or @Resource to specify the name or qualifier of the bean to be injected.
11. Tell me the three types to do dependency injection(How can we inject the beans
    in Spring)? Which way is better and why?  
    Constructor Injection: In this type of injection, dependencies are provided as arguments to the constructor of the class. The container then creates the instance of the class by invoking the constructor with the required dependencies.
```java
public class MyService {
  private final MyRepository myRepository;
  
  public MyService(MyRepository myRepository) {
    this.myRepository = myRepository;
  }
}
```
Setter Injection: In this type of injection, dependencies are provided through setter methods on the class. The container sets the values of the dependencies by invoking the corresponding setter methods.
```java
public class MyService {
  private MyRepository myRepository;
  
  public void setMyRepository(MyRepository myRepository) {
    this.myRepository = myRepository;
  }
}

```
Field Injection: In this type of injection, dependencies are provided as public or private fields on the class. The container sets the values of the fields directly.
```java
public class MyService {
  @Autowired
  private MyRepository myRepository;
}
```

Constructor injection is considered the most preferred method as it promotes immutability and ensures that all dependencies are available at the time of object creation. Field injection is considered the least preferred method as it may promote bad practices such as tight coupling and can make it difficult to test the class in isolation.
13. If we have multiple beans for one type, how to set one is primary? and how to let
    the spring to pick one bean to inject if no primay.
    If there are multiple beans of the same type in a Spring application context, we could specify which bean should be used as the primary bean using the @Primary annotation. The @Primary annotation can be added to a specific bean definition to indicate that it should be the preferred bean when multiple beans of the same type are present.

14. What is the difference between BeanFactory and ApplicationContext in Spring?  
    BeanFactory is the simplest container that provides basic support for dependency injection and bean creation.  
    ApplicationContext is a more advanced container that adds additional features to the BeanFactory, including support for internationalization, event propagation, and the ability to load multiple configurations from different sources.  
The different between them:
* Lazy-loading: BeanFactory loads beans lazily, meaning that it only loads a bean when it is requested. ApplicationContext, on the other hand, loads all singleton beans when the application context is created. 
* Lifecycle events: ApplicationContext provides support for lifecycle events, such as initializing and destroying beans. 
* Internationalization: ApplicationContext provides support for internationalization of messages and resources. 
* Resource loading: ApplicationContext provides support for loading resources, such as files and URLs, from the classpath or file system.
15. What is the Scope of a Bean?  and list the examples for each scope.  
    In Spring, the scope of a bean determines how long the bean should exist and how many instances of the bean should be created. The following are the different bean scopes in Spring:

Singleton: This is the default scope in Spring, where only one instance of the bean is created and shared across the entire application. If a bean is defined as a singleton, Spring will always return the same instance of the bean for each request.  
Example: A bean that manages the database connection pool.

Prototype: A new instance of the bean is created every time it is requested. This scope is useful for beans that have state that needs to be reset on every request.  
Example: A bean that generates a unique ID for each request.

Request: A new instance of the bean is created for each HTTP request in a web application. The bean is destroyed at the end of the request.  
Example: A bean that stores the user's shopping cart during an e-commerce transaction.

Session: A new instance of the bean is created for each user session in a web application. The bean is destroyed when the user's session ends.  
Example: A bean that stores the user's authentication credentials during a session.

Global session: A new instance of the bean is created for each global session in a portlet application. This scope is similar to the session scope, but for portlet applications.  
Example: A bean that stores the user's preferences in a portlet application.

Application: A single instance of the bean is created for the entire application context. The bean is destroyed when the application context is destroyed.  
Example: A bean that provides configuration information for the entire application.

WebSocket: A new instance of the bean is created for each WebSocket connection in a Spring-based WebSocket application.  
Example: A bean that manages the state of a chat room in a WebSocket application.
16. Configure a bean using xml. If bean has parameters/dependencies, how can we
    configure the bean? (you can google the tutorial how to configure beans in xml,
    and feel free to ask me any quesitons if you don't understand. it is a little bit old,
    I am not sure if I need to exaplain it in class)
    To configure a bean using XML in Spring, we could use the <bean> element. 