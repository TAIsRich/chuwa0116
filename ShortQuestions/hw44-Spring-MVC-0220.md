# Q2

MVC (Model-View-Controller) is a pattern in software design commonly used to implement user interfaces, data, and controlling logic. It emphasizes a separation between the software's business logic and display. The three parts of the MVC software-design pattern can be described as follows:

- Model: Manages data and business logic.
- View: Handles layout and display.
- Controller: Routes commands to the model and view parts.

# Q3

 A Front Controller is a typical structure in web applications that receives requests and delegates their processing to other components in the application.

# Q4

 The DispatcherServlet is the front controller in Spring web applications, it receives http request, processes the request and return the response to the client. The process of processing requests can be divided into the following parts:

- DispatcherServlet will call Handler Mapper, the Handler Mapper then returns the corresponding controller and method to DispatcherServlet.

- DispatcherServlet then call the method in the controller, and get the return value, which is MAV (model and view).

- DispatcherServlet then use the return viewd, which is view name normally, to call the view resolver to find the view template.

- Now DispatcherServlet has the model and the view template, it will call view engine to put data into the template, convert it into a html file and return to the browser.

# Q5

- JSP stands for Java Server Pages. It is used for creating web application.

- ModelAndView is a holder for both Model and View in the web MVC framework.

# Q6

Generic servlet and HTTP servlet.

# Q7

- Apache Tomcat

- Nginx

- IIS (Internet Information Services)
