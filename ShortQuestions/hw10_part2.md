### Homework10 Part2

Name: Zijun Zhou

##### 1. List all of the annotations you learned from class and homework to `annotaitons.md`
The `annotations.md` is now updated as needed.

##### 2. type the code, you need to checkout new branch from branch 02_post_RUD, name the new branch with `https://github.com/TAIsRich/springboot-redbook/tree/hw05_01_slides_JPQL`.
The code is included in MavenProject/

##### 3. What is JPQL?
JPQL is Java Persistence Query Language defined in JPA specification. It is used to create queries against entities to store in a relational database. JPQL is developed based on SQL syntax. But it won’t affect the database directly.

##### 4. What is @NamedQuery and @NamedQueries?
@NameQueries annotation is used to define the multiple named queries, while @NameQuery annotation is used to define the single named query.

##### 5. What is @Query? In which Interface we write the sql or JPQL?
@Query allows us to customize the query, and we could write query ourselves, by convention, we will write the sql or JPQL in our repository interfaces.

##### 6. What is HQL and Criteria Queries?
HQL is to perform both select and non-select operations on the data,  but Criteria is only for selecting the data, we cannot perform non-select operations using criteria
HQL is suitable for executing Static Queries, where as Criteria is suitable for executing Dynamic Queries
HQL doesn’t support pagination concept, but we can achieve pagination with Criteria
Criteria used to take more time to execute then HQL
With Criteria we are safe with SQL Injection because of its dynamic query generation but in HQL as your queries are either fixed or parametrized, there is no safe from SQL Injection.

##### 7. What is EnityManager?
An EntityManager instance is associated with a persistence context. A persistence context is a set of entity instances in which for any persistent entity identity there is a unique entity instance. Within the persistence context, the entity instances and their lifecycle are managed. The EntityManager API is used to create and remove persistent entity instances, to find entities by their primary key, and to query over entities.
The set of entities that can be managed by a given EntityManager instance is defined by a persistence unit. A persistence unit defines the set of all classes that are related or grouped by the application, and which must be colocated in their mapping to a single database.



##### 8. What is SessionFactory and Session?
SessionFactory is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction. Session is short-lived while SessionFactory objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache.
##### 9. What is Transaction? how to manage your transaction?
Transactions are a set of operations used to perform a logical set of work. A transaction usually means that the data in the database has changed. One of the major uses of DBMS is to protect the user’s data from system failures. It is done by ensuring that all the data is restored to a consistent state when the computer is restarted after a crash. The transaction is any one execution of the user program in a DBMS. Executing the same program multiple times will generate multiple transactions. 
##### 10. What is hibernate Caching?
Hibernate caching acts as a layer between the actual database and your application. It reduces the time taken to obtain the required data — as it fetches from memory instead of directly hitting the database. It is very useful when you need to fetch the same kind of data multiple times.
##### 11. What is the difference between first-level cache and second-level cache?
The first level cache is associated with the Session Object, while the second-level cache is associated with the SessionFactory object. This means first-level cache's scope is limited to session-level while second-level cache's scope is at the application level.

##### 12. How do you understand @Transactional?
when a class declares @Transactional on itself or its members, Spring creates a proxy that implements the same interface(s) as the class you’re annotating. In other words, Spring wraps the bean in the proxy and the bean itself has no knowledge of it. A proxy provides a way for Spring to inject behaviors before, after, or around method calls into the object being proxied.
In addition, the Spring makes sure the methods that are annotated with @Transactional finish the transaction altogether, which means if one operation fails, then all the operations would roll back. Only if all the operations perform successfully will Spring commit them to the database.

##### 13. Write a simple factory design pattern.
```
public abstract class Shape{
protected int size;
public int getSize(){
    return size;
}
}
public class Circle extends Shape{
}
public class Rectangle extends Shape{
}
public class ShapeFactory{
public Shape getShape(String shapeName){
 if(shapeName.equals("Circle"))
 return new Circle();
 else
 return new Rectangle();
}
}

```