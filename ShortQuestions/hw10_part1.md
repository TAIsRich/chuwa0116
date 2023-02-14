# HW10 Part1
### 1. List all of the annotations you learned from class and homework to annotaitons.md
Please check ShortQuestinos/annotations.md file

### 2. Type the Comment feature for the class project.

### 3. In postman, call of the APIs in PostController and CommentController.

### 4. what is JPA? and what is Hibernate?
```
JPA stands for Java Persistence API. It is a Java specification that gives some functionality and standard to ORM tools. It is used to examine, control, and persist data between Java objects and relational databases. It is observed as a standard technique for Object Relational Mapping. It is considered as a link between an object-oriented model and a relational database system.

Hibernate is an Object-Relational Mapping (ORM) tool that is used to save the Java objects in the relational database system. And it's an implementation of JPA. It is used in mapping Java data types with SQL data types and database tables.

The major difference between Hibernate and JPA is that Hibernate is a framework while JPA is API specifications. Hibernate is the implementation of all the JPA guidelines.
```

### 5. What is Hikari? what is the benefits of connection pool?
```
Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism.

Connection pools promote the reuse of connection objects and reduce the number of times that connection objects are created. Connection pools significantly improve performance for database-intensive applications because creating connection objects is costly both in terms of time and resources.
```

### 6. What is the `@OneToMany, @ManyToOne, @ManyToMany`? write some examples.
```
`@OneToMany` define a one to many relationship between two entities. Where one entity has relationship with many other entity. For example, one post can have many comments.
`@ManyToOne` define a many to one relationship between two entities. For example, cites in a state.
`@ManyToMany` define a many to many relationship between two entities. For example, students and classes.
```

### 7. What is the `cascade = CascadeType.ALL, orphanRemoval = true?` and what are the other CascadeType and their features? In which situation we choose which one?
```
`cascade = CascadeType.ALL, orphanRemoval = true?` means propagating all operations from parent to the relating entity and when the relationship between parent and child entity broke, the child entity will become orphan and will be removed.

CascadeType.ALL - the persistence will propagate (cascade) all EntityManager operations ( PERSIST, REMOVE, REFRESH, MERGE, DETACH ) to the relating entities. 
CascadeType.PERSIST – used to specify that if an entity is persisted then all its associated child entities will also be persisted.
CascadeType.MERGE - propagates the merge operation from a parent to a child entity.
CascadeType.REMOVE – the related entities are deleted when the owning entity is deleted.
CascadeType.REFRESH - the refresh is cascaded to the target of the association if the parent entity is refreshed.
CascadeType.DETACH – it detaches all the related entities if a manual detach occurs.
```

### 8. What is the `fetch = FetchType.LAZY, fetch = FetchType.EAGER?` what is the difference? In which situation you choose which one?
```
`fetch = FetchType.LAZY` - it fetches the child entities lazily, that is, at the time of fetching parent entity it just fetches proxy (created by cglib or any other utility) of the child entities and when you access any property of child entity then it is actually fetched by hibernate.

`fetch = FetchType.EAGER` - it fetches the child entities along with parent.

Lazy initialization improves performance by avoiding unnecessary computation and reduce memory requirements. Eager initialization takes more memory consumption and processing speed is slow.

If the related entity isn’t too big, this is not an issue for to-one relationships, we can use FetchType.EAGER.
```

### 9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
```
The JPA default table name is the name of the class (minus the package) with the first letter capitalized. Each attribute of the class will be stored in a column in the table.
We don't need to implement the method by ourselves.
```
```java
findByTitle(String title);
findByAgeGreaterThan();
findByFirstNameAndLastName();
```

### 10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.