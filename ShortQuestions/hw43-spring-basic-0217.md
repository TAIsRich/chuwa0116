### Spring Basic

##### 1. List all of the annotations you learned from class and homework to `annotaitons.md`
The new annotations has been added to the `annotations.md`.

##### 2. What is Spring and Springboot? What is the benfits of using Srpingboot?
Spring is a lightweight open-source Java development framework. It provides a comprehensive programming and configuration model for developing enterprise level Java applications. It aims to simplify enterprise Java development and helps developers build applications more effectively and efficiently.
Spring Boot is an extension of Spring, which eliminates the boilerplate configurations required for setting up a Spring application. Featuring default codes and annotation based configuration, Spring Boot enables a faster and more efficient development ecosystem. Since Spring Boot is built on top of Spring, it offers all the features and benefits of Spring. Spring Boot aims to reduce code length and provides developers with the easiest way to build an application.
Benefits of SpringBoot: 
- Can be used to build standalone applications
- No need to deploy WAR files
- Doesn't require XML configuration
- Embeds Tomcat, Jetty and Undertow directly
- Offers production ready features
- Easier to launch
- Easier management and customizationCan be used to build standalone applications

##### 3. What is IOC and What is DI?
Spring IoC (Inversion of Control) Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application. It gets the information about the objects from a configuration file(XML) or Java Code or Java Annotations and Java POJO class. 
Dependency Injection is the main functionality provided by Spring IOC(Inversion of Control). The Spring-Core module is responsible for injecting dependencies through either Constructor or Setter methods. The design principle of Inversion of Control emphasizes keeping the Java classes independent of each other and the container frees them from object creation and maintenance. These classes, managed by Spring, must adhere to the standard definition of Java-Bean. Dependency Injection in Spring also ensures loose coupling between the classes. 

##### 4. What is  @CompnonentScan?
@ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages, and add those classes to Spring IOC containers, and it's Spring's responsibility to manage the lifecycles of those beans.

##### 5. How to define which package spring need to scan in xml and annotaiton?
In XML:
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
               
     <context:component-scan base-package="org.example"/>
</beans>
```

In Annotation:
```
package org.example;
@ComponentSacn
public class MainClass{
.....
}
```

##### 6. What is  @SpringbootApplication?
@SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. It’s same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations. It is used to bootstrap and launch a Spring application from a Java main method. This class automatically creates the ApplicationContext from the classpath, scan the configuration classes and launch the application. This class is very helpful in launching Spring MVC or Spring REST application using Spring Boot.

##### 7. How many ways wo can define a bean
- We could use a @Component annotation
- Writing a bean factory method annotated with the @Bean annotation in a custom Java @Configuration class
- Declaring a bean definition in an XML configuration file

##### 8. What is default bean name for @Component and @Bean?
For @Bean annotation, the default bean name is the method name that returns the bean to Spring IOC container, for @Component annotation, the default bean name is the short name of the class name with the first character being converted to lower case

##### 9. What is the difference between @component and  @service,@repository?
They actually have the same function of registering the class in the Spring IOC container, but they are different in a sense that they could actually provide much more readability for our code, @Service could tell the readers that the class is responsible for the business logics, and @Repository means the class is mainly to interact with the database.

##### 10. How many annotaitons we can use to inject the bean?
We could use @Resource, @Autowired and @Inject to inject the beans as other beans' dependencies

##### 11. Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
There are three types of dependency injections: Constructor Injection, Property Injection, and Method injection, and I think Property Injection is better, because it could help us avoid changing the structure of the class over and over again.

##### 12. If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primay.
We could annotate the object generating method in the @Configuration class with @Primary, in this way, if there are multiple implementations qualified for injection, it would choose the primary one. If there is no primary, we could use @Qualifier to explicitly specify which bean we will want to inject as our dependency.

##### 13. What is the difference between BeanFactory and ApplicationContext in Spring?
This interface is designed on top of the BeanFactory interface. The ApplicationContext interface is the advanced container that enhances BeanFactory functionality in a more framework-oriented style. While the BeanFactory provides basic functionality for managing and manipulating beans, often in a programmatic way, the ApplicationContext provides extra functionality like MessageSource, Access to resources, Event propagation to beans, Loading of multiple (hierarchical) contexts etc. There are so many implementation classes that can be used such as ClassPathXmlApplicationContext, FileSystemXmlApplicationContext, AnnotationConfigWebApplicationContext etc.

##### 14. What is the Scope of a Bean?  and list the examples for each scope.
- Singleton: Scopes a single bean definition to a single object instance per Spring IoC container.

- Prototype: Scopes a single bean definition to any number of object instances.

- Request: Scopes a single bean definition to the lifecycle of a single HTTP request; that is each and every HTTP request will have its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.

- Session: Scopes a single bean definition to the lifecycle of a HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.

- Global session: Scopes a single bean definition to the lifecycle of a global HTTP Session. Typically only valid when used in a portlet context. Only valid in the context of a web-aware Spring ApplicationContext.


##### 15. Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml, and feel free to ask me any quesitons if you don't understand. it is a little bit old, I am not sure if I need to exaplain it in class
```
<bean 
  id="userService" 
  class="com.chuwa.service.UserServiceImpl" >
  <constructor-arg value="1" />
</bean>

<bean 
  id="userController" 
  class="com.chuwa.controllers.UserController" >
    <property name="userService" ref="userService" />
</bean>    

```