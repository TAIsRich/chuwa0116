## Part one
1. List all of the annotations you learned from class and homework to annotaitons.md
2.  Type the Comment feature for the class project.
3.  In postman, call of the APIs in PostController and CommentController.
4.  what is JPA? and what is Hibernate?
    * Spring Data JPA or JPA stands for Java Persistence API, so before looking into that, we must know about ORM (Object Relation Mapping). So Object relation mapping is simply the process of persisting any java object directly into a database table.
    * Hibernate is an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications.
5.  What is Hiraki? what is the benefits of connection pool?
    * Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism.
    * Connection pooling can improve the response time of any application that requires connections, especially Web-based applications.
    *  Using connection pools helps to both alleviate connection management overhead and decrease development tasks for data access.
6.  What is the  @OneToMany, @ManyToOne, @ManyToMany? write some examples.
    * @ManyToOne
      The @ManyToOne annotation is used to specify a many-to-one database relationship.
```java
@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String branchCode;
    String branchName;
    // Getters and Setters
}
```
```java
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String accountNumber;
    String fullName;
    BigDecimal balance;

    @ManyToOne
    Branch branch;

    // Getters and Setters
}
```
   * @OneToMany
   The @OneToMany annotation is used to specify a one-to-many database relationship.
```java
public class Cart {

    //...     
 
    @OneToMany(mappedBy="cart")
    private Set<Item> items;
	
    //...
}
```
```java
@Entity
@Table(name="ITEMS")
public class Item {

    //...
    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;

    public Item() {}

    // getters and setters
}
```
   * @OneToOne
The @OneToOne annotation is used to specify a one-to-one database relationship.
   ```java
@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    //... 

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    // ... getters and setters
}
```
```java
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    //...

    @OneToOne(mappedBy = "address")
    private User user;

    //... getters and setters
}
```
7. What is the  cascade = CascadeType.ALL, orphanRemoval = true? and what 
are the other CascadeType and their features? In which situation we choose 
which one?
    * CascadeType:  any change happened on parent must cascade to child as well.
    * OrphanRemoval: It marks "child" entity to be removed when it's no longer referenced from the "parent" entity.
    * CascadeType.PERSIST: When we save the parent entity, the child entity will also get saved.
    * CascadeType.REFRESH: the child entity also gets reloaded from the database whenever the parent entity is refreshed.
    * CascadeType.REPLICATE: The replicate operation is used when we have more than one data source and we want the data in sync.
    * CascadeType.DETACH: cascade type detach detaches all related entities if a “manual detach” occurs.
    * CascadeType.MERGE: cascade type merge means that related entities are merged when the owning entity is merged.
    * CascadeType.REMOVE: cascade type remove removes all related entities association with this setting when the owning entity is deleted.
8.  What is the  fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the 
difference? In which situation you choose which one?
   * fetch = FetchType.LAZY: data initialization occurs on the spot.
   * fetch = FetchType.EAGER:  defer initialization of an object as long as it's possible.
   * When the data is small and we want to use data efficiently, we can use FetchType.EAGER.
9.  What is the rule of JPA naming convention? Shall we implement the method by 
ourselves? Could you list some examples?
    * Distinct : select distinct in sql
    * And/Or : and/or logic in where clause in sql
    * Is/Equals : = condition in where clause in sql
    * LessThan : < 
    * LessThanEqual : <=
    * IsNull, Null : check if specific property is null
    * OrderBy : sort data using properties
10. Try to use JPA advanced methods in your class project. In the repository layer, 
you need to use the naming convention to use the method provided by JPA.
11. (Optional) Check out a new branch(https://github.com/TAIsRich/springboot-red
book/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao 
layer using JdbcTemplate.
12. (Optional) use JDBC to read the data from database.

## Part two
1.  List all of the annotations you learned from class and homework to
    annotaitons.md
2.  type the code, you need to checkout new branch from branch 02_post_RUD,
    name the new branch with https://github.com/TAIsRich/springboot-redbook/
    tree/hw05_01_slides_JPQL.
3.  What is JPQL?
    * Java Persistence Query language.It is used to create queries against entities to store in a relational database.
4.  What is @NamedQuery and @NamedQueries?
    * @NamedQuery is used to define a named jpl query. You just have to annotate one of your entity classes with @NamedQuery and provide 2 Strings for the name and query attributes.
    * @NamedQueries is use to wrap multiple named queries to the same entity class.
5.  What is @Query? In which Interface we write the sql or JPQL?
    * @Query: its value attribute contains the JPQL or SQL to execute.
    * JPQL: By default, the query definition uses JPQL. 
    * SQL: We can use also native SQL to define our query. All we have to do is set the value of the nativeQuery attribute to true.
6.  What is HQL and Criteria Queries?
    * HQL is to perform both select and non-select operations on the data,  but Criteria is only for selecting the data, we cannot perform non-select operations using criteria. We can use @NamedQuery annotation attaches itself to one entity class only. We can use the @NamedQueries annotation to group more than one named query for an entity.
    * Criteria queries are a programmatic, type-safe way to express a query. It can perform  query such as the query itself, or the select clause, or an order-by, etc.
7. What is EnityManager?
    * EntityManager is an interface provided by Java Persistence API (JPA) specification. We use EntityManager as a general-purpose DAO interface for managing lifecycle of entity instances.
8.  What is SessionFactory and Session?
    * SessionFactory is an interface available in org.hibernate package and it provides factory methods to get session object.
    * Session is an interface available in org.hibernate package which provides different API to communicate java application to hibernate.
9.  What is Transaction? how to manage your transaction?
    * Transactions manage the changes that you perform in one or more systems. These can be databases, message brokers, or any other kind of software system. The main goal of a transaction is to provide ACID characteristics to ensure the consistency and validity of your data.
    * We can use @Transactional annotation on methods.
10. What is hibernate Caching?
    * Hibernate caching acts as a layer between the actual database and your application. It reduces the time taken to obtain the required data.
11. What is the difference between first-level cache and second-level cache?
    * The first level is maintained at the Session level and accessible only to the Session.
    * The second level cache is maintained at the SessionFactory level and available to all Sessions.
12. How do you understand @Transactional? (不要clone，要自己抄写并测试
    transactional，https://github.com/TAIsRich/tutorial-transaction)
13. Write a simple factory design pattern.
    Refers to Coding/simpleFactory.