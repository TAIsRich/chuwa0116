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