# hw42-exception-validation-0217

## 1. List all of the annotations you learned from class and homework to annotations.md
see annotation.md

## 2. what is the @configuration and @bean?
@Configuration: This annotation
marks a class as a Configuration class in Java-based
configuration, it allows to register extra beans in the context
or import additional configuration classes

@Bean annotation is used when you want to
explicitly declare and register a bean into application
context, so that it will be managed by Spring.

## 3. How do you handle the exception in Spring?

Solution 1: the Controller-Level @ExceptionHandler

Solution 2: the HandlerExceptionResolver

Solution 3: @ControllerAdvice

Solution 4: ResponseStatusException (Spring 5 and Above)

## 4. How do you do the validations in Spring?
@Valid and @Notnull annotations in DTO class attributes.


## 5. What is the actuator?
In essence, Actuator brings production-ready features to our application.

Monitoring our app, gathering metrics, understanding traffic, or the state of our database become trivial with this dependency.

## 6 watch videos, omitted...