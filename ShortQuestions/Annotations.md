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