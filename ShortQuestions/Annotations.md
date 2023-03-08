# Annotations

+ `@Service` marks the class as a service provider.

  ```java
  @Service("ms")
  public class MathService {
  
  	public int add(int x, int y) {
  		return x + y;
  	}
  	
  	public int subtract(int x, int y) {
  		return x - y;
  	}
  }
  ```

+ `@SpringBootApplication` is used to mark a configuration class that declares one or more `@Bean` methods and also triggers `auto-configuration` and component scanning. It’s same as declaring a class with `@Configuration`, `@EnableAutoConfiguration` and `@ComponentScan` annotations.

  ```java
  @SpringBootApplication
  public class SpringBootRestApplication {
  
  	public static void main(String[] args) {
  		SpringApplication.run(SpringBootRestApplication.class, args);
  	}
  }
  ```

+ `@Repository` is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.

+ `@Autowired` allows Spring to resolve and inject collaborating beans into our bean.

+ `@Bean` is applied on a method to specify that it returns a bean to be managed by Spring context

+ `@Configuration` indicates that the class has `@Bean` definition methods. So Spring container can process the class and generate Spring Beans to be used in the application. 

  ```java
  @Configuration
   
  public class CollegeConfig {
   
      // Creating College class Bean
      // using Bean annotation
      @Bean
   
      // Here the method name is the
      // bean id/bean name
      public College collegeBean()
      {
   
          // Returns the College class object
          return new College();
      }
  }
  ```


+ `@Transactional` supports further configuration as well:

  - the *Propagation Type* of the transaction
  - the *Isolation Level* of the transaction
  - a *Timeout* for the operation wrapped by the transaction
  - a *readOnly flag* – a hint for the persistence provider that the transaction should be read only
  - the *Rollback* rules for the transaction

  ```java
  @Service
  @Transactional
  public class FooService {
      //...
  }
  ```

+ `@ComponentScan` annotation along with the `@Configuration` annotation to specify the packages that we want to be scanned. `@ComponentScan` without arguments tells Spring to scan the current package and all of its sub-packages.

  ```java
  @Configuration
  @ComponentScan
  public class SpringComponentScanApp {
      private static ApplicationContext applicationContext;
  
      @Bean
      public ExampleBean exampleBean() {
          return new ExampleBean();
      }
  
      public static void main(String[] args) {
          applicationContext = 
            new AnnotationConfigApplicationContext(SpringComponentScanApp.class);
  
          for (String beanName : applicationContext.getBeanDefinitionNames()) {
              System.out.println(beanName);
          }
      }
  }
  
  @ComponentScan(basePackages = "com.baeldung.componentscan.springapp.animals")
  @Configuration
  public class SpringComponentScanApp {
     // ...
  }
  ```


+ `@Order` is an annotation in Spring Framework that is used to specify the order in which beans should be created or processed. When multiple beans of the same type are defined in a Spring context, the @Order annotation can be used to control the order in which they are autowired or processed by other Spring components, such as interceptors or advice.

  The @Order annotation takes a single parameter, which is an integer value representing the order. Lower values indicate higher priority, so a bean with an @Order value of 1 will be processed before a bean with an @Order value of 2.

  ```java
  @Component
  @Order(2)
  public class MySecondBean implements MyBeanInterface {
      // ...
  }
  
  @Component
  @Order(1)
  public class MyFirstBean implements MyBeanInterface {
      // ...
  }
  
  @Service
  public class MyService {
      
      @Autowired
      private List<MyBeanInterface> myBeans;
      
      public void doSomething() {
          // Process the beans in order
          for (MyBeanInterface bean : myBeans) {
              bean.doSomething();
          }
      }
  }
  ```

  

## Controller

+ `@RestController`is used to create RESTful web services using Spring MVC.

  ```java
  @RestController
  public class RestController{
    
  }
  ```

+ `@RequestMapping` is used to map web requests onto specific handler classes and/or handler methods.

  ```java
  @RequestMapping("/home")
  public class HomeController {
  
  }
  ```

+ `@PostMapping`/ `@GetMapping`/ `@PutMapping`/ `@DeleteMapping` Annotation for mapping HTTP `POST`/ `Get`/`PUT`/`DELETE` requests onto specific handler methods.

