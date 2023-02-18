1. List all of the annotations you learned from class and homework to annotaitons.md
   
Please see annotaitons.md

2. what is the @configuration and @bean?

Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context.

3. How do you handle the exception in Spring?

    ```
    @Controller
    public class ExceptionHandlingController {

    // @RequestHandler methods
    ...
    
    // Exception handling methods
    
    // Convert a predefined exception to an HTTP Status code
    @ResponseStatus(value=HttpStatus.CONFLICT,
                    reason="Data integrity violation")  // 409
    @ExceptionHandler(DataIntegrityViolationException.class)
    public void conflict() {
        // Nothing to do
    }
    
    // Specify name of a specific view that will be used to display the error:
    @ExceptionHandler({SQLException.class,DataAccessException.class})
    public String databaseError() {
        // Nothing to do.  Returns the logical view name of an error page, passed
        // to the view-resolver(s) in usual way.
        // Note that the exception is NOT available to this view (it is not added
        // to the model) but see "Extending ExceptionHandlerExceptionResolver"
        // below.
        return "databaseError";
    }

    // Total control - setup a model and return the view name yourself. Or
    // consider subclassing ExceptionHandlerExceptionResolver (see below).
    @ExceptionHandler(Exception.class)
    public ModelAndView handleError(HttpServletRequest req, Exception ex) {
        logger.error("Request: " + req.getRequestURL() + " raised " + ex);

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", ex);
        mav.addObject("url", req.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
    }
    ```

4. How do you do the validations in Spring?

    ```
    <dependency> 
        <groupId>org.springframework.boot</groupId> 
        <artifactId>spring-boot-starter-validation</artifactId> 
    </dependency>

    @Entity
    public class User {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        
        @NotBlank(message = "Name is mandatory")
        private String name;
        
        @NotBlank(message = "Email is mandatory")
        private String email;
        
        // standard constructors / setters / getters / toString
            
    }

    @RestController
    public class UserController {

        @PostMapping("/users")
        ResponseEntity<String> addUser(@Valid @RequestBody User user) {
            // persisting the user
            return ResponseEntity.ok("User is valid");
        }
        
        // standard constructors / other methods
        
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
    MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
    ```

5. What is the actuator?

Spring Boot's 'Actuator' dependency is used to monitor and manage the Spring web application. We can use it to monitor and manage the application with the help of HTTP endpoints or with the JMX