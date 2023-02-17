# hw42-exception-validation-0217 - Hao Jia

### what is the @configuration and @bean?
In the context of Spring Framework for Java, @Configuration and @Bean are annotations used to define and configure beans, which are objects that can be managed and maintained by the Spring container.

+ The @Configuration annotation is used to indicate that a class is a configuration class, which means that it defines one or more beans that can be managed by the Spring container. Configuration classes typically contain one or more @Bean methods that define individual beans.
+ The @Bean annotation is used to indicate that a method in a configuration class returns a bean. The method must create and configure an instance of the bean, and the Spring container will manage the lifecycle of the bean. By default, the name of the bean is the same as the name of the method, but this can be customized using the name attribute of the @Bean annotation.


### How do you handle the exception in Spring?
+ Using the @ExceptionHandler annotation:
This annotation can be used to define a method that handles a specific type of exception. When an exception of that type is thrown during the processing of a request, Spring will call the corresponding method to handle the exception. The method can then return an appropriate response to the client.

+ Using the HandlerExceptionResolver interface:
This interface defines a mechanism for resolving exceptions that occur during request processing. It provides a central place to handle all exceptions that are not handled by a controller method. By implementing this interface, you can define custom logic for handling exceptions and returning an appropriate response to the client.

+ Using the @ControllerAdvice annotation:
This annotation can be used to define a class that provides exception handling for multiple controllers. When an exception is thrown during the processing of a request, Spring will look for an appropriate @ExceptionHandler method in the @ControllerAdvice-annotated class and call it to handle the exception.

+ Using the @ResponseStatus annotation:
This annotation can be used to define a status code and a reason phrase to return to the client when a specific exception is thrown. When the exception occurs, Spring will return the specified status code and reason phrase in the response.

+ Using the @RestControllerAdvice annotation:
This annotation is similar to @ControllerAdvice, but it's designed for RESTful web services. It provides exception handling for multiple REST controllers and allows you to return a custom response body in addition to the status code and reason phrase.

### How do you do the validations in Spring?
+ Using annotations:
Spring provides several validation annotations that can be used to validate user input, such as @NotNull, @NotEmpty, @Size, @Pattern, and @Valid. You can apply these annotations to fields or parameters in your controllers or services to validate the user input. Spring will automatically check the annotated fields or parameters and report any validation errors.

+ Using the Validator interface:
Spring also provides a Validator interface that you can implement to define custom validation logic. You can create a validator class that implements the Validator interface and register it with Spring. Spring will then use your validator to validate user input based on the rules you define.

+ Using the BindingResult object:
When you use annotations to validate user input, any validation errors will be automatically added to a BindingResult object. You can use this object to check for validation errors and return appropriate error messages to the client.

+ Using the @ExceptionHandler annotation:
If a validation error occurs during request processing, you can use the @ExceptionHandler annotation to handle the exception and return an appropriate response to the client. You can define a method that takes the specific exception type as a parameter and returns a custom response.

### What is the actuator?
Actuator is a feature that provides a set of HTTP endpoints for monitoring and managing your Spring application. The Actuator exposes useful information and statistics about your application's health, configuration, and performance, which can be useful for operations, monitoring, and troubleshooting purposes.