+ `@PathVariable` Annotation which indicates that a method parameter should be bound to a URI template variable. Supported for `@RequestMapping` annotated handler methods.

  ```java
  @GetMapping("/api/employees/{id}")
  @ResponseBody
  public String getEmployeesById(@PathVariable String id) {
      return "ID: " + id;
  }
  ```

+ `@ResponseStatus` specify the response status of a controller method.

  ```java
  @ResponseStatus(HttpStatus.BAD_REQUEST, reason = "Some parameters are invalid")
  void onIllegalArgumentException(IllegalArgumentException exception) {}
  ```

+ `@RequestParam`  indicates that a method parameter should be bound to a web request parameter.

  ```java
  @GetMapping("/api/foos")
  @ResponseBody
  public String getFoos(@RequestParam String id) {
      return "ID: " + id;
  }
  ```

  ```
  http://localhost:8080/spring-mvc-basics/api/foos?id=abc
  ----
  ID: abc
  ```

## Entity

+ `@Entity` in JPA are nothing but POJOs representing data that can be persisted to the database. An entity represents a table stored in a database. Every instance of an entity represents a row in the table.

+ `@Table` specify the table name.

+ `@Id` defines the primary key.

+ `@GeneratedValue` can generate the identifiers in different ways.

+ `@Column` annotation to mention the details of a column in the table (name, length, nullable, and unique).

  ```java
  @Entity
  @Table(name="STUDENT")
  public class Student {
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
      private Long id;
    
      @Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
      private String name;
      
      // getters and setters
  }
  ```

+ `@CreationTimestamp` marks a property as the creation timestamp of the containing entity. The property value will be set to the current VM date exactly once when saving the owning entity for the first time.

+ `@UpdateTimestamp` The value of the attribute annotated with *@UpdateTimestamp* gets changed in a similar way with every SQL Update statement. Hibernate gets the current timestamp from the VM and sets it as the update timestamp on the SQL Update statement.

+ `@OneToOne`, `@ManyToOne`, `@OneToMany`, `@ManyToMany`, `@JoinTable`, `@JoinColumn` 

  Let's say you have an entity `A` which has a `@ManyToOne` association ot an entity `B`

  `@JoinTable` will define the target table Foreign Key (e.g `B_ID`) while using the target Entity table (e.g. `B`).

  `@JoinColumn` will use a separate table to hold the relationship between `A` and `B`.

  ```java
  @Entity
  @Table(name = "users")
  public class User {
      
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name = "id")
      private Long id;
      //... 
  
      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "address_id", referencedColumnName = "id")
      private Address address;
  
      // ... getters and setters
  }
  
  @Entity
  @Table(name = "address")
  public class Address {
  
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name = "id")
      private Long id;
      //...
  
      @OneToOne(mappedBy = "address")
      private User user;
  
      //... getters and setters
  }
  ```

  ```java
  @Entity
  @Table(name="CART")
  public class Cart {
  
      //...
  
      @OneToMany(mappedBy="cart")
      private Set<Item> items;
  	
      // getters and setters
  }
  
  @Entity
  @Table(name="ITEMS")
  public class Item {
      
      //...
      @ManyToOne
      @JoinColumn(name="cart_id", nullable=false)
      private Cart cart;
  
      public Item() {}
      
      // getters and setters
  }
  ```

  ```java
  @Entity
  class Student {
  
      @Id
      Long id;
  
      @ManyToMany
    	@JoinTable(
    		name = "course_like", 
    		joinColumns = @JoinColumn(name = "student_id"), 
    		inverseJoinColumns = @JoinColumn(name = "course_id"))
      Set<Course> likedCourses;
  
      // additional properties
      // standard constructors, getters, and setters
  }
  
  @Entity
  class Course {
  
      @Id
      Long id;
  
      @ManyToMany
      Set<Student> likes;
  
      // additional properties
      // standard constructors, getters, and setters
  }
  ```

## Validation

+ `@NotEmpty` to say that a list field must not empty. 
+ `@Size` validate its value between the attributes min and max.

```java
public class User {

    // ...
  
  	@NotEmpty
    private String lastName;

    @Size(min = 3, max = 15)
    private String middleName;

    // ...

}
```

+ `@Valid` We can put the `@Valid` annotation on method parameters and fields to tell Spring that we want a method parameter or field to be validated.

  ```java
  @RestController
  public class UserController {
  
      @PostMapping("/users")
      ResponseEntity<String> addUser(@Valid @RequestBody User user) {
          // persisting the user
          return ResponseEntity.ok("User is valid");
      }
      
      // standard constructors / other methods
      
  }
  ```

