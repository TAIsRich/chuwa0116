1.  List all of the annotations you learned from class and homework to
    annotaitons.md
2.  What is Spring and Springboot? What is the benfits of using Srpingboot?
    1. Spring: The Spring framework provide comprehensive infrastructure support for developing Java applications,
       such as dependency injection, transaction management, web apps, and more
    2. Springboot: An extension of the Spring framework, which reduces the boilerplate configurations required for 
       setting up a SSpring application.
3.  What is IOC and What is DI?
    1. Inversion of Control (IOC): It's a design principle  where the control flow of the program is inverted
    2. Dependency Injection (DI): is the method of providing the dependencies and Inversion of Control is the end result
       of Dependency Injection.
4. What is  `@ComponentScan`?`
   1. It's an annotation used to direct Spring to search for components in the path specified
5.  How to define which package spring need to scan in xml and annotations?
6.  What is  `@SpringbootApplication`?
    1. It's an annotation we put at our application entrance class, and it contains three components: `@Configuration`, 
       `@EnableAutoConfiguration`, `@ComponentScan`
7. How many ways wo can define a bean?
   1. Class level
      * `@Component`
      * `@Service`
      * `@Repository`
      * `@Controller`
   2. Method level
      * `@Bean` (Used with `@Configuration` together)
   3. XML
      ```java
      <bean id="dataNucleusChuwaNoComponent"
      class="com.chuwa.springbasic.components.impl.DataNu
      cleusChuwaNoComponent"></bean>
      ```
8.  What is default bean name for  `@Component` and  `@Bean`?
    1. `@Component`: it's a class level annotation, and the default name would be class name with first letter being lowercase
    2. `@Bean`: it's a method level annotation, and the default name would be the same as the method name
9.  What is the difference between  `@component` and  `@service`,`@repository`?
    1. `@Componnet`: generic stereotype for any Spring-managed component.
    2. `@Service`: annotates classes at the service layer.
    3. `@Repository`: annotates classes at the persistence layer, which act as a database repository.
10. How many annotations we can use to inject the bean?
    1. `@Autowired`: Priority is `@Qualifier` > `@Primary` > `@Primary` > `By Name` > `NoUniqueBeanDefinitionException`
    2. `@Resource`: `By Name` > `By Type`
    3. `@Inject`
11. Tell me the three types to do dependency injection(How can we inject the beans
    in Spring)? Which way is better and why?
    1. Constructor injection is better since it helps us to identify if our bean is dependent on too many other objects,
       if it is, then it's probably an indicator that we should refactor the current class.
    2. Constructor Injection
    ```java
    @Autowired
    public ClassName(Filter filer) {
        this.filer = filer;
    }
    ```
    3. Setter Injection
    ```java
    @Autowired
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
    ```
    4. Field Injection
    ```java
    @Autowired
    private Filter filter;
    ```
12. If we have multiple beans for one type, how to set one is primary? and how to let
    the spring to pick one bean to inject if no primary.
    1. Set one bean to be primary like below:
    ```java
    @Component
    //@Primary
    public class HibernateChuwa implements JpaChuwa {
    
        @Override
        public void printMessage() {
            System.out.println("Message from " + getClass().getName());
        }
    }
    ```
    2. Use `@Qualifier` when autowiring the beans with same type
    ```java
    @Autowired
    @Qualifier("hibernateChuwa")
    private JpaChuwa jpaChuwaQualifier;
    ```
13. What is the difference between `BeanFactory` and `ApplicationContext` in Spring?
    1. `BreanFactory`: fundamental container that provides the basic functionality for manging beans, and does not 
       support Annotation based configuration in Bean Autowiring and must provide SML file only.
    2. `ApplicationContext`: an advanced container that extends the BeanFactory and provides extra bean scopes
       such as Singleton, Prototype, Request, Session etc.
14. What is the `Scope` of a `Bean`?  and list the examples for each scope.
    1. The `Scope` refers to the lifecycle of the bean.
       1. Singleton: Single bean instance per Spring IoC container (default), which is applicaton context-wise singleton
       ```java
       @Bean
       @Scope("singleton")
       public Person personSingleton() {
           return new Person();
       }
       ```
       2. Prototype: Any number of bean instances per Spring IoC container
       ```java
       @Bean
       @Scope("prototype")
       public Person personPrototype() {
           return new Person();
       }
       ```
15. Configure a bean using xml. If bean has parameters/dependencies, how can we
    configure the bean? (you can google the tutorial how to configure beans in xml,
    and feel free to ask me any questions if you don't understand. it is a little bit old,
    I am not sure if I need to explain it in class)
Bean Definition
```java
public class IndexApp {
    private IService service;
    // standard constructors/getters/setters
}

public interface IService {
    public String serve();
}

public class IndexService implements IService {
    @Override
    public String serve() {
        return "Hello World";
    }
}
```
1. Using Property
```xml
<bean 
  id="indexService" 
  class="com.baeldung.di.spring.IndexService" />
     
<bean 
  id="indexApp" 
  class="com.baeldung.di.spring.IndexApp" >
    <property name="service" ref="indexService" />
</bean>    

```
2. Using Constructor
```xml
<bean 
  id="indexApp" 
  class="com.baeldung.di.spring.IndexApp">
    <constructor-arg ref="indexService" />
</bean>    

```