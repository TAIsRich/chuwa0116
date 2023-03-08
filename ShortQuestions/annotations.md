# SpringBoot Annotions

## Annotion used by Entity

### @Entity
让人知道这个是从java映射到database的
```java
@Entity
public class T{
    
}
```
### @NamedQuery used by JPQL to give query
```java
@NamedQuery(name="get_all_posts", query="select p from Post p")
//here the Post is match to entity name rather than db name
```

### @NamedQueries used by JPQL to give s collection of query
```java
@NamedQueries({
        @NamedQuery(name="get_all_posts", query="select p from Post p"),
        @NamedQuery(name="get_posts_byId", query="select p from Post p where id = :id")
//here the Post is match to entity name rather than db name
```

### @Table
映射到db的table里并设置了一些比如table name还有constraint
```java
@Table(
        name = "posts",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"title"})
        }
)
```

### @UniqueConstraint(columnNames
constraint设置为不可重复 unique
```java
@UniqueConstraint(columnNames = {"title"}）

```

### @Id
设置id关键字
```java
@Id
private Long id;//UUID

```

### @GeneratedValue
设置自动生成
```java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;//UUID
```

### @Column
table的column映射 还可以设置一些constrain
```java
    @Column(name = "title", nullable = false)
    private String title;
```
### @OneToOne, @ManyToOne, @OneToMany, @ManyToMany, @JoinTable, @JoinColumn

give the relationship between tables
```java
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
//many comments in one post
```

### @CreationTimestamp
```java
 @CreationTimestamp
 private LocalDateTime createDateTime;
```

### @UpdateTimestamp
```java
 @CreationTimestamp
 private LocalDateTime updateTimestamp;
```

## Annotion used by Repository
### @Repository
```java
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    //no need to write anything here yet
}
```

## Annotion used by Service
### @Service
```java
@Service
public class PostServiceImpl implements PostService {
    
}
```

### @Autowired
tell service to dependency injection
```java
    @Autowired
    private PostRepository postRepository;
```
### @Resource
By Name > By Type
### @Inject

## Annotation used by Controller
### @RestController
tell here is controller
```java
    @RestController
    public class Controller{
        
    }
```

### @RequestMapping
tell the url path
```java
    @RestController
    @RequestMapping("/api/v1/posts")
    public class Controller{
        
    }
```

### @PostMapping
```java
    @PostMapping("/user/{userid}")
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
            PostDTO postResponse = postService.createPost(postDTO);
    
            return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
            }
        }
```

### @GetMapping/PutMapping/DeleteMapping
```java
    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(postService.getPostById(id));
        }
```

### @PathVariable
```java
    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(postService.getPostById(id));
        }
```
### @Valid use constrain we created in DTO
```java
@PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable(value = "postId") long id,
                                                    @Valid @RequestBody CommentDto commentDto) {
        return new ResponseEntity<>(commentService.createComment(id, commentDto), HttpStatus.CREATED);
    }
```

### @RequestBody
```java
     @PutMapping("/{id}")
    public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDto, @PathVariable(name = "id") long id) {
        PostDTO postResponse = postService.updatePost(postDto, id);
        return new ResponseEntity<>(postResponse, HttpStatus.OK);
        }
```

### @RequestParam
```java
      public PostResponse getAllPosts(
    @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo
        )
```

### @JsonPropertyOrder give the return order of Json
```java
@JsonPropertyOrder({ "last", "pageNo", "pageSize", "totalElements", "totalPages", "content" })
```

### @JsonProperty match Json to the entity name
```java
@JsonProperty("isLast")
```

### @PersistenceContext to clarify the entity manager
```java
    @PersistenceContext
    EntityManager entityManager;
```
## Config 层
### @Configuration  @Bean 
```java
/**@Configuration: This annotation
marks a class as a Configuration class in Java-based
configuration, it allows to register extra beans in the context
or import additional configuration classes*/
/**@Bean is a method level annotation,is used when you want to
explicitly declare and register a bean into application
 */
@Configuration
public class CommentConfig {
    //把第三方lib放入IOC容器需要 @Bean
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
```

