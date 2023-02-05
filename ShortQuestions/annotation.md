### create a file to list all of the annotaitons you learned and known, and explain the usage and how do you
### understand it. you need to update it when you learn a new annotation. Please organize those annotations
### well, like annotations used by entity, annotations used by controller
```
@autowired: give spring the automatic dependency injection
@ service: specify the service class
@ entity @table can do databse operation
```

### explain how the below annotaitons specify the table in database
```
1. specify the column name of the table, and default value is John Snow
2. specify the student_name column, which have length = 50, not null and have unique key
```

### What is the default column names of the table in database for @Column ?
```
The first default column name is firstName, and the second default column name is operatingSystem.
```

### What are the layers in springboot application? what is the role of each layer
```
presentation layer, business layer, persisten layer, actual database
```

### Describe the flow in all of the layers if an API is called by Postman.
```
client send http request to controller, controller maps the ruquest. Business logic is in service layer.
```

### What is the application.properties? do you know application.yml
```
it specifies the properties of your web app. 
another format of configuration
```

### Create a Project, name it with mongo-blog, write a POST API for mongo-blog, change database to
### MongoDB;

```
see code
```

### What is the application.properties? do you know application.yml
```
see code
```