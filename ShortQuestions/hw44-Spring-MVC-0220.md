#  hw44-Spring-MVC-0220

### 1 List all of the annotations you learned from class and homework to annotaitons.md

### 2 What is MVC pattern?

+ Controller: 

  The front controller maps the incoming request to a controller. Controllers contain the business logic of the application. They also handle requests and perform marshalling/ unmarshalling. The function of the controller is to handle a user request. The incoming 
  request may be handled in different ways like reading form data, processing it in some way, storing data in a database, or retrieving data from a web service etc. The controller places the data in the model which, simply put, is a container for the data. The controller returns the model (containing data) back to the front controller.

+ Model:

  Model is a container for data. It is used to transfer data from one part of the Spring MVC application to another. Controller populates the model with data from a form or a database or a web service. As can be seen from the Spring MVC request flow diagram, the controller passes the model to the front controller which forwards it to the view resolver. The view template displays the data in the model.

+ View:

  Spring MVC supports a number of view templates. The most commonly used are JSP or JSTL (JSP Standard Tag Library). Other view templates like Thymeleaf, Groovy, Velocity, and FreeMarker etc., can also be plugged in.
  View template receives the model containing data. It reads the model and displays the data. If, say, the model contains a list of players, the view template can create a table to display that list. In most cases a view template is a JSP page that provides data to the user.

### 3 What is Front-Controller? 

Front Controller is defined as “a controller that handles all requests for a Web site”. It stands in front of a web-application and delegates requests to subsequent resources. It also provides an interface to common behavior such as security, internationalization and presenting particular views to certain users.

This enables an application to change its behavior at runtime. Furthermore it helps to read and maintain an application by preventing code duplication.

The Front Controller consolidates all request handling by channeling requests through a single handler object.

### 4 What is DispatcherServlet? please decribe how it works.

DispatcherServlet handles an incoming HttpRequest, delegates the request, and processes that request according to the configured HandlerAdapter interfaces that have been implemented within the Spring application along with accompanying annotations specifying handlers, controller endpoints, and response objects.

In Spring, DispatcherServlet acts as the front Controller. When a request comes in Spring MVC application, below steps get executed,

+ the request is first received by the DispatcherServlet
+ DispatcherServlet will take the help of HandlerMapping and it will get to know the specific Controller that is associated with this request using @RequestMapping’s
+ Now, the request gets transferred to its associated Controller, the Controller will process this request by executing appropriate methods and returns the ModelAndView object back to the DispatcherServlet
+ The DispatcherServlet will transfer this object to ViewResolver to get the actual view page
+ Finally, DispatcherServlet passes the Model object to the View page which displays the result

### 5 What is JSP and What is ModelAndView？(please google to have a basic knowlege)

Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases. 

`ModelAndView` is a holder for both `Model` and `View` in the web MVC framework. These two classes are distinct; `ModelAndView` merely holds both to make it possible for a controller to return both model and view in a single return value.

### 6 Could you please google any other servlets(理解多少是多少，不要花太多时间，知道servlet的名字就行。)

A servlet is a small Java program that runs within a Web server. Servlets receive and respond to requests from Web clients, usually across HTTP, the HyperText Transfer Protocol.

There are two main servlet types, generic and HTTP:

+ Generic servlets

  + Extend `javax.servlet.GenericServlet`.

  - Are protocol independent. They contain no inherent HTTP support or any other transport protocol.

- HTTP servlets

  - Extend `javax.servlet.HttpServlet`.

  - Have built-in HTTP protocol support and are more useful in a Sun Java System Web Server environment.

    For both servlet types, you implement the constructor method `init()` and the destructor method `destroy()` to initialize or deallocate resources.

    All servlets must implement a `service()` method, which is responsible for handling servlet requests. For generic servlets, simply override the service method to provide routines for handling requests. HTTP servlets provide a service method that automatically routes the request to another method in the servlet based on which HTTP transfer method is used. So, for HTTP servlets, override `doPost()` to process POST requests, `doGet()` to process GET requests, and so on.

### 7 How many web server do you know? (Tomcat, Jetty, Jboss)

+ Apache HTTP Server
+ Nginx
+ Internet Information Services
+ Apache Tomcat
+ Mongoose
+ Jetty

### 8 clone this repo, and run it in you local.
 