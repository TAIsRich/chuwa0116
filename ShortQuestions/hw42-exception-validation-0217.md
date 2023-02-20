### Exception Validation

##### 1. List all of the annotations you learned from class and homework to `annotaitons.md`
The additional annotations are now updated in `annotations.md`

##### 2. what is the @configuration and @bean?
Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.

##### 3. How do you handle the exception in Spring?
We could actually create a global exception handler responsible for handling multiple exceptions thrown, the sample code is as follows:
```
@ControllerAdvice
public class ControllerExceptionHandler {
  
  @ExceptionHandler(value = {ResourceNotFoundException.class, CertainException.class})
  public ResponseEntity<ErrorMessage> resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
    ErrorMessage message = new ErrorMessage(
        status,
        date,
        ex.getMessage(),
        description);
    
    return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
  }
}
```
@ExceptionHandler would require you to declare the exception you want to handle

##### 4. How do you do the validations in Spring?
Doing the validations in SpringBoot is very straightforward, the common annotations of validations are as follows:
- @NotNull: It determines that the value can't be null.
- @Min: It determines that the number must be equal or greater than the specified value.
- @Max: It determines that the number must be equal or less than the specified value.
- @Size: It determines that the size must be equal to the specified value.
- @Pattern: It determines that the sequence follows the specified regular expression.
Then, we will need to add the hibernate validator to our dependency, this dependency is also included in the jpa-starter
```
<dependency>  
    <groupId>org.hibernate.validator</groupId>  
    <artifactId>hibernate-validator</artifactId>  
    <version>6.0.13.Final</version>  
</dependency>  
```
Then, we should define the anemic class object:
```
public class Employee {  
  
    private String name;  
    @Size(min=1,message="required")  
    private String pass;  
      
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getPass() {  
        return pass;  
    }  
    public void setPass(String pass) {  
        this.pass = pass;  
    }     
}  

```
String pass is actually the password we would need to validate, then, in the controller, we should declare the relevant object @Valid:
```
    @PostMapping 
    public String submitForm( @Valid @RequestBody Employee e)  
    {  
    .....
    }  
}  

```

Then, define a global exception handler responsible for handling the method argument illegal exception:
```
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, List<String>>> handleValidationErrors(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getFieldErrors()
                .stream().map(FieldError::getDefaultMessage).collect(Collectors.toList());
        return new ResponseEntity<>(getErrorsMap(errors), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

    private Map<String, List<String>> getErrorsMap(List<String> errors) {
        Map<String, List<String>> errorResponse = new HashMap<>();
        errorResponse.put("errors", errors);
        return errorResponse;
    }

}
```

##### 5. What is the actuator?
- Spring Boot’s ‘Actuator’ dependency is used to monitor and manage the Spring web application.
- We can use it to monitor and manage the application with the help of HTTP endpoints or with the JMX