ref: https://lightrun.com/spring-boot-annotations/

1. @Bean

The “@Bean” is a method-level annotation that is analogous to XML <bean> tag. When you declare this annotation, Java creates a bean with the method name and registers it with the BeanFactory. The following shows how the usage of @Bean in a method statement:
    @Bean
    public ExampleBean exampleBean() {
    return new ExampleBean();
    }

2. @Springbootapplication

The “@SpringBootApplication” annotation triggers auto-configuration and component scanning. It combines three annotations: @Configuration, @ComponentScan, and @EnabeAutoConfiguration. 

    @SpringBootApplication 
    public class MyClass {
        public static void main(String[] args) {
            SpringApplication.run(MyClass.class, args);
        }
    }

3. @Configuration

The “@Configuration” is a class-based annotation that indicates the definition of one or more Bean methods in the class. Once the Sprint container encounters this annotation, it can process these spring beans to generate bean definitions and service requests at runtime.

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    
    @Configuration
    public class ConfigClass {
        @Bean
        public MyBean mybean() {   
            return new MyBean();
        }
    }

4. @ComponentScan

You can use the “@ComponentScan” annotation with the “@Configuration” annotation to define the components you need the program to scan. There are a few arguments in this annotation. The framework scans the current package with sub-packages if you do not specify any argument. You can use the ‘basePackages’ argument to define the specific packages to scan.

    package TestPackage;
    
    import org.springframework.context.annotation.ComponentScan;
    import org.springframework.context.annotation.Configuration;
    
    @Configuration
    @ComponentScan(basePackages = "TestPackage")
    
    public class TestClass {
    
    }

5. @EnableAutoconfiguration

This annotation allows you to auto-configure the program based on your requirements. The framework decides this auto-configuration based on the jars included in the program and the classpath. For example, suppose you added the “tomcat-embedded.jar” file, then it automatically configures the TomcatServletWebServerFactory if there is no explicit declaration for its related factory bean. Using the “exclude” and “excludeClassName” arguments.

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
    
    @EnableAutoConfiguration
    public class TestClass {
        public static void main(String[] args) {
            SpringApplication.run(TestClass.class, args);
        }
    }

6. @RequestMapping 

The “@RequestMapping” Annotation is used to map HTTP requests to REST and MVC controller methods in Spring Boot applications. You can apply this to either class-level or method-level in a controller. Furthermore, you can declare multiple request mappings using a list of values in the annotation.

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.ResponseBody;
    
    @Controller
    public class ControllerClass {
        
        @ResponseBody
        @RequestMapping("/cart")
        public String getCart() {
            return "this is the cart!";
        }
        
        @ResponseBody
        @RequestMapping("/catalogue")
        public String getCatalogue() {
            return "this is the catalogue";
        }
    }

7. @GetMapping 

The “@GetMapping” is a shortcut for the  “@RequestMapping(method = RequestMethod.GET)” annotation, which handles the HTTP GET requests corresponding to the specified URL. The following class uses the “@RestController” annotation to indicate it can handle web requests. The “@GetMapping” maps /hello to the hello() method

    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RestController;
    
    @RestController
    public class TestController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
    }

8. @RequestParam

The “@RequestParam” annotation enables extracting input query parameters, form data, etc. For example, suppose you have an endpoint /API/book which takes a query string parameter called id. Then you can specify that parameter in the following manner using the @RequestParam annotation. 

    @GetMapping("/api/book")
    @ResponseBody
    public String getBook(@RequestParam String id) {
        return "Book ID: " + id;
    }

9. @Service 

The @Service is a class-level annotation used to indicate that the class is a service class that defines the business logic. For instance, the below @Service annotation indicates that BankService is a service class that offers bank services. 

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;
    
    @Service
    public class BankService {
    
        private final BankInfo bankInfo;
    
        @Autowired
        public BankService(BankInfo bankInfo) {
            this.bankInfo = bankInfo;
        }
    }

10. @Component 

This component allows the framework to automatically detect the component classes without any need to write any explicit code. Spring framework scans classes with @component, initialize them, and injects the required dependencies.

    import org.springframework.stereotype.Component;
    
    @Component
    public class TestComponentAnnotation {
    
    public int multiply(int x, int y) {
        return x * y;
    }
    }

11. @Repository

The “@Repository” is a specialized version of the “ @Component” annotation. It indicates that the class is a repository that contains data storage and other operations such as updating, deleting, searching, and retrieving data on objects. 

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    import com.howtodoinjava.demo.model.BookEntity;
    
    @Repository
    public interface BookRepository extends JpaRepository<BookEntity, Long>
    {
    }

12. @Controller

This class-based annotation is also a specialization of the “@Component” annotation, marking the class as a controller. It usually combines with handler methods annotated with the @RequestMapping annotation and is used with Spring MVC applications. Spring scans these classes with this annotation and catches @RequestMapping annotations. Below is an example of its usage.

    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    
    @Controller
    public class TestController {
    
        @RequestMapping("/hello")
        public String hello()
        {
            return "Hello Spring!";
        }
    }

13. @Autowired

