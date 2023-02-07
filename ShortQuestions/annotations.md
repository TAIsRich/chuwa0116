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
-@PutMapping annotation is used to handle HTTP PUT requests and map them to specific methods in a controller class.
```java
public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDTO, @PathVariable(name = "id") long id) {
    }
```

### @DeleteMapping
-DeleteMapping is used to handle HTTP DELETE requests and map them to specific methods in a controller class.
```java
 public ResponseEntity<String> deletePost(@PathVariable(name = "id") long id) {
    }
```