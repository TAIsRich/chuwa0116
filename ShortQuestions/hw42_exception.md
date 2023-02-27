###1. annotations.md
###2.what is the @configuration and @bean?
- Spring @Configuration annotation is part of the spring core framework. Spring Configuration annotation indicates that the class has @Bean definition methods. So Spring container can process the class and generate Spring Beans to be used in the application.
- @Bean is a method-level annotation, it is used to mark a method as one that creates a bean and Spring will then add it to the context for us.
###3. How do you handle the exception in Spring?
- use ErrorDetails class 
- use GlobalExceptionHandler class to handle all exceptions in one place
- use Postman to check for testing 
###4. How do you do the validations in Spring?
- 1. import dependecy
- 2. Add validation Rule to payload
- 3. Add @valid to controller to apply the Rule here
- 4. Check it in Postman
###5.  What is the actuator?
- tool to monitor the application 
- a sub-project of the Spring Boot Framework, It uses HTTP endpoints to expose operational information about any running application.