@Controller
- The @Controller annotation indicates that a particular class serves the role of a controller. Spring Controller annotation is typically used in combination with annotated handler methods based on the @RequestMapping annotation. It can be applied to classes only. It's used to mark a class as a web request handler.

@Autowired

- Spring @Autowired annotation is used for automatic dependency injection. Spring framework is built on dependency injection and we inject the class dependencies through spring bean configuration file.

@RequestMapping

- RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods. @RequestMapping can be applied to the controller class as well as methods. Today we will look into various usage of this annotation with example and other annotations @PathVariable and @RequestParam .

@PathVariable

-The @PathVariable annotation is used to extract the value of the template variables and assign their value to a method variable. A Spring controller method to process above example is shown below; @RequestMapping("/users/{userid}", method=RequestMethod.

@Column

- @Column annotation is used for Adding the column the name in the table of a particular MySQL database.

@Repository

- Spring @Repository annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects

@Service

- We mark beans with @Service to indicate that they're holding the business logic. Besides being used in the service layer, there isn't any other special use for this annotation.

@Component

- We can use @Component across the application to mark the beans as Spring's managed components.

@Entity

- The @Entity annotation specifies that the class is an entity and is mapped to a database table.

@Id

- Each JPA entity must have a primary key that uniquely identifies it. The @Id annotation defines the primary key.

@Table

- The @Table annotation allows you to specify the details of the table that will be used to persist the entity in the database. The @Table annotation provides four attributes, allowing you to override the name of the table, its catalog, and its schema, and enforce unique constraints on columns in the table.