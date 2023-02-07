# Java Annotations

## @Autowired
The Spring framework enables automatic dependency injection. In other words, by declaring all the bean dependencies in a Spring configuration file, Spring container can autowire relationships between collaborating beans. This is called Spring bean autowiring.

## @Controller
We typically use @Controller in combination with a @RequestMapping annotation for request handling methods.

## @RestController
It's a convenient annotation that combines @Controller and @ResponseBody

## @RequestMapping
The annotation is used to map web requests to Spring Controller methods.

## @PostMapping @PutMapping @GetMapping @DeleteMapping
Annotation for mapping HTTP POST / PUT / GET / DELETE requests onto specific handler methods.

## @PathVariable
The @PathVariable annotation in Spring Boot is used to bind a URI template variable to a method parameter.

## @RequestBody
The @RequestBody annotation maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization

## @Repository
It is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects。

## @Entity
Specifies that the class is an entity. This annotation is applied to the entity class.

## @Table
The @Table annotation allows you to specify the details of the table that will be used to persist the entity in the database.

## @UniqueConstraint
The @UniqueConstraint annotation in Spring Boot is used to specify a unique constraint on a table in a database.

## @Id @GeneratedValue
The @Id annotation specifies the primary key of an entity and the @GeneratedValue provides for the specification of generation strategies for the values of primary keys.

## @Column
The @Column annotation in Spring Boot is used to map a property of a Java bean class to a column in a database table.

## @CreateTimestamp
The @CreateTimestamp annotation is used to specify the creation time of an object in a database.

## @UpdateTimestamp
It is used for keeping track of when an object was last updated.

## @Service
Spring @Service annotation is used with classes that provide some business functionalities. Spring context will autodetect these classes when annotation-based configuration and classpath scanning is used.

## @RespondStatus
The @ResponseStatus annotation in Spring Boot is used to specify the HTTP status code to be returned when a specific exception is thrown in the application.

## @JsonPropertyOrder
The @JsonPropertyOrder annotation in Spring Boot is used to specify the order of the properties in a JSON representation of a Java object.
The class instances are serialized in the order they appear in the annotation.

## @JsonProperty
The @JsonProperty annotation in Spring Boot is used to specify the property name in a JSON payload when serializing or deserializing an object to/from JSON. By default, the name of the property in the JSON payload is determined by the name of the corresponding field in the Java class. However, you can use @JsonProperty to specify a different name for the property in the JSON payload.

## @ManyToOne
The @ManyToOne annotation in Spring Boot is used to specify a many-to-one relationship between two entities in a database.

## JoinColumn
The @JoinColumn annotation in Spring Boot is used to specify a column for joining an entity association or to map a foreign key column in the database.


--------------------------
## @Override
Overrides an inherited methods

## @FunctionalInterface
Sanity check, a functional interface should only have one abstract method.