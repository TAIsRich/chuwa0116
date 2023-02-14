# Annotations
### @Entity
This annotation specifies the class is an entity

### @Id
This annotation specifies the primary key of the entity

### @GeneratedValue
This annotation specifies the generation strategies for the values of primary keys

### @Table
This annotation specifies the table in the database with which this entity is mapped

### @Column
This annotation specifies variable to table column mapping

### @CreationTimestamp
This annotation specifies creation time

### @UpdateTimestamp
This annotation specifies update time

### @Controller
This annotation marks a class as a web request handler

### @Service
This annotation tells the Spring that class contains the business logic

### @Autowired 
This annotation can be used on properties, setters, and constructors after enabling annotation injection

### @Repository
This annotation a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects

### @RequestMapping 
This annotation is used to map web requests onto specific handler classes and/or handler methods

### @PostMapping
This annotation is for mapping HTTP POST requests onto specific handler methods

### @SpringBootApplication
This annotation is used to mark the main class of a Springboot application

### @Configuration 
This annotation marks configuration can be found automatically

### @ComponentScan 
This annotation tells Spring in which packages you have annotated classes that should be managed by Spring

### @PropertySource
This annotation is used to read properties from .properties file in the resource directory

### @OneToMany
One record in the table relates multiple records in another table.

### @ManyToOne
Multiple records in the table relate to one record in another table.

### @ManyToMany
Multiple records in the table relate to multiple records in another table.

### @NamedQuery 
This annotation is used by JPQL to give query
```java
@NamedQuery(name="get_all_posts", query="select p from Post p")
//here the Post is match to entity name rather than db name
```

### @NamedQueries
This annotation is used by JPQL to give s collection of query
```java
@NamedQueries({
        @NamedQuery(name="get_all_posts", query="select p from Post p"),
        @NamedQuery(name="get_posts_byId", query="select p from Post p where id = :id")
//here the Post is match to entity name rather than db name
})
```

### @JsonPropertyOrder
This annotation gives the return order of Json
```java
@JsonPropertyOrder({ "last", "pageNo", "pageSize", "totalElements", "totalPages", "content" })
```
### @JsonProperty 
This annotation matches Json to the entity name
```java
@JsonProperty("isLast")
```
### @PersistenceContext 
This annotation is used to clarify the entity manager
```java
    @PersistenceContext
    EntityManager entityManager;
```