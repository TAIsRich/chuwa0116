# hw42-spring-data-0213 - Hao Jia


### what is JPA? and what is Hibernate?
+ JPA (Java Persistence API) is a Java specification for accessing, persisting, and managing data between Java objects and relational databases. It provides a standard API for performing CRUD (create, read, update, delete) operations on database tables, as well as defining and managing relationships between tables.
+ Hibernate is a popular and widely used implementation of the JPA specification. It is an open-source framework that provides a set of APIs and tools for mapping Java objects to relational database tables and vice versa. Hibernate simplifies the process of accessing and storing data in a database by providing a high-level, object-oriented API for database operations. With Hibernate, developers can write Java code to interact with a database without having to write the low-level SQL code required to manipulate the data stored in the database.

### What is Hiraki? what is the benefits of connection pool?
+ Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism
+ Connection pools promote the reuse of connection objects and reduce the number of times that connection objects are created.

### What is the  @OneToMany, @ManyToOne, @ManyToMany? write some examples.
+ @OneToMany is a unidirectional relationship where one entity (the owner) has multiple instances of another entity (the target).
```java
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Employee> employees;
}

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
```

+ @ManyToOne is a bidirectional relationship where many entities (the targets) are related to one entity (the owner).
```java
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Department department;
}

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
```
+ @ManyToMany is a bidirectional relationship where many entities (the sources) are related to many other entities (the targets).
```java
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany
    private List<Course> courses;
}

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;
}

```

### What is the  cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
cascade=CascadeType.ALL is an attribute used in JPA to indicate that when an operation is performed on the owner of a relationship, the same operation should be performed on the related entities as well. The CascadeType.ALL value indicates that all cascade operations (i.e., PERSIST, MERGE, REMOVE, REFRESH, and DETACH) should be cascaded to the related entities.

orphanRemoval=true is an attribute used in JPA to indicate that when an entity is removed from a relationship, it should also be removed from the database.

Other CascadeType values include:
+ CascadeType.PERSIST: Indicates that persist operations should be cascaded to the related entities.
+ CascadeType.MERGE: Indicates that merge operations should be cascaded to the related entities.
+ CascadeType.REFRESH: Indicates that refresh operations should be cascaded to the related entities.
+ CascadeType.DETACH: Indicates that detach operations should be cascaded to the related entities.
+ CascadeType.REMOVE: Indicates that remove operations should be cascaded to the related entities.

### What is the  fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? 
+ FetchType.LAZY indicates that the related entities should be fetched only when they are first accessed. This means that when the parent entity is fetched from the database, the related entities are not fetched at the same time. Instead, they are fetched only when they are first accessed. This is known as lazy loading.
+ FetchType.EAGER indicates that the related entities should be fetched along with the parent entity when the parent entity is fetched from the database. This is known as eager loading.

The choice of which FetchType to use depends on the specific requirements of the application and the desired behavior of the relationship between entities. If the related entities are rarely accessed and the performance overhead of fetching them is significant, you may choose to use FetchType.LAZY. If the related entities are frequently accessed and the performance overhead of fetching them is not significant, you may choose to use FetchType.EAGER.

### What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
+ For entities, it is common to name the class in CamelCase, starting with a capital letter, such as Department or Employee.
+ For attributes, it is common to name them in camelCase, starting with a lowercase letter, such as employeeId or departmentName.

```java
@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Employee> employees;

    public int getEmployeeCount() {
        return employees.size();
    }
}
```

### What is JPQL?
JPQL (Java Persistence Query Language) is a database-agnostic query language used in Java Persistence API (JPA) to perform operations on entities stored in a database. JPQL is similar in syntax and functionality to SQL, but operates on entities and their attributes rather than tables and columns in a database.

With JPQL, you can perform operations such as retrieving, updating, and deleting data from the database in a type-safe and database-agnostic manner. JPQL queries are defined as strings and can be executed by the JPA framework to retrieve data from the database and return the results as entities or values.

```java
String jpql = "SELECT d FROM Department d";
Query query = entityManager.createQuery(jpql);
List<Department> departments = query.getResultList();

```

