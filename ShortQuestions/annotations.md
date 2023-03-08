## @Entity

Specifies that the class is an entity. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.

## @Table

It specifies the table in the database with which this entity is mapped

## @UniqueConstraint

Specifies values of some columns should be unique.

## @Id

This annotation specifies the primary key of the entity.

## @GeneratedValue

Provides for the specification of generation strategies for the values of primary keys.

## @Column

Specify the column mapping

## @CreationTimestamp

Marks a property as the creation timestamp of the containing entity. The property value will be set to the current VM date exactly once when saving the owning entity for the first time.


## @UpdateTimestamp

Marks a property as the update timestamp of the containing entity. The property value will be set to the current VM date whenever the owning entity is updated.


```Java
@Entity
@Table(
        name = "posts",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"title"})
        }
)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}
```

## @Repository

@Repository is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.

## @Service

Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."

## @Autowired

The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.


```Java
@Component
public class FooService {  
    @Autowired
    private FooFormatter fooFormatter;
}
```

## @RestController

This annotation is applied to a class to mark it as a request handler. Spring RestController annotation is used to create RESTful web services using Spring MVC.

## @RequestMapping

RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 

## @PostMapping

Annotation for mapping HTTP POST requests onto specific handler methods. Specifically, @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) .

```Java
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
        PostDTO postResponse = postService.createPost(postDTO);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }
}
```

## @GetMapping

Annotation for mapping HTTP GET requests onto specific handler methods. 

## @PutMapping

Annotation for mapping HTTP PUT requests onto specific handler methods. 

## @DeleteMapping

Annotation for mapping HTTP DELETE requests onto specific handler methods. 

## @SpringBootApplication

Enable Spring Boot’s auto-configuration mechanism, enable @Component scan on the package where the application is located, allow to register extra beans in the context or import additional configuration classes.

## @ResponseBody

@ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.

## @PathVariable

@PathVariable annotation can be used to handle template variables in the request URI mapping, and set them as method parameters.

```Java
@GetMapping("/api/employees/{id}")
@ResponseBody
public String getEmployeesById(@PathVariable String id) {
    return "ID: " + id;
}

```

## @RequestBody 

@RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization

## @RequestParam

@RequestParam to extract query parameters, form parameters, and even files from the request.

```Java
@GetMapping("/api/foos")
@ResponseBody
public String getFoos(@RequestParam String id) {
    return "ID: " + id;
}
```


## @Configuration

@Configuration annotation which indicates that the class has @Bean definition methods. So Spring container can process the class and generate Spring Beans to be used in the application. 

## @bean

@Bean annotationis applied on a method to specify that it returns a bean to be managed by Spring context. Spring Bean annotation is usually declared in Configuration classes methods.

## @ControllerAdvice

Classes annotated with @ControllerAdvice can be declared explicitly as Spring beans or auto-detected via classpath scanning. 

```Java
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

}

```

## @ExceptionHandler

```Java
@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                        WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(),
                webRequest.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
```
## @NotEmpty @NotNull @Size

```Java
public class CommentDto {

    private long id;

    @NotEmpty(message = "Name should not be null or empty")
    private String name;
}


## @OneToMany, @ManyToOne, @ManyToMany

@OneToMany: One record in the table relates multiple records in another table.

@ManyToOne: Multiple records in the table relate to one record in another table.

@ManyToMany: Multiple records in the table relate to multiple records in another table.

```Java
@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    /* Getters and setters */
}

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    /* Getters and setters */
}
```


```Java
@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double fee;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    /* Getters and setters */
}

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "student_course",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    private Set<Course> courses;

    /* Getters and setters */
}
```

## @NamedQuery, @NamedQueries

```Java
@NamedQueries(  
    {  
        @NamedQuery(  
        name = "findEmployeeByName",  
        query = "from Employee e where e.name = :name"  
        )  
    }  
)  
```
## @Query

Write sql or jpql to deal with database

```Java
    @Query("select p from Post p where p.id = ?1 or p.title = ?2")
    Post getPostByIDOrTitleWithJPQLIndexParameters(Long id, String title);
```

## @PersistenceContext

The persistence context is the first-level cache where all the entities are fetched from the database or saved to the database.

```Java
    @PersistenceContext
    EntityManager entityManager;
```

## @Transactional 

To make a unit of operations atomic.

```Java
@Transactional
public class PostJPQLRepositoryImpl implements PostJPQLRepository {}

```

## @Configuration

One of the most important annotations in spring is @Configuration annotation which indicates that the class has @Bean definition methods. So Spring container can process the class and generate Spring Beans to be used in the application. This annotation is part of the spring core framework.

## @EnableWebSecurity

The @EnableWebSecurity is a marker annotation. It allows Spring to find (it's a @Configuration and, therefore, @Component) and automatically apply the class to the global WebSecurity.

## @EnableGlobalMethodSecurity

@EnableWebSecurity is used for spring security java configuration. Add this annotation with @configuration on top of your security java class that extends WebSecurityConfigurerAdapter .


## @Scheduled 

configure and schedule tasks.

```
@Scheduled(fixedDelay = 1000)
public void scheduleFixedDelayTask() {
    System.out.println(
      "Fixed delay task - " + System.currentTimeMillis() / 1000);
}
```

## @PreAuthorize

The @PreAuthorize annotation checks the given expression before entering the method

## @PostAuthorize

@PostAuthorize annotation verifies it after the execution of the method and could alter the result.

## @Aspect

It declares the class as an aspect.

## @Pointcut

It declares the pointcut expression.

## @Around

It can perform the behavior before and after the method invocation.

## @Pointcut

Pointcut is a signature that matches the join points.

## @Before

It runs before the method execution.

## @AfterReturning

It runs after the result is returned by the method.

## @AfterThrowing
It runs after an exception is thrown by the method.

## @BeforeClass

This annotation must be used on public static void no-arg method.
The method is invoked before an instance of this test class is created and any tests are invoked.

This life cycle callback is not related to JVM class loading. JUnit framework calls this method explicitly before calling constructor/other methods.
This method is called only once, whereas, other instance lifecycle methods are called every time before calling each test method.

This annotation is useful for initializing static resources which would, otherwise, be expensive to create during each test invocation.

## @AfterClass

Similar to @BeforeClass but is called at the very end of all test/other lifecycle methods. It is called only once. Useful for static resource clean up.

## @Before

It should be used on public void no-arg instance method.

It is invoked every time before each test method invocation.

Used to setup instance variables/resources which can be used during a test method execution. Useful to avoid code duplication and/or when there are many indirection of method calls starting from the target test method.

## @After

Similar to @Before but runs after target test method execution. Useful for cleaning up instance resources.

## @Test

public void methods to perform tests. This is where we perform one or more assertions by using static methods of org.junit.Assert. Assert methods throw org.junit.AssertionError on assertion failure. This exception or any other exception is reported as test failure. If no exceptions are thrown then the test will pass.

## @Spy

@Spy - It allows the creation of partially mock objects. In other words, it allows shorthand wrapping of the field instances in a spy object. Like other annotations, @Spy annotation is also available in the org.
