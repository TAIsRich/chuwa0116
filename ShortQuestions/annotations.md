#Spring Boot REST

##1.Defination: 
    1)@Controller: 
        @RequestMapping
        Marking @Contraoller on a class, along with the @RequestMapping annotiation, allows you to define multiple interfaces 
        wtihin a class. The class marked by @Controller is actually a SpringMVC Controller object. It is a controller classs where 
        the @RequestMapping methods are scanned  by the distrubution handler to distribute different requests to the corresponding 
        interface.
    2)@RestController
    
```
@RestController
//@RequestMapping
@RequestMapping("/api/v1/posts")
public class PostController {

}

```

##2.Common annotations for parameter binding:
    1)for handling request body: @RequestParam（）, @RequestBody
```
@PostMapping(path = "/json/user/set/name", produces = MediaType.APPLICATION_JSON_VALUE)
public User setUserName(@RequestParam String name) {
    user.setName(name);
    return user;
}

```

    2)for handling request URIs: @PathVariable
```
@PutMapping("/{id}")
public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDTO, @PathVariable(name = "id") long id){
   PostDTO postResponse = postService.updatePost(postDTO, id);
   return new ResponseEntity<>(postResponse, HttpStatus.OK);
}
```
    3)for handling reqeust Headers: @RequestHeader, @CookieValue
```
@GetMapping(path = "/html/demo/header")
public String htmlHeader(@RequestHeader(value = "Accept") String acceptHeader, HttpServletRequest request) {
    return "<html><body>Request 'Accept' header value : " + acceptHeader + " </body></html>";
}

```

    4)for handling attributes: @SessionAttributes, @ModelAttribute

####@RequestMapping(value = "/users", method =RequestMethod.GET)
####@RequestMapping(value = "/users", method =RequestMethod.POST)
####@RequestMapping(value = "/users", method =RequestMethod.PUT)
####@RequestMapping(value = "/users", method =RequestMethod.DELETE)





##3. Exception:
    1.@RestControllerAdvice

##4.Cross-Domain:
    1.@CrossOrigin


#Web MVC Annotation Driver

##1.Annotation Configuration:
    @Configuration

##2.Component Activation:
    @EnableWebMvc

##3.Custom Component:
    @WebMvcConfigurer

##4.Model Attribute:
    @ModelAttribute

##5.Request header:
    @RequestHeader

##6.Cookie:
    @CookieValue

##7.Check Parameter:
    @Valid, @Validated

##8.Annotation Processing:
    @ExceptionHandler

##9.Aspect Advice:
    @ControllerAdvice


##@Autowired：
    @Autowired is a annotation, which can annotate member variables, methods and constructors to complete the auto-assembly work. 
    @Autowired annotation can be placed on member variables, or on the set method of member variables, or on any method representation, 
    and automatically executes the current method. If the method has parameters, Parameters of the same type are automatically 
    found in the IOC container for their values.
```
@Autowired
    ItemRepository groceryItemRepo;

@Autowired
	CustomItemRepository customRepo;

```

##@Service
    @Service is used on class, and marks the current class as a service class. Adding this annotation can automatically inject 
    the current class into the spring container, which eliminates the need to define beans in the applicationContext.xml file.


##Assembly Annotation
####@ImportResource:
    Replace XML element <import>
####@Import:
    Import the Configuration class
####@ComponentScan
    Scans for classes annotated with Spring schema annotations under the specified package

#Data 

####@OneToMany
```
@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
private Set<Comment> comments = new HashSet<>();
```
####@ManyToOne
```
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "post_id", nullable = false)
private Post post;

```

####@ManyToMany
```
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name = "sku_inventory", joinColumns = @JoinColumn(name = "sku_id"), inverseJoinColumns = @JoinColumn(name ="inventory_id"))
private Set<PmsInventory> pmsInventories = new HashSet<>();

```

####@NamedQuery
```
@NameQuery(name="get_all_posts", query="select p from Post p")
```

####@NamedQueries
```
@NamedQueries({
    @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
    @NamedQuery(name = "Book.findByPublishingDate", query = "SELECT b FROM Book b WHERE b.publishingDate = :publishingDate")
})
```

####@Query
```
@Query("select p from Post p where p.id = :key or p.title = :title")
Post getPostByIDOrTitleWithJPQLNamedParameters(@Param("key") Long id,
                                                @Param("title") String title);
```

####@PersistenceContext
```
@PersistenceContext
EntityManager entityManager;
```

####@Transactional
```
@Transactional
public class PostJPQLRepositoryImpl implements PostJPQLRepository {
    @PersistenceContext
    EntityManager entityManager;
     ...
}

```

####@EnableTransactionManagement
```
@SpringBootApplication
@EnableTransactionManagement
public class TutorialTransactionApplication{
    public static void main(String[] args){
        SpringApplication.run(TutorialTransactionApplication);
    }
}
```


####@Bean:
```
@Bean
public ModelMapper modelMapper() {
   return new ModelMapper();
}

```

#Dealing with exceptions

####@ExceptionHandler
####@ControllerAdvice
```
@ControllerAdvice
public class ControllerExceptionHandler{
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails>  handleResourceNotFoundException(ResourceNotFoundException  exception,
                                                                   WebRequest webRequest) {
        ErrorDetails errorDetails = new ErrorDetails(new Date(), exception.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
```

#Validation

#### @Valid
```
@PostMapping
public ResponseEntity<PostDTO> createPost(@Valid @RequestBody postDTO postDTO){
    return new ResponseEntity<>(postService.createPost(postDTO), HttpStatus.CREATED);
}
```

####@NotEmpty, @Size(used for make valid rules)
```
@NotEmpty
@Size(min = 5, message = "Comment body must be minimum 5 characters")
private String body;
```


#Inversion of Control(IoC)
####@ComponentScan: 
    Defines where the spring need to scan the bean definations and generate the beans.

####@SpringBootApplication:

####@Configuration:
    Declares a class as the source for bean definitions.

####@EnableAutoConfiguration:
    Allows the application to add beans using classpath definitions
```
@Configuration
@ComponentScan(basePackage = {"packagename"})
public class BeanConfiguration{

}
```

####@Qualifier:
```
@Qualifier("first")
@Autowired
private Formatter formatter;
System.out.println(formatter.format());
```

####@Primary:
```
@Primary
@Component("first")
public class First{

}

```
####@Resource: 
    A method to implement dependency injection.











