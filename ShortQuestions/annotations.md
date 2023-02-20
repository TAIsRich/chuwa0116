### Entity

`@Entity`: This annotation is used to mark a Java class as a persistable entity, meaning it can be stored in a database.

`@Table`: This annotation is used to map the entity class to a database table. The name of the table can be specified using the "name" attribute.

`@Id`: This annotation is used to mark a field as the primary key of the entity.

`@GeneratedValue`: This annotation is used to specify that the primary key value is generated automatically by the database. The strategy for generating the key value can be specified using the "strategy" attribute.

`@Column`: This annotation is used to map a field to a database column. The name of the column can be specified using the "name" attribute.

`@CreationTimestamp`: This annotation is used to mark a field that should be automatically set to the current timestamp when the entity is created.

`@UpdateTimestamp`: This annotation is used to mark a field that should be automatically updated to the current timestamp when the entity is updated.

```java
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

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "content", nullable = false)
    private String content;

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}
```



`@ManyToOne` & `@JoinColumn`: @ManyToOne is a JPA (Java Persistence API) annotation that is used in object-relational mapping to define a relationship between two entities, where one entity can have multiple references to the other entity. It indicates that the entity annotated with @ManyToOne has a many-to-one relationship with the target entity.

In simpler terms, it means that one instance of an entity can be related to many instances of another entity. For example, a `Student` entity can have multiple `Enrollment` entities, where each `Enrollment` entity represents the enrollment of the `Student` in a particular course.

The @ManyToOne annotation is usually used with a join column to specify the foreign key column in the source table that references the primary key column in the target table. The target entity is specified as the type parameter in the annotation.

```java
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String email;
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
    
}
```



`@OneToMany` is used to define a one-to-many relationship between two entities, where one entity has a reference to multiple entities. For example, consider the following entities: "Department" and "Employee". A department can have many employees, but an employee can only belong to one department. In this case, we can use the @OneToMany annotation to define the relationship between the "Department" and "Employee" entities:

```java
@Entity
public class Department {
    @Id
    private int id;
    private String name;
    
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
    // getters and setters...
}

@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;
    // getters and setters...
}
```



`@ManyToMany` is used to define a many-to-many relationship between two entities, where each entity can have references to multiple entities of the other type. For example, consider the following entities: "Student" and "Course". A student can take many courses, and a course can have many students. In this case, we can use the @ManyToMany annotation to define the relationship between the "Student" and "Course" entities:

```java
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    
    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
    // getters and setters...
}

@Entity
public class Course {
    @Id
    private int id;
    private String name;
    
    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "course_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;
    // getters and setters...
}
```

`@NamedQuery`: A named query is a statically defined query with a predefined unchangeable query string. They're validated when the session factory is created, thus making the application to fail fast in case of an error. It's important to note that every @NamedQuery annotation is attached to exactly one entity class or mapped superclass.

`@Query`: In order to define SQL to execute for a Spring Data repository method, we can annotate the method with the @Query annotation — its value attribute contains the JPQL or SQL to execute. It's used in the repository layer.



### Controller

`@RestController`: This annotation is used to indicate that a class serves as a RESTful web service controller. A REST controller typically handles incoming HTTP requests and returns HTTP responses.

`@RequestMapping`: This annotation is used to map a URL to a method in a controller. The URL can be specified using the "value" attribute.

`@Autowired`: This annotation is used to inject a bean into a field, method or constructor. It tells the Spring framework to automatically instantiate the bean and set it to the annotated field, method or constructor.

`@PostMapping`: This annotation is a shorthand for `@RequestMapping(method = RequestMethod.POST)`. It is used to map a HTTP POST request to a method in a controller. The URL for the POST request can be specified using the "value" attribute.

```java
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO) {
        PostDTO postResponse = postService.createPost(postDTO);

        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

}
```

`@GetMapping`: This is a Spring MVC annotation that maps a HTTP GET request to a specific handler method. It is used to retrieve data from a server.

`@PutMapping`: This is a Spring MVC annotation that maps a HTTP PUT request to a specific handler method. It is used to update existing data on a server.

`@DeleteMapping`: This is a Spring MVC annotation that maps a HTTP DELETE request to a specific handler method. It is used to delete data from a server.

### Service

`@Service`: This annotation is used to indicate that a class serves as a service layer in the architecture of a Spring application. The service layer is typically responsible for handling business logic and communicating with the data access layer (for example, a repository) to persist and retrieve data.

By annotating a class with `@Service`, it is automatically registered as a bean in the Spring application context and can be easily accessed and injected into other components (such as controllers) using dependency injection. This allows for a clean separation of concerns and promotes modularity and reusability in the code.

