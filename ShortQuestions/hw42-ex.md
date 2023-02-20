### What is @Configuration and @Bean?

In Java, `@Configuration` is an annotation that indicates that a class contains bean definitions that should be processed by the Spring container. `@Bean` is another annotation used within a `@Configuration` class to define a bean and register it with the Spring container. When Spring processes a `@Configuration` class, it looks for `@Bean` methods to create bean instances and register them with the container.

### How do you handle exceptions in Spring?

 `@ControllerAdvice` is an annotation in Spring that allows you to define methods that will apply to multiple controllers in your application. Here's how you can use `@ControllerAdvice` to handle exceptions in your Spring application:

1. Create a new class and annotate it with `@ControllerAdvice`. This class will contain methods that handle exceptions thrown by your controllers.

```java
@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
    // exception handling methods go here
}
```

2. Define methods within the `@ControllerAdvice` class that handle specific exceptions. You can use the `@ExceptionHandler` annotation to specify which exception each method handles.

```java
@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("An error occurred: " + ex.getMessage());
    }
}
```

In this example, the `handleException` method handles any exception thrown by any controller in your application. It returns a response with an HTTP status code of 500 (Internal Server Error) and a message indicating the error that occurred.

3. Optionally, you can use the `value` attribute of `@ControllerAdvice` to limit the scope of the advice to specific packages or classes.

```java
@ControllerAdvice("com.example.controllers")
public class ExceptionHandlerControllerAdvice {
    // exception handling methods go here
}
```

In this example, the `@ControllerAdvice` applies only to controllers in the `com.example.controllers` package.

When an exception is thrown by any controller in your application, Spring will search for a matching exception handling method in your `@ControllerAdvice` class and invoke it if found.

### How do you do validations in Spring?

In Spring, you can perform input validations using the `javax.validation` API, which is a standard part of Java. Here are the basic steps to perform input validation in Spring:

1. Add the `javax.validation` and `hibernate-validator` dependencies to your project. You can use a build tool like Maven or Gradle to manage your dependencies.
2. Annotate the fields in your model classes with validation annotations. For example, you can use the `@NotNull` annotation to ensure that a field is not null.

```java
public class User {
    @NotNull
    private String username;

    // getters and setters
}
```

3. In your controller method, add an `@Valid` annotation before the model object that you want to validate. This will trigger the validation process.

```java
@PostMapping("/users")
public ResponseEntity<String> createUser(@Valid @RequestBody User user) {
    // create user logic
}
```

4. If the input is invalid, Spring will throw a `MethodArgumentNotValidException`. You can handle this exception in a number of ways, such as returning a custom error response.

```java
@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<String> handleValidationException(MethodArgumentNotValidException ex) {
    List<FieldError> fieldErrors = ex.getBindingResult().getFieldErrors();
    String errorMessage = "Validation failed for field(s): ";
    for (FieldError error : fieldErrors) {
        errorMessage += error.getField() + " (" + error.getDefaultMessage() + ") ";
    }
    return ResponseEntity.badRequest().body(errorMessage);
}
```

In this example, the `handleValidationException` method handles `MethodArgumentNotValidException` and returns a custom error message that includes the field name and the validation error message.

With these basic steps, you can perform input validations in your Spring application. You can use many other validation annotations such as `@Size`, `@Pattern`, `@Max`, `@Min`, etc., to validate your model fields based on your specific requirements.

### What is actuator?

Spring Boot Actuator is a feature of the Spring Boot framework that provides additional endpoints for your application, which can be used to monitor and manage your application at runtime. These endpoints expose information about your application, such as health status, performance metrics, and environment details. The Actuator endpoints are implemented using Spring MVC and can be accessed through HTTP requests or JMX (Java Management Extensions) clients.

Some examples of Actuator endpoints are:

- `/actuator/health`: Returns the health status of the application.
- `/actuator/info`: Returns general information about the application.
- `/actuator/metrics`: Returns various metrics of the application, such as memory usage, request count, etc.
- `/actuator/env`: Returns the environment details of the application, such as system properties and environment variables.

Actuator endpoints can also be customized or extended to provide additional information or functionality specific to your application.

Actuator is a very useful feature for monitoring and managing your application in production environments, as it provides valuable information about the application's health and performance, without the need for additional tools or libraries.