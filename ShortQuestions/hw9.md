## 2.  how do you do the debug?
    The simplest way to do the debug is that we 
    can printout certain lines in between the suspected lines that may cause the error. We can set breakpoints in corresponding places and then use single step debug to find problem.

## 3.  What is DTO, VO, Payload, DO?
- DTO stands for Data Transfer Object, which is used to transfer data between layers in an application, typically from the presentation layer to the service layer. 
    
- VO stands for Value Object, which is a simple object that contains a set of values. 

- Payload refers to the data that is sent in a request or response in an API. 

- DO stands for Data Object, which is a persistence-layer object that represents the data stored in a database.

## 5.  do you know what is Jackson?
```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.13.3</version>
    <scope>compile</scope>
</dependency>
```

Jackson is one such Java Json library used for parsing and generating Json files. It has built in Object Mapper class which parses json files and deserializes it to custom java objects. It helps in generating json from java objects


## 9.  What is ResultSet in jdbc? and describe the flow how to get data using JDBC
- A ResultSet is a Java object that contains the results of executing an SQL query. In other words, it contains the rows that satisfy the conditions of the query. 

- get data using JDBC
    - Import the package.
    - Load and Register the driver.
    - Create a Connection.
    - Create a Statement.
    - Execute the Query.
    - Process the Results.
    - Close the connection.

## 10. What is the ORM framework?
In a nutshell, an ORM framework is written in an object oriented language (like PHP, Java, C# etc…) and it is designed to virtually wrap around a relational database. If you look at the name (ORM), it basically translates into: mapping objects to relational tables.

