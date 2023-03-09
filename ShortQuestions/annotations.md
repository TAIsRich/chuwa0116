## Annotations

### @Override
The `@Override` annotation specifies that the method that has been marked with this annotation overrides the method of the superclass with the same method name, return type and parameter list.

It is not mandatory to use `@Override` when overriding a method. However, if we use it, the compiler gives an error if something is wrong (such as wrong parameter type) while overriding the method.

```Java
class Animal {
    public void displayInfo() {
        System.println("I am animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
```

### Autowired
Spring provides annotation-based auto-wiring by providing `@Autowired` annotation. It is used to autowire spring bean on setter methods, instance variable, and constructor. When we use `@Autowired` annotation, the spring container auto-wires the bean by matching data-type.

### Controller
The `@Controller` is a class-level annotation. It is a specialization of `@Component`. It marks a class as a web request handler. It is often used to serve web pages. By default, it returns a string that indicates which route to redirect. It is mostly used with `@RequestMapping` annotation.
```Java
@Controller  
@RequestMapping("books")  
public class BooksController {  

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)  
    public Employee getBooksByName()   
    {  
        return booksTemplate;  
    }  
}  
```

### @RequestMapping
It is used to map the web requests. It has many optional elements like consumes, header, method, name, params, path, produces, and value. We use it with the class as well as the method.

### @GetMapping
It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)

### @PostMapping
It maps the HTTP POST requests on the specific handler method. It is used to create a web service endpoint that creates It is used instead of using: @RequestMapping(method = RequestMethod.POST)

### @PutMapping
It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates It is used instead of using: @RequestMapping(method = RequestMethod.PUT)

### @DeleteMapping
It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)

### @PatchMapping
It maps the HTTP PATCH requests on the specific handler method. It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)

### @RequestBody
It is used to bind HTTP request with an object in a method parameter. Internally it uses HTTP MessageConverters to convert the body of the request. When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.

### @ResponseBody
It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.

### @PathVariable
It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. We can define multiple @PathVariable in a method.

### @RequestParam
It is used to extract the query parameters form the URL. It is also known as a query parameter. It is most suitable for web applications. It can specify default values if the query parameter is not present in the URL.

### @RequestHeader
It is used to get the details about the HTTP request headers. We use this annotation as a method parameter. The optional elements of the annotation are name, required, value, defaultValue. For each detail in the header, we should specify separate annotations. We can use it multiple time in a method

### @Service
It is also used at class level. It tells the Spring that class contains the business logic.

### @Repository
It is a class-level annotation. The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.

### @RestController
It can be considered as a combination of @Controller and @ResponseBody annotations. The @RestController annotation is itself annotated with the @ResponseBody annotation. It eliminates the need for annotating each method with @ResponseBody.

### @Entity
The `@Entity` annotation specifies that the class is an entity and is mapped to a database table.

### @Table
The `@Table` annotation specifies the name of the database table to be used for mapping.

### @Id
The `@Id` annotation specifies the primary key of an entity and the `@GeneratedValue` provides for the specification of generation strategies for the values of primary keys.

### @Column
`@Column` annotation is used for Adding the column the name in the table of a particular MySQL database.

### @ResponseStatus
`@ResponseStatus` marks a method or exception class with the status code and reason message that should be returned. The status code is applied to the HTTP response when the handler method is invoked, or whenever the specified exception is thrown. It overrides status information set by other means, like ResponseEntity or redirect.

### @OneToMany, @ManyToOne, @ManyToMany
specify a one-to-many/many-to-one/many-to-many database relationship between two tables

### @NamedQuery, @NamedQueries
`@NameQueries`: to define the multiple named queries.

`@NameQuery`: to define the single named query.

### @Query
If we use the `@Query` annotation the method name can violate the JPA naming convention, but it is best to use the method name to understand the purpose of the method.

### @Transactional
Spring provides Declarative Transaction Management via `@Transactional` annotation. When a method is applied with `@Transactional`, then it will execute inside a database transaction. @Transactional annotation can be applied at the class level also, in that case, all methods of that class will be executed inside a database transaction.

### @Configuration
indicates that the class has @Bean definition methods. Spring container can process the class and generate Spring Beans to be used in the application. Spring `@Configuration` annotation allows us to use annotations for dependency injection. It’s better to use `@Configuration` annotation with configuration classes to make sure our spring container is behaving like the way we want it to. 

### @Bean
`@Bean` Annotation is applied on a method to specify that it returns a bean to be managed by Spring context. Spring Bean annotation is usually declared in Configuration classes methods. In this case, bean methods may reference other `@Bean` methods in the same class by calling them directly.

### @ExceptionHandler
`@ExceptionHandler` annotation is used to handle specific exceptions thrown by controllers

### @ControllerAdvice
`@ControllerAdvice` annotation is a global exception handler used to intercept and handle the exceptions thrown by the controllers across the application.

### @CompnonentScan
`@ComponentScan` defines where the Spring need to scan the bean definations and generate the beans. It directs Spring to search for components in the path specified.

### @SpringbootApplication
`@SpringBootApplication` is a combination of 3 different annotations:

`@Configuration`: This annotation marks a class as a Configuration class in Java-based configuration, it allows to register extra beans in the context or import additional configuration classes `@ComponentScan`: to enable component scanning `@EnableAutoConfiguration`: to enable Spring Boot’s auto- configuration feature. These 3 annotations are frequently used together, so SpringBoot designers bundled them into one single

`@SpringBootApplication`, now instead of 3 annotations you just need to specify only one annotation on the Main class. However, if you don’t need one of these annotation depending on your requirement, then you will have to use them separately.

### @component
`@Component` is a general purpose stereotype annotation which indicates that the class annotated with it, is a spring managed component.

### @Primary
`@Primary` indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.

### @Qualifier
`@Qualifier` indicates specific bean should be autowired when there are multiple candidates. (If there is no primary)

### @ConfigurationProperties
This is mostly used in Spring projects to load configuration properties (map values from .properties( .yml also supported) to a POJO).

- It initializes an entity based on property data.

- `@ConfigurationProperties` identifies the property file to load.

### @Scheduled 
The Spring `@Scheduled` annotation can be used to configure and schedule tasks.

The simple rules that we need to follow to annotate a method with @Scheduled are:
- the method should typically have a void return type (if not, the returned value will be ignored)
- the method should not expect any parameters

### @Aspect
`@Aspect` indicates this is a aop class.

### @Pointcut
Mark a function as a Pointcut.
execution( expression ) − Expression covering methods on which advice is to be applied.

```
@Pointcut("execution(* com.tutorialspoint.Student.getAge(..))")
private void selectGetName(){}

@After("selectGetAge()")
public void afterAdvice(){
   System.out.println("Student profile setup completed.");
} 
```

### @After
`@After` is an advice type which ensures that an advice runs after the method execution.

### @Before
`@Before` is an advice type which ensures that an advice runs before the method execution.

### @AfterThrowing
`@AfterThrowing` is an advice type which ensures that an advice runs if the method throws an exception.

### @AfterReturning
We can implement after returning advice in an application by using `@AfterReturning` annotation. The annotation marks a function as an advice to be executed before the method covered by PointCut. After returning advice runs when a matched method execution returns a value normally.

### @Around
`@Around` is an advice type, which ensures that an advice can run before and after the method execution.

### @Mock
We can use `@Mock` to create and inject mocked instances without having to call Mockito.mock manually.

### @Spy
use the `@Spy` annotation to spy on an existing instance.