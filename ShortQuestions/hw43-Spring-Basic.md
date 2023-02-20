### What is Spring and Springboot? What is the benefits of using springboot?

The **Spring** framework provides comprehensive infrastructure support for developing Java applications.

It's packed with some nice features like Dependency Injection, and out of the box modules like:

- Spring JDBC
- Spring MVC
- Spring Security
- Spring AOP
- Spring ORM
- Spring Test

These modules can drastically reduce the development time of an application.

**Spring Boot** is basically an extension of the Spring framework, which eliminates the boilerplate configurations required for setting up a Spring application.

It takes an opinionated view of the Spring platform, which paves the way for a faster and more efficient development ecosystem.

Here are just a few of the features in Spring Boot:

- Opinionated ‘starter' dependencies to simplify the build and application configuration
- Embedded server to avoid complexity in application deployment
- Metrics, Health check, and externalized configuration
- Automatic config for Spring functionality – whenever possible

### What is IOC and What is DI?

Spring IoC (Inversion of Control) Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.

### What is  @ComponentScan?

Define where the spring need to scan the bean definitions and generate the beans

### How to define which package spring need to scan in xml and annotation?

ClassPathXmlApplicationContext

```java
ApplicationContext context = 
        new ClassPathXmlApplicationContext("bean.xml");
```

AnnotationConfigApplicationContext

```java
ApplicationContext context = 
        new AnnotationConfigApplicationContext(BeanConfig.class);
```

`@ComponentScan(basePackages = {"com.chuwa.springbasic"})`

### What is  @SpringbootApplication?

Spring Boot SpringApplication class is used to bootstrap and launch a Spring application from a Java main method. This class automatically creates the ApplicationContext from the classpath, scan the configuration classes and launch the application.

### How many ways wo can define a bean?

There are three different ways in which you can define a Spring bean:

1. annotating your class with the stereotype @Component annotation (or its derivatives)
2. writing a bean factory method annotated with the @Bean annotation in a custom Java configuration class
3. declaring a bean definition in an XML configuration file

### What is default bean name for  @Component and  @Bean?

It's the method name.

### What is the difference between  @component and  @service,@repository?

Annotate other components (for example REST resource classes) with @Component.

@Component is a generic stereotype for any Spring-managed component.
@Repository, @Service, and @Controller are specializations of @Component for more specific use cases,
for example, in the persistence, service, and presentation layers, respectively.

![](https://www.techferry.com/articles/images/SpringComponentAnnotations.jpg)

### How many annotations we can use to inject the bean?

@Resource @Inject @Autowire

### Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?

Field vs Setter vs Constructor Injection

**Readability**

- Field Injection: The Best. Less boilerplate code. The focus is on business logic.
- Constructor Injection: Better. Constructors visually stand separate from methods.
- Setter Injection: Worst. When we have a large number of fields, the setter methods cause a focus shift.

**Immutability**

- Constructor Injection: Supports immutability.
- Setter Injection: No immutability.
- Field Injection: No immutability.

**State Safety**

- Constructor Injection: State Safe. The object is instantiated to the entire state or is not instantiated at all.
- Setter Injection: The consumer uses a no-argument constructor. And possibly miss calling one of the setters or call the same setter twice with a different value (copy-paste bugs)
- Field Injection: Consumer uses no-argument constructor. There is no valid way to set the state of the object. The only option is to use Reflection to set the private fields.

### If we have multiple beans for one type, how to set one is primary? and how to let the spring pick one bean to inject if no primary

Use @Primary annotation. It will pick by the name.

### What is the difference between BeanFactory and ApplicationContext in Spring?

ApplicationContext Container is advanced than Beanfactory Container...

1) BeanFactory Container is basic container, it can only create objects and inject Dependencies.But we can not attach other services like security, transaction ,messaging etc. To provied all the services we have to use ApplicationContext Container.

2) BeanFactory Container doesn't support the feature of AutoScanning , but ApplicationContext Container supports.

3) Beanfactory Container will not create a bean object upto the request time.It means Beanfactory Container loads beans laziely. While ApplicationContext Container creates objects of Singleton bean at the time of loading only.It means there is early loading.

4) Beanfactory Container support only two scopes (singleton & prototype) of the beans. But ApplicationContext Container supports all the beans scope.

### What is the Scope of a Bean?  and list the examples for each scope.

1. singleton

This scopes the bean definition to a single instance per Spring IoC container (default).


2. prototype

This scopes a single bean definition to have any number of object instances.


3. request

This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.


4. session

This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

5. global-session

This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.

### Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml, and feel free to ask me any questions if you don't understand. it is a little bit old, I am not sure if I need to explain it in class)