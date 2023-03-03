@Autowired
- To wire the application parts together, use the @Autowired on the fields, constructors, or methods in a component. Spring's dependency injection mechanism wires appropriate beans into the class members marked with @Autowired

    









@Controller

- marks the class as a web controller, capable of handling the HTTP requests. Spring will look at the methods of the class marked with the @Controller annotation and establish the routing table to know which methods serve which endpoints.

@RequestMapping

- specify on the method in the
  controller, to map a HTTP request to the URL to this method.

@PathVariable

- binds placeholder from the URI to
  the method parameter

@Column

- Adding the column the name in the table of a particular MySQL database

@Repository

- @Repository’s job is to catch persistence-specific exceptions and re-throw them as one of Spring’s unified unchecked exceptions.

@Service

- We mark beans with @Service to indicate that they're holding the business logic. Besides being used in the service layer, there isn't any other special use for this annotation.

@Component

- We can use @Component across the application to mark the beans as Spring's managed components.

@Entity

- Define an entity so that JPA awares of it

@Id

- Each JPA entity must have a primary key that uniquely identifies it. The @Id annotation defines the primary key.

@Table

- In most cases, the name of the table in the database and the name of the entity won't be the same. In these cases, we can specify the table name using the @Table annotation

@RestController

- Spring RestController annotation is used to create RESTful web services using Spring MVC

@PostMapping
- The @PostMapping is a specialized version of @RequestMapping annotation that acts as a shortcut for @RequestMapping(method = RequestMethod. POST) . The @PostMapping annotated methods handle the HTTP POST requests matched with the given URI expression.

@GetMapping
- @GetMapping: It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET

@PutMapping

-  It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates

@DeleteMapping

- It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource.

@OneToOne 

- Defines a single-valued association to another entity that has one-to-one multiplicity. It is not normally necessary to specify the associated target entity explicitly since it can usually be inferred from the type of the object being referenced. If the relationship is bidirectional, the non-owning side must use the mappedBy element of the OneToOne annotation to specify the relationship field or property of the owning side.

@OneToMany

- one-to-many mapping means that one row in a table is mapped to multiple rows in another table

@ManyToOne

- The many-to-one mapping or association means that one parent record can have multiple child records

@ManyToMany

- A relationship is a connection between two types of entities. In the case of a many-to-many relationship, both sides can relate to multiple instances of the other side

@NamedQuery

- @NamedQuery annotation to specify a named query within an entity class and then declare that method in repository. 

@Query

- In order to define SQL to execute for a Spring Data repository method, we can annotate the method with the @Query annotation — its value attribute contains the JPQL or SQL to execute

@Transaction
- Transactions in Java, as in general refer to a series of actions that must all complete successfully

@EnableTransactionManagement

- Add on top of Applications.java to enable transaction in spring

@configuration

- @Configuration annotation indicates that the class has @Bean definition methods. So Spring container can process the class and generate Spring Beans to be used in the application. This annotation is part of the spring core framework

@Bean

- An annotation used to specify some class-related information for the automatically generated BeanInfo classes

@ExceptionHandler

-  Exception handling in Spring MVC. Define a method to handle exceptions and annotate with @ExceptionHandler

@ControlAdvice

- @ControllerAdvice is a specialized form of the spring's stereotype annotation which allows handling exceptions across the whole application in one global handling component

@NotNull

- It determines that the value can't be null.

@Pattern

- It determines that the sequence follows the specified regular expression.

@Min

- It determines that the number must be equal or greater than the specified value.

@Max

- It determines that the number must be equal or less than the specified value

@Size

- It determines that the size must be equal to the specified value.
  

@ComponentScan

- Directs Spring to search for components in the path specified

@Configuration

- Declares a class as the source for bean definitions

@EnableAutoConfiguration

- Allows the application to add beans using classpath definitions

@SpringbootApplication

- @SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning. It's same as declaring a class with @Configuration, @EnableAutoConfiguration and @ComponentScan annotations

@@Qualifier

- There may be a situation when you create more than one bean of the same type and want to wire only one of them with a property. In such cases, you can use the @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired

@Primary

- we use @Primary to give higher preference to a bean when there are multiple beans of the same type

@EnableWebSecurity

- The @EnableWebSecurity is a marker annotation. It allows Spring to find (it's a @Configuration and, therefore, @Component) and automatically apply the class to the global WebSecurity.


@EnableGlobalMethodSecurity

- EnableGlobalMethodSecurity provides AOP security on methods. Some of the annotations that it provides are PreAuthorize, PostAuthorize

@PreAuthorize

- @PreAuthorize annotation checks the given expression before entering the method

@PostAuthorize

- @PostAuthorize annotation verifies it after the execution of the method and could alter the result

@Value

- @Value is used for injecting values into fields in Spring-managed beans, and it can be applied at the field or constructor/method parameter level.

@JsonProperty

- @JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property

@Before 
- Run before the method execution @After – Run after the method returned a result

@AfterReturning 
- Run after the method returned a result, intercept the returned result as well.

@AfterThrowing 
- Run after the method throws an exception

@Around  
- Run around the method execution, combine all three advices above.

@Aspect  
- indicate this is a aop class

@Component -
- This annotation mark the beans as Spring’s managed components

@EnableScheduling

- Enables Spring's scheduled task execution capability
