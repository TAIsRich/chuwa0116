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

