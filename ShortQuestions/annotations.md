# Java Annotations

## @Autowired
The Spring framework enables automatic dependency injection. In other words, by declaring all the bean dependencies in a Spring configuration file, Spring container can autowire relationships between collaborating beans. This is called Spring bean autowiring.

## @Controller
We typically use @Controller in combination with a @RequestMapping annotation for request handling methods.

## @RestController
It's a convenient annotation that combines @Controller and @ResponseBody

## @RequestMapping
The annotation is used to map web requests to Spring Controller methods.

## @PostMapping @PutMapping @GetMapping @DeleteMapping
Annotation for mapping HTTP POST / PUT / GET / DELETE requests onto specific handler methods.

## @PathVariable
The @PathVariable annotation in Spring Boot is used to bind a URI template variable to a method parameter.

## @RequestBody
The @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization

## @Repository
It is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects。

## @Entity
Specifies that the class is an entity. This annotation is applied to the entity class.

## @Table
The @Table annotation allows you to specify the details of the table that will be used to persist the entity in the database.

## @UniqueConstraint
The @UniqueConstraint annotation in Spring Boot is used to specify a unique constraint on a table in a database.

## @Id @GeneratedValue
The @Id annotation specifies the primary key of an entity and the @GeneratedValue provides for the specification of generation strategies for the values of primary keys.

## @Column
The @Column annotation in Spring Boot is used to map a property of a Java bean class to a column in a database table.

## @CreateTimestamp
The @CreateTimestamp annotation is used to specify the creation time of an object in a database.

## @UpdateTimestamp
It is used for keeping track of when an object was last updated.

## @Service
Spring @Service annotation is used with classes that provide some business functionalities. Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used.

## @RespondStatus
The @ResponseStatus annotation in Spring Boot is used to specify the HTTP status code to be returned when a specific exception is thrown in the application.

## @JsonPropertyOrder
The @JsonPropertyOrder annotation in Spring Boot is used to specify the order of the properties in a JSON representation of a Java object.
The class instances are serialized in the order they appear in the annotation.

## @JsonProperty
The @JsonProperty annotation in Spring Boot is used to specify the property name in a JSON payload when serializing or deserializing an object to/from JSON. By default, the name of the property in the JSON payload is determined by the name of the corresponding field in the Java class. However, you can use @JsonProperty to specify a different name for the property in the JSON payload.

## @ManyToOne
The @ManyToOne annotation in Spring Boot is used to specify a many-to-one relationship between two entities in a database.

## JoinColumn
The @JoinColumn annotation in Spring Boot is used to specify a column for joining an entity association or to map a foreign key column in the database.

## @Transactional
The @Transactional annotation is a Spring framework annotation used to indicate that a method or a class should participate in a transaction. When placed on a method, it ensures that any database transactions started within the method are committed or rolled back based on whether the method execution was successful or not. When placed on a class, all public methods within the class will participate in a transaction by default.

## @PersistenceContext
The @PersistenceContext annotation is used to inject an EntityManager instance into a field or property of a managed bean. The EntityManager is used to manage the persistence of entities in a JPA application. It provides access to a database and is responsible for performing operations like reading and writing entities to the database, as well as managing transactions.

## @Query
The @Query annotation in Spring is used to declare a query method in a Spring Data repository interface. The annotated method serves as a convenient way to express a search operation that can be executed to retrieve data from a database.

## @NamedQuery
The NamedQuery annotation in Spring is used to define a static, named query in a JPA entity class. A named query is a pre-defined query that is written in the entity class and can be reused throughout the application.

## @ResponseStatus
We can use @ResponseStatus with these error handler methods to define response status code.

## @Configuration
We use @Configuration so that Spring creates a Spring bean in the application context.

## @Bean
@Bean annotation is used when you want to
explicitly declare and register a bean into application
context, so that it will be managed by Spring.

## @Valid
@Valid annotation for method level validation. We also use it to mark a member attribute for validation.

## @ExceptionHandler
The @ExceptionHandler is an annotation used to handle the specific exceptions and sending the custom responses to the client.

## @CompnonentScan ?
With Spring, we use the @ComponentScan annotation along with the @Configuration annotation to specify the packages that we want to be scanned. @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages.

## @SpringbootApplication ?
@SpringBootApplication annotation is used to mark a configuration class that declares one or more @Bean methods and also triggers auto-configuration and component scanning.


## @Primary
if there are multiple beans, beans with this annotation are primary choice for spring.

## @Component
@Component is a generic stereotype for any Spring-managed component.

## @Autowired @Qualifier @Resource and @Inject
Annotations for dependency injections.

## @EnableTransactionManagement
When this annotation is added to a Spring configuration class, it allows the Spring framework to detect @Transactional annotations on methods in the application and automatically provide transaction management support.

## @PropertySource
@PropertySource is an annotation in Spring Framework that is used to declare a property source file or files. It allows Spring to load properties from external files and inject them into a Spring bean.

## @EnableWebMvc
When @EnableWebMvc is used, Spring Boot automatically configures the application to use Spring MVC. This includes configuring a default RequestMappingHandlerAdapter and RequestMappingHandlerMapping to handle incoming HTTP requests, as well as other MVC-related components.
##

##

##

##

##



--------------------------
## @Override
Overrides an inherited methods

## @FunctionalInterface
Sanity check, a functional interface should only have one abstract method.