## Part1
1. List all of the annotations you learned from class and homework to annotaitons.md
2. Type the Comment feature for the class project.
3. In postman, call of the APIs in PostController and CommentController.
4. what is JPA? and what is Hibernate?
The Java Persistence API (JPA) is a specification of Java. It is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems. As JPA is just a specification, it doesn't perform any operation by itself. It requires an implementation. So, ORM tools like Hibernate, TopLink and iBatis implements JPA specifications for data persistence. Hibernate is a java framework and ORM (Object Relation Mapping) tool that is used to provide the implementation of the JPA methods. 
5. What is Hiraki? what is the benefits of connection pool?
Hikari is a JDBC DataSource implementation that provides a connection pooling mechanism. Compared to other implementations, it promises to be lightweight and better performing. 
6. What is the @OneToMany, @ManyToOne, @ManyToMany? write some examples.
* @OneToMany: As its name implies, it’s a relationship that links one entity to many other entities.
```
//Suppose we have these 2 entities
//Each teacher is responsible for different courses
@Entity
public class Teacher {
    // ...
    @OneToMany(mappedBy = "teacher")
    private List<Course> courses;
}
@Entity
public class Course {
    // ...
    private Teacher teacher;
}
```

* @ManyToOne: it’s a relationship that links many entities to one entity.
```
@Entity
public class Teacher {
    private List<Course> courses;
}
@Entity
public class Course {
    // ...
    
    @ManyToOne
    @JoinColumn(name = "TEACHER_ID", referencedColumnName = "ID")
    private Teacher teacher;
}
```

* @ManyToMany: it’s a relationship that links many entities to many entities.
```
\\ The Many-to-Many relationship will be the one between Student and Course 
\\ instances as a student can attend multiple courses, and a course
\\ can be followed by multiple students.
@ManyToMany
@JoinTable(
  name = "STUDENTS_COURSES",
  joinColumns = @JoinColumn(name = "COURSE_ID", referencedColumnName = "ID"),
  inverseJoinColumns = @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
)
private List<Student> students;
```
7. What is the cascade = CascadeType.ALL, orphanRemoval = true? and what are the other CascadeType and their features? In which situation we choose which one?
* ALL: CascadeType.ALL propagates all operations — including Hibernate-specific ones — from a parent to a child entity.
* PERSIST: The persist operation makes a transient instance persistent. Cascade Type PERSIST propagates the persist operation from a parent to a child entity. When we save the person entity, the address entity will also get saved
* MERGE:The merge operation copies the state of the given object onto the persistent object with the same identifier. CascadeType.MERGE propagates the merge operation from a parent to a child entity.
* REMOVE:As the name suggests, the remove operation removes the row corresponding to the entity from the database and also from the persistent context.
* REFRESH:Refresh operations reread the value of a given instance from the database. In some cases, we may change an instance after persisting in the database, but later we need to undo those changes.
* DETACH:The detach operation removes the entity from the persistent context. When we use CascadeType.DETACH, the child entity will also get removed from the persistent context.
The cascade attribute is set to CascadeType.ALL, meaning that all the JPA and Hibernate entity state transitions (e.g., persist, merge, remove) are passed from the parent Post entity to the PostComment child entities.

The orphanRemoval attribute is going to instruct the JPA provider to trigger a remove entity state transition when a PostComment entity is no longer referenced by its parent Post entity.

8. What is the fetch = FetchType.LAZY, fetch = FetchType.EAGER? what is the difference? In which situation you choose which one?
The FetchType.EAGER tells Hibernate to get all elements of a relationship when selecting the root entity. As I explained earlier, this is the default for to-one relationships, and you can see it in the following code snippets.The FetchType.LAZY tells Hibernate to only fetch the related entities from the database when you use the relationship. This is a good idea in general because there’s no reason to select entities you don’t need for your uses case. You can see an example of a lazily fetched relationship in the following code snippets.
9. What is the rule of JPA naming convention? Shall we implement the method by ourselves? Could you list some examples?
The JPA default table name is the name of the class (minus the package) with the first letter capitalized. We need to follow JPA naming convetion. It is not a good idea for us to implement the method by ourselves. Take findByLastnameOrFirstname(a, b) as an example. We must have lastname, firstname colmun name in our database. The value of a will give to lastname and the value of b will give to firstname.
10. Try to use JPA advanced methods in your class project. In the repository layer, you need to use the naming convention to use the method provided by JPA.

11. (Optional) Check out a new branch(https://github.com/TAIsRich/springboot-red
book/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao
layer using JdbcTemplate.
12. (Optional) use JDBC to read the data from database.


## Part2
1. List all of the annotations you learned from class and homework to annotaitons.md
2. type the code, you need to checkout new branch from branch 02_post_RUD, name the new branch with https://github.com/TAIsRich/springboot-redbook/tree/hw05_01_slides_JPQL.
3. What is JPQL?
JPQL is Java Persistence Query Language defined in JPA specification. It is used to create queries against entities to store in a relational database. JPQL is developed based on SQL syntax. But it won’t affect the database directly.
4. What is @NamedQuery and @NamedQueries?
@NameQuery annotation is used to define the single named query.  @NamedQueries is used to define multiple named queries.
5. What is @Query? In which Interface we write the sql or JPQL?
The @Query annotation takes precedence over named queries, which are annotated with @NamedQuery or defined in an orm. xml file. In repository interface.
6. What is HQL and Criteria Queries?
HQL is to perform both select and non-select operations on the data, but Criteria is only for selecting the data, we cannot perform non-select operations using criteria. 
7. What is EntityManager?
The EntityManager API is used to access a database in a particular unit of work. It is used to create and remove persistent entity instances, to find entities by their primary key identity, and to query over all entities.
8. What is SessionFactory and Session?
SessionFactory is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction. Session is short-lived while SessionFactory objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache.
9. What is Transaction? how to manage your transaction?
Transactions are a set of operations used to perform a logical set of work. A transaction usually means that the data in the database has changed. One of the major uses of DBMS is to protect the user’s data from system failures. It is done by ensuring that all the data is restored to a consistent state when the computer is restarted after a crash. The transaction is any one execution of the user program in a DBMS. Executing the same program multiple times will generate multiple transactions. 
10. What is hibernate Caching?
Hibernate caching acts as a layer between the actual database and your application. It reduces the time taken to obtain the required data — as it fetches from memory instead of directly hitting the database. It is very useful when you need to fetch the same kind of data multiple times.
11. What is the difference between first-level cache and second-level cache?
* First-level cache
    * Hibernate first level cache is session specific, that’s why when we are
getting the same data in same session there is no query fired whereas in
other session query is fired to load the data.
    * Hibernate first level cache can have old values — Two session works on
the same object, the second session update the object and save to
database, but it won’t reflect in the first session cache.
* Second-level cache : When an entity instance is looked up by its id and if
second-level caching is enabled for that entity, the following happens:
    * If an instance is already present in the first-level cache, it is returned
from there
    * If an instance is not found in the first-level cache, and the
corresponding instance state is cached in the second-level cache, then
the data is fetched from there and an instance is assembled and
returned
    *  Otherwise, the necessary data are loaded from the database and an
instance is assembled and returned
12. How do you understand @Transactional? (不要clone，要⾃⼰抄写并测试
transactional，https://github.com/TAIsRich/tutorial-transaction)
The @Transactional annotation is the metadata that specifies the semantics of the transactions on a method.
13. Write a simple factory design pattern.