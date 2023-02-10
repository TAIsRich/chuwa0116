## what is JPA? and what is Hibernate?
`JPA` It is a Java specification that gives some functionality and standard to ORM tools. It is used to examine, control, and persist data between Java objects and relational databases. It is observed as a standard technique for Object Relational Mapping.

It is considered as a link between an object-oriented model and a relational database system. As it is a specification of Java, JPA does not conduct any functioning by itself. Therefore, it needs implementation. Hence, for data persistence ORM tools like Hibernate implements JPA specifications. For data persistence, the javax.persistence package contains the JPA classes and interfaces.

`Hibernate` is an open source object relational mapping (ORM) tool that provides a framework to map object-oriented domain models to relational databases for web applications.

Object relational mapping is based on the containerization of objects and the abstraction that provides that capacity. Abstraction makes it possible to address, access and manipulate objects without having to consider how they are related to their data sources.

The Hibernate ORM framework guides mapping Java classes to database tables and Java data types to SQL data types and provides querying and retrieval.

## What is Hiraki? what is the benefits of connection pool?

`Hikari` is a JDBC DataSource implementation that provides a connection pooling mechanism.

A connection pool provides the following benefits:

- Reduces the number of times new connection objects are created.

- Promotes connection object reuse.

- Quickens the process of getting a connection.

- Reduces the amount of effort required to manually manage connection objects.

- Minimizes the number of stale connections.

- Controls the amount of resources spent on maintaining connections.

## What is the  `@OneToMany`, `@ManyToOne`, `@ManyToMany`? write some examples.

'@OneToOne'

![](https://res.cloudinary.com/practicaldev/image/fetch/s--QwlsN_Gc--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/i/hdbf72ngsufth4g8xegg.png)

A student is associated with a tuition and that tuition is associated with a unique student.

```java
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch=FetchType.LAZY)
    private Tuition tuition;

    /* Getters and setters */   
}
```

```java
@Entity
@Table(name = "tuition")
public class Tuition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double fee;

    //what column in Tuition table has the FK
    @JoinColumn(name = "student_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Student student;

    /* Getters and setters */    
}
```

`@OneToMany` (bidirectional)

![](https://res.cloudinary.com/practicaldev/image/fetch/s--gp7bBb5U--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/i/j31nmxtn3fx9ixqnfbf8.png)

University can have many students so in university class we will have the @OneToMany. A student is associated with just one university that's why we use the `@ManyToOne` in student class.

```java
@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "university", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students;

    /* Getters and setters */
}
```

```java
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "university_id")
    private University university;

    /* Getters and setters */
}
```

`@OneToMany` (unidirectional)

```java
@Entity
@Table(name = "university")
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "university_id")
    private List<Student> students;

    /* Getters and setters */
}
```

`@ManyToMany` (bidirectional)

![](https://res.cloudinary.com/practicaldev/image/fetch/s--Elsja-70--/c_limit%2Cf_auto%2Cfl_progressive%2Cq_auto%2Cw_880/https://dev-to-uploads.s3.amazonaws.com/i/rpkmv0iv2sh39dt2kj24.png)

```java
@Entity
@Table(name="course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double fee;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;

    /* Getters and setters */
}
```

```java
@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "student_course",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id")}
    )
    private Set<Course> courses;

    /* Getters and setters */
}
```

## What is the  cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?

1. **CascadeType.PERSIST**: cascade type persist means that save() or persist() operations cascade to related entities.
2. **CascadeType.MERGE**: cascade type merge means that related entities are merged when the owning entity is merged.
3. **CascadeType.REFRESH**: cascade type refresh does the same thing for the refresh() operation.
4. **CascadeType.REMOVE**: cascade type remove removes all related entities association with this setting when the owning entity is deleted.5. 
5. **CascadeType.DETACH**: cascade type detach detaches all related entities if a “manual detach” occurs.
6. **CascadeType.ALL**: cascade type all is shorthand for all of the above cascade operations.

7. **orphanRemoval = true** When a target entity in one-to-one or one-to-many relationship is removed from the relationship, it is often desirable to cascade the remove operation to the target entity. Such target entities are considered “orphans,” and the orphanRemoval attribute can be used to specify that orphaned entities should be removed. For example, if an order has many line items and one of them is removed from the order, the removed line item is considered an orphan. If orphanRemoval is set to true, the line item entity will be deleted when the line item is removed from the order.

## What is the  `fetch = FetchType.LAZY`, `fetch = FetchType.EAGER`? what is the difference? In which situation you choose which one?

Sometimes you have two entities and there's a relationship between them. For example, you might have an entity called University and another entity called `Student` and a `University` might have many Students:

The University entity might have some basic properties such as id, name, address, etc. as well as a collection property called students that returns the list of students for a given university

![](https://i.stack.imgur.com/N1PL3.png)

```java
public class University {
   private String id;
   private String name;
   private String address;
   private List<Student> students;

   // setters and getters
}
```

Now when you load a `University` from the database, JPA loads its id, name, and address fields for you. But you have two options for how `students` should be loaded:

1. To load it together with the rest of the fields (i.e. eagerly), or
2. To load it on-demand (i.e. lazily) when you call the university's `getStudents()` method.
When a university has many students it is not efficient to load all of its students together with it, especially when they are not needed and in suchlike cases you can declare that you want students to be loaded when they are actually needed. This is called lazy loading.

## What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?

https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.namespace-reference

Yes

findEmailByName("Tom")

countOrderByName("Sam")

