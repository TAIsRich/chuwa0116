## What is MVC pattern?

The Model View Controller (MVC) design pattern specifies that an application consist of a data model, presentation information, and control information. The pattern requires that each of these be separated into different objects.

MVC is more of an architectural pattern, but not for complete application. MVC mostly relates to the UI / interaction layer of an application. You’re still going to need business logic layer, maybe some service layer and data access layer.

## What is Front-Controller?

Front Controller - In Spring Web MVC, the DispatcherServlet class works as the front controller. It is responsible to manage the flow of the Spring MVC application.

## What is DispatcherServlet? please describe how it works.

DispatcherServlet acts as the Front Controller for Spring-based web applications. So now what is Front Controller? So it is pretty simple. Any request is going to come into our website the front controller is going to stand in front and is going to accept all the requests and once the front controller accepts that request then this is the job of the front controller that it will make a decision that who is the right controller to handle that request.

1.  Tomcat 收到Http Request，将request交给DispatcherServlet来处理
2.  DispatcherServlet 拿着该req去call HandlerMapper,
3.  HandlerMapper将会找到对应的Controller以及对应的method，并返回给
    dispatcherServlet
4.  dispatcherServlet将call该Controller对应的method，此时会触发call service,
    repository and database.
5.  然后结果(ModelAndView)再通过Controller返回。一般是返回view name, 一个字
    符串，比如list-customers. 而数据是要set到Model 中。
6.  dispatcherServlet拿着view name去call view Resolver,
7. View Resolver会帮助我们找到view template, 比如list-customers.jsp
8.  此时我们有了view template, 也有了数据model，则可以call View engine去帮助我
    们把数据放到view template里，然后转换成纯粹的HTML
9.  该HTML就是前端显示的内容，最终返回给browser。

## What is JSP and What is ModelAndView？(please google to have basic knowledge)

Java Server Pages (JSP) is a technology that allows developers to create dynamic web pages using a combination of HTML, XML, and Java code. JSP pages are executed on a web server, and the resulting output is sent to the client's web browser. JSP provides a way to easily access Java code and objects from within a web page, simplifying the creation of dynamic web pages. JSP pages are typically used in conjunction with Java servlets, which handle data processing and client requests. JSP is part of the Java EE platform and is supported by most web servers and servlet containers.

ModelAndView is a holder for both Model and View in the web MVC framework. These two classes are distinct; ModelAndView merely holds both to make it possible for a controller to return both model and view in a single return value.

## Could you please google any other servlets(理解多少是多少，不要花太多时间，知道servlet的名字就行。

dispatcherServlet

## How many web server do you know? (Tomcat, Jetty, Jboss)

1. Apache 
2. Tomcat
3. NGINX
4. LiteSpeed
5. CentOS Stream
6. Caddy
7. Lighttpd
8. Microsoft IIS