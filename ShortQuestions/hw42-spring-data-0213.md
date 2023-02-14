# hw42-spring-data-0213

## 1. List all of the annotations you learned from class and homework to annotation.md
see annotation.md

## 2. Type the Comment feature for the class project.
Adding comments for a post.

## 3. In postman, call of the APIs in PostController and CommentController.
```aidl

POST http://localhost:8080/api/v1/posts/{{postId}}/comments

GET http://localhost:8080/api/v1/posts/{{postId}}/comments

DELETE http://localhost:8080/api/v1/posts/{{postId}}/comments/{{id}}

...
```

## 4. what is JPA? and what is Hibernate?
JPA (Java Persistence API) is a Java specification for accessing, persisting, and managing data between Java objects and a relational database. JPA provides a standard interface for managing relational data in Java applications and allows for the use of different implementations (such as Hibernate).

Hibernate is a popular open-source implementation of the Java Persistence API (JPA) that provides a framework for mapping Java classes to relational database tables and handling data persistence. It provides a powerful and flexible object-relational mapping (ORM) solution that simplifies database access in Java applications by abstracting the underlying database details. With Hibernate, developers can work with objects in Java code and have the changes automatically persisted to the database, without having to write SQL queries or manually manage database connections.

## 5. What is Hiraki? what is the benefits of connection pool?
Hikari Connection Pooling (or Hikari CP) is the new kid on the block, though a late entrant in pooling mechanisms, it is outperforming the ones offered by C3P0, Apache Commons DBCP, BoneCP, Tomcat, Vibur etc.

As for the benefits of a connection pool, a connection pool is a cache of database connections maintained so that the connections can be reused when needed to serve new requests, rather than being opened and closed for every transaction.
The main benefits includes improved performance, reduced overhead, increased scalability, better resource management and simplified code.

## 6. What is the @OneToMany, @ManyToOne, @ManyToMany ? write some examples.
@OneToMany, @ManyToOne, and @ManyToMany are annotations used in Java Persistence API (JPA) to define the relationships between entities. These annotations are used to specify the cardinality of relationships between entities.

@OneToMany(mappedBy = "department") private List<Employee> employees; Many employee belongs to one department

@ManyToMany(mappedBy = "courses") private List<Student> students;

...


## 7. What is the cascade = CascadeType.ALL, orphanRemoval = true ? and what are the other CascadeType and their features? In which situation we choose which one?
CascadeType.ALL and orphanRemoval = true are JPA (Java Persistence API) annotations used in mapping relationships between entities in a relational database.

CascadeType.ALL is an enumeration of the CascadeType class and specifies that all operations that can be cascaded (persist, merge, remove, refresh, and detach) should be cascaded to the related entities.

orphanRemoval = true is a property of the OneToOne, OneToMany, or ManyToMany annotations, and it specifies that when the parent entity is deleted, the child entities should be deleted as well.

## 8. What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER ? what is the difference? In which situation you choose which one?
fetch = FetchType.LAZY and fetch = FetchType.EAGER are the two possible values that can be used in the @OneToMany and @ManyToOne annotations in JPA (Java Persistence API) to specify the fetching strategy for a relationship between entities.

The fetching strategy determines when the related entities should be loaded into memory.

FetchType.LAZY means that the related entities will be loaded on demand, only when they are accessed for the first time. This is the default fetching strategy for relationships. It can help to improve performance, as only the entities that are actually needed will be loaded into memory.

FetchType.EAGER means that the related entities will be loaded together with the owning entity, as soon as the owning entity is retrieved from the database. This can lead to less efficient database queries and can result in the loading of unnecessary data into memory, but it can also provide a consistent view of the data and simplify the code that needs to be written.

## ## 9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
JPA (Java Persistence API) naming conventions refer to the set of standards and guidelines that should be followed while naming entities, attributes, and relationships in a JPA based application.

The following are some of the common naming conventions that are followed in JPA:

Entity names should be singular and written in CamelCase. For example, Employee, UserProfile, Product, etc.

Attribute names should also be written in CamelCase and should be named after their respective database columns. For example, firstName, lastName, emailAddress, etc.

