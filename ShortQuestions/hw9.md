2. how do you do the debug?

I will use IDE to indicate some point and use postman send json using apis, and then debug in IDE

3. What is DTO, VO, Payload, DO?

DTO is data transfer object, formerly known as value objects or VO. 

The payload means body in the HTTP request and response message. It's optional and depends on the HTTP method name i.e.,

A DO is a plain data object that holds data. It's used to represent data in a simple and straightforward way, without having any behavior or methods.

4. What is @JsonProperty("description_yyds") (不会的话，课上问)?

@JsonProperty(name), tells Jackson ObjectMapper to map the JSON property name to the annotated Java field's name. @JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.

5. do you know what is jackson?

Jackson is a very popular and efficient java based library to serialize or map java objects to JSON and vice versa. 

6. What is spring-boot-stater?

a. what dependecies in the below starter? do you know any starters?

Spring boot

In the world of Spring Boot, there is: starters! Starters are a set of convenient dependency descriptors that you can include in your application. You get a one-stop–shop for all the Spring and related technologies that you need without having to hunt through sample code and copy-paste loads of dependency descriptors

7. do you know @RequestMapping(value = "/users", method = RequestMethod.POST) ? could you list CRUD by this style?

ref: https://blog.csdn.net/ZZBvos/article/details/127267191?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522167571522116800225536999%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=167571522116800225536999&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_click~default-2-127267191-null-null.142^v73^pc_new_rank,201^v4^add_ask,239^v1^insert_chatgpt&utm_term=%40RequestMapping&spm=1018.2226.3001.4187

Value attribute is an array of a string type, indicating that the request mapping can match the request corresponding to multiple CRUD method. In this questions, the restapi use a POST method.

    ```
    @RestController
    @RequestMapping("/users")
    public class UserController {

    @PostMapping
    public User createUser(@RequestBody User user) {
        // Implementation for creating a new user
    }

    @GetMapping
    public List<User> getAllUsers() {
        // Implementation for retrieving a list of all users
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        // Implementation for retrieving a single user by id
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        // Implementation for updating an existing user
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        // Implementation for deleting a user
    }
    }

    ```

8. What is ResponseEntity? why do we need it?

ResponseEntity will give you some added flexibility in defining arbitrary HTTP response headers. See the 4th constructor here. If you don't need that, using @ResponseBody will be a tiny bit more concise.

9. What is ResultSet in jdbc? and describe the flow how to get data using JDBC

ResultSet interface represents the result set of a database query. A ResultSet object maintains a cursor that points to the current row in the result set. The term "result set" refers to the row and column data contained in a ResultSet object.

Querying Data From MySQL Using JDBC

Connection conn = DriverManager.getConnection(url,username,password); ...

Connection conn = MySQLJDBCUtil.getConnection() ...

Statement stmt = conn.createStatement(); ...

String sql = "SELECT first_name, last_name, email " + "FROM candidates"; ResultSet rs = stmt.executeQuery(sql)

10. What is the ORM framework?

ORM – The Meaning of Object Relational Mapping Database Tools.

Object Relational Mapping (ORM) is a technique used in creating a "bridge" between object-oriented programs and, in most cases, relational databases.

12. What is the serialization and desrialization

ref: https://hazelcast.com/glossary/serialization/

Serialization is the process of converting a data object—a combination of code and data represented within a region of data storage—into a series of bytes that saves the state of the object in an easily transmittable form. In this serialized form, the data can be delivered to another data store (such as an in-memory computing platform), application, or some other destination.

The reverse process—constructing a data structure or object from a series of bytes—is deserialization. The deserialization process recreates the object, thus making the data easier to read and modify as a native structure in a programming language.

13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32]

    public class Main {
        public static void main(String[] args) {
            int[] array = new int[]{20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
            double res = Arrays.stream(array).average().getAsDouble();
            System.out.println(res);
        }
        
    }

16. Try to write the CRUD api for a new application Cassandra-Blog

Please see codes in Coding/coding9

