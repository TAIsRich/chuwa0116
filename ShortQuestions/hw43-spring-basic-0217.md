# hw42-exception-validation-0217 - Hao Jia


### What is Spring and Springboot? What is the benfits of using Srpingboot?
Spring is a popular Java framework that provides a comprehensive programming and configuration model for building modern, scalable, and robust enterprise applications. It provides a wide range of features, such as dependency injection, aspect-oriented programming, data access, web development, security, and more.

Spring Boot, on the other hand, is an extension of the Spring framework that makes it easier to create production-ready, standalone Spring applications that can be run with little or no configuration. It provides a set of opinionated defaults and auto-configurations that simplify the development process and reduce the amount of boilerplate code that you need to write. With Spring Boot, you can focus on writing business logic rather than worrying about configuring your application infrastructure.

Some of the benefits of using Spring Boot are:

+ Rapid application development: With Spring Boot, you can quickly create a new Spring application with minimal setup and configuration. The auto-configuration feature automatically configures the application based on the dependencies you have added, making it easy to get up and running quickly.

+ Microservices: Spring Boot is well-suited for building microservices-based architectures. The framework provides the necessary features for building, deploying, and monitoring microservices, such as containerization, service discovery, and distributed tracing.

+ Convention over Configuration: Spring Boot follows the "Convention over Configuration" principle, which means that it makes assumptions about how your application is structured and configured. This can significantly reduce the amount of boilerplate code that you need to write, making development faster and more efficient.

+ Easy to deploy and manage: Spring Boot applications can be easily deployed to a wide range of platforms, such as traditional servers, cloud-based environments, and container platforms like Docker and Kubernetes. The framework also provides a wide range of management endpoints through its Actuator feature, making it easy to monitor and manage your application in production.

+ Large and active community: Spring Boot has a large and active community of developers, which means that there are plenty of resources and support available when you need it. The community provides a wide range of plugins, tools, and libraries that can be used to extend and customize the framework to suit your needs.

### What is IOC and What is DI?
+ Inversion of Control (IOC) is a design principle that refers to the process of inverting the control of objects or components in a software system. Instead of a component directly controlling its dependencies, the control is passed to an external container that manages the lifecycle and dependencies of the components. In the context of Spring, the container is known as the Spring container or application context.

+ Dependency Injection (DI) is a design pattern that implements IOC. It is a technique of passing dependencies to an object or component at runtime, rather than having the object or component create its dependencies directly. This is done by externalizing the dependencies from the component, and allowing an external entity, such as the Spring container, to inject the required dependencies into the component.

### What is @CompnonentScan?
@ComponentScan is an annotation in the Spring Framework that is used to configure component scanning for Spring-managed beans. When you use @ComponentScan in your Spring application, Spring will automatically search for classes that are annotated with stereotypes such as @Component, @Service, @Controller, and @Repository, and create instances of those classes as Spring-managed beans.

### How to define which package spring need to scan in xml and annotaiton?
+ In XML configuration,
```java
<context:component-scan base-package="com.example.app" />
```
+ In Java annotations,
```java
@Configuration
@ComponentScan(basePackages = {"com.example.app"})
public class AppConfig {
    // Bean definitions here
}
```

### What is  @SpringbootApplication?
@SpringBootApplication is an annotation in the Spring Boot Framework that is used to bootstrap a Spring application. It is a convenience annotation that is equivalent to using @Configuration, @EnableAutoConfiguration, and @ComponentScan together.

### How many ways wo can define a bean?
+ Using XML configuration: In this approach, you define beans in an XML file using the <bean> element. You can specify various properties of the bean, including the class name, constructor arguments, and properties to be injected.

+ Using Java configuration: In this approach, you define beans in a Java class using the @Bean annotation. You can define a method that creates and returns an instance of the bean, and specify any dependencies to be injected.

+ Using component scanning: In this approach, you annotate a class with @Component or one of its subtypes (@Service, @Repository, or @Controller), and Spring will automatically create a bean for that class. You can also use the @ComponentScan annotation to specify which packages to scan for annotated classes.

+ Using annotations on constructor parameters: In this approach, you can use annotations such as @Autowired, @Value, and @Qualifier on the constructor parameters of a class to inject dependencies. Spring will automatically create the necessary beans and inject them.

+ Using the FactoryBean interface: In this approach, you can create a custom implementation of the FactoryBean interface to define a bean. The FactoryBean interface allows you to define a factory method that creates and returns an instance of the bean, and specify any dependencies to be injected.

+ Using the @ComponentFactory annotation: In Spring 5.2 and later, you can use the @ComponentFactory annotation to define a factory method that creates and returns an instance of a bean. The @ComponentFactory annotation is similar to @Bean, but it allows you to define a factory method in a more concise way.

### What is default bean name for  @Component and  @Bean?
+ For @Component, if you don't provide a specific name for the bean using the value attribute, Spring will automatically generate a bean name based on the name of the class with the first letter in lowercase. For example, if you have a class MyComponent, the default bean name will be myComponent.

+ For @Bean, if you don't provide a specific name for the bean using the name attribute, Spring will automatically generate a bean name based on the name of the method with the first letter in lowercase. For example, if you have a method createMyBean() that returns an instance of MyBean, the default bean name will be myBean.

