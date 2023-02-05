# SpringBoot Annotions

## Annotion used by Entity

### @Entity
让人知道这个是从java映射到database的
```java
@Entity
public class T{
    
}
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
tell service to use repository
```java
    @Autowired
    private PostRepository postRepository;
```
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
    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
            PostDTO postResponse = postService.createPost(postDTO);
    
            return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
            }
        }
```
