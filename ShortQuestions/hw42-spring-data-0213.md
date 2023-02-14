# Q4

- JPA (Java Persistence API) is a specification of Java which is used to access, manage, and persist data between Java object and relational database. It is considered as a standard approach for Object Relational Mapping.
  JPA can be seen as a bridge between object-oriented domain models and relational database systems. Being a specification, JPA doesn't perform any operation by itself. Thus, it requires implementation. So, ORM tools like Hibernate, TopLink, and iBatis implements JPA specifications for data persistence.
- A Hibernate is a Java framework which is used to store the Java objects in the relational database system. It is an open-source, lightweight, ORM (Object Relational Mapping) tool.
  Hibernate is an implementation of JPA. So, it follows the common standards provided by the JPA.

# Q5

Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism. Compared to other implementations, it promises to be lightweight and better performing.

Connection pools promote the reuse of connection objects and reduce the number of times that connection objects are created. Connection pools significantly improve performance for database-intensive applications because creating and closing connection objects is costly both in terms of time and resources.

# Q6

```
@Entity
class Post {
    @Id
    private Long id;

    @OneToMany(mappedBy = "post")
    private Set<Comment> comments;

    ...
}

@Entity
class Comment {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
    ...
}
```

```
@Entity
class Student {
    @Id
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColunms = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses;

    ...
}

@Entity
class Course {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;
}
```

# Q7

```cascade = CascadeType.ALL``` means all cascade operations on parent table applied to child table. ```orphanRemoval = true``` means orphan record would be deleted automatically.

# Q8

- Eager fetch means that when a record is fetched from the database, all the associated records from related tables are also fetched.
- Lazy fetch means that the associated record will not be fetched from the database untill it it needed.

# Q9

Spring uses lower snake case by default, which means it uses only lower case letters and separates words with underscores.

====================================================================================================================================================================================================

# Q3

JPQL is Java Persistence Query Language defined in JPA specification. It is used to create queries against entities to store in a relational database.

# Q4

```@NameQuery``` annotation is used to define the single named query. ```@NameQueries``` means multiple ```@NameQuery```.

# Q5

The @Query annotation can only be used to annotate repository interface methods.

# Q6

Hibernate Query Language (HQL) is an object-oriented query language, similar to SQL, but instead of operating on tables and columns, HQL works with persistent objects and their properties.

# Q7

An EntityManager instance is associated with a persistence context

# Q8

The SessionFactory in Hibernate is responsible for the creation of Session objects. The Hibernate Session provides methods such as save, delete and update, all of which are used to perform CRUD-based operations on the database to which the SessionFactory connects.

# Q9

A database transaction is a sequence of actions that are treated as a single unit of work. 

# Q10

Hibernate caching acts as a layer between the actual database and your application. It reduces the time taken to obtain the required data — as it fetches from memory instead of directly hitting the database. It is very useful when you need to fetch the same kind of data multiple times.