```java
@Service
public class PostServiceImpl implements PostService {
}
```

### DAO

`@Repository`: This annotation is used to indicate that a class serves as a data access layer in the architecture of a Spring application. The repository layer is typically responsible for managing the persistence of data, such as database access.

Additionally, the `@Repository` annotation provides exception translation. In the case of a data access failure, such as a constraint violation or a data integrity issue, the repository layer can catch the exception and translate it into a more appropriate exception that can be easily handled by other components in the application. This helps to ensure that the persistence logic is decoupled from the business logic and that the persistence layer can evolve independently of the rest of the application.

### General

`@ResponseStatus`: 

### Json

`@JsonProperty` is a Jackson annotation used to specify the name of a property in a JSON serialization or deserialization process. When a Java object is serialized to JSON, the names of its properties are used as the names of the corresponding fields in the JSON representation. Similarly, when a JSON object is deserialized to a Java object, the names of the fields in the JSON object are used to set the values of the properties in the Java object.

The `@JsonProperty` annotation allows you to specify a custom name for a property that is different from the name of the corresponding field in the Java object. This can be useful if you want to use different names for the same property in the JSON representation and the Java object, or if you want to maintain compatibility with a pre-existing JSON format that uses different names for its fields.

Here's an example of how you might use the `@JsonProperty` annotation in a Java class:

```java
public class User {
    @JsonProperty("user_id")
    private long id;

    @JsonProperty("user_name")
    private String name;
    //...
}
```

In this example, the `@JsonProperty` annotations are used to specify that the `id` property in the Java object should be serialized as the field `user_id` in the JSON representation, and the `name` property in the Java object should be serialized as the field `user_name` in the JSON representation.

### Transaction

`EnableTransactionManagement` is a **annotation** that we can use in a *@Configuration* class to enable transactional support. However, if we're using a Spring Boot project and have a spring-data-\* or spring-tx dependencies on the classpath, then transaction management will be enabled by default.

`@Transactional`: we can annotate a bean with @Transactional either at the class or method level. The proxy allows the framework to inject transactional logic before and after the running method, mainly for starting and committing the transaction.

### Exception

`@ControllerAdvice` is an annotation in Spring that allows you to define methods that will apply to multiple controllers in your application. Here's how you can use `@ControllerAdvice` to handle exceptions in your Spring application:

1. Create a new class and annotate it with `@ControllerAdvice`. This class will contain methods that handle exceptions thrown by your controllers.

```java
@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
    // exception handling methods go here
}
```

2. Define methods within the `@ControllerAdvice` class that handle specific exceptions. You can use the `@ExceptionHandler` annotation to specify which exception each method handles.

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

In this example, the `handleException` method handles any exception thrown by any controller in your application. It returns a response with an HTTP status code of 500 (Internal Server Error) and a message indicating the error that occurred.

3. Optionally, you can use the `value` attribute of `@ControllerAdvice` to limit the scope of the advice to specific packages or classes.

```java
@ControllerAdvice("com.example.controllers")
public class ExceptionHandlerControllerAdvice {
    // exception handling methods go here
}
```

In this example, the `@ControllerAdvice` applies only to controllers in the `com.example.controllers` package.

When an exception is thrown by any controller in your application, Spring will search for a matching exception handling method in your `@ControllerAdvice` class and invoke it if found.

### Validation

- `@Valid`: Indicates that a nested object should be validated.
- `@NotNull`: Validates that the annotated field or parameter is not null.
- `@Size`: Validates that the annotated field or parameter has a size within a specified range. You can specify the minimum and maximum size using the `min` and `max` parameters, respectively.
- `@Pattern`: Validates that the annotated field or parameter matches a regular expression pattern.
- `@Max`: Validates that the annotated field or parameter is less than or equal to a specified value. You can specify the maximum value using the `value` parameter.
- `@Min`: Validates that the annotated field or parameter is greater than or equal to a specified value. You can specify the minimum value using the `value` parameter.

These annotations can be used in combination to create complex validation rules for your application's data. By using these annotations, you can ensure that the data entered into your application is valid and meets the requirements of your business logic.

### Spring & Spring Boot

`@ComponentScan` is an annotation provided by the Spring Framework that is used to specify the packages that should be scanned for Spring-managed components. When this annotation is used, Spring searches for classes annotated with the @Component annotation, and creates instances of these classes as Spring-managed components.

The @ComponentScan annotation can be used in a Spring configuration class or in the main class of a Spring Boot application. It takes one or more package names as arguments and instructs Spring to search for components in those packages and their sub-packages.

