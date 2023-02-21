# hw44-Spring-MVC-0220 - Hao Jia

### What is MVC pattern?
MVC, or Model-View-Controller, is a software design pattern that separates an application into three interconnected components: the model, the view, and the controller.

+ The model represents the data and the business logic of the application. It is responsible for managing the application's data, and for processing requests and updates to the data.

+ The view is responsible for presenting the data to the user. It is the graphical user interface that allows the user to interact with the application.

+ The controller acts as an intermediary between the model and the view. It receives input from the user via the view, and uses that input to manipulate the model. It also updates the view based on changes to the model.


### What is Front-Controller?
A Front-Controller is a software design pattern used in web applications, that provides a centralized entry point for handling requests and controlling the flow of the application. The Front-Controller receives all requests from the client and is responsible for dispatching the request to the appropriate handler, which may be a controller, a view, or a service.

The Front-Controller pattern is typically implemented in the form of a single controller that handles all requests, or a set of controllers that work together to handle different types of requests. The Front-Controller can also perform other tasks such as logging, security, and error handling.

### What is DispatcherServlet? please decribe how it works.
DispatcherServlet is a key component of the Spring Framework for Java web applications. It acts as a Front-Controller, receiving incoming requests from clients, and directing them to the appropriate handlers for processing.

When a client sends a request to a Spring web application, the DispatcherServlet intercepts the request and passes it to the appropriate handler based on the URL mapping configured in the application's configuration files. The handler can be a controller, a view, or a service that performs some business logic.

The DispatcherServlet works in the following way:

+ The client sends an HTTP request to the web application.

+ The request is intercepted by the DispatcherServlet, which examines the URL and determines the appropriate handler based on the URL mapping in the application's configuration.

+ The handler processes the request and returns a ModelAndView object, which contains the data and view to be rendered to the client.

+ The DispatcherServlet sends the ModelAndView object to the appropriate view, which renders the data and generates a response to send back to the client.

+ The response is sent back to the client, completing the request-response cycle.


### What is JSP and What is ModelAndView？(please google to have a basic knowlege)
+ JSP (JavaServer Pages) is a technology used for building dynamic web applications in Java. It is a server-side scripting language that allows developers to embed Java code and HTML markup into a single file, which is then compiled into a servlet by the web container at runtime. JSPs are commonly used to generate dynamic content, such as HTML pages with data from a database, or to create reusable components for use in larger applications.

+ ModelAndView is a class in the Spring Framework for Java that is used to represent the data and view components of a web application's response. It is typically returned by a controller method after processing a request, and contains the data to be displayed in the view, as well as the name or location of the view to be rendered.

### Could you please google any other servlets(理解多少是多少，不要花太多时间， 知道servlet的名字就行。)
+ HttpServlet - a base class for servlets that provides methods for handling HTTP requests and responses.

+ Filter - a servlet that intercepts requests and responses to perform pre-processing or post-processing tasks, such as authentication, logging, or compression.

+ SessionServlet - a servlet that manages user sessions by creating, maintaining, and destroying session objects.

+ RequestDispatcher - a servlet that forwards requests and responses between servlets or JSPs within the same web application.

+ DefaultServlet - a servlet that serves static resources, such as HTML files, images, and CSS files, from the web application's document root.

### How many web server do you know? (Tomcat, Jetty, Jboss)
+ Apache Tomcat - a lightweight, open-source web server and servlet container that is widely used for hosting Java web applications.

+ Jetty - a fast and scalable web server and servlet container that is commonly used for hosting lightweight web applications.

+ Nginx - a high-performance web server and reverse proxy that is commonly used for serving static content, load balancing, and caching.

+ Apache HTTP Server - a powerful and flexible web server that supports a wide range of languages and platforms, including PHP, Perl, and Python.

+ Microsoft IIS - a web server and application server that is widely used on Windows-based systems, and supports a wide range of languages and frameworks, including ASP.NET.

+ JBoss - a popular open-source application server that includes a built-in web server, and supports a wide range of Java-based technologies, including Servlets, JSPs, and EJBs.
