1. List all of the annotations you learned from class and homework to annotaitons.md

2. What is MVC pattern?
Spring Web MVC is the original web framework built on the Servlet API and has been included inthe Spring Framework from the very beginning.

3. What is Front-Controller? 
The front controller maps the incoming request to a controller. Controllers contain the business logic of the application. They also handle requests and perform marshalling/unmarshalling. The function of the controller is to handle a user request. The incoming request may be handled in different ways like reading form data, processing it in some way, storing data in a database, or retrieving data from a web service etc. The controller places the data in the model which, simply put, is a container for the data. The controller returns the model (containing data) back to the front controller.

4. What is DispatcherServlet? please decribe how it works.
DispatcherServlet abstracts away the following tedious and boilerplate tasks and focus on useful business logic:
    * Mapping an HTTP request to a certain processing method
    * Parsing of HTTP request data and headers into data transfer objects (DTOs)or domain objects
    * Model-view-controller interaction
    * Generation of responses from DTOs, domain objects, etc.
5. What is JSP and What is ModelAndView？(please google to have a basic knowlege)
Java Server Pages (JSP) is a server-side programming technology that enables the creation of dynamic, platform-independent method for building Web-based applications. JSP have access to the entire family of Java APIs, including the JDBC API to access enterprise databases. This tutorial will teach you how to use Java Server Pages to develop your web applications in simple and easy steps. ModelAndView is a holder for both Model and View in the web MVC framework. These two classes are distinct; ModelAndView merely holds both to make it possible for a controller to return both model and view in a single return value.

6. Could you please google any other servlets(理解多少是多少，不要花太多时间，知道servlet的名字就⾏。)
HTTP servlets can read HTTP headers and write HTML coding to deliver a response to a browser client. Servlets are deployed on WebLogic Server as part of a Web Application.

7. How many web server do you know? (Tomcat, Jetty, Jboss)
    * Apache
    * IIS
    * lighttpd
    * Jagsaw