### 1.  List all the annotations you learned from class and homework to annotations.md
### 2.  What is MVC pattern?
MVC stands for Model-View-Controller and it is a software design pattern commonly used in web development. The purpose of the MVC pattern is to separate an application into three interconnected components: the model, the view, and the controller.

The Model component represents the data and business logic of the application. It is responsible for managing the data, applying business rules, and responding to requests for information from the View and Controller components.

The View component represents the user interface of the application. It is responsible for presenting the data from the Model to the user, and for receiving input from the user and forwarding it to the Controller.

The Controller component acts as the intermediary between the Model and the View. It is responsible for interpreting user input from the View, updating the Model with the new data, and then notifying the View of the changes.
### 3.  What is Front-Controller?
The Front-Controller pattern consists of a single component that is responsible for receiving incoming requests and then dispatching them to the appropriate part of the application for handling. It serves as the entry point for all requests, and is responsible for coordinating the various components involved in processing a request.

The Front-Controller typically performs tasks such as routing requests, handling security and authentication, and managing the flow of control between different parts of the application. It may also be responsible for managing the application's configuration, including loading and initializing components, setting up middleware, and handling error conditions.

### 4.  What is DispatcherServlet? please describe how it works.
DispatcherServlet is the front controller that handles all incoming requests and directs them to the appropriate handler for processing. It is a key component in the Spring MVC web framework.

1. When a request is received by the web server, it is passed to the DispatcherServlet which examines the request and determines the appropriate handler for processing. The DispatcherServlet consults a configuration file (such as a Spring configuration file or a web.xml file) to determine the mapping between the incoming request and the appropriate handler.

2. Once the appropriate handler is determined, the DispatcherServlet passes the request to the handler for processing. The handler may be a controller, a REST endpoint or any other handler that can process the request. The handler generates a response, which is returned to the DispatcherServlet.

3. The DispatcherServlet then consults a view resolver to determine the appropriate view for rendering the response. The view may be a JSP file, a template file, or any other type of view that can be used to generate the response. The view generates the response based on the data provided by the handler, and returns it to the DispatcherServlet.

### 5. What is JSP and What is ModelAndView？(please google to have basic knowledge)
**_JSP (JavaServer Pages)_** is a technology used for developing dynamic web pages in Java. JSP pages can be thought of as HTML pages with Java code embedded in them. When a JSP page is requested by a client, the Java code is executed and the dynamic content is generated and sent to the client as an HTML page.
**_ModelAndView_** is a class used in Spring MVC to represent the result of handling a web request. It contains both a model object, which is a data object that holds the data to be displayed in the view, and a view object, which is the actual view that will be rendered and sent back to the client.

### 6.  Could you please google any other servlets(理解多少是多少，不要花太多时间，知道servlet的名字就行。)
1. **_HttpServlet_**: This is a subclass of the basic Servlet class that provides additional functionality for handling HTTP requests and responses. It provides methods for handling common HTTP methods like GET and POST, and supports features like session management, URL rewriting, and error handling.
2. **_Session_**: The Session is a servlet interface that provides a way to maintain state information across multiple requests from the same client. It can be used to store data like user preferences or shopping cart contents.
3. **_Filter_**: A Filter is a servlet component that intercepts requests and responses before they are processed by the servlet or JSP. Filters can be used for tasks like logging, security, and content transformation.
4. **_RequestDispatcher_**: The RequestDispatcher is a servlet interface that allows a servlet to forward a request to another servlet or JSP. This can be used to create composite views, where multiple servlets or JSPs are combined to generate a single page.

### 7. How many web server do you know? (Tomcat, Jetty, Jboss)
Nginx Tomcat JBoss Jetty