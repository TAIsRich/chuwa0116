## Annotations

### @Override
The `@Override` annotation specifies that the method that has been marked with this annotation overrides the method of the superclass with the same method name, return type and parameter list.

It is not mandatory to use `@Override` when overriding a method. However, if we use it, the compiler gives an error if something is wrong (such as wrong parameter type) while overriding the method.

```Java
class Animal {
    public void displayInfo() {
        System.println("I am animal.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.println("I am a dog.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.displayInfo();
    }
}
```

### Autowired
Spring provides annotation-based auto-wiring by providing `@Autowired` annotation. It is used to autowire spring bean on setter methods, instance variable, and constructor. When we use `@Autowired` annotation, the spring container auto-wires the bean by matching data-type.

### Controller
The `@Controller` is a class-level annotation. It is a specialization of `@Component`. It marks a class as a web request handler. It is often used to serve web pages. By default, it returns a string that indicates which route to redirect. It is mostly used with `@RequestMapping` annotation.
```Java
@Controller  
@RequestMapping("books")  
public class BooksController {  

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)  
    public Employee getBooksByName()   
    {  
        return booksTemplate;  
    }  
}  
```

### @RequestMapping
It is used to map the web requests. It has many optional elements like consumes, header, method, name, params, path, produces, and value. We use it with the class as well as the method.

### @GetMapping
It maps the HTTP GET requests on the specific handler method. It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)

### @PostMapping
It maps the HTTP POST requests on the specific handler method. It is used to create a web service endpoint that creates It is used instead of using: @RequestMapping(method = RequestMethod.POST)

### @PutMapping
It maps the HTTP PUT requests on the specific handler method. It is used to create a web service endpoint that creates or updates It is used instead of using: @RequestMapping(method = RequestMethod.PUT)

### @DeleteMapping
It maps the HTTP DELETE requests on the specific handler method. It is used to create a web service endpoint that deletes a resource. It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)

### @PatchMapping
It maps the HTTP PATCH requests on the specific handler method. It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)

### @RequestBody
It is used to bind HTTP request with an object in a method parameter. Internally it uses HTTP MessageConverters to convert the body of the request. When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.

### @ResponseBody
It binds the method return value to the response body. It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.

### @PathVariable
It is used to extract the values from the URI. It is most suitable for the RESTful web service, where the URL contains a path variable. We can define multiple @PathVariable in a method.

### @RequestParam
It is used to extract the query parameters form the URL. It is also known as a query parameter. It is most suitable for web applications. It can specify default values if the query parameter is not present in the URL.

### @RequestHeader
It is used to get the details about the HTTP request headers. We use this annotation as a method parameter. The optional elements of the annotation are name, required, value, defaultValue. For each detail in the header, we should specify separate annotations. We can use it multiple time in a method

### @Service
It is also used at class level. It tells the Spring that class contains the business logic.

### @Repository
It is a class-level annotation. The repository is a DAOs (Data Access Object) that access the database directly. The repository does all the operations related to the database.

### @RestController
It can be considered as a combination of @Controller and @ResponseBody annotations. The @RestController annotation is itself annotated with the @ResponseBody annotation. It eliminates the need for annotating each method with @ResponseBody.

### @Entity
The `@Entity` annotation specifies that the class is an entity and is mapped to a database table.

### @Table
The `@Table` annotation specifies the name of the database table to be used for mapping.

### @Id
The `@Id` annotation specifies the primary key of an entity and the `@GeneratedValue` provides for the specification of generation strategies for the values of primary keys.

### @Column
`@Column` annotation is used for Adding the column the name in the table of a particular MySQL database.

### @ResponseStatus
`@ResponseStatus` marks a method or exception class with the status code and reason message that should be returned. The status code is applied to the HTTP response when the handler method is invoked, or whenever the specified exception is thrown. It overrides status information set by other means, like ResponseEntity or redirect.

### @OneToMany, @ManyToOne, @ManyToMany
specify a one-to-many/many-to-one/many-to-many database relationship between two tables

### @NamedQuery, @NamedQueries
`@NameQueries`: to define the multiple named queries.

`@NameQuery`: to define the single named query.

### @Query
If we use the `@Query` annotation the method name can violate the JPA naming convention, but it is best to use the method name to understand the purpose of the method.

### @Transactional
Spring provides Declarative Transaction Management via `@Transactional` annotation. When a method is applied with `@Transactional`, then it will execute inside a database transaction. @Transactional annotation can be applied at the class level also, in that case, all methods of that class will be executed inside a database transaction.