# Homework 8

### 1. create a file to list all of the annotaitons you learned and known, and explain the usage and how do you understand it. you need to update it when you learn a new annotation. Please organize those annotations well, like annotations used by entity, annotations used by controller

### 2. explain how the below annotaitons specify the table in database?
```java
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;

@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```

This first part of the code means the variable `name` refers to the `name` column in a database table, and the type of that field is varchar(255) that is the string whose length is maximum 255. By default, if we don't specify the field in this POJO, the spring would help us insert the field's value as John Snow.

As for the second part, it means the variable `studentName` refers to the `STUDENT_NAME` column in a database table, and its length is 50, and it could not be null, which means that if we insert a POJO whose studentName field is null, an exception would be thrown. Also, we do not need to make the student name unique, because there always exits multiple students whose name are the same.


### 3. What is the default column names of the table in database for @Column ?
```java
@Column
private String firstName;
@Column
private String operatingSystem;
```

### 4. What are the layers in springboot application? what is the role of each layer?

### 5. Describe the flow in all of the layers if an API is called by Postman.

### 6. What is the application.properties? do you know application.yml?

### 7. Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to MongoDB;

### 8. In your redbook application, write the code for RUD APIs.