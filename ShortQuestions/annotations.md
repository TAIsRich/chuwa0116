1. @Autowired: @Autowired is a way of telling Spring that auto-wiring is required. It can be applied to field, constructor and methods.   

2. @Service: the service layer classes that contain the business logic should be annotated with @Service. Apart from the fact that it is used to indicate that the class contains business logic, there is no special meaning to this annotation, however it is possible that Spring may add some additional feature to @Service in future, so it is always good idea to follow the convention.   

3. @Repository: the classes annotated with this annotation defines data repositories. It is used in DAO layer classes. @Repository has one special feature that it catches platform specific exceptions and re-throw them as one of the Spring’s unified unchecked exception i.e. DataAccessException.

4. @RequestMapping: @RequestMapping annotation maps the incoming HTTP request to the handler method that will serve this request, we can apply @RequestMapping on a class as well as a method. When used on a class, it maps a specific request path or pattern onto a controller, then the method level annotation will make the mappings more specific to handler methods.   

5. @Entity: @Entity annotation defines that a class can be mapped to a database table. The class fields will be mapped to the columns of the table.    

6. @Id: @Id annotation defines the primary key of a table.   

7. @Column: @Column can give names to the columns of a JPA Entity    

8. @RequestBody: @RequestBody annotation is used to bind the incoming json request to the pojo class.     

9. @PathVariable: @PathVariable annotation can be used to handle template variables int the request URI mapping.     

10. @PutMapping: @PutMapping is an annotation used for mapping HTTP PUT requests onto specific handler methods.    

11. @DeleteMapping: @DeleteMapping is an annotation to map HTTP DELETE requests onto specific handler methods.    

12. @GetMapping: @GetMapping is an annotation for mapping HTTP GET requests onto specific handler methods.     

13. @PostMapping: @PostMapping annotated methods handle the HTTP POST requests matched with the given URI expression.     

14. @JsonProperty: @JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.     

15. @ManyToOne: JPA allows you to define Many-to-one relationships between entity classes using the @ManyToOne annotation.     

16. @NamedQuery: @NamedQuery is used to define the single named query.      

17. @Transactional: Spring provides Declarative Transaction Management via @Transactional annotation. When a method is qpplied with @Transactional, then it will execute inside a database transaction. @Transactional annotation can be applied at the class level also, in that case, all methods of that class will be executed inside a database transaction.     

18. @PersistenceContext: To tell the EntityManager to use the transaction presistence context, we simply annotate it with @PersistenceContext. A persistence context is a set of entity instances in which for any persistent entity identity there is a unique entity instance. Within the persistence context, the entity instances and their lifecycle are managed. This interface defines the methods that are used to interact with the persistence contxt.     
19. @Valid: In the context of software development, @Valid is an annotation used in Java and some other programming languages to indicate that a particular parameter or object should be validated against certain constraints.    

When applied to a method parameter, @Valid indicates that the parameter must be validated according to the constraints defined on its fields or properties. For example, if a method takes a user object as a parameter and the user object has a field called "email" that is annotated with @Email (a validation annotation that checks if the field contains a valid email address), then applying @Valid to the user parameter will trigger validation of the email field when the method is called.    

@Valid is often used in conjunction with the Java Bean Validation framework, which provides a set of validation annotations (such as @NotNull, @Size, @Min, @Max, etc.) that can be used to define constraints on the fields or properties of Java objects.     

