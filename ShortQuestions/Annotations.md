# Annotation

## JPA
### @Entity
Specifies that the class is an entity
### @Table(name = "employee")
It specifies the table in the database with which this entity is mapped.
### @Column(name = "employee_name")
Specify the column mapping using @Column annotation
### @Id
This annotation specifies the primary key of the entity.
### @GeneratedValue
This annotation specifies the generation strategies for the values of primary keys.
### @ManyToMany
The @ManyToMany annotation is used to specify a many-to-many database relationship.
### @ManyToOne
The @ManyToOne annotation is used to specify a many-to-one database relationship.
### @OneToMany
The @OneToMany annotation is used to specify a one-to-many database relationship.
#### @OneToOne
The @OneToOne annotation is used to specify a one-to-one database relationship.
### @OrderBy
The @OrderBy annotation is used to specify the entity attributes used for sorting when fetching the currently annotated collection.
## Spring Web
### @Controller
It marks a class as a web request handler.
### @RequestBody
It maps the body of the HTTP request to an object:
### @RestController = @Controller + @RequestBody
### @RequestMapping("books")  
It is used to map web requests onto specific handler classes and/or handler methods.
### @Service
It tells the Spring that class contains the business logic.
### @Repository
The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.
### @PathVariable
It bound to a URI template variable.
### @RequestParam
It bound to a HTTP request parameters.
### @ExceptionHandler
It declares a custom error handler method.
### @ResponseStatus
It declares a HTTP status of the response.
### @ModelAttribute
It accesses elements that are already in the model of an MVC @Controller.

## Springboot
### @SpringBootApplication
It is used to mark the main class of a Spring Boot application.
### @Configuration 
It marks configuration can be found automatically.
### @ComponentScan 
It tells Spring in which packages you have annotated classes that should be managed by Spring.
