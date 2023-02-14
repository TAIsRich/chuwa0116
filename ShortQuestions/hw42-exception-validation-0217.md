# hw42-exception-validation-0217

### 1 List all of the annotations you learned from class and homework to annotaitons.md

### 2 What is the @configuration and @bean?

`@Bean` annotation is used when you want to explicitly declare and register a bean into application context, so that it will be managed by Spring.

`@Configuration` annotation indicates that the class has `@Bean` definition methods. So Spring container can process the class and generate Spring Beans to be used in the application.

### 3 How do you handle the exception in Spring?

The `@ControllerAdvice` is an annotation, to handle the exceptions globally.

The `@ExceptionHandler` is an annotation used to handle the specific exceptions and sending the custom responses to the client.

Steps

+ Create ErrorDetails Class
+ Create GlobalExceptionHandler Class

### 4 How do you do the validations in Spring?

1. Import dependency `spring-boot-starter-validation`
2. Add validation Rule to `payload`
3. Add `@valid` to controller to apply the Rule here

### 5 What is the actuator?

Spring Boot Actuator is a sub-project of the Spring Boot Framework. It uses HTTP endpoints to expose operational information about any running application.

The main benefit of using this library is that we get health and monitoring metrics from production-ready applications. Moreover, the gathering of metrics, understanding traffic, or knowing the state of the database, becomes tremendously easy with Actuator.

### 6 watch those videos