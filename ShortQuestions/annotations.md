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

#### Json

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

#### Transaction

`EnableTransactionManagement` is a **annotation** that we can use in a *@Configuration* class to enable transactional support. However, if we're using a Spring Boot project and have a spring-data-\* or spring-tx dependencies on the classpath, then transaction management will be enabled by default.

`@Transactional`: we can annotate a bean with @Transactional either at the class or method level. The proxy allows the framework to inject transactional logic before and after the running method, mainly for starting and committing the transaction.

#### Exception

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

#### Validation

- `@Valid`: Indicates that a nested object should be validated.
- `@NotNull`: Validates that the annotated field or parameter is not null.
- `@Size`: Validates that the annotated field or parameter has a size within a specified range. You can specify the minimum and maximum size using the `min` and `max` parameters, respectively.
- `@Pattern`: Validates that the annotated field or parameter matches a regular expression pattern.
- `@Max`: Validates that the annotated field or parameter is less than or equal to a specified value. You can specify the maximum value using the `value` parameter.
- `@Min`: Validates that the annotated field or parameter is greater than or equal to a specified value. You can specify the minimum value using the `value` parameter.

These annotations can be used in combination to create complex validation rules for your application's data. By using these annotations, you can ensure that the data entered into your application is valid and meets the requirements of your business logic.
