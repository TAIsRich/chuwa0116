# HW42-Spring-Data
1. List all of the annotations you learned from class and homework to
annotations.md
2. Type the Comment feature for the class project
3. In postman, call of the APIs in PostController and CommentController
4. what is JPA? and what is Hibernate?
   * JPA: Java Persistence API is a specification of Java, it is often utilized to 
     persist the data transferred between Java object and relational database. To put
      it simply, JPA acts as the bridge between object-oriented domain models and relational database systems.
   * Hibernate: Hibernate is a framework that simplifies the development of Java application to interact with the
     database and it's also called an ORM(Object Relational Mapping) tool. Hibernate implements the specifications of JPA
     for data persistence.
5. What is Hikari? what is the benefits of connection pool?
   * Hikari is a light weight JDBC connection pooling framework.
   * Benefits of connection pool:
     1. Reduces the number of times new connection objects are created
     2. Promotes connection object reuse
     3. Reduces amount of time to manually manage the connection objects
     4. Reduces the number of stale connections
6. What is the  `@OneToMany`, `@ManyToOne`, `@ManyToMany`? write some examples.
    * `@OneToMany`: Current class object may contains multiple objects of another class
    ```java
    @OneToMany(mappedBy = "posts", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments = new HashSet<>();
    ```
    * `@ManyToOne`: Current class objects may be included into on objects of another class
    ```java
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;
    ```
    * `@ManyToMany`: Current class object may contains multiple objects of another class, and vice versa
    ```java
        @ManyToMany(fetch = FetchType.LAZY)
        @JoinTable(name = "sku_inventory",
                joinColumns = @JoinColumn(name = "sku_id"),
                inverseJoinColumns = @JoinColumn(name = "inventory_id"))
        private Set<PmsInventory> pmsInventories = new HashSet<>();
    ```
7. What is the `cascade = CascadeType.ALL, orphanRemoval = true`? and what
   are the other CascadeType and their features? In which situation we choose
   which one?
   * All cascading operations on owning entity will be applied to related entity, and 
    if the parent entity is gone, it's related child entity will be removed.
   * CascadeType:
     1. Persist: makes a transient instance persistent
     2. Merge: copies the states of the given object onto the persistent object with the same identifier
     3. Refresh: rereads the value of a given instance from the database
     4. Remove: removes the row corresponding the entity from the database and from the persistence context
     5. Detach: removes the entity from the persistent context
     6. All: all the operations above
8. What is the `fetch = FetchType.LAZY, fetch = FetchType.EAGER`? what is the
   difference? In which situation you choose which one?
   * `LAZY`: load the current field on-demand, use it when the fields to be loaded could take up too many storage space
   * `EAGER`: load the current filed along with other files in the entity, use it when the current field does not take
     up too much storage space
9. What is the rule of JPA naming convention? Shall we implement the method by
   ourselves? Could you list some examples?
   * Example: `findByLastnameOrFirstname(a, b)`
     * `lastname` and `firstname` must be the column name in the table
     * `find`, `By`, `Or` is the namespace provided by JPA.
   * No we don't need to implement the method by ourselves as long as we follow the naming conventions
   * More examples:
     1. findByLastnameAndFirstname(a, b)
     2. findByLastnameOrFirstname(a, b)
     3. findByStartDateBetween(a, b)
10. Try to use JPA advanced methods in your class project. In the repository layer,
    you need to use the naming convention to use the method provided by JPA.
    * Practice: in the `Comment` repository interface, we defined: `List<Comment> findByPostId(long postId);` which
      is an example of following the JPA naming conventions, and when we call this method in our services, we don't 
      need to implement it, because JPA has already taken care of it.
11. (Optional) Check out a new branch(https://github.com/TAIsRich/springboot-red
    book/tree/hw02_01_jdbcTemplate) from branch 02_post_RUD, replace the dao
    layer using JdbcTemplate.
12. (Optional) use JDBC to read the data from database.

# HW43-Spring-Data-Part2
1. List all of the annotations you learned from class and homework to
   annotation.md
   * See annotation.md
2. type the code, you need to checkout new branch from branch 02_post_RUD.
   * See `Coding/hw42/redbook`