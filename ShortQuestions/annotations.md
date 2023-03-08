# Annotation

## JPA
### @Entity
Specifies that the class is an entity
### @Table(name = "employee")
It specifies the table in the database with which this entity is mapped.
### @Column(name = "employee_name")
Specify the column mapping using @Column annotation
### @Id
This annotation specifies the primary key of the entity.
### @GeneratedValue
This annotation specifies the generation strategies for the values of primary keys.
### @ManyToMany
The @ManyToMany annotation is used to specify a many-to-many database relationship.
### @ManyToOne
The @ManyToOne annotation is used to specify a many-to-one database relationship.
### @OneToMany
The @OneToMany annotation is used to specify a one-to-many database relationship.
#### @OneToOne
The @OneToOne annotation is used to specify a one-to-one database relationship.
### @OrderBy
The @OrderBy annotation is used to specify the entity attributes used for sorting when fetching the currently annotated collection.
## Spring Web
### @Controller
It marks a class as a web request handler.
### @RequestBody
It maps the body of the HTTP request to an object:
### @RestController = @Controller + @RequestBody
### @RequestMapping("books")
It is used to map web requests onto specific handler classes and/or handler methods.
### @Service
It tells the Spring that class contains the business logic.
### @Repository
The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.
### @PathVariable
It bound to a URI template variable.
### @RequestParam
It bound to a HTTP request parameters.
### @ExceptionHandler
It declares a custom error handler method.
### @ResponseStatus
It declares a HTTP status of the response.
### @ModelAttribute
It accesses elements that are already in the model of an MVC @Controller.

## Springboot
### @SpringBootApplication
It is used to mark the main class of a Spring Boot application.
### @Configuration
It marks configuration can be found automatically.
### @ComponentScan
It tells Spring in which packages you have annotated classes that should be managed by Spring.

## Spring Boot Exception Handling
### @ControllerAdvice
It's used to handle the exceptions globally.
### @ExceptionHandler

## AOP
### @Pointcut("execution(public * *(..))") - Pointcut expressions
### @target
limits matching to join points (the execution of methods when using Spring AOP) where the class of the executing object has an annotation of the given type
### @args
limits matching to join points (the execution of methods when using Spring AOP) where the runtime type of the actual arguments passed have annotations of the given type(s)
### @within
limits matching to join points within types that have the given annotation (the execution of methods declared in types with the given annotation when using Spring AOP)
### @annotation
limits matching to join points where the subject of the join point (method being executed in Spring AOP) has the given annotation
### @After
### @Before
### @AfterThrowing
### @AfterReturning
### @Around

## Mockito
### @Mock
create and inject mocked instances without having to call Mockito.mock manually.
### @Spy
spy on an existing instance.
### @InjectMocks
inject mock fields into the tested object automatically.

## Junit
### @BeforeClass
run once during the start of the class.
### @AfterClass
run once at the end of the class.
###  @Before
run it before each testcase runs.
### @After
run it after the execution of each test case.
###  @Test
annotates that these are the core test cases for the JUnit class to be executed.