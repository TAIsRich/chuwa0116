.  List all of the annotations you learned from class and homework to
annotaitons.md
2. Type the Comment feature for the class project.
3. In postman, call of the APIs in PostController and CommentController.
4. what is JPA? and what is Hibernate?  
   JPA (Java Persistence API) is a specification for object-relational mapping (ORM) in Java, which is used to manage the relational data in Java applications. It defines a standard interface for accessing databases and helps to manage the persistence of data in Java applications.  
   Hibernate is a popular, open-source ORM framework that implements the JPA specification. It provides a powerful and flexible framework for storing and retrieving data from a database in Java applications. With Hibernate, developers can work with data in the form of Java objects rather than writing raw SQL statements, and Hibernate automatically maps these objects to the database. Hibernate also offers a variety of advanced features such as caching, lazy loading, and transactions, making it a popular choice for developing Java applications.
5. What is Hiraki? what is the benefits of connection pool?  
  Hiraki means means that a well-trained actor, whose skills reach a certain level, performs a special program with the permission of the grand master of the school he or she belongs to.  
   The primary benefit of using a connection pool is to reduce the overhead of establishing a new database connection for each transaction. By reusing existing connections, the connection pool can significantly improve the performance and scalability of a Java application that interacts with a database.
6. What is the  @OneToMany, @ManyToOne, @ManyToMany? write some examples.   
Thera are annotations in JPA that define the relationships between entities.  They are used to map the relationships between tables in a relational database.
```java
@Entity
public class Employee {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  
  //OneToMany means a person could hava multiple phones.
  @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
  private List<Phone> phones;

  // getters and setters ...
}

@Entity
public class Phone {

  @Id
  @GeneratedValue
  private Long id;

  private String number;
  
  //ManyToOne means a lots of phones could belong one person
  @ManyToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;

  // getters and setters ...
}

```
This example means that a customer can have multiple products, and a product can be associated with multiple customers.
```java
@Entity
public class Customer {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToMany
  @JoinTable(
    name = "customer_product",
    joinColumns = @JoinColumn(name = "customer_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id")
  )
  private List<Product> products;

  // getters and setters ...
}

@Entity
public class Product {

  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @ManyToMany(mappedBy = "products")
  private List<Customer> customers;

  // getters and setters ...
}

```
7. What is the  cascade = CascadeType.ALL, orphanRemoval = true? and what
   are the other CascadeType and their features? In which situation we choose
   which one?  
   cascade = CascadeType.ALL is an attribute of the @OneToMany and @ManyToMany annotations, and it specifies that changes made to the parent entity should be propagated to its child entities. For example, if you delete a parent entity, its child entities will also be deleted.  
   orphanRemoval = true is an attribute of the @OneToMany annotation, and it specifies that when an entity is removed from the relationship, it should also be deleted from the database.  
   Here are some of the other CascadeType values and their features:
* CascadeType.PERSIST: Specifies that changes made to the parent entity should be persisted to the database, including changes made to its child entities.
* CascadeType.MERGE: Specifies that changes made to the parent entity should be merged with the corresponding data in the database, including changes made to its child entities. 
* CascadeType.REMOVE: Specifies that changes made to the parent entity should be removed from the database, including changes made to its child entities. 
* CascadeType.REFRESH: Specifies that changes made to the parent entity should be refreshed from the database, including changes made to its child entities.

8. What is the  fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the
    difference? In which situation you choose which one?  
   fetch = FetchType.LAZY specifies that the data for the relationship should be fetched only when it is explicitly needed.  
   fetch = FetchType.EAGER specifies that the data for the relationship should be fetched immediately when the parent entity is loaded from the database.  
   The choice between FetchType.LAZY and FetchType.EAGER depends on the requirements of your application and the desired behavior of your entities.   
  If there are a large number of related entities and you don't need to access them immediately, you can use FetchType.LAZY to optimize performance by only loading the data when it's needed. On the other hand, if you always need the data for a relationship, you can use FetchType.EAGER to ensure that it's always available.

9. What is the rule of JPA naming convention? Shall we implement the method by
    ourselves? Could you list some examples? 
