### 1.  List all the annotations you learned from class and homework to annotations.md
### 2.  what is the @configuration and @bean?
@Bean is used to define a bean that should be managed by the Spring container. The method that is annotated with @Bean should return an object that represents the bean that should be created. The name of the bean is the name of the method by default, but can be customized using the name attribute of the @Bean annotation.

@Configuration is used to indicate that a class is a configuration class. A configuration class is a special type of class that is used to define beans and their dependencies. It is usually used in conjunction with @Bean to define the beans that should be created by the Spring container. When Spring encounters a @Configuration class, it reads the class and looks for @Bean methods to create the corresponding beans.
### 3.  How do you handle the exception in Spring?
Exception Handling using @ExceptionHandler: This allows developers to define custom methods for handling exceptions. The methods are annotated with @ExceptionHandler and can be placed in any controller class.The methods are annotated with @ExceptionHandler and can be placed in any controller class.
ControllerAdvice: This is a global exception handler that can be used to handle exceptions across multiple controllers.
HandlerExceptionResolver: This is an interface that can be implemented to provide custom exception handling.

### 4.  How do you do the validations in Spring?
1. Add the necessary dependencies to your project.
2. Annotate your model class with validation annotations such as @NotNull, @Size.
3. In controller method, add an annotation @Valid to the parameter that we want to validate.

### 5.  What is the actuator?
Spring Actuator provides production-ready capabilities to help you monitor and manage your applications.
With Spring Actuator, we can easily monitor the health of our applications and be notified if something goes wrong.
