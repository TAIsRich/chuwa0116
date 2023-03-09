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

####@CoookieValue:
    Placeing in front of method parameters to get the parameter values in the request header cookie.
  
#Spring Security:

####@EnableWebSecurity:
    by this annotation, the WebSecurityConfiguration configuration class is loaded to configure 
    security authentication policies. And load the AuthenticationConfiguration, configuring the authentication information.

####@EnableGlobalMethodSecurity:
    Spring Security is disabled by default. If want to open the annotations, it requires to inherit WebSecurityConfigurerAdapter 
    class and add @ EnableGlobalMethodSecurity annotations to judge whether a user has the access right for methods in a  control layer.
    @ EnableGlobalMethodSecurity has respectively prePostEnabled, securedEnabled, jsr250Enabled three fields. Every field is annotation supported, 
    the default is false, true to open it.
    1)@EnableGlobalMethodSecurity(securedEnabled=true): Enable the permission of @Secured annotation filtering 
    2)@EnableGlobalMethodSecurity(jsr250Enabled=true): Enable the permission of @RolesAllowed annotation filtering 
    3)@EnableGlobalMethodSecurity(prePostEnabled=true):

##securedEnabled:
####@Secured:
    @Secured specifies the security requirements on the method. It can be used to specify security requirement roles/permissions, etc. 
    On a method that only users of the corresponding roles/permissions can call. If someone tries to call a method but does not have 
    the required roles/permissions, access will be denied and an exception will be thrown.
```
@Secured("ROLE_ADMIN")
```

##prePostEnables:
####@PreAuthorize:
```
@PreAuthorize("hasRole('ADMIN')")
@PostMappint
public ResponseEntity<PostDTO> createPost(@Valid, @RequestBody PostDTO postDTO){
    return new ResponseEntity<>(postService.createPost(postDTO), HttpStatus.CREATED)
}

```
    It is appropriate to verify authorization before entering the method.
####@PostAuthorize:
    The authorization method is checked before it is executed
####@PostFilter:
    It is executed after the method executes, and here you can call the return value of the method, and then filter, process 
    or modify the return value and return it
####@Prefilter:
    It is executed before the method executes, and here you can call the parameters of the method and then filter, process 
    or modify the parameter values.



####@Value:
    get value from application.properties
```
in application.properties:
app.jwt-secret = JWTSecretKey
app.jwt-expiration-milliseconds = 10000000
can use @Value as following:
@Value("${app.jwt-secret}")
private String jwtSecret;
@Value("${app.jwt-expiration-milliseconds}")
private int jwtExpirationInMs;

```

#AOP concepts

##@Aspect
    Indicate this is a aop class
```
@Aspect
@Component
@Order(2)
public class LoggingAspect{
}
```

##@Pointcut
    An expression that is matched with join points to determine whether advice needs to be applied or not
```
@Pointcut("within(@org.springframework.stereotype.Repository *)" +
            " || within(@org.springframework.stereotype.Service *)" +
            " || within(@org.springframework.web.bind.annotation.RestController *)")
public void springBeanPointcut() {
    // Method is empty as this is just a Pointcut, the implementations are in the advices.
}
@Pointcut("within(com.chuwa.redbook.security..*)" +
            " || within(com.chuwa.redbook.service..*)" +
            " || within(com.chuwa.redbook.controller..*)" +
            " || within(com.chuwa.redbook.dao..*)")
public void applicationPackagePointcut() {
    // Method is empty as this is just a Pointcut, the implementations are in the advices.
}

```
##@Before:
    Run before the method execution
```
@Before("webLog()")
public void doBefore(JoinPoint joinPoint) throws Throwable {

}
```

##@After
    Run after the method returned a result

##@AfterReturning
    Run after the method returned a result, and intercept the returned result as well.
```
@AfterReturning(value = "webLog()", returning = "ret")
public void doAfterReturning(Object ret) throws Throwable {

}
```

##@AfterThrowing
    Run after the method throws an exception
```
@AfterThrowing(pointcut = "applicationPackagePointcut() && springBeanPointcut()", throwing = "e")
public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {
    log.error("Exception in {}.{}() with cause = {}", joinPoint.getSignature().getDeclaringTypeName(),
              joinPoint.getSignature().getName(), e.getCause() != null ? e.getCause() : "NULL");
}
```

##@Around
    Run around the method execution, combine all three advices above.
```
@Around("applicationPackagePointcut() && springBeanPointcut()")
public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
    if (log.isDebugEnabled()) {
        log.debug("Enter: {}.{}() with argument[s] = {}", joinPoint.getSignature().getDeclaringTypeName(),
                  joinPoint.getSignature().getName(), Arrays.toString(joinPoint.getArgs()));
    }
    try {
        Object result = joinPoint.proceed();
        if (log.isDebugEnabled()) {
            log.debug("Exit: {}.{}() with result = {}", joinPoint.getSignature().getDeclaringTypeName(),
                joinPoint.getSignature().getName(), result);
        }
        return result;
    } catch (IllegalArgumentException e) {
        log.error("Illegal argument: {} in {}.{}()", Arrays.toString(joinPoint.getArgs()),
            joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        throw e;
    }
}
```

#Test

##@BeforeALl:
    Method is executed only once,before all test methods.
    @BeforeAll runs only once before all the test methods of a Test class. Sometimes there are heavy operations like setting 
    up a Database connection or spinning up an embedded server etc which should be done only once for a test class.
```
@BeforeAll
static void runOnceBeforeAllTests(){
}
```

##@BeforeEach:
    This method is executed before each test method. This is used to ensure we have clean data(for eg. setting up mocks) 
    for each test case and is not updated by any other already executed @Test method.
```
@BeforeEach
public void testMethod(){
    System.out.println("BeforeEach executed!");
}

```

##@Test:
    This annotation marks a method as a test method. 
```
@Test
public void testMethod(){

}
```

##@AfterEach:
    This method is executed after each test method. This is generally used to clean up the data or to perform an action 
    after a @Test method. If it is just a cleanup of data then sometimes it is can also be done in @BeforeEach method.
```
@AfterEach
public void testMethod(){
    System.out.println("AfterEach executed!");
}
```
##@AfterAll:
    Method is executed only once, before all testmethods.
    @AfterAll runs only once after all the test methods of a Test class. Mostly the setup that is done in @BeforeAll method 
    also needs to be cleaned up like closing the Database connection or shutting down the embedded server etc which is generally
    done only once for a test class.
```
@AfterAll
static void runOnceAfterAllTests(){
}
```

##@SpringBootTest

##@Mock:
    Create a Mock.
```
@Mock
private PostRepository postRepositoryMock;
```

##@Spy:
     Wrap a real object and call the real method by default. Additionally, @spy also has the ability same as @Mock.
```
@Spy
private ModelMapper modelMapper;
```

##@InjectMocks:
    Create an instance. The instance can call the method of the real code, and the rest of the mocks created with the @Mock 
    (or @Spy) annotation will be injected into the instance.

```
@InjectMocks
private PostServiceImpl postService;
```









