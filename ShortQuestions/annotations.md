1. @Service
   - It is used at the class level. It shows that the annotated class is a service class, such as business basic logic, and call external APIs.
```
@Service
public class PostServiceImpl implements PostService {
}
```  

2. @RestController
   - Spring RestController annotation is used to create RESTful web services using Spring MVC. Spring RestController takes care of mapping request data to the defined request handler method.

3. @RequestMapping
   - RequestMapping is used to map the HTTP request. It is used with the class as well as the method. It has many other optional elements like consumes, name, method, request, path, etc.

```
@RestController
@RequestMapping("api/v1/posts")
public class PostController {

}
```
4. @Autowired
   - This annotation is used to auto-wire spring bean on setter methods, constructor and instance variable. It injects object dependency implicitly. When we use this annotation, the spring container auto-wires the bean by its matching data type.
  
```
@RestController
@RequestMapping("api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;
}
```

5. @Repository
   - It is a Data Access Object (DAO) that accesses the database directly. It indicates that the annotated class is a repository. 
```
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
//    no need to write for now
}
```

6. @GetMapping, @PutMapping, @DeleteMapping, @PostMapping
   - Different annotations for corresponding types of API
```
    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
        PostDTO postResponse = postService.createPost(postDTO);

        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);

    }
```

7. @Entity
   - @Entity annotation defines that a class can be mapped to a table. 

8. @Table
   - Defines the table that class mapped to, including table's name and contraints on columns

```
@Entity
@Table(
        name = "posts",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"title"})
        }
)
public class Post {

}
```

9. @Column
   - @Column annotation is used for Adding the column the name in the table of a particular MySQL database.

```
@Column(name = "content", nullable = false)
private String content;
```

10. @Id, @GeneratedValue
    - The @Id annotation specifies the primary key of an entity and the @GeneratedValue provides for the specification of generation strategies for the values of primary keys.

```
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
```
11. @ResponseStatus
    - @ResponseStatus marks a method or exception class with the status code and reason message that should be returned. The status code is applied to the HTTP response when the handler method is invoked, or whenever the specified exception is thrown. 
```
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
}
```  