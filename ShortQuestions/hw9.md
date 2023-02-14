## Part 1
### 1. List all of the annotations you learned from class and homework to annotaitons.md
### 2. Type the Comment feature for the class project.
### 3. In postman, call of the APIs in PostController and CommentController.
### 4. what is JPA? and what is Hibernate?
* JPA全称是Java Persistence API，即java持久化API，是sun公司推出的一套基于ORM的规范，内部由一系列的接口和抽象类构成
* JPA和Hibernate的关系就像JDBC和JDBC驱动的关系，JPA是规范，Hibernate除了作为ORM框架之外，它也是一种JPA实现。JPA怎么取代Hibernate呢？JDBC规范可以驱动底层数据库吗？答案是否定的，也就是说，如果使用JPA规范进行数据库操作，底层需要hibernate作为其实现类完成数据持久化工作。
* JPA is a standard of Object Relational Mapping. It is an interface that defines a set of annotations for creating the object relational mapping.
* JPA use JDBC to CRUD database, and also transfer result from database to Java Entities.
### 5.  What is Hiraki? what is the benefits of connection pool?
* 在执行JDBC的增删改查的操作时，如果每一次操作都来一次打开连接，操作，关闭连接，那么创建和销毁JDBC连接的开销就太大了。为了避免频繁地创建和销毁JDBC连接，我们可以通过连接池（Connection Pool）复用已经创建好的连接。
JDBC连接池有一个标准的接口javax.sql.DataSource，注意这个类位于Java标准库中，但仅仅是接口。要使用JDBC连接池，我们必须选择一个JDBC连接池的实现。常用的JDBC连接池有：
  * HikariCP
  * C3P0
  * BoneCP
  * Druid
### 6. What is the @OneToMany, @ManyToOne, @ManyToMany? write some examples.
* @OneToMany, @ManyToOne, and @ManyToMany are JPA annotations used in object-relational mapping (ORM) to define the relationship between entities in a database.

### 7. What is the cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
* lifecycle is true, ex: post deleted, comments deleted all.
-   `CascadeType.PERSIST`: Changes to the parent entity will be cascaded to its related entities when the parent is persisted.
-   `CascadeType.MERGE`: Changes to the parent entity will be cascaded to its related entities when the parent is merged.
-   `CascadeType.REFRESH`: The state of the parent entity will be refreshed in its related entities when the parent is refreshed.
-   `CascadeType.REMOVE`: Changes to the parent entity will be cascaded to its related entities when the parent is removed.
-   `CascadeType.DETACH`: Changes to the parent entity will be cascaded to its related entities when the parent is detached.
-   `CascadeType.ALL`
### 8. What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
* EAGER: If we don't need data from comment, JPA doesn't fetch it, 
* LAZY: when we fetch post, JPA also fetch comment at the same time.

### 9.What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
* findByLastNameAndFirstName();
* findByLastNameOrFirstName();

## Part 2

### 3.  What is JPQL?
* Java Persistence Query language.It is used to create queries against entities to store in a relational database.
* JPQL，因此它可以完全理解继承、多态和关联等特征。而且JPQL内置了大量函数，极大地方便了JPQL查询的功能。当然JPQL底层依然是基于SQL的，但JPQL到SQL的转换无须开发者关心，JPQL解析器会负责完成这种转换，并负责执行这种转换的SQL语句来更新数据库。

### 4.  What is @NamedQuery and @NamedQueries?
* @NamedQuery and @NamedQueries are annotations used in the Java Persistence API (JPA) to define predefined queries that can be reused throughout an application.
* @NamedQuery is used to define a single named query, while @NamedQueries is used to define multiple named queries.

###  5. What is @Query? In which Interface we write the sql or JPQL?
* @Query is a JPA annotation used to define a custom query in a repository. The custom query can be written using either SQL or JPQL (Java Persistence Query Language).
* In JPA, the @Query annotation is used to define a custom query in a repository interface that extends the JpaRepository or CrudRepository interface.

### 6.  What is HQL and Criteria Queries?
* HQL (Hibernate Query Language) and Criteria Queries are both ways to query data in Hibernate, which is an ORM (Object-Relational Mapping) framework for Java.
* Criteria Queries, on the other hand, are a programmatic way of constructing queries in Hibernate. They allow you to build complex queries by chaining together method calls, without having to write any HQL or SQL.

### 7. What is EnityManager?
* EntityManager is an interface in the Java Persistence API (JPA) that provides a set of methods for performing basic CRUD (Create, Read, Update, Delete) operations on entities. The EntityManager interface is the main interface used by applications to interact with a database and to persist entities.

### 8. What is SessionFactory and Session?
* SessionFactory and Session are core concepts in Hibernate, a popular Java persistence framework. 
* SessionFactory is a factory class that is used to create Session objects, which are the main interface for interacting with a database in Hibernate. The SessionFactory is a thread-safe, singleton object that is used to create Session objects, which are lightweight and not thread-safe. 
* Session is the main interface used by applications to perform database operations in Hibernate. It provides methods for performing CRUD (Create, Read, Update, Delete) operations on entities, executing queries, and managing the lifecycle of entities. The Session interface is designed to be lightweight and not thread-safe, so it is typically used for a single unit of work and then closed.

### 9.  What is Transaction? how to manage your transaction?
* A transaction is a series of operations that must be executed in a consistent and reliable manner. In the context of databases, a transaction represents a set of database operations that must either all succeed or all fail, so that the database remains in a consistent state.
* We can use try catch and rollback to accomplish it.

### 10. What is hibernate Caching?
* Hibernate caching refers to the caching mechanism that Hibernate provides to improve the performance of database operations. Hibernate caching is implemented using a two-level cache system that consists of a first-level cache and a second-level cache.

### 11. What is the difference between first-level cache and second-level cache?
* The first-level cache, also known as the session cache, is associated with a single Session or EntityManager instance and is used to cache data for the duration of a single unit of work. The first-level cache is automatically maintained by Hibernate, and it is transparent to the application.
* The second-level cache, on the other hand, is a shared cache that can be used by multiple Session or EntityManager instances and across multiple transactions. The second-level cache is implemented using a cache provider, such as EhCache, Hazelcast, or Infinispan. The second-level cache can be configured and managed by the application and is used to cache data that is likely to be reused across multiple units of work.


### 12. How do you understand @Transactional? (不要clone，要自己抄写并测试 transactional，https://github.com/TAIsRich/tutorial-transaction)
### 13. Write a simple factory design pattern.