## Exception

+ `@ControllerAdvice` is a specialization of the `@Component` annotation which allows to handle exceptions across the whole application in one global handling component.

+ `@ExceptionHandler` allows us to handle specified types of exceptions through one single method.

  ```java
  @ControllerAdvice
  public class ControllerAdvisor extends ResponseEntityExceptionHandler {
  
      @ExceptionHandler(CityNotFoundException.class)
      public ResponseEntity<Object> handleCityNotFoundException(
          CityNotFoundException ex, WebRequest request) {
  
          Map<String, Object> body = new LinkedHashMap<>();
          body.put("timestamp", LocalDateTime.now());
          body.put("message", "City not found");
  
          return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
      }
  
      @ExceptionHandler(NoDataFoundException.class)
      public ResponseEntity<Object> handleNodataFoundException(
          NoDataFoundException ex, WebRequest request) {
  
          Map<String, Object> body = new LinkedHashMap<>();
          body.put("timestamp", LocalDateTime.now());
          body.put("message", "No cities found");
  
          return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
      }
  
      @Override
      protected ResponseEntity<Object> handleMethodArgumentNotValid(
          MethodArgumentNotValidException ex, HttpHeaders headers, 
          HttpStatus status, WebRequest request) {
  
          Map<String, Object> body = new LinkedHashMap<>();
          body.put("timestamp", LocalDate.now());
          body.put("status", status.value());
  
          List<String> errors = ex.getBindingResult()
                  .getFieldErrors()
                  .stream()
                  .map(x -> x.getDefaultMessage())
                  .collect(Collectors.toList());
  
          body.put("errors", errors);
  
          return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
      }
  }
  ```

## JPQL

+ `@Query` In order to define SQL to execute for a Spring Data repository method, we can annotate the method with the `@Query` annotation — its value attribute contains the JPQL or SQL to execute.

  ```java
  @Query("SELECT u FROM User u WHERE u.status = 1")
  Collection<User> findAllActiveUsers();
  ```

+ `@Transactional` describes a transaction attribute on an individual method or on a class.

+ `@PersistenceContext` An EntityManager instance is associated with a persistence context. A persistence context is a set of entity instances in which for any persistent entity identity there is a unique entity instance. Within the persistence context, the entity instances and their lifecycle are managed. The EntityManager API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.

  ```java
  @Repository
  @Transactional
  public class PostJPQLRepositoryImpl implements PostJPQLRepository {
      @PersistenceContext
      EntityManager entityManager;
      ...
  }
  ```

+ `@NamedQuery` pecify a named query within an entity class and then declare that method in repository. 

  ```java
  @Entity
  @NamedQuery(name = "Employee.findByEmail", query = "select e from Employee e where e.email = ?1")
  public class Employee {
    // ...
  }
  ```

+ `@NamedQueries`

  ```java
  @Entity
  @NamedQueries({
      @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title =                :title"),
      @NamedQuery(name = "Book.findByPublishingDate", query = "SELECT b FROM Book b WHERE     b.publishingDate = :publishingDate")
  })
  public class Book implements Serializable {
  ...
  }
  ```


## Security

+ `@EnableWebSecurity` is annotated at class level with `@Configuration` annotation to enable web securities in our application defined by `WebSecurityConfigurer` implementations. 

  ```java
  @EnableWebSecurity
  public class SecurityConfig {
  
      @Autowired
      public void configureGlobal(AuthenticationManagerBuilder auth) 
        throws Exception {
          auth.inMemoryAuthentication().withUser("user")
            .password(passwordEncoder().encode("password")).roles("USER");
      }
  }
  ```

+ `@EnableGlobalMethodSecurity` We can enable annotation-based security using the *@EnableGlobalMethodSecurity* annotation on any *@Configuration* annotated class. By default, global method security is disabled, so if you want to use this functionality, you first need to enable it. Hence, in order to get access of annotations such as *@PreAuthorize, @PostAuthorize, @Secured, @RolesAllowed*, you first need to enable Global Method Security by applying *@EnableGlobalMethodSecurity* annotation to any *@Configuration* annotated java class.

  ```java
  @EnableWebSecurity
  @EnableGlobalMethodSecurity(
          prePostEnabled = true,  // Enables @PreAuthorize and @PostAuthorize
          securedEnabled = true, // Enables @Secured 
          jsr250Enabled = true    // Enables @RolesAllowed (Ensures JSR-250 annotations are enabled)
   )
  @Configuration 
   public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override 
        protected void configure(HttpSecurity http) throws Exception {
                ....
        }
         // some other overriden methods
  }
  ```

