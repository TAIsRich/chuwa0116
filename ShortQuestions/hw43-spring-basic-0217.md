1. what is the @configuration and @bean?
@configuration clearly states that a class having @Configuration annotation tells Spring container that there is one or more beans that needs to be dealt with on runtime. @Bean is a method-level annotation and a direct analog of the XML <bean/> element. 
2. How do you handle the exception in Spring?
- create ErrorDetails Class
- Create GlobalExceptionHandler Class
- Test using Postman Client
3. How do you do the validations in Spring?
- import dependecy
```
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-validation</artifactId>
<version>2.7.0</version>
</dependency>
```
- Add validation Rule to payload
- Add @valid to controller to apply the Rule here
- Check it in Postman
4. What is the actuator?
It is a tool to monitor the applicaiton.

5. What is Spring and Springboot? What is the benfits of using Srpingboot?
Spring is a lightweight framework. It provides the best mechanisms for different frameworks, such as Struts, Hibernate, EJB, JSF, and Tapestry. It helps solve real-time technical problems. Spring contains multiple modules, such as WEB MVC, IOC, DAO, AOP, Context, and ORM. Spring Boot is an open-source tool that makes it easier for developers to create standalone digital products and production-ready spring applications including Java applications and web services. It uses a micro framework, which makes it most useful for creating microservices for websites and mobile apps.
6. What is IOC and What is DI?
Spring IoC (Inversion of Control) Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.
7. What is @CompnonentScan?
One of the most important annotations in spring is @ComponentScan which is used along with the @Configuration annotation to specify the packages that we want to be scanned.
8. How to define which package spring need to scan in xml and annotaiton?
In XML configuration, you can use the<\context:component-scan>element to specify the package or packages to scan. In annotations, you can use the @ComponentScan annotation to specify the package or packages to scan.

9. What is @SpringbootApplication?
Spring Boot @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. It’s same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations.

10. How many ways we can define a bean?
* Class level
* Method level
* XML* 
11. What is default bean name for @Component and @Bean?
The default bean name will be method name.
12. What is the difference between @component and @service,@repository?
 @Component is a generic stereotype for any Spring-managed component. @Service annotates classes at the service layer. @Repository annotates classes at the persistence layer, which will act as a database repository.

13. How many annotaitons we can use to inject the bean?
@Resource @Inject @Autowire
14. Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
* Constructor Injection happens at the time of creating the object itself.
* Setter Injection uses setters to set the value.
* Field Injection uses reflection to set the values of private variables.
Constructor injection makes code more robust.

15. If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primay.
We can use @Qualifier or @Primary.
Priority: @Qualifier > @Primary > By Name > throw
exception(NoUniqueBeanDefinitionException)

16. What is the difference between BeanFactory and ApplicationContext in Spring?
 The ApplicationContext interface is the advanced container that enhances BeanFactory functionality in a more framework-oriented style. While the BeanFactory provides basic functionality for managing and manipulating beans, often in a programmatic way, the ApplicationContext provides extra functionality like MessageSource, Access to resources, Event propagation to beans, Loading of multiple (hierarchical) contexts etc.
17. What is the Scope of a Bean? and list the examples for each scope.
A bean's scope refers to the lifecycle of the bean; things like how long the bean will live, how many instances will be created, and how the bean is shared in the Spring environment. 
* Basic
    * Singleton
    * prototype
* Web 
    * Request
    * Session
    * Applicaiton
    * Websocket
18. Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml, and feel free to ask me any quesitons if you don't understand. it is a little bit old, I am not sure if I need to exaplain it in class)
To declare a bean, simply annotate a method with the @Bean annotation. When JavaConfig encounters such a method, it will execute that method and register the return value as a bean within a BeanFactory. By default, the bean name will be that of the method name.
```
@Configuration
public class AppConfig {
    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl();
    }
}
```
The above is exactly equivalent to the following appConfig.xml:
```
<beans>
    <bean name="transferService" class="com.company.TransferServiceImpl"/>
</beans>
```
We can add following tag to .xml
```
<constructor-arg value="xxx"/>
```
for beans that have parameters/dependencies.
