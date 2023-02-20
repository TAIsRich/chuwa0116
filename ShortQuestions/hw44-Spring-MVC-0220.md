1.  List all of the annotations you learned from class and homework to
    annotations.md
2.  What is MVC pattern?
    1. Model: is a container for data, and is used to transfer data from one part of the Spring MVC pattern to another
    2. View: View template receives the model which contains and data and is responsible for displaying that to the user
    3. Controller: front-controller is responsible for mapping the incoming request to a controller, and controller 
       contains the business logic of the application, such as repository, data processing, and retrieving data.
3.  What is Front-Controller?
    * Is a controller that handles all request for a Website, is it often located in front of a web application and delegates 
      requests to subsequent resources.
4.  What is DispatcherServlet? please describe how it works.
    1. It's actually the Front Controller for the Spring web applications, and here's how it works:
       1. Maps an HTTP request to a certain processing method
       2. Parse HTTP request data and headers into data transfer objects (DTOs) or domain objects
       3. Responsible for Model-view-controller interaction
       4. Generation of responses from DTOs, domain objects, etc.
5.  What is JSP and What is ModelAndView？(please google to have a basic
    knowledge)
    1. JSP: Java Server Pages, it is a server side technology used to create dynamic web technology, and Java code 
       can be inserted in HTML/XML pages and both.
    2. ModelAndView: Holder for both Model and View framework, model contains and data to be displayed, and View is 
       returned by the controller in the form of view name.
6.  Could you please google any other servlets(理解多少是多少，不要花太多时间，
    知道servlet的名字就行。)
    1. Generic servlets
    2. HTTP servlets
7. How many web server do you know? (Tomcat, Jetty, Jboss)
   1. Apache Tomcat
   2. Jetty (Under Eclipse Foundation)
   3. Apache TomEE (built on the top of Tomcat)
   4. Oracle WebLogic
   5. IBM WebSphere
   6. Red Hat Wildfly
   7. Apache Geronimo
   8. Oracle GlassFish
8.  clone this repo, and run it in you local.
    a. https://github.com/TAIsRich/springmvc5-demo
    b. Notice that you need to configure the Tomcat by yourself. tutorial in
    the slides.
    c.  find out the APIs in controller and call some APIs, In slides, I also list
    some API.
    d.  remember to create a database for this project
    e.  all details in the slides.
 