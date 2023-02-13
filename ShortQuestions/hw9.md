##1. List all of the annotations you learned from class and homework to annotaitons.md
####Answer:


##2. Type the Comment feature for the class project.
####Answer:
    The answer is in the redbook.


##3. In postman, call of the APIs in PostController and CommentController.
####Answer:
    Completed.


##4. what is JPA? and what is Hibernate?
####Answer:
    1)JPA(Java Persistence API):  It is a JDK 5.0 annotation or XML description object-relational table mapping, and persists
    runtime entity objects into the database. And JPA uses JDBC to CRUD database, and transfer results from database to Java Entites.
    2)Hibernate: Hibernate is an ORM framework, which creates some kind of mapping betwen Java objects and relational databases
    to achieve direct acess to Java objects.
    3)Relation: JPA is a set of ORM specifications, and hibernate is a subset of JPA and an implementation of JPA. Spring Data JPA 
    is also the implementation of JPA, the underlying use of hibernate technology implementation

##5. What is Hiraki? what is the benefits of connection pool?
####Answer:
    1)Hiraki: It is a pool applied by Spring framwork to operate with database.
    2)benifits:Like Thread, when JPA uses JDBC to connect a database, creating and destorying a connection each time is very 
    rsource consuming. By applying Hiraki, it can help us avoid creating and destorying connections too often.



##6. What is the @OneToMany, @ManyToOne, @ManyToMany? write some examples.
####Answer:
    1)@OneToMany/@ManyToOne: The data in Table1 corresponds to multiple data entry in Table2. OneToMany relationship is related by 
    prinary key and foreign key. Note: The foreign key must be the primary key of another table. And data types of the primary 
    key and foreign key must be the same. And the table with both primary and foreign keys is the multiple party.
    For example: the consumers and orders, each consumer can buy something and creates more than one order. Hence, each consumer
    can have multiple related order information.


    3)ManyToMany: The data in table1 can correspond to multiple data in table2, and the data in table2 can also correspond 
    to multiple data in table1. ManyToMany database creation requires the craetion of an additional intermediate table to hold the 
    primary keys of both tables. Note: An additional intermediate table must be created. The primary key is either a joint 
    primary key or a compound primary key. For example: the relationship between authors and books. One author can write more than one book, and one book can be written
    by more than one author.



##7. What is the cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
####Answer:
    1)CascadeType.ALL includes all casacade operations-CascadeType.REMOVE, CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.Merge.

    CascadeType.REMOVE：Cascade remove operation. When the current entity is deleted, the entity that is mapped to is also deleted.

    CascadeType.PERSIST：Add/save data, and gives the current set entity permission to operate on another entity. For example,
    The customer needs to save the Order after placing an order each time, and the order contains Items. Hence, when  saving the Order,
    the Items associated with the Order also needs to be saved.

    CascadeType.Merge: used to update data. In reality, there is often a similar need to find a business entity and update it, 
    as well as the other business entities associated with that entity. For example, we need to update both the Order and its associated Items.

    CascadeType.REFRESH：Cascade refresh operation. Hpothetical scenariio, there is an order which can be operated by many people.
    At this time, A modifies the order and associated goods. Meanwhile, B also performs the same opartion, but B saves the data before
    A. In this situation, when A saves the data, he needs to refresh the order information and associated commodity information firstly, 
    and then save the order and commodity. The object in the order object that also retrieves the latest items. The refresh(object) method 
    corresponding to the EntityManager is valid. The latest data in the database is re-queried.

    CascadeType.DETACH：Cascade detach operation. If you want ot delete an entity, but it has  a foreign key and cannot be deleted,
    you will need this cascading permission. It will undo all relevant foreign key associations.

    2)orphanRemoval = true: This annotation indicates whether to remove isolated elements, such as OneToOne or OnetoMany mappings.
    With this comment, even if you do not set the cascadation, when you delete one, the multiple parties are definitely isolated elements.
    orphanRemoval = true is usually added to one side.


##8. What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
####Answer:
    1)fetch = FetchType.EAGER: . Eager fetch means that when a record is fetched from the database, all the associated records 
    from related tables are also fetched.
    2)fetch = FetchType.LAZY: Lazy fetch fetches the records only when they are needed.
    3)For example, The class User has two attributes, name and address. After login, the user name needs to be displayed. 
    The probability of using this attribute is great. It is necessary to check the database immediately and use Eager fetch.
    And the user address in most cases do not need to be displayed. It is required to be displayed when checking user's information. 
    Hence, Lazy fetch is more suitable. Instead of loading all of the user's data into the object as soon as you log in, you have these two loading modes.

##9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
####Answer:
    1)JPA implements methods based on the column names of the table. The premise is to follow the syntax of JPA when writing the method name, using 
    the keyword like find, by, And, Or, between , isNull, Desc, and etc..
    2)For example, there is a table with column naming firstname, lastname, age.
    findByLastnameAndFirstname(lastname, firstname), findByAgeIsNull(), findByLastNameOrFirstname(lastname, firstname).


##10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.
####Answer:





##1. List all of the annotations you learned from class and homework to annotaitons.md
####Answer:


##2. type the code, you need to checkout new branch from branch 02_post_RUD, name the new branch with https://github.com/TAIsRich/springboot-redbook/tree/hw05_01_slides_JPQL.
####Answer:
    The answer is in the Redbook2.


