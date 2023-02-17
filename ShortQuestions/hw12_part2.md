### 1.  List all of the annotations you learned from class and homework to annotaitons.md
### 2. What is Spring and Springboot? What is the benefits of using Springboot
Spring Boot is an open-source tool that makes it easier for developers to create standalone digital products and production-ready spring applications including Java applications and web services
reduces lots of development time and increases productivity. It avoids writing lots of boilerplate Code, Annotations and XML Configuration. It is very easy to integrate Spring Boot Application with its Spring Ecosystem like Spring JDBC, Spring ORM, Spring Data, Spring Security etc

### 3. What is IOC and What is DI
In software engineering, inversion of control (IoC) is a design pattern in which custom-written portions of a computer program receive the flow of control from a generic framework.
Dependency Injection is a fundamental aspect of the Spring framework, through which the Spring container “injects” objects into other objects or “dependencies”. Simply put, this allows for loose coupling of components and moves the responsibility of managing components onto the container

### 4. What is  @ComponentScan
With Spring, we use the @ComponentScan annotation along with the @Configuration annotation to specify the packages that we want to be scanned. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.

### 5. How to define which package spring need to scan in xml and annotation?
In annotation:
Use @ComponentScan and @Configuration

In xml: Define bean id and class path

### 6. What is  @SpringbootApplication
@SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. It's same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations

### 7. How many ways wo can define a bean
Three ways. Class Level, Method Level, XML

### 8. What is default bean name for  @Component and  @Bean
Method name

### 9. What is the difference between  @component and  @service,@repository

- @Component is a generic stereotype for any Spring-managed component
- @Service annotates classes at the service layer
- @Repository annotates classes at the persistence layer, which will act as a database repository

### 10. How many annotaitons we can use to inject the bean
Three. @Autowired By Type > By Name @Resource By Name > By Type @Inject

### 11. Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
Three ways. 1. Construction Injection. 2. Setter Injection. 3. Field Injection

The Spring documentation recommends using constructor-based injection for mandatory dependencies, and setter-based injection for optional ones

A class that takes a required dependency as a constructor argument can only be instantiated if that argument is provided . A constructor therefore enforces the dependency requirement whether or not you're using Spring, making it container-agnostic.

If you use setter injection, the setter may or may not be called, so the instance may never be provided with its dependency.

### 12. If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primary
Set primary: @Qualifier. If there is no @Qualifier, check @Primary

If there is not @Primary, check by name. If name is found, check if there is @primary and use the bean with @primary. If not, throw exception(NoUniqueBeanDefinitionException)

### 13. What is the difference between BeanFactory and ApplicationContext in Spring
While the BeanFactory provides basic functionality for managing and manipulating beans, often in a programmatic way, the ApplicationContext provides extra functionality like MessageSource, Access to resources, Event propagation to beans, Loading of multiple (hierarchical) contexts etc

### 14. What is the Scope of a Bean?  and list the examples for each scope

+ Singleton: This scopes the bean definition to a single instance per Spring IoC
container (default).
+ Prototype: This scopes a single bean definition to have any number of object
  instances
+ Request: This scopes a bean definition to an HTTP request. Only valid in the
  context of a web-aware Spring ApplicationContext.
+ Session: This scopes a bean definition to an HTTP session. Only valid in the
  context of a web-aware Spring ApplicationContext.
+ Global-session: This scopes a bean definition to a global HTTP session. Only
  valid in the context of a web-aware Spring ApplicationContext

### 15. Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml, and feel free to ask me any quesitons if you don't understand. it is a little bit old, I am not sure if I need to exaplain it in class)
```agsl
<beans>
    <bean name="transferService" class="com.company.TransferServiceImpl"/>
</beans>
<bean class="org.springframework.config.java.process.ConfigurationPostProcessor"/> 

Dependencies/Parameters:
Use Construction Injection like constructor-arg and provide ref of the bean with ID
<bean id="myTeacher"
  class="com.nikhil.IoC.HistoryTeacher">

  <!-- set-up constructor injection-->
  <constructor-arg ref="myQuoteService" />
</bean>
```