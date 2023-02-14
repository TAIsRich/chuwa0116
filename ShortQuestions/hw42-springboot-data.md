## part1
### 1. List all of the annotations you learned from class and homework to annotaitons.md

### 2.  Type the Comment feature for the class project.

### 3.  In postman, call of the APIs in PostController and CommentController.

### 4.  what is JPA? and what is Hibernate?
JPA (Java Persistence API) is a Java specification for accessing, persisting, and managing data between Java objects/classes and a relational database.   It provides a standard API for object-relational mapping (ORM) and is the Java equivalent of the Object-Relational Mapping (ORM) concept.

Hibernate is a popular and widely used Java library for implementing JPA.   It provides a framework for mapping an object-oriented domain model to a relational database.  With Hibernate, developers can interact with the database using a simple Java API, rather than writing SQL statements.

In summary, JPA is a specification and Hibernate is a popular implementation of the JPA specification that provides additional features and functionality not found in the standard JPA specification.
### 5.  What is Hiraki? what is the benefits of connection pool?
Hikari is a JDBC DataSource implementation that provides a connection pooling.<br>
benefits:
1. Improved Performance: Reusing existing connections to the database is faster than creating a new connection for each user request.

2. Reduced Overhead: Creating a new connection for each user request requires a significant amount of overhead in terms of time and resources. Connection pooling eliminates this overhead.

3. Scalability: Connection pooling makes it easier to scale a database-driven application to handle increasing numbers of users by allowing connections to be reused as needed.

### 6.  What is the  @OneToMany, @ManyToOne, @ManyToMany? write some examples.
The @OneToMany, @ManyToOne, and @ManyToMany annotations are used in JPA to define relationships between entities.<br>
[Example in annotations.md](annotations.md)

### 7. What is the  cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
The cascade attribute is used to specify how changes to the parent entity should affect the child entities. The CascadeType enumeration defines a number of options, including:

1. CascadeType.ALL: This option causes all operations (such as persist, remove, merge, and refresh) to be cascaded to the related entities.

2. CascadeType.PERSIST: This option causes only the persist operation to be cascaded to the related entities.

3. CascadeType.MERGE: This option causes only the merge operation to be cascaded to the related entities.

4. CascadeType.REMOVE: This option causes only the remove operation to be cascaded to the related entities.

5. CascadeType.REFRESH: This option causes only the refresh operation to be cascaded to the related entities.

The orphanRemoval attribute is used to specify whether the removal of an entity should also remove its related entities. When orphanRemoval is set to true, removing an entity will cause its related entities to be removed as well.

We choose which CascadeType to use based on our specific requirements for the relationship between entities. For example, if we want changes to a parent entity to affect all related entities, we would use CascadeType.ALL. If we only want to persist related entities when the parent entity is persisted, we would use CascadeType.PERSIST.

### 8.  What is the  fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
- FetchType.LAZY means that the related entities are not fetched from the database until they are explicitly accessed. This can help to improve performance in cases where you do not need all of the related entities for a given query.

- FetchType.EAGER means that the related entities are fetched from the database as soon as the parent entity is fetched. This can result in a larger amount of data being fetched from the database, but it can also help to avoid additional database queries if you need to access the related entities frequently.
<p>If we know that we will always need the related entities, and we want to avoid additional database queries, we may choose FetchType.EAGER.     
If we only need the related entities in some cases, and we want to minimize the amount of data fetched from the database, we choose FetchType.LAZY.

### 9.  What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
JPA naming conventions are rules that dictate how entity classes, attributes, and relationships should be named in order to work properly with JPA. There are no strict rules for naming conventions in JPA, but there are some commonly used conventions that help ensure that entities are mapped correctly to the underlying database

```java
findByCustomerId(customerId)
```
### 10. Try to use JPA advanced methods in your class project. In the repository layer,you need to use the naming convention to use the method provided by JPA.
### 11. (Optional) Check out a new branch(https://github.com/TAIsRich/springboot-redbook/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao layer using JdbcTemplate.
### 12. (Optional) use JDBC to read the data from database.
```java
public class ReadData {
  public static void main(String[] args) {
    try {
      // Load the JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      
      // Connect to the database
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "user", "password");
      
      // Create a statement
      Statement statement = connection.createStatement();
      
      // Execute a query
      ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
      
      // Iterate over the results
      while (resultSet.next()) {
        int id = resultSet.getInt("id");
        String title = resultSet.getString("title");
        String author = resultSet.getString("author");
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
      }
      
      // Close the connection
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
```
 
