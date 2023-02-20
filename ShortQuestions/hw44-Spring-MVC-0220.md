# hw44-Spring-MVC-0220

## 1. add to annotation.md

## 2. What is MVC pattern?
MVC stands for Model-View-Controller, which is a software design pattern used to separate the concerns of an application's data, user interface, and control logic into three distinct components.

In the MVC pattern, the Model represents the application's data and business logic, the View represents the user interface, and the Controller acts as the mediator between the Model and the View, handling user input and updating the Model and View as needed.

## 3. What is Front-Controller?
A Front-Controller is a design pattern used in software development that provides a centralized entry point for handling incoming requests in a web application.

## 4. What is DispatcherServlet? please describe how it works.
DispatcherServlet abstracts away the following tedious and boilerplate tasks and focus on
useful business logic:
- Mapping an HTTP request to a certain processing method
- Parsing of HTTP request data and headers into data transfer objects (DTOs)or
domain objects
- Model-view-controller interaction
- Generation of responses from DTOs, domain objects, etc.

## 5. What is JSP and What is ModelAndView？
JSP (JavaServer Pages) is a technology for building dynamic web pages using Java. JSP allows you to embed Java code into HTML pages to generate dynamic content based on user requests. When a user requests a JSP page, the web server executes the JSP code and generates an HTML page that is sent back to the user's browser.

ModelAndView is a class in the Spring Framework for building model data and specifying a view to render that data. It is commonly used in Spring MVC (Model-View-Controller) architecture to handle user requests and generate dynamic content. The "model" in ModelAndView refers to the data that is passed to the view, while the "view" refers to the HTML or JSP page that will display the data.

In a Spring MVC application, a controller method can return a ModelAndView object to specify the model data and the view to render that data. The model data can be passed as a key-value map, and the view can be specified as a JSP page or other type of view. The ModelAndView object is then processed by the Spring Framework to generate the final HTML page that is sent back to the user's browser.

## 6. Could you please google any other servlets
HttpServlet: This is the most commonly used Servlet in Java EE. It provides methods for handling HTTP requests and generating HTTP responses. You can extend HttpServlet to create custom Servlets that respond to specific types of HTTP requests.

Filter: A Filter is a special type of Servlet that can be used to intercept and modify HTTP requests and responses. You can use Filters to perform common tasks such as authentication, logging, or compression.

## 7. How many web server do you know? (Tomcat, Jetty, Jboss)
Apache HTTP Server

Nginx

Microsoft IIS

Apache Tomcat

Jetty

JBoss

Lighttpd

Caddy

Gunicorn

Tornado

## 8. omitted