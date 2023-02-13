### Common Annotations in Spring Boot project development

##### 1. @Configuration
example:
```
@Configuration 
class Configuration1{
@Bean
public DataSource dataSource(){
    return new AdvancedDataSource();
}
}
```
As is shown above, we could see that @Configuration is typicall used in together with @Bean, which means that we could make the object annotated with @Bean added to our spring containers so that we could utilize it somewhere else.

##### 2.@EnableAutoConfiguration
example:
```
@EnableAutoConfiguration
class MainApplication{
public static void main(String... args){
SpringApplication.run(MainApplications.class,args);
}
}
```
This is to enable auto configuration of our spring boot project.

##### 3.@ComponentScan
example:
```
@EnableAutoConfiguration
@ComponentScan
class MainApplication{
public static void main(String... args){
SpringApplication.run(MainApplications.class,args);
}
}
```
@ComponentScan by default is to scan all the sub-packages or current packages of the packages of our current class, and add those objects to our spring containers.

##### 4. @SpringBootApplication
example:
```
@SpringBootApplication
class MainApplication{
public static void main(String... args){
SpringApplication.run(MainApplications.class,args);
}
}
```
In order to give more convenience to developers, spring framework provide us with a more efficient way of starting our project @SpringBootApplication is the combination of both @ComponentScan and @EnableAutoConfiguraion so that we could immediately start our development.

##### 5. @Controller, @Service, @Repository and @Component
example:
```
@Controller
@RequestingMapping("user")
class UserController{
@GetMapping("{id}")
public ResponseEntity<User> getSpecificUser(@PathVariable("id")int id){
    return ....;
}
}
```
example:
```
@Service
@Transactional
class UserServiceImpl implements UserService{

}
```
Actually, these annotations have the same function that could make the objects added to the spring containers. However, they have different names, because spring framework could make developers clear that what the class is used to do at first glance.

##### 6.@RequestMapping, @GetMapping, @PutMapping, @PostMapping, @DeleteMapping
These annotations are used to conveniently extract the variables coming from the user request, and to efficiently respond to different kinds of requests.
And their usages are very simple:
Example:
```
@Controller
@RequestingMapping("user")
class UserController{
@GetMapping("{id}")
public ResponseEntity<User> getSpecificUser(@PathVariable("id")int id){
    return ....;
}
@PostMapping
public ResponseEntity<Void> createUser(@RequestBody User user){
    return ....;
}
@DeleteMapping("{id}")
public ResponseEntity<Void> deleteUser(@PathVariable("id")int id){
    return ....;
}
@PutMapping
public ResponseEntity<Void> updateUser(@RequestBody User user){
    return ....;
}
}
```

##### 7.@EnableConfigurationProperties and @ConfigurationProperties
These two annotations are used in combination with @Configuration to enable developers to efficiently extract the configuration properties from application.yml or application.properties
Example:
```
//Could read the properties prefixed with jdbc from application.yml
@ConfigurationProperties(prefix="jdbc")
class JdbcProperties{
private String className;
private String driverName;
.....Getter and Setter
}
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
class JdbcConfiguration{
@Autowired
private JdbcProperties properites;
@Bean
public DataSource dataSource(){
DataSource dataSource = new AdvancedDataSource();
dataSource.setDriverName(properties.getDriverName());
return dataSource;
}
}
```

##### 8. @PropertySource and @Value
This is used to read properties from .properties file in the resource directory, just as @ConfigurationProperties(prefix="") does
```
@PropertySource("classpath:jdbc.properties")
class JdbcProperties{
@Value("jdbc.username")
private String username
}
```

##### 9. @Entity @Table @Id @GeneratedValue @Column
These two annotations are used to map the object to the table, we could use the field in @Table to specify which table the object would going to be mappined to, and GeneratedValue could be used to notify the JPA framework that how to generate the primary key for each record, and @Column could be used to map the field to the table's field in the database.
```
@Entity
@Table(
    name = "posts",
    uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Post{
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(name = "title",nullable=false)
    private String title;
}
```

##### 10. @OneToOne @JoinColumn @ManyToOne @ManyToMany and @JoinTable
These annotations are used to represent the complicated relationship between different entities in our project, and also helps the JPA framework to determine if the corresponding operation should be also performed in its relevant entities.

```
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(name = "sku_inventory",
    joinColumns = @JoinColumn(name = "sku_id"),
    inverseJoinColumns = @JoinColumn(name = "inventory_id")
   )
private Set<PmsInventory> pmsInventories = new HashSet<>();

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "post_id", nullable = false)
private Post post;
```

##### 11. @Transactional
This annotation could be used to automatically create a transaction for your database operations, if one operation fails, then all the operations would be rolled back.And @Transactional could be specified in a class or a method

```
@Transactional
public void transferMoney(){
bankRepository.deductFromMyAccount(2000);
bankRepository.depositToAccount(2000,"asdas");
}
```

##### 12. @NamedQueries
This is the annotation that allows you to customize your own query sentence:
```
@Entity
@NamedQueries({
    @NamedQuery(name = "Book.findByTitle", query = "SELECT b FROM Book b WHERE b.title = :title"),
    @NamedQuery(name = "Book.findByPublishingDate", query = "SELECT b FROM Book b WHERE b.publishingDate = :publishingDate")
})
public class Book implements Serializable {
...
}

@PersistenceContext
EntityManager entityManager;
@Override
public List<Post> getAllPostWithJPQL() {
TypedQuery<Post> posts = entityManager.createNamedQuery("get_all_posts", Post.class);
return posts.getResultList();
}
```

##### 13. @Query
This could also allow us to customize the query, however, we do not need to obey the JPA name conventions while using this annotation:

```
@Query("select p from Post p where p.id = :key or p.title = :title")
Post getPostByIDOrTitleWithJPQLNamedParameters(@Param("key") Long id,@Param("title") String title);
```