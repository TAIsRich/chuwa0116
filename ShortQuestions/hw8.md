# HW8

## 1.
Refer annotations.md file

## 2. explain how the below annotations specify the table in database?
```aidl
@Column(columnDefinition = "varchar(255) default 'John Snow'")
private String name;

@Column(name="STUDENT_NAME", length=50, nullable=false, unique=false)
private String studentName;
```
The first one says that name is type varchar(255) in db and the default value is 'John Snow'.

The second one says that column STUDENT_NAME's string valued column length is 50 and cannot be null and does not have to unique.

## 3. What is the default column names of the table in database for @Column ?
The name of the column. Defaults to the property or field name. In this case, firstName and OperatingSystem.


## 4. What are the layers in springboot application? what is the role of each layer?
Presentation Layer – Authentication & Json Translation
Business Layer – Business Logic, Validation & Authorization
Persistence Layer – Storage Logic
Database Layer – Actual Database

## 5. Describe the flow in all the layers if an API is called by Postman.
Postman Client <-> Controller <-> Service <-> DAO <-> DB

## 6. What is the application.properties? do you know application.yml?
This file contains the different configuration which is required to run the application in a different environment, 
and each environment will have a different property defined by it.

YAML is a data serialization language that is often used for writing configuration files. So YAML configuration file in 
Spring Boot provides a very convenient syntax for storing logging configurations in a hierarchical format. 
The application.properties file is not that readable. So most of the time developers choose application.yml file over 
application.properties file. YAML is a superset of JSON, and as such is a very convenient format for specifying 
hierarchical configuration data. YAML is more readable and it is good for the developers to read/write configuration files.

## Q7 Q8
refer coding folder