Relationships between entities should be named in CamelCase and should be descriptive. For example, employeeProfile, productOrders, userAddresses, etc.

The primary key column in the database should be named as "id".

You do not necessarily have to implement the naming conventions yourself as JPA provides the necessary mechanisms for mapping entities and their attributes to the database. However, it is a best practice to follow naming conventions as it makes your code more readable and maintainable.

eg. returnType findPostById(); // comment repository defined


## 10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.
List<Post> findPostByBody();

## 11 and 12 omitted 

# Part 2

## 1. List all of the annotations you learned from class and homework to annotaitons.md
see annotation.md

## 2. type the code, you need to checkout new branch from branch 02_post_RUD, name the new branch with https://github.com/TAIsRich/springboot-redbook/tree/hw05_01_slides_JPQL.
see coding folder

## 3. What is JPQL?
JPQL stands for Java Persistence Query Language. It's a query language used to communicate with a database and perform various operations, such as retrieving data from tables, updating data in the database, and deleting data from tables.

## 4. What is @NamedQuery and @NamedQueries?
The @NamedQuery annotation is used to declare a single named query and it is defined on a class (entity).

The @NamedQueries annotation is used to declare multiple named queries and it is also defined on a class (entity).

## 5. What is @Query? In which Interface we write the sql or JPQL?
@Query is a Spring Data JPA annotation that is used to specify custom JPQL or SQL queries for a repository method. The JPQL or SQL query is written as a string value within the annotation, and it is executed when the method annotated with @Query is called.

In Spring Data JPA, you can write the JPQL or SQL query in the following interfaces:

Repository interface: You can write the JPQL or SQL query in a method inside the repository interface. The method should be annotated with @Query and the query string should be passed as a value to the annotation.

NamedQuery: You can also write the JPQL or SQL query in a Named Query. A Named Query is a pre-defined query that can be used multiple times in a program. Named Queries are defined at the entity level and can be reused across the application.


## 6. What is HQL and Criteria Queries?
HQL is to perform both select and non-select operations on the data, but Criteria is only for selecting the data, we cannot perform non-select operations using criteria.

## 7. What is EntityManager?

The EntityManager API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.

## 8. What is SessionFactory and Session?
SessionFactory is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction.

Session is short-lived while SessionFactory objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache.

## 9. What is Transaction? how to manage your transaction?
A transaction is a set of operations that are executed as a single unit of work. The purpose of a transaction is to ensure that the database remains in a consistent state, even if some of the operations fail.

To manage transactions, you can use the following steps:

Begin the transaction: Start a transaction by issuing a BEGIN TRANSACTION or similar command.

Execute the operations: Perform the operations that you want to include in the transaction.

Commit the transaction: If all the operations are successful, commit the transaction by issuing a COMMIT command.

Rollback the transaction: If any of the operations fail, rollback the transaction by issuing a ROLLBACK command. This will undo any changes made during the transaction.

End the transaction: End the transaction by either committing or rolling back.


## 10. What is hibernate Caching?
Hibernate caching is a mechanism used to cache the data from the database in memory, so that subsequent requests for the same data can be served faster, without the need to hit the database. Hibernate provides several levels of caching, including:

First-level cache: This is the session-level cache that is associated with a single Hibernate Session. It is automatically maintained by Hibernate for each session and caches data for a single transaction.

Second-level cache: This is a cache that is shared across multiple sessions and transactions and can be managed either by Hibernate or by a third-party cache provider such as EhCache.

## 11. What is the difference between first-level cache and second-level cache?
The first level cache is associated with the Session Object, while the second-level cache is associated with the SessionFactory object.

## 12. How do you understand @Transactional? (不要clone，要⾃⼰抄写并测试 transactional，https://github.com/TAIsRich/tutorial-transaction)
@Transactional is a Java annotation that is used to indicate that a method or a class is to be executed within a transaction. Transactions are used in database systems to ensure that a series of database operations are executed as a single unit of work.

## 13. Write a simple factory design pattern.
Done before under coding folders