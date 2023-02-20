https://springframework.guru/spring-framework-annotations/

## Core Spring Framework Annotations

### @Required

This annotation is applied on bean setter methods. 
Consider a scenario where you need to enforce a required property. 
The `@Required` annotation indicates that the affected bean must be populated 
at configuration time with the required property. 
Otherwise, an exception to type `BeanInitializationException` is thrown.

### @Autowired

his annotation is applied on **fields**, **setter** methods, and **constructors**. The @Autowired annotation injects object dependency implicitly.

When you use `@Autowired` on fields and pass the values for the fields using the property name, 
Spring will automatically assign the fields with the passed values.

When you use @Autowired on setter methods, Spring tries to perform the by 
Type autowiring on the method. You are instructing Spring that it should 
initiate this property using setter method where you can add your custom code, 
like initializing any other property with this property.

```java
public class Customer {                                                                                         
    private Person person;
    @Autowired                                                                                                      
    public void setPerson (Person person) {
     this.person=person;
    }
}
```

Consider a scenario where you need instance of class A, but you do not 
store A in the field of the class. You just use A to obtain instance of B, 
and you are storing B in this field. In this case setter method autowiring 
will better suite you. You will not have class level unused fields.

When you use `@Autowired` on a constructor, constructor injection happens at 
the time of object creation. It indicates the constructor to autowire when 
used as a bean. One thing to note here is that only one constructor of any 
bean class can carry the @Autowired annotation.

```java
@Component
public class Customer {
    private Person person;
    @Autowired
    public Customer (Person person) {          
      this.person=person;
    }
}
```

## Spring Framework Stereotype Annotations

### @Service

Annotate all service classes with @Service. All  business logic should be in Service classes.

### @Repository

Annotate all DAO classes with @Repository. All database access logic should be in DAO classes.

### @Component

Annotate other components (for example REST resource classes) with @Component.

@Component is a generic stereotype for any Spring-managed component.
@Repository, @Service, and @Controller are specializations of @Component for more specific use cases,
for example, in the persistence, service, and presentation layers, respectively.

![](https://www.techferry.com/articles/images/SpringComponentAnnotations.jpg)

## Spring Boot Annotations

### @EnableAutoConfiguration

### @SpringBootApplication

## Spring MVC and REST Annotations

### @Controller

This annotation is used on Java classes that play the role of controller 
in your application. The `@Controller` annotation allows auto-detection of 
component classes in the classpath and auto-registering bean definitions for 
them. To enable auto-detection of such annotated controllers, 
you can add component scanning to your configuration. 
**The Java class annotated with @Controller is capable of handling multiple 
request mappings.**

### @RequestMapping

This annotation is used both at class and method level. 
The `@RequestMapping` annotation is used to map web requests onto specific 
handler classes and handler methods. When `@RequestMapping` is used on class 
level it creates a base URI for which the controller will be used. When 
this annotation is used on methods it will give you the URI on which the 
handler methods will be executed. From this you can infer that the class 
level request mapping will remain the same whereas each handler method will 
have their own request mapping.

Sometimes you may want to perform different operations based on the HTTP method used, 
even though the request URI may remain the same. In such situations, 
you can use the method attribute of `@RequestMapping` with an HTTP method 
value to narrow down the HTTP methods in order to invoke the methods of 
your class.

```java
@Controller
@RequestMapping("/welcome")
public class WelcomeController{
  @RequestMapping(method = RequestMethod.GET)
  public String welcomeAll(){
    return "welcome all";
  }  
}
```

In this example only `GET` requests to `/welcome` is handled by the `welcomeAll()` method.

[More details on @RequestMapping](https://springframework.guru/spring-requestmapping-annotation/)

## Composed @RequestMapping Variants

### @GetMapping

This annotation is used for mapping HTTP GET requests onto specific 
handler methods. `@GetMapping` is a composed annotation that acts as a 
shortcut for `@RequestMapping(method = RequestMethod.GET)`

### @PostMapping

This annotation is used for mapping HTTP POST requests onto specific handler methods. 
`@PostMapping` is a composed annotation that acts as a shortcut for 
`@RequestMapping(method = RequestMethod.POST)`

### @PutMapping

This annotation is used for mapping HTTP PUT requests onto specific handler 
methods. `@PutMapping` is a composed annotation that acts as a shortcut for 
`@RequestMapping(method = RequestMethod.PUT)`

### @PatchMapping

This annotation is used for mapping HTTP PATCH requests onto specific 
handler methods. `@PatchMapping` is a composed annotation that acts as a 
shortcut for `@RequestMapping(method = RequestMethod.PATCH)`

### @DeleteMapping

This annotation is used for mapping HTTP DELETE requests onto specific 
handler methods. @DeleteMapping is a composed annotation that acts as a 
shortcut for `@RequestMapping(method = RequestMethod.DELETE)`

### @RequestParam

### @RequestBody
```java
    @PostMapping
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
        PostDTO postResponse = postService.creatPost(postDTO);

        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }
```

### @PathVariable
```java
    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable(name = "id") long id) {
        return ResponseEntity.ok(postService.getPostById(id));
    }
```

### @JsonProperty

### @ManyToOne

## Database/Entity

### @OneToMany

### @ManyToOne

### @ManyToMany

### @Getter

### @Setter

### @NoArgsConstructor

### @AllArgsConstructor

### @NotEmpty

### @Size

### @ComponentScan

Define where the spring need to scan the bean definitions and generate the beans

### @Configuration

Which declares a class as the source for bean definitions

### @EnableAutoConfiguration

Which allows the application to add beans using classpath definitions

### @Resource

### @Inject