## part 2
### 1.  List all annotations you learned from class and homework to annotaitons.md
### 2.  type the code, you need to check out new branch from branch 02_post_RUD,name the new branch with https://github.com/TAIsRich/springboot-redbook/tree/hw05_01_slides_JPQL.
### 3.  What is JPQL?
JPQL (Java Persistence Query Language) is a query language used by JPA (Java Persistence API) to perform database operations on entities.  JPQL is similar to SQL, but operates on entities and their attributes instead of database tables and columns.  This allows developers to write database queries in a high-level, object-oriented way, rather than writing raw SQL.

### 4.  What is @NamedQuery and @NamedQueries?
@NamedQuery and @NamedQueries are JPA annotations that allow you to define named JPQL queries within an entity class.  Named queries are reusable, pre-defined JPQL queries that can be executed by name, rather than by writing out the entire JPQL statement.

The @NamedQuery annotation is used to define a single named query, while the @NamedQueries annotation is used to define multiple named queries.

### 5.  What is @Query? In which Interface we write the sql or JPQL?
@Query is a Spring Data JPA annotation that allows you to define custom SQL or JPQL queries to be executed by a JPA repository method. @Query is typically used when the query you want to execute cannot be expressed using the standard JPA query methods (such as findBy, save, etc.).

@Query allows you to write custom SQL or JPQL queries directly within your repository interface, using the value attribute. You can also specify any query parameters using the @Param annotation.

### 6.  What is HQL and Criteria Queries?
- HQL is a query language that is similar to SQL, but is specifically designed for querying Hibernate-managed entities. HQL queries are written using Hibernate's query language syntax, which includes entity names and properties instead of database tables and columns.
-  Criteria Queries are defined using the Criteria API, which provides a type-safe and fluent API for building queries.   Criteria Queries can be used to build queries that are more complex than simple HQL queries.

### 7. What is EnityManager?
EntityManager is an interface in the Java Persistence API (JPA) that provides a set of methods for performing CRUD (Create, Read, Update, Delete) operations on database entities. EntityManager is used to manage the persistence context, which is an in-memory representation of the database.

EntityManager is responsible for creating and managing entity instances, associating entities with the persistence context, and synchronizing the changes made to entities with the database.

### 8.  What is SessionFactory and Session?
- SessionFactory is a thread-safe and immutable object that is responsible for creating Session objects. SessionFactory is created only once per application and is typically stored as a singleton instance.
- Session is a lightweight and non-thread-safe object that represents a single unit of work with the database. Session is created by the SessionFactory, and is used to load, save, update, and delete entities. Session provides a set of methods for performing CRUD operations on entities, and is responsible for managing the persistence context.

### 9.  What is Transaction? how to manage your transaction?
A database transaction is a sequence of actions that are treated as a single unit of work.  These actions should either complete entirely or take no effect at all.  Transaction management is an important part of RDBMS-oriented enterprise application to ensure data integrity and consistency.  The concept of transactions can be described with the following four key properties described as ACID

### 10. What is hibernate Caching?
Hibernate caching is a mechanism that improves the performance of Hibernate applications by reducing the number of database queries that need to be executed. Caching can be used to store frequently accessed data in memory, so that it can be retrieved more quickly without needing to query the database.

### 11. What is the difference between first-level cache and second-level cache?
- First-level cache (also called session cache) is a cache that is associated with a single Hibernate Session, and is used to store the entities that are currently being managed by that session.   The first-level cache is enabled by default in Hibernate, and is used to reduce the number of database queries by caching the results of queries and entities that have already been loaded.   The first-level cache is not shared between sessions and is not visible to other sessions.

- Second-level cache is a cache that is shared by all Hibernate Sessions in an application, and is used to store the entities and queries that are frequently accessed by the application.    The second-level cache is more powerful than the first-level cache, as it is shared across multiple sessions and can reduce the number of queries needed to be executed.

### 12. How do you understand @Transactional? (不要clone，要自己抄写并测试transactional，https://github.com/TAIsRich/tutorial-transaction)

### 13. Write a simple factory design pattern.
```java
// Define an interface for the products to be created by the factory
interface Product {
    public void doSomething();
}

// Define some concrete implementations of the Product interface
class ConcreteProductA implements Product {
    public void doSomething() {
        System.out.println("Doing something in ConcreteProductA");
    }
}

class ConcreteProductB implements Product {
    public void doSomething() {
        System.out.println("Doing something in ConcreteProductB");
    }
}

// Define the Factory class that will create instances of the concrete products
class Factory {
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}

// Example usage of the Factory to create and use concrete products
public class Main {
    public static void main(String[] args) {
        // Create a ConcreteProductA object using the Factory
        Product productA = Factory.createProduct("A");
        productA.doSomething();
        
        // Create a ConcreteProductB object using the Factory
        Product productB = Factory.createProduct("B");
        productB.doSomething();
    }
}
```