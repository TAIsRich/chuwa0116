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

## SpringMVC
### @Controller
It marks a class as a web request handler.
### @RequestMapping("books")  
It is used to map web requests onto specific handler classes and/or handler methods.
### @Service
It tells the Spring that class contains the business logic.

### @Repository
The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.


## Springboot
### @SpringBootApplication
It is used to mark the main class of a Spring Boot application.
### @Configuration 
It marks configuration can be found automatically.

### @ComponentScan 
It tells Spring in which packages you have annotated classes that should be managed by Spring.
