### 1. List all of the annotations you learned from class and homework to annotaitons.md
### 2. What is MVC pattern?
The Model View Controller (MVC) design pattern specifies that an application consist of a data model, presentation information, and control information. The pattern requires that each of these be separated into different objects.

MVC is more of an architectural pattern, but not for complete application. MVC mostly relates to the UI / interaction layer of an application. You’re still going to need business logic layer, maybe some service layer and data access layer.

The Model contains only the pure application data, it contains no logic describing how to present the data to a user.
The View presents the model’s data to the user. The view knows how to access the model’s data, but it does not know what this data means or what the user can do to manipulate it.
The Controller exists between the view and the model. It listens to events triggered by the view (or another external source) and executes the appropriate reaction to these events. In most cases, the reaction is to call a method on the model. Since the view and the model are connected through a notification mechanism, the result of this action is then automatically reflected in the view.

### 3. What is Front-Controller?
The front controller maps the incoming request to a controller. Controllers contain the business logic of the application. They also handle requests and perform marshalling/unmarshalling. The function of the controller is to handle a user request. The incoming request may be handled in different ways like reading form data, processing it in some way, storing data in a database, or retrieving data from a web service etc. The controller places the data in the model which, simply put, is a container for the data. The controller returns the model (containing data) back to the front controller.

### 4. What is DispatcherServlet? please decribe how it works.
The DispatcherServlet is the front controller in Spring web applications. It's used to create web applications and REST services in Spring MVC. In a traditional Spring web application, this servlet is defined in the web.xml file.

Spring Boot provides the spring-boot-starter-web library for developing web applications using Spring MVC. One of the main features of Spring Boot is autoconfiguration. The Spring Boot autoconfiguration registers and configures the DispatcherServlet automatically. Therefore, we don’t need to register the DispatcherServlet manually.

### 5. What is JSP and What is ModelAndView？(please google to have a basic knowlege)
JSP: 
It stands for Java Server Pages.
It is a server side technology.
It is used for creating web application.
It is used to create dynamic web content.
In this JSP tags are used to insert JAVA code into HTML pages.
It is an advanced version of Servlet Technology.
It is a Web based technology helps us to create dynamic and platform independent web pages.
In this, Java code can be inserted in HTML/ XML pages or both.
JSP is first converted into servlet by JSP container before processing the client’s request.

ModelAndView:
ModelAndView is a class present in org.springframework.web.servlet package. ModelAndView is a value object designed to hold model and view making it possible for a handler to return both model and view in a single return value. ModelAndView is resolved by DispatcherServlet using special framework objects ViewResolver and View.

### 6. Could you please google any other servlets(理解多少是多少，不要花太多时间，知道servlet的名字就⾏。)
There are two main types of servlets:
Generic Servlets: Are protocol independent. They contain no inherent HTTP support or any other transport protocol.

HTTP servlets: Have built-in HTTP protocol support and are more useful in a Sun Java System Web Server environment.

All servlets must implement a service() method, which is responsible for handling servlet requests. For generic servlets, simply override the service method to provide routines for handling requests. HTTP servlets provide a service method that automatically routes the request to another method in the servlet based on which HTTP transfer method is used. So, for HTTP servlets, override doPost() to process POST requests, doGet() to process GET requests, and so on.

### 7. How many web server do you know? (Tomcat, Jetty, Jboss)
Apache HTTP Server
NGINX
Apache Tomcat
Node.js
Lighttpd

### 8. clone this repo, and run it in you local.