### What is the difference between  @component and  @service,@repository?
In Spring, @Component, @Service, and @Repository are all stereotypes annotations that are used to annotate classes and indicate their roles in the application. Although they have similar functionality, each of these annotations has a specific purpose, and they are typically used in different layers of a typical Spring application.
+ @Component: This is the most generic stereotype annotation in Spring. It is typically used to annotate classes that do not fit into any of the other stereotype categories. The primary purpose of @Component is to indicate that a class is a candidate for auto-detection by the Spring component scanner.

+ @Service: This annotation is used to indicate that a class is a service component in the application. Service components typically contain business logic, and are used to perform complex operations and interact with other components in the system.

+ @Repository: This annotation is used to indicate that a class is a repository component in the application. Repository components are used to interact with the database or other data sources, and typically provide data access operations such as CRUD (Create, Read, Update, and Delete) functionality.

### How many annotaitons we can use to inject the bean?
+ @Autowired: This annotation can be used to automatically wire a bean to a class property, method parameter, or constructor parameter. Spring will automatically search for a bean of the same type as the property or parameter and inject it. It is important to note that @Autowired does not require an explicit configuration of the bean.

+ @Resource: This annotation is similar to @Autowired, but it can also be used to inject a bean by its name or by a specified type. @Resource is a Java EE standard annotation, and it can be used with any Java EE-compliant application server.

+ @Inject: This annotation is similar to @Autowired, but it is part of the Java Dependency Injection (DI) standard. It can be used to inject dependencies into a class property, method parameter, or constructor parameter.

+ @Value: This annotation can be used to inject a value (such as a string or a number) into a class property or method parameter. The value can be specified in a properties file, a system property, or an environment variable.

### Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
+ Constructor injection: In this type of injection, the dependencies are injected via the constructor of a class. This ensures that the required dependencies are available at the time of object creation, making the class more predictable and easier to test. Constructor injection is generally considered the most reliable and preferred way of dependency injection, as it makes the class immutable and ensures that all the necessary dependencies are available.

+ Setter injection: In this type of injection, the dependencies are injected via setter methods. Setter injection is more flexible than constructor injection, as it allows the dependencies to be injected after the object has been created. However, this type of injection can make the class mutable and more difficult to test.

+ Field injection: In this type of injection, the dependencies are injected directly into the fields of a class, using annotations such as @Autowired or @Resource. Field injection is the easiest and most concise way to inject dependencies, but it also makes the class mutable and difficult to test. Field injection should generally be avoided, except in cases where it is absolutely necessary (e.g., when using third-party libraries that do not support constructor or setter injection).

Among these three types of injection, constructor injection is generally considered the best approach, as it ensures that the class is immutable and all dependencies are available at the time of object creation. However, the choice of injection type depends on the specific use case and requirements of the application.

### If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primay.
If you have multiple beans of the same type and you want to specify which one to use, you can use the @Primary annotation to mark one of the beans as the primary one. This tells Spring to use that bean by default whenever the type is autowired and no qualifier is specified.

If you have multiple beans of the same type and none of them are marked as primary, you can use the @Qualifier annotation to specify which bean to use. The @Qualifier annotation takes a value that matches the name of the bean you want to use.

### What is the difference between BeanFactory and ApplicationContext in Spring?
+ BeanFactory is the basic interface for managing the beans in a Spring application. It provides the basic functionality for managing the lifecycle of the beans, such as creating, configuring, and destroying beans. BeanFactory is the core container of the Spring framework and provides the basic functionality for dependency injection.

+ ApplicationContext is a sub-interface of BeanFactory and provides additional functionality beyond the basic bean management. It provides support for internationalization, event propagation, resource loading, and AOP. ApplicationContext is the preferred interface for most applications, as it provides more functionality than BeanFactory.

### What is the Scope of a Bean?  and list the examples for each scope.
+ Singleton: This is the default scope in Spring. A singleton bean is a shared instance of the bean that is managed by the Spring container. The same instance is returned whenever the bean is requested. Examples of singleton beans include database connections, thread pools, and caches.

+ Prototype: A prototype bean is a new instance of the bean that is created every time the bean is requested. This scope is useful when you want to create a new instance of a bean for each usage. Examples of prototype beans include stateless beans that don't maintain state across requests.
```java
@Component
@Scope("prototype")
public class MyPrototypeBean {
  // implementation details
}
```
+ Request: A request-scoped bean is created once per HTTP request and is destroyed when the request is completed. This scope is useful when you want to store state information that is related to a specific HTTP request. Examples of request-scoped beans include user authentication and session management.

+ Session: A session-scoped bean is created once per HTTP session and is destroyed when the session is invalidated or expires. This scope is useful when you want to store state information that is related to a specific user session. Examples of session-scoped beans include user preferences and shopping cart items.

+ Application: An application-scoped bean is created once per web application context and is destroyed when the context is shut down. This scope is useful when you want to store state information that is shared across the entire web application. Examples of application-scoped beans include configuration settings and application-level caches.

+ WebSocket: A web socket-scoped bean is created once per WebSocket session and is destroyed when the session is closed. This scope is useful when you want to store state information that is related to a specific WebSocket session.

+ Custom scopes: Spring also allows you to define your own custom scopes for your beans.

### Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean?
```java
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
                           http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="myDependencyBean" class="com.example.MyDependencyBean" />

    <bean id="myBean" class="com.example.MyBean">
        <constructor-arg ref="myDependencyBean" />
        <property name="name" value="John" />
    </bean>

</beans>

```