* Entity names should be in UpperCamelCase and should represent the name of the entity in the business domain. For example, "Employee" or "Product". 
* Table names should be in lowercase and separated by underscores, and should correspond to the entity name. For example, "employee" or "product". 
* Column names should be in lowercase and separated by underscores, and should correspond to the attribute name of the entity. For example, "first_name" or "last_name".
* Primary key column names should be the entity name followed by "_id". For example, "employee_id" or "product_id"
we cannot implement the method by ourselves. 
```java
@Entity
@Table(name = "my_employee_table")
public class Employee {

  @Id
  @Column(name = "employee_id")
  private Long id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;
  
  // ...
}

```
10. Try to use JPA advanced methods in your class project. In the repository layer,
    you need to use the naming convention to use the method provided by JPA.
11. (Optional) Check out a new branch(https://github.com/TAIsRich/springboot-red
    book/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao
    layer using JdbcTemplate.
12. (Optional) use JDBC to read the data from database.
 
# Part 2

1. List all of the annotations you learned from class and homework to
    annotaitons.md
2. type the code, you need to checkout new branch from branch 02_post_RUD,
    name the new branch with https://github.com/TAIsRich/springboot-redbook/
    tree/hw05_01_slides_JPQL.
3. What is JPQL?  
   The Java persistence query language (JPQL) is used to define searches against persistent entities independent of the mechanism used to store those entities.
4. What is @NamedQuery and @NamedQueries?  
   @NamedQuery is used to define a single named query, while @NamedQueries is used to define multiple named queries.
5. What is @Query? In which Interface we write the sql or JPQL?  
   @Query is an annotation in JPA (Java Persistence API) that allows you to specify a custom JPQL (Java Persistence Query Language) or SQL query to be used for a query method in a repository interface.  
   The @Query annotation is typically used in combination with the CrudRepository or JpaRepository interface, which are both part of Spring Data JPA.
6. What is HQL and Criteria Queries?  
   HQL (Hibernate Query Language) is a proprietary query language used by the Hibernate framework for object-relational mapping. HQL provides a syntax that is similar to SQL but is used to query the data stored in Hibernate-mapped objects and properties, rather than in a relational database table. HQL is translated by Hibernate into the appropriate SQL query for the underlying database, which means that you can write portable, database-independent queries using HQL.  
   Criteria Queries are a programmatic way to create and execute database queries in Hibernate. Unlike HQL, Criteria Queries do not use a proprietary query language and instead rely on a Java API to create queries. Criteria Queries are created by constructing a Criteria object and chaining together method calls to specify the criteria for the query.
7. What is EnityManager?  
   The EntityManager is an API that manages the lifecycle of entity instances. An EntityManager object manages a set of entities that are defined by a persistence unit. Each EntityManager instance is associated with a persistence context.
8. What is SessionFactory and Session?  
   SessionFactory is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction. Session is short-lived while SessionFactory objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache.
9. What is Transaction? how to manage your transaction?  
   A transaction in database terms refers to a sequence of one or more operations that are executed as a single, atomic unit of work. In other words, either all the operations are executed and committed or none of them are executed and all changes are rolled back.
   In JPA and Hibernate, transactions are managed using the EntityTransaction and Transaction interfaces, respectively. To start a transaction, you call the begin method on an instance of EntityTransaction or Transaction. To commit the transaction, you call the commit method. If any of the operations in the transaction fail, you can call the rollback method to undo all changes made in the transaction.
10. What is hibernate Caching?  
    Hibernate caching acts as a layer between the actual database and your application. It reduces the time taken to obtain the required data — as it fetches from memory instead of directly hitting the database.
11. What is the difference between first-level cache and second-level cache?  
    The first level cache is associated with the Session Object, while the second-level cache is associated with the SessionFactory object. This means first-level cache's scope is limited to session-level while second-level cache's scope is at the application level.
12. How do you understand @Transactional? (不要clone，要自己抄写并测试
    transactional，https://github.com/TAIsRich/tutorial-transaction)
13. Write a simple factory design pattern.