##3. What is JPQL?
####Answer:
    JPQL(java Persistent Query Language) is a portable query language designed to bind SQL syntax and simple query semantics 
    together in an object-oriented form. Queries written in this language are portable and can be compiled into SQL on all 
    major database servers. Its characteristics are similar to native SQL statements and are completely object-oriented, 
    and is accessed by class names and properties rather than table names and table field names.


##4. What is @NamedQuery and @NamedQueries?
####Answer:
    JPA's named query actually gives a name to the query statement, which is used name directly when executing the query. 
    This avoids writing the JPQL statement repeatly, and makes the query more reused in the code. The attribute name in 
    @NamedQuery specifies the name of the named query, and the query attribute specifies the statement of the named query.
    To define multiple named queries, use @NamedQueries instead.
```
@NamedQueries({
    @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
    @NamedQuery(name = "Book.findByPublishingDate", query = "SELECT b FROM Book b WHERE b.publishingDate = :publishingDate")
})
```

##5. What is @Query? In which Interface we write the sql or JPQL?
####Answer:
    1)JPA provides the ability to operate database by annotating @Query on an interface class method that inherits repository.
    2)We write the sql or JPQL in DAO(Data Access Object) layer. 

##6. What is HQL and Criteria Queries?
####Answer:
    HQL(Hibernate Query Language) is an object-oriented query language, and the query subject is the persistence class 
    and its attributes of the mapping configuration.
    Criteria Queries: This method encapsulates the query conditions as a criteria object. In practice, the createCriteria() 
    method of the Session is used to build an org.hibernate.Criteria instance. And then the specific query conditions are 
    added to the Criteria instance through the add() method of Criteria. This allows programmers to query data without 
    using SQL or even HQL.


##7. What is EnityManager?
####Answer:
    A JPA EntityManager manages connection to a database as well as to database operations. EntityManager is associated 
    with a PersistenceContext. All operations that are performed in a specific session are stored inside the PersistenceContext.
    EntityManager is the interface to the Persistence Context. All operations on the entity go through the EntityManager. 
    We will declare an EntityManager object in our class and mark it with the @PersistenceContext annotation.


##8. What is SessionFactory and Session?
####Answer:
    1)Session: For each and every request that askes something to do with the database would create a session object to interact
    with the database. Do something with data, which could be any of the CRUD operations. and once it is done, taking 
    care of destroying that object and closing the session. Session is not thread-safe and pretty lightweight.
    2)Session Factory: It acts like a factory to manufactory sessions.we ask the session factory to create a session.
    The session factory is also an object created by the configuration file that configured for the database. A session factory 
    is created for each and every single database. The session factory object would be created only once when starting 
    the application or during the first request that comes into the application when it starts. Session factory is thread-safe 
    and can stay alive for a long time. 


##9. What is Transaction? how to manage your transaction?
####Answer:
    1)Transaction: A transaction is a series of operations executed as a unit that either succeeds or fails, if fails rolling 
    back to its original state. In transaction terms, a transaction is either committed or aborted. To commit a transaction, 
    all participants must guarantee that any changes to the data are permanent. Changes must be persistent regardless of
    system crashes or other unforeseen events. If only one participant fails to make this guarantee, the entire transaction 
    will fail. All data changes within the scope of the transaction are rolled back to a specific setting point.
    2)Spring supports declarative transactions, which uses annotations to select the method or class that needs to use transactions.
    It uses the @Transactional annotation to indicate on the method/class that the method/class needs transactional support.
    Spring's declarative transaction management is based on the Spring AOP mechanism, which essentially intercepts the target 
    method before and after, creates or joins a transaction before the target method starts, and commits or rolls back the 
    transaction after the target method is executed. That is, the transaction enhancement process is inserted into the target 
    business method in the business component and the corresponding proxy object is generated for use by the application (client)
    to add the transaction without pollution. And not forget to add @EnableTransactionManagement annotation to application class.


##10. What is hibernate Caching?
####Answer:
    Hibernate implements a great Cache mechanism, which can quickly improve the data reading performance of the system. The Cache 
    in Hibernate can be divided into two layers: level-1 Cache and level-2 Cache.
    1)Hibenate level 1 cache, also called session cache, it can reduce the number of database access within the session scope! 
    Only valid at session scope! Session closed, level 1 cache invalid! Anything that persists object state is managed by the Session, that is, in the Session cache!
    Session cache is maintained by hibernate. Users cannot operate the cache content. If you want to manipulate the cache content, 
    you must do so through the evit/clear method provided by hibernate.
    2)Level 2 caching is an application-based cache that can be used by all sessions. Hibernate provides a secondary cache 
    with a default implementation and is a pluggable caching framework! If the user wants to use the second-level cache, 
    they only need to configure it in hibernate.cfg.xml. Do not want to use, directly remove, does not affect the code. 
    If users feel that the framework provided by hibernate is not useful, they can switch to another caching framework 
    or implement their own caching framework. Hibernate Level 2 cache: Stores commonly used classes。

##11. What is the difference between first-level cache and second-level cache?
####Answer:
    1)first level cache: stays in session level, and it aims at minimizing the database visit.
    2)second level cache: stays in sessionFactory, and it aims to cross session use.

##12. How do you understand @Transactional? (不要clone，要⾃⼰抄写并测试transactional，https://github.com/TAIsRich/tutorial-transaction)
####Answer:
    @Transactional annontation can be added to a class or a method, which can guarantee all operations in its scope is 
    atomic. And the code is in the transactiondemo.


##13. Write a simple factory design pattern.
####Answer:

