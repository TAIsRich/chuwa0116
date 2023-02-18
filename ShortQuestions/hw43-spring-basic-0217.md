## 2.What is Spring and Springboot? What is the benfits of using Srpingboot?
- Spring is a lightweight framework that offers an elaborate environment for robust programming and configuration model for Java-based applications. Spring Boot is a java-based framework that is best for creating stand-alone, Spring-based applications in a short period.Advantages of Spring Boot:
  It reduces lots of development time and increases productivity. It avoids writing lots of boilerplate Code, Annotations and XML Configuration. It is very easy to integrate Spring Boot Application with its Spring Ecosystem like Spring JDBC, Spring ORM, Spring Data, Spring Security etc.
## 3.What is IOC and What is DI?
- Spring IoC (Inversion of Control) Container is the core of Spring Framework. It creates the objects, configures and assembles their dependencies, manages their entire life cycle. The Container uses Dependency Injection(DI) to manage the components that make up the application.
## 4.What is  @CompnonentScan?
- One of the most important annotations in spring is @ComponentScan which is used along with the @Configuration annotation to specify the packages that we want to be scanned. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.
## 5.How to define which package spring need to scan in xml and annotaiton?
- In XML configuration, you can use the<\context:component-scan>element to specify the package or packages to scan. In annotations, you can use the @ComponentScan annotation to specify the package or packages to scan.
## 6.What is  @SpringbootApplication?
- Spring Boot SpringApplication class is used to bootstrap and launch a Spring application from a Java main method. This class automatically creates the ApplicationContext from the classpath, scan the configuration classes and launch the application.
## 7.How many ways wo can define a bean?
- There are three different ways in which you can define a Spring bean: annotating your class with the stereotype @Component annotation (or its derivatives) writing a bean factory method annotated with the @Bean annotation in a custom Java configuration class. declaring a bean definition in an XML configuration file.
## 8.What is default bean name for  @Component and  @Bean?
- The default bean name will be method name. It means first bean name is getBeanA and second bean name is getBeanB . A bean can be accessed by bean class or bean name or can be injected in component using @Autowired annotation.
## 9.What is the difference between  @component and  @service,@repository?
- @Component is a generic stereotype for any Spring-managed component. 
- @Service annotates classes at the service layer. 
- @Repository annotates classes at the persistence layer, which will act as a database repository.
## 10.How many annotations we can use to inject the bean?
- @Resource 
- @Inject 
- @Autowire
## 11.Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
- Constructor Injection 
- Setter Injection
- Interface Injection 
- The injection in Spring is either done via setter, field or constructor injection.
- Constructor injection makes code more robust

## 12.If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primary.
- We can use @Qualifier or @Primary. Priority: @Qualifier > @Primary > By Name > throw exception(NoUniqueBeanDefinitionException)

## 13.What is the difference between BeanFactory and ApplicationContext in Spring?
- While the BeanFactory provides basic functionality for managing and manipulating beans, often in a programmatic way, the ApplicationContext provides extra functionality like MessageSource, Access to resources, Event propagation to beans, Loading of multiple (hierarchical) contexts etc.
## 14.What is the Scope of a Bean?  and list the examples for each scope
- Basic
  - Singleton
  - prototype
- Web
  - Request
  - Session
  - Applicaiton
  - Websocket
## 15. Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? 
