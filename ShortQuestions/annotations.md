### @Entity
- The @Entity annotation is used to map a Java class to a database table.
```java
@Entity
public class Post{
    
}
```

### @Service
- @Service annotation is used to indicate that a Java class is a service class. This means that the class will be discovered and registered as a Spring bean, and can be injected into other components using dependency injection.
```java
@Service
public class PostServiceImpl implements PostService {
}
```

### @Autowire
-  @Autowired annotation is used for dependency injection. It is used to automatically inject instances of the required beans where we are needed.
```java
@Autowired
PostRepository repository;
```

### @RestController
- The @RestController annotation indicates that a class is a controller that is used to handle HTTP requests and return HTTP responses.  So that the return value of the method is automatically serialized to JSON or XML and written to the HTTP response body.
- @RestController =  @Controller + @ResponseBody
```java
@RestController
public class PostController {
}
```

### @PostMapping
- The @PostMapping annotation is used to handle HTTP POST requests and map them to specific methods in a controller class. The annotated method will be executed whenever a POST request is sent to the specified URL. 
```java
@PostMapping
public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
}
```

### @RequestMapping
- @RequestMapping annotation is used to map incoming HTTP requests to specific methods in a controller class.  It is used to define the URL that a particular method should handle, and the HTTP methods that it should accept.
```java
@RestController
@RequestMapping
public class PostController {
}
```

### @Repository
-  @Repository annotation is used to mark a class as a repository.
```java
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
```

### @Table
- @Table annotation is used to map an entity class to a database table.
```java
@Table( name= "posts",
uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}   //数据库里的是独一无二的不能重复
)
public class Post {}
```
### @Id
- Declare that this field is a primary key
```java
@Id
@GeneratedValue(
        strategy = GenerationType.IDENTITY    //自动生成1，2，3，4
)
private Long id;
```
### @GeneratedValue
- Declares that this field is automatically generated
```java
@Id
@GeneratedValue(
        strategy = GenerationType.IDENTITY    //自动生成1，2，3，4
)
private Long id;
```

### @Column
- The @Column annotation can be used to specify the name of the column in the database table, the type of the column, and whether the column is nullable or not
```java
@Column(name = "description", nullable = false)
private String description;
```

### @CreationTimestamp
-The @CreationTimestamp annotation is used to automatically set the value of the field to the current time when a new instance is created and saved to the database.

```java
 @CreationTimestamp
private LocalDateTime createDateTime;
```

### @UniqueConstraint
- @UniqueConstraint is used to mark the value of this field as unique in database
```java
@Table( name= "posts",
uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}   //数据库里的是独一无二的不能重复
)
public class Post {}
```

### @PutMapping
- @PutMapping annotation is used to handle HTTP PUT requests and map them to specific methods in a controller class.
```java
public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDTO, @PathVariable(name = "id") long id) {
    }
```

### @DeleteMapping
- DeleteMapping is used to handle HTTP DELETE requests and map them to specific methods in a controller class.
```java
 public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
    }
```

### @OneToOne, @ManyToOne, @OneToMany, @ManyToMany, @JoinTable, @JoinColumn

- Let's say you have an entity `A` which has a `@ManyToOne` related ot an `B`

- `@JoinTable` will define the target table Foreign Key while using the target table.

- `@JoinColumn` will use a separate table to hold the relationship between `A` and `B`.

  ```java
  @Entity
  @Table(name = "users")
  public class User {
      
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      @Column(name = "id")
      private Long id;
      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name = "address_id", referencedColumnName = "id")
      private Address address;
  
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
  }
  ```

  ```java
  @Entity
  @Table(name="CART")
  public class Cart {
      @OneToMany(mappedBy="cart")
      private Set<Item> items;
      
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
### @NotEmpty 
- field must not empty.
### @Size 
- its value between the attributes min and max.

```java
public class User {
  	@NotEmpty
    private String lastName;