## Exception
### @ControllerAdvice
@ControllerAdvice annotation is used to intercept
and handle the exceptions thrown by the controllers across
the application, so it is a global exception handler. You can
also specify @ControllerAdvice for a specific package
```java
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception,
                                                                        WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(),
                webRequest.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
```
### @ExceptionHandler
@ExceptionHandler annotation is used to handle specific
exceptions thrown by controllers

## Validation
### @NotEmpty @NotNull @Size
```java
@NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;
```


### @ComponentScan
Define where the spring need to scan the bean definitions and generate the beans
```java
@Configuration
@ComponentScan(basePackage = "com.chuwa.spring")
```
### @SpringBootApplication


### @EnableWebSecurity
This annotation is a marker annotation. It allows Spring to find (it's a @Configuration and, therefore, @Component) and automatically apply the class to the global WebSecurity.


### @EnableGlobalMethodSecurity
This annotation provides AOP security on methods. Some of the annotations that it provides are PreAuthorize, PostAuthorize

### @PreAuthorize
This annotation checks the given expression before entering the method
```java
@PreAuthorize("hasRole('ADMIN')")
@PostMappint
public ResponseEntity<PostDTO> createPost(@Valid, @RequestBody PostDTO postDTO){
    return new ResponseEntity<>(postService.createPost(postDTO), HttpStatus.CREATED)
}
```

### @PostAuthorize
This annotation verifies it after the execution of the method and could alter the result

### @Value
This annotation is used for injecting values into fields in Spring-managed beans, and it can be applied at the field or constructor/method parameter level.
```java
in application.properties:
app.jwt-secret = JWTSecretKey
app.jwt-expiration-milliseconds = 10000000
can use @Value as following:
@Value("${app.jwt-secret}")
private String jwtSecret;
@Value("${app.jwt-expiration-milliseconds}")
private int jwtExpirationInMs;
```
### @JsonProperty
This annotation is used to mark non-standard getter/setter method to be used with respect to json property

### @EnableGlobalMethodSecurity
When you use this annotation, it enables the use of Spring Security's method security features such as @PreAuthorize, @PostAuthorize, @Secured, and other similar annotations that can be used to restrict access to specific methods based on user roles or permissions.

### @EnableWebSecurity
The @EnableWebSecurity annotation is usually added to a configuration class that extends the WebSecurityConfigurerAdapter class. This class provides a convenient base class for creating a custom security configuration.

### @PreAuthorize
validate if user has role specified in the brackets

### @Aspect
The @Aspect annotation in Spring is used to mark a class as an aspect.

### @Order
The @Order annotation is a Spring Framework annotation that can be used to specify the ordering of beans or components within an application context.

### @Pointcut
The @Pointcut annotation is typically used in combination with other annotations, such as @Before, @After, or @Around, to define advice that will be executed at the join points matched by the pointcut expression.

### @AfterThrowing
pring will automatically generate code that wraps the target method in a try-catch block. If the target method throws an exception, the code defined in the annotated method will be executed.

### @Around
When the @Around annotation is applied to a method, Spring's AOP mechanism will wrap the target method with the advice method, and will execute the advice method before and/or after the target method execution.

### @EqualsAndHashCode
When you annotate a class with @EqualsAndHashCode, the annotation processor generates equals() and hashCode() methods using all non-static, non-transient fields of the annotated class.

### @Scheduled 
When you try to use task schedule

### `@BeforeAll`: provides class level set-up
### `@BeforeEach`: provides method level set-up
### `@Test`: test execution and assertion happens
### `@AfterEach`: provides method level clean-up
### `@AfterAll`: provides class level clean-up
## @ExtendWith(MockitoExtension.class)