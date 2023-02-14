# HW10 Part2
### 1. List all of the annotations you learned from class and homework to annotaitons.md
Please check ShortQuestion/annotaitons.md file

### 2. type the code, you need to checkout new branch from branch 02_post_RUD, name the new branch with https://github.com/TAIsRich/springboot-redbook/tree/hw05_01_slides_JPQL.
Please check Coding/springboot-redbook-JPQL 

### 3. What is JPQL?
```
JPQL is Java Persistence Query Language defined in JPA specification. It is used to create queries against entities to store in a relational database. JPQL is developed based on SQL syntax. But it won’t affect the database directly.
```

### 4. What is @NamedQuery and @NamedQueries?
```
`@NameQueries` annotation is used to define the multiple named queries.
`@NameQuery` annotation is used to define the single named query.
```

### 5. What is @Query? In which Interface we write the sql or JPQL?
```
`@Query` defines a query that we can execute.
Repository interface.
```

### 6. What is HQL and Criteria Queries?
```
Hibernate Query Language (HQL) is an object-oriented query language, similar to SQL, but instead of operating on tables and columns, HQL works with persistent objects and their properties. HQL queries are translated by Hibernate into conventional SQL queries, which in turns perform action on database.

Criteria Queries enables us to write queries without doing raw SQL as well as gives us some object-oriented control over the queries. The Criteria API allows us to build up a criteria query object programmatically, where we can apply different kinds of filtration rules and logical conditions.
```

### 7. What is EnityManager?
```
The EntityManager is an API that manages the lifecycle of entity instances. An EntityManager object manages a set of entities that are defined by a persistence unit. Each EntityManager instance is associated with a persistence context.
```

### 8. What is SessionFactory and Session?
```
SessionFactory is a factory class for Session objects. It is available for the whole application while a Session is only available for particular transaction.
Session is short-lived while SessionFactory objects are long-lived. SessionFactory provides a second level cache and Session provides a first level cache.
```

### 9. What is Transaction? how to manage your transaction?
```
A transaction is a unit of work that is executed against a database. Transactions ensure that either all or none of the changes made to the database are committed, providing atomicity, consistency, and durability (ACID) guarantees.
We can use try catch and rollback to manage our transaction.
```

### 10. What is hibernate Caching?
```
Hibernate caching acts as a layer between the actual database and your application. It reduces the time taken to obtain the required data — as it fetches from memory instead of directly hitting the database. It is very useful when you need to fetch the same kind of data multiple times.
```

### 11. What is the difference between first-level cache and second-level cache?
```
The main difference between the first level and second level cache in Hibernate is that the first level is maintained at the `Session` level and accessible only to the Session, while the second level cache is maintained at the `SessionFactory` level and available to all Sessions. This means, you can use the first-level cache to store local data, i.e. the data which is needed by the Session, and you can use the second-level cache to store global data, i.e. something which can be shared across sessions.
```

### 12. How do you understand @Transactional? (不要clone，要自己抄写并测试 transactional，https://github.com/TAIsRich/tutorial-transaction)
Please check Coding/transcation directory

### 13. Write a simple factory design pattern.
Please check Coding/factory-pattern-example directory

