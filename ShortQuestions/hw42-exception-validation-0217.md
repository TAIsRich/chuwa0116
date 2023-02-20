1. List all of the annotations you learned from class and homework to
    annotaitons.md
2. what is the @configuration and @bean?  
   @Configuration is an annotation in the Spring Framework that is used to declare a class as a configuration class. A configuration class is a class that contains methods annotated with @Bean annotations that define the beans that will be managed by the Spring container.  
In other words, @Configuration is used to define a class as a source of bean definitions for the application context. It is used in conjunction with @Bean to provide a way to define and manage beans in a Spring application.

3. How do you handle the exception in Spring?  
   In Spring, exceptions can be handled using the @ExceptionHandler annotation, which can be applied to a method in a controller class to define how exceptions should be handled.
4. How do you do the validations in Spring?  
   Use the javax.validation API and its annotations.  
* Add the javax.validation API to the project dependencies. This can be done using Maven or Gradle by adding the following dependency to the project:
```
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>2.0.1.Final</version>
</dependency>
```
* Define a Java bean class to be validated. This can be any plain Java object that has fields that need to be validated. 
```java
public class User {
@NotNull(message = "Name cannot be null")
private String name;

    @Email(message = "Email address is not valid")
    private String email;

    // getters and setters
}

```
* Use the @Valid annotation to trigger validation on the bean. This can be done in a controller method that accepts the bean as a parameter:
```java
@PostMapping("/users")
public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
    // code to add the user
}
```
* Handle validation errors in an exception handler method:
```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<ErrorResponse> handleValidationError(MethodArgumentNotValidException ex) {
    // code to create an error response
}
```
4. What is the actuator?  
   An actuator is a part of a device or machine that helps it to achieve physical movements by converting energy, often electrical, air, or hydraulic, into mechanical force. Simply put, it is the component in any machine that enables movement.
5. watch those videos(泛泛地看一遍，能理解多少是多少。千万千万不要看其它的视
    频，会走火入魔晕乎乎的)
   