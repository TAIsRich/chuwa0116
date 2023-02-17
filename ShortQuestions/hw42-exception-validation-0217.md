### 2. what is the @configuration and @bean?
* `@Configuration` annotation indicates that the class has @Bean definition methods. So Spring container can process the class and generate Spring Beans to be used in the application. Spring `@Configuration` annotation allows us to use annotations for dependency injection. It’s better to use `@Configuration` annotation with configuration classes to make sure our spring container is behaving like the way we want it to. 

* Spring `@Bean` Annotation is applied on a method to specify that it returns a bean to be managed by Spring context. Spring Bean annotation is usually declared in Configuration classes methods. In this case, bean methods may reference other `@Bean` methods in the same class by calling them directly.

### 3. How do you handle the exception in Spring?
* `@ExceptionHandler`

    * Method level
    * used to handle the specific exceptions and sending the custom responses to the client. 
`@ExceptionHandler` annotation allows you to handle local exceptions of Controller
* `@ControllerAdvice`
    * class level
    * used to handle the exceptions globally.

Steps:
1. Create ErrorDetails Class
2. Create GlobalExceptionHandler class
3. Test using Postman Client.

`@ControllerAdvice` annotation is a global exception handler used to intercept and handle the exceptions thrown by the controllers across the application.
`@ExceptionHandler` annotation is used to handle specific exceptions thrown by controllers

### 4. How do you do the validations in Spring?
Validations is used to Validate the request Body and customize to return some information.

Steps:

1. import dependency in pom.xml:
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
    <version>2.7.0</version>
</dependency>
```

2. Add validation rule to payload, using annotations like @Size, @NotEmpty.

3. Add @Valid to controller to apply the rule, for example:
```
@PostMapping
public ResponseEntity<PostDTO> createPost(@Valid @RequestBody postDTO postDTO){
    return new ResponseEntity<>(postService.createPost(postDTO), HttpStatus.CREATED);
}
```
4. Check it in Postman.

### 5. What is the actuator?
Actuator brings production-ready features to our application.

Monitoring our app, gathering metrics, understanding traffic, or the state of our database become trivial with this dependency.

The main benefit of this library is that we can get production-grade tools without having to actually implement these features ourselves.

Actuator is mainly used to expose operational information about the running application — health, metrics, info, dump, env, etc. It uses HTTP endpoints or JMX beans to enable us to interact with it.

Once this dependency is on the classpath, several endpoints are available for us out of the box. As with most Spring modules, we can easily configure or extend it in many ways.