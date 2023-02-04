1. @Autowired: @Autowired is a way of telling Spring that auto-wiring is required. It can be applied to field, constructor and methods.   

2. @Service: the service layer classes that contain the business logic should be annotated with @Service. Apart from the fact that it is used to indicate that the class contains business logic, there is no special meaning to this annotation, however it is possible that Spring may add some additional feature to @Service in future, so it is always good idea to follow the convention.   

3. @Repository: the classes annotated with this annotation defines data repositories. It is used in DAO layer classes. @Repository has one special feature that it catches platform specific exceptions and re-throw them as one of the Spring’s unified unchecked exception i.e. DataAccessException.

4. @C@RequestMapping: @RequestMapping annotation maps the incoming HTTP request to the handler method that will serve this request, we can apply @RequestMapping on a class as well as a method. When used on a class, it maps a specific request path or pattern onto a controller, then the method level annotation will make the mappings more specific to handler methods.   

5. @Entity: @Entity annotation defines that a class can be mapped to a database table. The class fields will be mapped to the columns of the table.    

6. @Id: @Id annotation defines the primary key of a table.   

7. @Column: @Column can give names to the columns of a JPA Entity