    @Size(min = 3, max = 15)
    private String middleName;
}
```

### @Valid
- We can put the `@Valid` annotation on method parameters and fields to tell Spring that we want a method parameter or field to be validated.
  ```java
  @RestController
  public class UserController {
      @PostMapping("/users")
      ResponseEntity<String> addUser(@Valid @RequestBody User user) {
      }
  }
  ```
### @ControllerAdvice 
- It is a specialization of the `@Component` annotation which allows to handle exceptions across the whole application in one global handling component.

### @ExceptionHandler 
- It allows us to handle specified types of exceptions through one single method.

  ```java
  @ControllerAdvice
  public class ControllerAdvisor extends ResponseEntityExceptionHandler {
  
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
### @Query 
- In order to define SQL to execute for a Spring Data repository method, we can annotate the method with the `@Query` annotation — its value attribute contains the JPQL or SQL to execute.

```java
  @Query("SELECT u FROM User u WHERE u.status = 1")
  Collection<User> findAllActiveUsers();
```

### @Transactional 
- describes a transaction attribute on an individual method or on a class.

### `@PersistenceContext` 
- An EntityManager instance is associated with a persistence context. A persistence context is a set of entity instances in which for any persistent entity identity there is a unique entity instance. Within the persistence context, the entity instances and their lifecycle are managed. The EntityManager API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.

  ```java
  @Repository
  @Transactional
  public class PostJPQLRepositoryImpl implements PostJPQLRepository {
      @PersistenceContext
      EntityManager entityManager;
      ...
  }
  ```

### @NamedQuery
- pecify a named query within an entity class and then declare that method in repository.

  ```java
  @Entity
  @NamedQuery(name = "Employee.findByEmail", query = "select e from Employee e where e.email = ?1")
  public class Employee {
    // ...
  }
  ```

### @NamedQueries
  ```java
  @Entity
  @NamedQueries({
      @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title =                :title"),
      @NamedQuery(name = "Book.findByPublishingDate", query = "SELECT b FROM Book b WHERE     b.publishingDate = :publishingDate")
  })
  public class Book implements Serializable {
  }
  ```
### @SpringBootApplication 
- It is used to mark a configuration class that declares one or more `@Bean` methods and also triggers `auto-configuration` and component scanning. It’s same as declaring a class with `@Configuration`, `@EnableAutoConfiguration` and `@ComponentScan` annotations.

  ```java
  @SpringBootApplication
  public class SpringBootRestApplication {
  
  	public static void main(String[] args) {
  		SpringApplication.run(SpringBootRestApplication.class, args);
  	}
  }
  ```

### @Configuration 
- `@Configuration` indicates that the class has `@Bean` definition methods. So Spring container can process the class and generate Spring Beans to be used in the application.

  ```java
  @Configuration
  public class CollegeConfig {
      // Here the method name is the
      // bean id/bean name
      @Bean
      public College collegeBean(){
   
          // Returns the College class object
          return new College();
      }
  }
  ```

### @ComponentScan 
- `@ComponentScan` annotation along with the `@Configuration` annotation to specify the packages that we want to be scanned. `@ComponentScan` without arguments tells Spring to scan the current package and all of its sub-packages.

  ```java
  @Configuration
  @ComponentScan
  public class SpringComponentScanApp {
      private static ApplicationContext applicationContext;
      @Bean
      public ExampleBean exampleBean() {
          return new ExampleBean();
      }
  }
  
  @ComponentScan(basePackages = "com.baeldung.componentscan.springapp.animals")
  @Configuration
  public class SpringComponentScanApp {
     // ...
  }
  ```
  
### @EnableWebSecurity
The`@EnableWebSecurity` is an annotation in the Spring Security framework that enables web security features in a Spring Boot application. When this annotation is used in a Spring Boot application, it automatically configures several default security features, such as authentication and authorization.
The `@EnableWebSecurity` annotation can be used to configure web security by creating a class that extends the `WebSecurityConfigurerAdapter` class and annotating it with `@EnableWebSecurity`. This class can then override methods to configure various security features, such as authentication and authorization, as well as configure specific security rules for different paths or URLs.

- `@Configuration`: This annotation indicates that the class is a configuration class that provides Spring configuration metadata.
- `@EnableGlobalMethodSecurity`: This annotation enables method-level security using Spring Security. It allows you to secure individual methods or entire classes with specific security rules.
- `@EnableWebMvcSecurity`: This annotation is used in Spring Security 3.x to enable web security in a Spring MVC application. It has been replaced by `@EnableWebSecurity` in Spring Security 4.x and higher.
- `@Order`: This annotation specifies the order in which Spring Security filters should be applied. It is used to control the order in which filters are applied to incoming requests.
- `@Secured`: This annotation is used to secure individual methods or entire classes with specific security rules. It is used in conjunction with the `@EnableGlobalMethodSecurity` annotation.