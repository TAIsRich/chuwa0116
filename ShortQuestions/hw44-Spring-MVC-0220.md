1. List all of the annotations you learned from class and homework to annotaitons.md

    Please see annotations.md

2. What is MVC pattern?

    MVC means Model-View-Controller design pattern.

    Model is container for data, it is used to transfer data from one Spring MVC application to another.

    View is the front template and UI that reperent the data.

    Controller mainly focus on bussiness logic, handel the request, do some process for data and process the database. The controller places the data in the model and return the data back to the front view.


3. What is Front-Controller? 

    Front Controller is DispatcherServlet in Spring Framework. 

    Front-Controller is a software design pattern that provides a centralized entry point for handling requests in a web application. The Front-Controller pattern is commonly used in web development frameworks to handle the processing of incoming HTTP requests from the user.

4. What is DispatcherServlet? please decribe how it works.

    Front Controller is DispatcherServlet in Spring Framework.

    When a request is made to the URL, the DispatcherServlet intercepts it and processes it.

    The DispatcherServlet uses a HadderMapping to determine which controller should handle the request, based on the URL and other request parameters. Once the appropriate controller is identified, the DispatcherServlet passes the request to the controller for processing.

    After the controller has processed the request and produced a response, the DispatcherServlet uses a ViewResolver to determine which view should be used to render the response. The view is typically a JSP or Thymeleaf template that is populated with data from the model produced by the controller.

    Finally, the DispatcherServlet returns the view to the user, completing the request-response cycle. 

5.  What is JSP and What is ModelAndView？(please google to have a basic knowlege)

    JSP is JavaSever Pages used to create dynamic web pages. JSP files are HTML pages that can include Java code, which is execute on the server to generate dynamic content. JSP is commonly used in conjunction with Servlets and can access JavaBeans, databases, and other resources to produce dynamic web pages.

    ModelAndView is a Spring class that represents a model and a view for a web request. It combines both data and view information and is used to pass data between a controller and a view in the Spring MVC framework. The Model part of the ModelAndView contains the data that is passed to the view, while the View part defines the template or view that is used to render the response.

6.  Could you please google any other servlets(理解多少是多少，不要花太多时间，知道servlet的名字就行。)

    HttpServlet: This is the base class for HTTP servlets in Java. It provides methods for handling HTTP requests and generating HTTP responses. Most servlets in Java extend the HttpServlet class.

    GenericServlet: This is the base class for all servlets in Java. It provides a simple framework for handling requests and generating responses, but does not support the HTTP protocol specifically.

    RequestDispatcher: This servlet is used to forward a request from one servlet to another. It is commonly used to implement modular web applications where different servlets handle different parts of the application.

    CookieServlet: This servlet is used to set and retrieve HTTP cookies. Cookies are used to store information on the client-side and can be used to maintain state across multiple requests.

    SessionServlet: This servlet is used to manage HTTP sessions. Sessions are used to maintain state across multiple requests and can be used to store information about the user's session or preferences.

    JSP Servlet: This servlet is used to compile and execute JavaServer Pages (JSP). JSPs are a technology used to generate dynamic HTML content on the server-side and can include Java code and HTML templates.

7. How many web server do you know? (Tomcat, Jetty, Jboss)

    Tomcat, Jetty, and JBoss Undertow are all popular Java-based web servers and servlet containers that are commonly used for hosting and serving web applications.

    Apache Tomcat: This is a widely used open-source servlet container and web server that is designed for hosting Java-based web applications. It is highly configurable and supports many popular features, such as HTTP/2 and SSL/TLS encryption. Tomcat is often used in combination with the Spring Framework and other Java-based web application frameworks.

    Eclipse Jetty: This is another popular open-source servlet container and web server that is designed to be lightweight and highly scalable. Jetty is commonly used for hosting web applications that require high performance and low resource usage, such as mobile and IoT applications. It is also used for embedded deployments, such as in testing and development environments.

    JBoss Undertow: This is a lightweight, high-performance web server and servlet container that is designed to be modular and extensible. Undertow is designed to be embedded into other applications, and is often used with the WildFly application server. It supports popular features such as HTTP/2 and WebSocket, and has a small memory footprint.