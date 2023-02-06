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