The “@Autowired” annotation can auto wire bean on a constructor,  setter method, property, or methods with multiple parameters. When you use @Autowired annotation on setter methods, you can eliminate the <property> tag in the XML configuration file. 

    import org.springframework.beans.factory.annotation.Autowired;
    
    public class Product {
    private Product product;
    
    @Autowired
    public void setProduct( Product product ){
        this.product = product;
    }
    public Product getProduct( ) {
        return product;
    }
    }

14. @SpringBootTest

As the name suggests, @SpringBootTest annotation can be used on a test class that executes Spring Boot-based tests. You can use it easily for integration testing as it loads the full application context. 

    import org.springframework.boot.test.context.SpringBootTest;
    
    @SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
    public class DemoTest 
    {   
    @Autowired
    private DemoController demoController;
    
    @Test
    public void contextLoads() throws Exception {
        assertThat(demoController).isNotNull();
    }
    }

15. @MockBean

Using this annotation, you can specify mocks in ApplicationContext and mocks the services or REST API endpoints from your programs. Spring loads the mock version of the application context when you run the application. You can specify this annotation at the class and field levels, and it is possible to specify them in configuration classes. Below is an example of using the “@MockBean” annotation.

    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.test.context.SpringBootTest;
    import org.springframework.boot.test.mock.mockito.MockBean;
    
    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class ProductServiceTest {
    
    @Autowired
    private ProductService productService;
    
    @MockBean(name="Product")
    private Product product;
    
    @Test
    public void test(){
        when(product.findAll()).thenReturn(Collections.emptyList());
        assertTrue(productService.findAll().isEmpty());
    }
    }

16. @RestController
    
@RestController注解，代表返回的是json格式的数据，这个注解是Spring4之后新加的注解，原来返回json格式的数据需要@ResponseBody配合@Controller一起使用；
A convenience annotation that is itself annotated with @Controller and @ResponseBody.

17.  @Transactional

保证原子操作的

18. @PersistenceContext

    
19. @Configuration 


20. @Bean 第三方工具包,想放进来IOC容器中, autowaired 得放这个 @Configuration return new (一般放config文件夹)

21. @ExceptionHandler
    
Method Level
used to handle the specific exceptions and sending the custom 
responses to the client


22.  @ControllerAdvice
Class Level to handle the exceptions globally

23.  What is @CompnonentScan?

One of the most important annotations in spring is @ComponentScan which is used along with the @Configuration annotation to specify the packages that we want to be scanned. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.

24. @RestController vs. @Controller (面试)  
    @RestController = @Controller + @ResponseBody

    ```
    @RestController
    @RequestMapping("/api/v1/posts")
    public class PostController {
        @Autowired
        private PostService postService;
        @PostMapping()
        public ResponseEntity<PostDto> 
        createPost(@RequestBody PostDto postDto) {
            PostDto postResponse = postService.createPost(postDto);
            return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
        }
    }

vs.

    @Controller
    @RequestMapping("/api/v1/posts")
    public class PostController {
        @Autowired
        private PostService postService;
        @PostMapping()
        public @ResponseBody ResponseEntity<PostDto> 
            createPost(@RequestBody PostDto postDto) {
                PostDto postResponse = postService.createPost(postDto);
                return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
        }
    }
    ```

25. @Configuration is used to indicate that a class contains bean definitions that should be processed by the Spring container.

26. @EnableWebSecurity is used to enable Spring Security's web security support and provide a configuration that extends WebSecurityConfigurerAdapter class to configure security settings.
    ```
    @Configuration
    @EnableWebSecurity
    public class SecurityConfig extends WebSecurityConfigurerAdapter {

        @Autowired
        private UserDetailsService userDetailsService;

        @Autowired
        private PasswordEncoder passwordEncoder;

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
        }

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/user/**").hasAnyRole("ADMIN", "USER")
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()
                .logout()
                    .permitAll();
        }
    }


    ```
27. @EnableGlobalMethodSecurity(prePostEnabled = true) is used to enable global method-level security annotations such as @PreAuthorize and @PostAuthorize for securing controller methods and service layer methods in Spring MVC applications.
    ```
    @Configuration
    @EnableGlobalMethodSecurity(prePostEnabled = true)
    public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {

        @Autowired
        private CustomPermissionEvaluator permissionEvaluator;

        @Override
        protected MethodSecurityExpressionHandler createExpressionHandler() {
            DefaultMethodSecurityExpressionHandler expressionHandler =
                    new DefaultMethodSecurityExpressionHandler();
            expressionHandler.setPermissionEvaluator(permissionEvaluator);
            return expressionHandler;
        }
    }

    ```

    In this example, we use @EnableGlobalMethodSecurity to enable method-level security in our application. We set prePostEnabled to true, which enables the use of @PreAuthorize and @PostAuthorize annotations on methods.

    We also extend GlobalMethodSecurityConfiguration to configure the method security settings. We inject a custom PermissionEvaluator, which will be used to evaluate custom permissions on secured methods. We then override the createExpressionHandler method to create a DefaultMethodSecurityExpressionHandler and set the custom PermissionEvaluator on it.

    Overall, @EnableGlobalMethodSecurity provides a convenient way to enable and configure method-level security in Spring Security, and GlobalMethodSecurityConfiguration provides a way to customize the security settings to fit the needs of our application.

28. @Mock 

    @Mock is used to create a mock object in a test class, while @InjectMocks is used to inject the dependencies of the mock object into the class being tested.