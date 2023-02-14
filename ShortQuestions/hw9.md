### 2.how do you do the debug?
* Right click on the triangle icon on main function and start the project in debug mode
### 3.What is DTO, VO, PayLoad, DO?
* DTO, also referred to as Data Transfer Object, encapsulates values to carry data between processes or networks.
  This helps in reducing the number of methods called. By including multiple parameters or values in a single call, we reduce the network overhead in remote operations.
* VO, also known as the Value Object, is a special type of object that can hold values such as java.lang.Integer and java.lang.Long. A VO should always override the equals() and hashCode() methods. VOs generally encapsulate small objects such as numbers, dates, strings, and more. They follow the value semantics, i.e., they directly change the object's value and pass copies around instead of references.
* Payload of an API Module is the body of your request and response message. It contains the data that you send to the server when you make an API request.
### 4.What is @JasonProperty("description_yyds")
* @JsonProperty is used to mark non-standard getter/setter method to be used with respect to json property.

### 5. What is jackson
* Jackson is one such Java Json library used for parsing and generating Json files. It has built in Object Mapper class which parses json files and deserializes it to custom java objects.
### 6.What is spring-boot-starter
* Spring Boot Starters are dependency descriptors that can be added under the <dependencies> section in pom. xml
* Spring boot starter web.It is mainly used for building web applications that include RESTful applications using Spring MVC

### 7. Do you know @RequestMapping(value="/users",method=RequestMethod.POST), list CRUD 
* RequestMapping annotation is used to map web requests onto specific handler classes and/or handler methods.
``` 
* @RequestMapping(value="/method0")
@ResponseBody
public String method0(){
	return "method0";
}
```

### 8.What is ResponseEntity? Why do we need it
* ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. 

### 9.What is ResultSet in jdbc? describe how to get data using JDBC
* The result set is an object that represents a set of data returned from a data source, usually as the result of a query.
*  Invoke the Connection.createStatement method to create a Statement object.
*  Invoke the Statement.executeQuery method to obtain the result table from the SELECT statement in a ResultSet object.
*  In a loop, position the cursor using the next method, and retrieve data from each column of the current row of the ResultSet object using getXXX methods. XXX represents a data type.
*  Invoke the ResultSet.close method to close the ResultSet object.
*  Invoke the Statement.close method to close the Statement object when you have finished using that object.

### 10. What is the ORM framework?
* Object Relational Mapping (ORM) is a technique used in creating a "bridge" between object-oriented programs and, in most cases, relational databases. 

### 12. What is the serialization and deserialization?
* Serialization is the process of converting a data object—a combination of code and data represented within a region of data storage—into a series of bytes that saves the state of the object in an easily transmittable form.
* Deserialization is constructing a data structure or object from a series of bytes

### 13. use stream api to get the average of the array
``` 
List<Integer> list=Array.asList(20,3,78,9,6,53,73,99,24,32);
list.stream().mapToInt(Integer::intValue).average();
```