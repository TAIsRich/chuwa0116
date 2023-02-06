## @Entity

Specifies that the class is an entity. Typically, an entity represents a table in a relational database, and each entity instance corresponds to a row in that table.

## @Table

It specifies the table in the database with which this entity is mapped

## @UniqueConstraint

Specifies values of some columns should be unique.

## @Id

This annotation specifies the primary key of the entity.

## @GeneratedValue

Provides for the specification of generation strategies for the values of primary keys.

## @Column

Specify the column mapping

## @CreationTimestamp

Marks a property as the creation timestamp of the containing entity. The property value will be set to the current VM date exactly once when saving the owning entity for the first time.


## @UpdateTimestamp

Marks a property as the update timestamp of the containing entity. The property value will be set to the current VM date whenever the owning entity is updated.


```Java
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

    @CreationTimestamp
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    private LocalDateTime updateDateTime;
}
```

## @Repository

@Repository is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects.

## @Service

Indicates that an annotated class is a "Service", originally defined by Domain-Driven Design (Evans, 2003) as "an operation offered as an interface that stands alone in the model, with no encapsulated state."

## @Autowired

The @Autowired annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.


```Java
@Component
public class FooService {  
    @Autowired
    private FooFormatter fooFormatter;
}
```

## @RestController

This annotation is applied to a class to mark it as a request handler. Spring RestController annotation is used to create RESTful web services using Spring MVC.

## @RequestMapping

RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. 

## @PostMapping

Annotation for mapping HTTP POST requests onto specific handler methods. Specifically, @PostMapping is a composed annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) .

```Java
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
        PostDTO postResponse = postService.createPost(postDTO);
        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }
}
```

## @GetMapping

Annotation for mapping HTTP GET requests onto specific handler methods. 

## @PutMapping

Annotation for mapping HTTP PUT requests onto specific handler methods. 

## @DeleteMapping

Annotation for mapping HTTP DELETE requests onto specific handler methods. 

## @SpringBootApplication

Enable Spring Boot’s auto-configuration mechanism, enable @Component scan on the package where the application is located, allow to register extra beans in the context or import additional configuration classes.

## @ResponseBody

@ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.

## @PathVariable

@PathVariable annotation can be used to handle template variables in the request URI mapping, and set them as method parameters.

```Java
@GetMapping("/api/employees/{id}")
@ResponseBody
public String getEmployeesById(@PathVariable String id) {
    return "ID: " + id;
}

```

## @RequestBody 

@RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization

## @RequestParam

@RequestParam to extract query parameters, form parameters, and even files from the request.

```Java
@GetMapping("/api/foos")
@ResponseBody
public String getFoos(@RequestParam String id) {
    return "ID: " + id;
}
```