For example, if you have a Spring application with components located in the "com.example" package and its sub-packages, you can use the @ComponentScan annotation as follows:

```java
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
   //...
}
```

This tells Spring to scan the "com.example" package and its sub-packages for components. If you have components in other packages, you can include those as well by providing a comma-separated list of package names.

The @ComponentScan annotation is a convenient way to configure Spring-managed components in a Spring application. It eliminates the need to manually configure individual components and provides a way to quickly and easily configure an entire application with Spring-managed components.



`@SpringBootApplication` is a convenience annotation provided by Spring Boot that combines three commonly used Spring annotations: @Configuration, @EnableAutoConfiguration, and @ComponentScan.

The @Configuration annotation marks the class as a configuration class that can contain Spring Bean definitions. The @EnableAutoConfiguration annotation tells Spring Boot to automatically configure the application based on its classpath and other configurations. The @ComponentScan annotation tells Spring to scan the specified packages for Spring-managed components.

By using the @SpringBootApplication annotation, you can create a Spring Boot application with minimal configuration. You only need to define the main class of your application, and Spring Boot will take care of the rest. Spring Boot will automatically configure the application based on the classpath and other configurations, and will scan the specified packages for Spring-managed components.

Here's an example of how to use the @SpringBootApplication annotation:

```Java
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
```

In this example, the @SpringBootApplication annotation is used to mark the MyApplication class as a Spring Boot application. The main() method starts the Spring Boot application by calling the static run() method of the SpringApplication class.

By using @SpringBootApplication, you can create a Spring Boot application with minimal configuration and start developing your application right away. It simplifies the process of setting up a Spring application and provides a solid foundation for building and deploying production-grade Spring Boot applications.



In Spring, there are several annotations that can be used to inject beans into other components:

1. `@Autowired`: The @Autowired annotation is used to inject a bean into a dependent component automatically. Spring will look for a matching bean in the context and inject it into the component.
2. `@Qualifier`: The @Qualifier annotation is used in conjunction with @Autowired to specify which bean to inject when there are multiple beans of the same type in the context.
3. `@Resource`: The @Resource annotation is a Java EE standard annotation that can be used to inject a bean into a dependent component. It works in a similar way to @Autowired, but can also be used to inject non-Spring beans.
4. `@Value`: The @Value annotation is used to inject a value, such as a property or a configuration setting, into a component.
5. `@Inject`: The @Inject annotation is another Java EE standard annotation that can be used to inject a bean into a dependent component. It works in a similar way to @Autowired, but provides more fine-grained control over injection.



`@Qualifier` is used to specify which bean should be injected when there are multiple beans of the same type in the context.

`@Primary` is used to indicate that a bean should be given preference when multiple beans of the same type are present in the context.

`Qualifier` has a higher priority.



`Scope` annotation is used to specify the scope of a bean.

### Security

`@EnableWebSecurity` is an annotation in the Spring Security framework that enables web security features in a Spring Boot application. When this annotation is used in a Spring Boot application, it automatically configures several default security features, such as authentication and authorization.

The `@EnableWebSecurity` annotation can be used to configure web security by creating a class that extends the `WebSecurityConfigurerAdapter` class and annotating it with `@EnableWebSecurity`. This class can then override methods to configure various security features, such as authentication and authorization, as well as configure specific security rules for different paths or URLs.

When the Spring Boot application starts up, it scans for any classes that are annotated with `@EnableWebSecurity` and automatically applies the security configuration provided by those classes.

In summary, `@EnableWebSecurity` is a Spring Security annotation that enables web security in a Spring Boot application and provides a convenient way to configure authentication, authorization, and other security features.



There are several annotations that are related to `@EnableWebSecurity` in the Spring Security framework. Here are a few examples:

1. `@Configuration`: This annotation indicates that the class is a configuration class that provides Spring configuration metadata.
2. `@EnableGlobalMethodSecurity`: This annotation enables method-level security using Spring Security. It allows you to secure individual methods or entire classes with specific security rules.
3. `@EnableWebMvcSecurity`: This annotation is used in Spring Security 3.x to enable web security in a Spring MVC application. It has been replaced by `@EnableWebSecurity` in Spring Security 4.x and higher.
4. `@Order`: This annotation specifies the order in which Spring Security filters should be applied. It is used to control the order in which filters are applied to incoming requests.
5. `@Secured`: This annotation is used to secure individual methods or entire classes with specific security rules. It is used in conjunction with the `@EnableGlobalMethodSecurity` annotation.

Overall, these annotations provide a convenient way to configure and customize the security features in a Spring Boot application using the Spring Security framework.