## AOP

+ `@Aspect` is used to declare an aspect.
+ `@Pointcut` is an annotation used in Spring AOP (Aspect-Oriented Programming) to specify a particular join point in the application where an advice will be applied.
+ `@AfterThrowing` is an advice type in Spring AOP that is executed after a method throws an exception.
+ `@Around` is an advice type in Spring AOP that is executed around a join point, i.e., before and after the execution of the method. 
+ `@Before `is an advice type in Spring AOP that is executed before a method is invoked. 
+ `@AfterReturning` is an advice type in Spring AOP that is executed after a method successfully returns a result.

```java
@Aspect
@Component
public class LoggingAspect {
  
  @Before("execution(* com.example.*.*(..))")
  public void logBefore(JoinPoint joinPoint) {
    System.out.println("Logging before method " + joinPoint.getSignature().getName());
  }
  
  @AfterReturning(pointcut = "execution(* com.example.*.*(..))", returning = "result")
  public void logAfterReturning(JoinPoint joinPoint, Object result) {
    System.out.println("Logging after method " + joinPoint.getSignature().getName() + " returned " + result);
  }
  
  @AfterThrowing(pointcut = "execution(* com.example.*.*(..))", throwing = "ex")
  public void logAfterThrowing(JoinPoint joinPoint, Exception ex) {
    System.out.println("Logging after method " + joinPoint.getSignature().getName() + " threw " + ex);
  }
  
  @Around("execution(* com.example.*.*(..))")
  public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("Logging around method " + joinPoint.getSignature().getName());
    Object result = joinPoint.proceed();
    System.out.println("Logging after method " + joinPoint.getSignature().getName() + " returned " + result);
    return result;
  }
  
  @Pointcut("execution(* com.example.*.*(..))")
  public void loggingPointcut() {}
  
  @DeclarePrecedence("logBefore, loggingPointcut, logAfterReturning, logAfterThrowing, logAround")
  public static final String[] adviceOrder() { return null; }
  
}
```

## Unit Test

+ `@ExtendWith` is a JUnit 5 annotation used to register extensions for a test class or method. 
+ `@Mock` is an annotation used in Java testing frameworks, such as JUnit and Mockito, to create mock objects. Mock objects are objects that simulate the behavior of real objects in a controlled way, making it easier to test the functionality of a system in isolation from its dependencies.

+ `@Spy` is an annotation used in Java testing frameworks, such as JUnit and Mockito, to create spy objects. Spy objects are objects that have the same behavior as the real objects they are based on, but they can also be configured to capture and report interactions with them.

+ `@InjectMocks` is used in conjunction with @Mock or @Spy annotations to create mock or spy objects and inject them into the fields of the class being tested. This allows the developer to test the class in isolation while providing the necessary dependencies.
+ `@BeforeAll`  is used to set up the preconditions for the tests and perform any initialization necessary before the tests run. This annotation is typically used to set up static resources that are required by all tests in a class.
+ `@BeforeEach`is used to set up the preconditions for each individual test and perform any initialization necessary before the test runs. This annotation is typically used to set up non-static resources that are required by each test in a class.

```java
@ExtendWith(MockitoExtension.class)
public class MyTest {
   @Mock
  private MyDependency mockedDependency;
  
  @Spy
  private List<String> spiedList = new ArrayList<String>();
  
  @InjectMocks
  private MyService myService;
  
  @BeforeAll
  public static void setUp() {
    // set up any static resources needed for the test class
  }
  
  @Test
  public void testMyService() {
    // set up the mock behavior for the dependency
    when(mockedDependency.someMethod()).thenReturn("mocked result");
    
    // add some items to the spied list
    spiedList.add("item 1");
    spiedList.add("item 2");
    
    // call the method being tested
    String result = myService.doSomething();
    
    // verify the results
    assertEquals("mocked result", result);
    assertEquals(2, spiedList.size());
  }
}
```
