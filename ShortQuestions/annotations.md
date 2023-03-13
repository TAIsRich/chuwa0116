# Annotations
### @Entity
This annotation specifies the class is an entity

### @Id
This annotation specifies the primary key of the entity

### @GeneratedValue
This annotation specifies the generation strategies for the values of primary keys

### @Table
This annotation specifies the table in the database with which this entity is mapped

### @Column
This annotation specifies variable to table column mapping

### @CreationTimestamp
This annotation specifies creation time

### @UpdateTimestamp
This annotation specifies update time

### @Controller
This annotation marks a class as a web request handler

### @Service
This annotation tells the Spring that class contains the business logic

### @Autowired 
This annotation can be used on properties, setters, and constructors after enabling annotation injection

### @Repository
This annotation a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects

### @RequestMapping 
This annotation is used to map web requests onto specific handler classes and/or handler methods

### @PostMapping
This annotation is for mapping HTTP POST requests onto specific handler methods

### @SpringBootApplication
This annotation is used to mark the main class of a Springboot application

### @Configuration 
This annotation marks configuration can be found automatically

### @ComponentScan 
This annotation tells Spring in which packages you have annotated classes that should be managed by Spring

### @PropertySource
This annotation is used to read properties from .properties file in the resource directory

### @OneToMany
One record in the table relates multiple records in another table.

### @ManyToOne
Multiple records in the table relate to one record in another table.

### @ManyToMany
Multiple records in the table relate to multiple records in another table.

### @NamedQuery 
This annotation is used by JPQL to give query
```java
@NamedQuery(name="get_all_posts", query="select p from Post p")
//here the Post is match to entity name rather than db name
```

### @NamedQueries
This annotation is used by JPQL to give s collection of query
```java
@NamedQueries({
        @NamedQuery(name="get_all_posts", query="select p from Post p"),
        @NamedQuery(name="get_posts_byId", query="select p from Post p where id = :id")
//here the Post is match to entity name rather than db name
})
```

### @JsonPropertyOrder
This annotation gives the return order of Json
```java
@JsonPropertyOrder({ "last", "pageNo", "pageSize", "totalElements", "totalPages", "content" })
```
### @JsonProperty 
This annotation matches Json to the entity name
```java
@JsonProperty("isLast")
```
### @PersistenceContext 
This annotation is used to clarify the entity manager
```java
    @PersistenceContext
    EntityManager entityManager;
```

### @ControllerAdvice
This annotation in Spring allows us to define methods that will apply to multiple controllers in your application.

`@ControllerAdvice` annotation can handle exceptions in your Spring application:
Create a new class and annotate it with `@ControllerAdvice`. This class will contain methods that handle exceptions thrown by your controllers.
```java
@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
    // exception handling methods go here
}
```
Define methods within the `@ControllerAdvice` class that handle specific exceptions. You can use the `@ExceptionHandler` annotation to specify which exception each method handles.
```java
@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("An error occurred: " + ex.getMessage());
    }
}
```

### `@Valid`
This annotation indicates that a nested object should be validated.
### `@NotNull`
This annoation validates that the annotated field or parameter is not null.
### `@Size`
This annotation validates that the annotated field or parameter has a size within a specified range. You can specify the minimum and maximum size using the `min` and `max` parameters, respectively.
### `@Pattern`
This annotation  validates that the annotated field or parameter matches a regular expression pattern.
### `@Max`
This annotation validates that the annotated field or parameter is less than or equal to a specified value. You can specify the maximum value using the `value` parameter.
### `@Min`
This annotation validates that the annotated field or parameter is greater than or equal to a specified value. You can specify the minimum value using the `value` parameter

### @Autowired
This annotation tells service to dependency injection
```java
    @Autowired
    private PostRepository postRepository;
```

### @ComponentScan
This annotation defines where the spring need to scan the bean definitions and generate the beans
```java
@Configuration
@ComponentScan(basePackage = "com.chuwa.spring")
```

### @ControllerAdvice
This annotation is used to handle the exceptions globally.
### @ExceptionHandler
This annotation is used to handle the specific exceptions and sending the custom responses to the client.

### @EnableWebSecurity
It is annotated at class level with `@Configuration` annotation to enable web securities in our application defined by `WebSecurityConfigurer` implementations. 
```java
@EnableWebSecurity
public class SecurityConfig {
@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("user").password(passwordEncoder().encode("password")).roles("USER");
    }
}
```

### @EnableWebSecurity
This annotation is a marker annotation. It allows Spring to find (it's a @Configuration and, therefore, @Component) and automatically apply the class to the global WebSecurity.


### @EnableGlobalMethodSecurity
This annotation provides AOP security on methods. Some of the annotations that it provides are PreAuthorize, PostAuthorize

### @PreAuthorize
This annotation checks the given expression before entering the method

### @PostAuthorize
This annotation verifies it after the execution of the method and could alter the result

### @Value
This annotation is used for injecting values into fields in Spring-managed beans, and it can be applied at the field or constructor/method parameter level.

### @JsonProperty
This annotation is used to mark non-standard getter/setter method to be used with respect to json property

### @Mock
This annotation is used to create mock objects that can be used to replace dependencies in a test class.

### @InjectMocks
This annotation is used to create an instance of a class and inject the mock objects into it, allowing you to test the behavior of the class.

### @BeforeAll
This annotation is used to signal that the annotated method should be executed before all tests in the current test class.

### @BeforeEach
This annotation is used to signal that the annotated method should be executed before each invocation of @Test, @RepeatedTest, @ParameterizedTest, or @TestFactory method in the current class

### @Test
This annotation tells JUnit that the public void method to which it is attached can be run as a test case

### @AfterEach
This annotation is used to signal that the annotated method should be executed after each @Test method in the current test class.

### @AfterAll
This annotation is used to signal that the annotated method should be executed after all tests in the current test class

### @Spy
This annotation is used to to spy on a real object. This will allow us to call all the normal methods of the object while still tracking every interaction, just as we would with a mock. 

### @LoadBalanced
This annotation is used as a marker annotation indicating that the annotated RestTemplate should use a RibbonLoadBalancerClient for interacting with your service(s)

### @EnableCircuitBreaker
This annotation can scan the classpath for any compatible Circuit Breaker implementation. It enables the underlying circuit breaker config

### @EnableEurekaClient
This annotation makes your Spring Boot application act as a Eureka client

### @EnableEurekaServer
This annotation is used to make your Spring Boot application acts as a Eureka Server. Make sure Spring cloud Eureka server dependency is added in your build configuration file. By default, the Eureka Server registers itself into the discovery.

### @HystrixCommand
Hystrix looks for any method annotated with the @HystrixCommand annotation, and wraps it inside proxy so that Hystrix can monitor it.