### What is @NamedQuery and @NamedQueries?
@NamedQuery and @NamedQueries are annotations used in JPA to define named queries. Named queries are JPQL queries that are pre-defined and stored at the class level of an entity, allowing you to reuse the same query multiple times throughout your application.

### What is @Query? In which Interface we write the sql or JPQL?
@Query is a Spring Data JPA annotation that allows you to define a query to be executed by the repository directly, bypassing the default query generation mechanism. The query can be written in JPQL or in SQL, depending on the type of the underlying database.
```java
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("SELECT d FROM Department d WHERE d.name = :name")
    List<Department> findByName(@Param("name") String name);
}
```
@Query annotation can be used in any interface that extends JpaRepository or any of its subinterfaces, such as CrudRepository or PagingAndSortingRepository. The query can be written in JPQL or SQL, depending on the type of the underlying database.

### What is HQL and Criteria Queries?
+ HQL (Hibernate Query Language) is a proprietary, object-oriented query language that is used to query data in Hibernate. HQL is similar to SQL, but operates on objects and properties of persistent classes rather than on tables and columns. HQL provides a way to express complex queries in a compact and expressive syntax.
```java
String hql = "FROM Department d WHERE d.name = :name";
Query query = session.createQuery(hql);
query.setParameter("name", "IT");
List<Department> departments = query.list();
```
+ Criteria Queries, on the other hand, are a programmatic way of building and executing queries in Hibernate. Criteria Queries are created using the Criteria API, which provides a type-safe and type-aware way of constructing queries.
```java
Session session = sessionFactory.openSession();
Criteria criteria = session.createCriteria(Department.class);
criteria.add(Restrictions.eq("name", "IT"));
List<Department> departments = criteria.list();
session.close();
```

### What is EnityManager?
The EntityManager is a central component of the Java Persistence API (JPA). It is an interface that provides a set of APIs for managing the persistence of entities in a database. The EntityManager is responsible for performing the CRUD (Create, Read, Update, Delete) operations on entities, as well as for managing transactions and caching.

The EntityManager can be accessed using the @PersistenceContext annotation in a JPA-based application. Once an EntityManager has been injected into a component, it can be used to interact with the database and perform persistence operations on entities.

### What is SessionFactory and Session?
SessionFactory and Session are core components of the Hibernate framework, which is a Java-based ORM (Object-Relational Mapping) tool. They are used to manage the persistence of entities in a database.

SessionFactory is a factory object that creates Session objects. It is responsible for establishing a connection to the database, caching metadata information about the entities being persisted, and managing the first-level cache (also known as the session cache) of entities. The SessionFactory is a heavyweight object and is typically created only once in a J2EE application, and then used to create multiple Session objects.

Session is an interface that represents a unit of work with the database. It is used to perform CRUD (Create, Read, Update, Delete) operations on entities, as well as to manage transactions. The Session is a lightweight object and is created each time a persistence operation is performed. Once a Session has been created, it can be used to perform multiple persistence operations.

### What is Transaction? how to manage your transaction?
A transaction is a unit of work that is performed against a database. In the context of a persistence framework such as JPA or Hibernate, a transaction is a series of operations that are executed against the database as a single unit of work. The main purpose of a transaction is to ensure that all operations are executed atomically, meaning that either all operations are executed successfully or none of them are executed.

Transactions are managed using the EntityTransaction interface in JPA and the Transaction interface in Hibernate.

### What is hibernate Caching?
Hibernate caching refers to the process of caching data and objects in memory in order to improve the performance of database operations. Hibernate provides a number of different caching options to optimize performance for different use cases.

### What is the difference between first-level cache and second-level cache?
+ First-level caching is enabled by default and is managed by the Session object. It caches data and objects in memory for the duration of a single Session. This helps to reduce the number of database queries that are executed, as Hibernate can retrieve data from the first-level cache instead of querying the database.
+ Second-level caching is a more advanced form of caching that caches data and objects across multiple Session objects. This can help to improve performance even further, as the data is cached in memory and can be reused by multiple Session objects without having to hit the database. Hibernate provides a number of different second-level caching providers, including EhCache, Hazelcast, and Infinispan, that can be used to implement second-level caching.

### Write a simple factory design pattern
```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

```

