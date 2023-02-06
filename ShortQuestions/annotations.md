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
