## how do you do the debug?
Set break point, and use Postman to send API request.

## What is DTO, VO, Payload, DO?
In the field of programming a data transfer object is an object that carries data between processes.

A payload is the carrying capacity of a packet or other transmission data unit.

In computer science, a value object is a small object that represents a simple entity whose equality is not based on identity: i.e. two value objects are equal when they have the same value, not necessarily being the same object.

## What is @JsonProperty("description_yyds") (不会的话，课上问)?

The @JsonProperty annotation is used to map property names with JSON keys during serialization and deserialization. By default, if you try to serialize a POJO, the generated JSON will have keys mapped to the fields of the POJO. If you want to override this behavior, you can use the @JsonProperty annotation on the fields. It takes a String attribute that specifies the name that should be mapped to the field during serialization.

## do you know what is jackson?

Jackson is a suite of data-processing tools for Java. It allows to read and write data in JSON, Avro, BSON, CBOR, CSV, Smile, (Java) Properties, Protobuf, XML or YAML format.

In Spring objects are automatically conversed to JSON with the Jackson library.

## What is spring-boot-stater? What dependencies in the below starter? do you know any starters?

## do you know  `@RequestMapping(value = "/users", method = RequestMethod.POST)` ? could you list CRUD by this style?

It map the url that end with /users to the post method.

`@RequestMapping(value = "/users", method = RequestMethod.POST)`

`@RequestMapping(value = "/users", method = RequestMethod.GET)`

`@RequestMapping(value = "/users", method = RequestMethod.UPDATE)`

`@RequestMapping(value = "/users", method = RequestMethod.DELETE)`

## What is ResponseEntity? why do we need it?

ResponseEntity represents the whole HTTP response: status code, headers, and body. As a result, we can use it to fully configure the HTTP response. If we want to use it, we have to return it from the endpoint; Spring takes care of the rest.

## What is ResultSet in jdbc? and describe the flow how to get data using JDBC

he SQL statements that read data from a database query, return the data in a result set.

The typical flow of using JDBC is as follows: First, load the JDBC driver and create a connection to the database. Then, create a Statement and execute the query to get a ResultSet. Next, traverse and process the ResultSet

## What is the ORM framework?

Object Relational Mapping (ORM) is a technique used in creating a "bridge" between object-oriented programs and, in most cases, relational databases. Put another way, you can see the ORM as the layer that connects object oriented programming (OOP) to relational databases.

## What is the serialization and deserialization?

Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.git

## use steam api to get the average of the array [20, 3, 78, 9, 6, 53, 73, 99, 24, 32].

```java
list.stream().average().getAsDouble();
```