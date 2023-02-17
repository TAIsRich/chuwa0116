### 1.  List all the annotations you learned from class and homework to annotations.md
### 2.  What is Spring and Springboot? What is the benefits of using springboot?
Spring is composed of various modules that can be used independently or together to create web applications, RESTful services, batch jobs, integration services, and more.
Spring Boot is a framework built on top of Spring that simplifies the process of building and deploying Spring-based applications. It provides a number of features that make it easy to get started with Spring
<br>Benefits:
1. Easy to set up: Spring Boot provides pre-configured defaults and makes it easy to get started with a new project,It has auto configuration, No xml.
2. Rapid development: Spring Boot provides various tools to streamline the development process and allows developers to focus on writing business logic.
3. Embeddable server: Spring Boot includes an embedded server, making it easy to develop and test applications without deploying to a standalone server.

### 3.  What is IOC and What is DI?
In Java development, IOC means giving control of your designed objects to the container, rather than the traditional direct control inside your objects. With Spring's IoC feature, developers don't have to manually create objects and manage their dependencies. Instead, they can define the dependencies required for the object in the form of a Java bean, and the Spring container will create and inject dependencies as needed.

DI stands for Dependency Injection in Spring, which is a design pattern used to achieve Inversion of Control (IoC). It allows objects to be decoupled from their dependencies, and to have those dependencies provided to them, rather than creating them directly. This makes the application more flexible, maintainable, and testable.

### 4.  What is  @ComponentScan?
One of the most important annotations in spring is @ComponentScan which is used along with the @Configuration annotation to specify the packages that we want to be scanned.
Using @ComponentScan can save you from having to manually create and wire all of your Spring-managed components. Instead, Spring will take care of it for you, making it easier to build and maintain your Spring applications.

### 5.  How to define which package spring need to scan in xml and annotation?
In XML configuration, you can use the`<\context:component-scan>`element to specify the package or packages to scan.

In annotations, you can use the `@ComponentScan` annotation to specify the package or packages to scan.
### 6.  What is  @SpringbootApplication?
This annotation is a combination of several other annotations that are commonly used in Spring Boot applications, including `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`.

### 7. How many ways wo can define a bean?
1. XML configuration: This is the original way of defining beans in Spring Framework. You can define a bean in an XML file using the <bean> element and provide the required details like class, name, and dependencies.
2. Annotation-based configuration: You can use annotations to define beans in your Java classes. Spring provides several annotations, including @Component, @Service, @Repository, and @Controller, which can be used to mark a class as a Spring bean.
3. Java-based configuration: You can define beans in a Java configuration class using the @Configuration and @Bean annotations. You can also use other annotations like @Import and @ComponentScan to import or scan for other beans.

### 8.  What is default bean name for  @Component and  @Bean?
In Spring Framework, the default bean names for `@Component` and `@Bean` are generated based on the name of the class or method, respectively.

### 9.  What is the difference between  @component and  @service,@repository?
`@Component` is a general-purpose annotation, while `@Service` and `@Repository` are more specialized annotations that convey additional information about the role of the bean. While all three annotations serve the same purpose of marking a class as a Spring-managed bean, choosing the appropriate annotation can help to provide more information about the purpose and intended use of the bean.
### 10. How many annotations we can use to inject the bean?
`@Resource`
`@Inject`
`@Autowire`

### 11. Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?
1. Constructor injection: dependencies are injected into an object through its constructor. This is useful when the dependencies are required for the object to function properly and cannot be changed at runtime.
2. Setter injection: dependencies are injected into an object through setter methods. This allows the dependencies to be changed at runtime, if needed.
3. Field injection: I dependencies are injected directly into the fields of an object. We can use Autowired annotation.
4. Interface injection: The object implements the interface, and the dependencies are passed to the object through the methods defined in the interface.


### 12. If we have multiple beans for one type, how to set one is primary? and how to let the spring pick one bean to inject if no primary.
1. If you have multiple beans of the same type and none of them are marked as primary, Spring will throw an exception when trying to inject the bean. In this case, you can use the @Qualifier annotation to specify which bean you want to use. The @Qualifier annotation allows you to specify the name or a custom qualifier of the bean you want to inject.
2. n Spring, when you have multiple beans of the same type and you want to specify one of them as the primary bean, you can use the @Primary annotation on the bean definition. This will mark the annotated bean as the primary one to be used when multiple beans of the same type are present.

### 13. What is the difference between BeanFactory and ApplicationContext in Spring?
- **_Functionality_**: BeanFactory is a basic container that provides basic support for DI and is suitable for small applications. ApplicationContext, on the other hand, is a more complete container that provides additional enterprise-level features such as internationalization, event publishing, and resource loading.
- **_Configuration_**: BeanFactory reads configuration metadata from an XML file, while ApplicationContext can read metadata from XML, annotations, and Java code.
- **_Lazy Loading_**: BeanFactory provides lazy loading, i.e., beans are created only when they are requested. ApplicationContext, on the other hand, eagerly loads all singleton beans at startup.
- **_Events_**: ApplicationContext supports publishing events to beans that implement the ApplicationListener interface, while BeanFactory does not provide this feature.
- In general, it is recommended to use ApplicationContext over BeanFactory, as it provides more features and ease of use. However, if the requirements are minimal, BeanFactory can be used to save resources.

### 14. What is the Scope of a Bean?  and list the examples for each scope.
1. singleton: Only one instance of the bean is created for the entire application, and is shared by all requests.
2. prototype: A new instance of the bean is created each time it is requested.
3. request: A single bean instance is created per HTTP request. It is only available in the context of a web-aware Spring ApplicationContext.
4. session: A single bean instance is created per HTTP session. It is only available in the context of a web-aware Spring ApplicationContext.
5. application: A single bean instance is created for the entire context of a ServletContext. It is only available in the context of a web-aware Spring ApplicationContext.

### 15. Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml,and feel free to ask me any questions if you don't understand. it is a little old,I am not sure if I need to explain it in class)
If the bean requires any parameters or dependencies, we can provide them using <constructor-arg> or <property> tags.
For example, if the MyBean class has a constructor that takes a string parameter, we can provide the parameter value like this:
```xml
<bean id="myBean" class="com.example.MyBean">
<constructor-arg value="myStringParameter"/>
</bean>
```
This will create a new instance of MyBean with the string parameter "myStringParameter" passed to its constructor.

If the bean has a property that needs to be set, we can use the <property> tag:
```xml
<bean id="myBean" class="com.example.MyBean">
<property name="myProperty" value="myPropertyValue"/>
</bean>
```
This will create a new instance of MyBean and set its myProperty property to the string value "myPropertyValue".