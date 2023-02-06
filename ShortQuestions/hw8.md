1.  List all of the new annotations to your annotations.md and explain its role
    * Please check annotations.md
2.  How do you do the debug?
    * Normally I would set break points using IDE, and check the local variables.
    * If the program is not too large, then simply by printing the variable onto the display works as well.
3.  What is DTO, VO, Payload, DO?
    * DTO: Data Transfer Object is a class that could hold the response data from the remote server call, 
      which is the JSON file translated into the Java object format.
    * VO: Value-Object is a class that represent a set of fixed data, similar to `enum`
    * Payload: the data your send during your API request (GET, POST, DELETE, PUT, etc.).
4.  What is @JsonProperty("description_yyds") (不会的话，课上问)?
    * tells Jackson ObjectMapper to map the JSON property name to the annotated Java field's name.
5.  Do you know what is jackson?
    * Jackson is a useful tool to map java object to JSON and vice versa.
       * Jackson is a very popular and efficient java based library to serialize or map java objects to JSON 
         and vice versa. This tutorial will teach you basic and advanced Jackson library API features and their usage 
         in a simple and intuitive way.
6.  What is spring-boot-stater?
    spring-boot-stater is a dependency descriptor that can be added under the `<dependencies>` section in pom.xml, so
    developer don't have to spend too much time adding the dependency in the project
    1. what dependencies in the below starter? do you know any starters?
        We use the below starter to build web including RESTful applications using Spring MVC.
        ```xml
       <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-starter-web</artifactId>
       </dependency>
       ```
       Other starters:
       1. `spring-boot-starter` Core starter, including auto-configuration support, logging, and YAML
       2. `spring-boot-starter-data-cassandra` Starter for using Cassandra distributed database and Spring Data Cassandra
       3. `spring-boot-starter-data-jpa` Starter for using Spring Data JPA with Hibernate
7. do you know `@RequestMapping(value = "/users", method = RequestMethod.POST)` ? could you list CRUD by this style?
   1. Map web requests onto methods in request-handling classes, and with `method` optional element being set up, the 
      request type have bing restricted to only `POST ` request
   2. CRUD styles
      1. `@RequestMapping(value = "/users", method = RequestMethod.POST)`
      2. `@RequestMapping(value = "/users", method = RequestMethod.GET)`
      3. `@RequestMapping(value = "/users", method = RequestMethod.PUT)`
      4. `@RequestMapping(value = "/users", method = RequestMethod.DELETE)`
8.  What is ResponseEntity? why do we need it?
    It's a class that wrap our response body with the correct response code and provide more information to the frontend
    from the spring backend, if we only return the response without any indicating status code, then the frontend will
    not be able to get detailed information.
9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC
    `ResultSet` is a core component in the JDBC Framework, and it is used to access query results retrieved from the 
    database.
    ```java
    public class ResultSetDemo {
    
    	public static void main(String[] args) {
    		String query = "select empid, firstname, lastname, dob from tblemployee";
    		Connection conn = null;
    		Statement stmt = null;
    		try {
    			Class.forName("com.mysql.jdbc.Driver");
    			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/empdb", "root", "root");
    			stmt = conn.createStatement();
    			ResultSet rs = stmt.executeQuery(query);
    			while (rs.next()) {
    				Integer empId = rs.getInt(1);
    				String firstName = rs.getString(2);
    				String lastName = rs.getString(3);
    				Date dob = rs.getDate(4);
    				System.out.println("empId:" + empId);
    				System.out.println("firstName:" + firstName);
    				System.out.println("lastName:" + lastName);
    				System.out.println("dob:" + dob);
    				System.out.println("");
    			}
    			rs.close();
    		} catch (Exception e) {
    			e.printStackTrace();
    		} finally {
    			try {
    				stmt.close();
    				conn.close();
    			} catch (Exception e) {}
    		}
    	}
    }
    ```
10. What is the ORM framework?
    Object-relation mapping (ORM) is a programming method used for converting data between incompatible type systems 
    in relational databases and object-oriented programming languages, it can wrap our tables or procedures in classes
    in our programming language, and use class methods and fields to interact with the database instead of writing 
    SQL statements.
11. Learn how to use ObjectMapper by this example.
    by calling `node.at("/data/0")` we can get the first restaurant from our response body in JsonNode class
    ```java
    FoodOutlet foodOutlet = objectMapper.readValue(resBody, FoodOutlet.class);
    String s = objectMapper.writeValueAsString(foodOutlet);
    System.out.println(s);
    JsonNode node = objectMapper.readTree(s);
    System.out.println(node.at("/data/0"));
    ```
12. What is serialization and deserialization?
    * Serialization: turn an object into a series of bytes which can be easily stored in file, database, and memory
    * Deserialization: turn a series of bytes in to the object class
13. use stream api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32]
    ```java
    OptionalDouble ans = Arrays.stream(new int[] {0, 3, 78, 9, 6, 53, 73, 99, 24, 32}).average();
            System.out.println(ans.orElse(0));
    ```
14. Copied on local branch
 
    Testing API: `{{localhost}}/api/v1/posts?pageNo=0&pageSize=5&sortDir=desc`
    Response JSON: 
    ```json
    {
        "content": [
            {
                "id": 10,
                "title": "This is a 10 title",
                "description": "A Poem to Jiucai Friends",
                "content": "Tong shi tian ya lun luo jiu, xiang jian he bi ceng xiang shi"
            },
            {
                "id": 9,
                "title": "This is a 9 title",
                "description": "A Poem to Jiucai Friends",
                "content": "Tong shi tian ya lun luo jiu, xiang jian he bi ceng xiang shi"
            },
            {
                "id": 8,
                "title": "This is a 8 title",
                "description": "A Poem to Jiucai Friends",
                "content": "Tong shi tian ya lun luo jiu, xiang jian he bi ceng xiang shi"
            },
            {
                "id": 7,
                "title": "This is a 7 title",
                "description": "A Poem to Jiucai Friends",
                "content": "Tong shi tian ya lun luo jiu, xiang jian he bi ceng xiang shi"
            },
            {
                "id": 6,
                "title": "This is a fifth title",
                "description": "A Poem to Jiucai Friends",
                "content": "Tong shi tian ya lun luo jiu, xiang jian he bi ceng xiang shi"
            }
        ],
        "pageNo": 0,
        "pageSize": 5,
        "totalElements": 8,
        "totalPages": 2,
        "last": false
    }
    ```
15. Copied on local branch
    Testing API: `{{localhost}}/api/v1/posts/1/comments`
    Response JSON:
    ```json
    {
        "id": 1,
        "name": "alex",
        "email": "12@qq.com",
        "body": "this is my comment"
    }
    ```
16. TODO