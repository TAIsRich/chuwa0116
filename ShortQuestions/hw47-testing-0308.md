### 1.  List all the new learned annotations to your annotations.md
### 2.  what is selenium(YouTube)?
Selenium is an open-source, portable software testing framework for web applications. It allows testers and developers to automate web browsers for testing web-based applications in different environments and operating systems. Selenium supports various programming languages, such as Java, Python, Ruby, C#, and JavaScript, making it flexible and easy to integrate into existing development and testing workflows.

### 3.  what is cucumber(YouTube)?
Cucumber is a tool that is used for Behavior-Driven Development (BDD) to write automated acceptance tests for web applications. It is a testing framework that uses a plain text, business-readable domain-specific language (DSL) to describe the behavior of an application in terms of scenarios and steps. The scenarios are typically written in a Gherkin format, which is a human-readable format that describes the behavior of the application in terms of feature files, scenarios, and steps.

### 4.  what is JMeter(youtube)?
JMeter (Apache JMeter) is a Java-based open-source load testing tool that is used to test the performance and functionality of web applications, APIs, and databases. It simulates a heavy load on a server, network, or object to measure its performance under various conditions.

JMeter can be used to test a variety of applications, including web applications, SOAP and RESTful web services, FTP and database servers, and more. It supports various protocols, including HTTP, HTTPS, FTP, JDBC, and JMS, and can generate and measure different types of requests, such as HTTP GET, POST, PUT, DELETE, and more.

JMeter provides a user-friendly graphical interface that allows testers to create and configure test plans, add and configure samplers and listeners, and generate detailed reports on the performance of the application under test. Testers can create test scenarios that simulate a high number of users, requests, and transactions to measure the response time, throughput, error rate, and other key performance indicators (KPIs) of the application.

### 5.  what is unit-test?
Unit testing is a software testing practice that involves testing individual units or components of a software application in isolation to ensure that they meet the expected functional and non-functional requirements. The unit tests are usually written by developers and are performed using a testing framework such as JUnit, NUnit, or pytest.

A unit test typically focuses on a small piece of code, such as a function or method, and checks whether it behaves as expected under various conditions. It is designed to test the smallest possible part of the code to ensure that it works correctly and as expected.

### 6.  What is the lifecycle of Junit?
- Write Test Cases
- Compile Test Classes
- Run Test Classes
- Assertion
- Test Results
- Debugging
- Fixing Bugs
- Refactoring

### 7. Is @BeforeAll method should be Class level(static)?
Yes, the @BeforeAll method in JUnit should be a class-level (static) method.

The @BeforeAll annotation is used to specify a method that should be executed once before all the test cases in a test class are executed. This method is typically used to perform setup tasks that need to be done before any test cases are executed, such as initializing test data or connecting to a database.

### 8.  What is Mockito? and what is its limitations?
Mockito is a popular open-source Java library used for creating mock objects in unit tests. It provides a simple and easy-to-use API that allows developers to create mock objects for classes and interfaces, and then specify the behavior of these mock objects during testing.
Limitations:
- Mockito can only mock non-final classes and interfaces. It cannot mock final classes, static methods, constructors, or private methods.
- Mockito cannot mock static or final fields.
- Mockito does not guarantee type safety at compile-time, so it is possible to create mock objects that do not match the actual class or interface being mocked.
- Mockito can sometimes be misused, leading to tests that are difficult to read, understand, and maintain. 
- Mockito may not be suitable for testing certain types of applications, such as those that involve heavy network or database interactions, as it can be difficult to create accurate mock objects for these scenarios.

### 9.  What is @Mock and what is @InjectMocks?
@Mock and @InjectMocks are two annotations provided by the Mockito library for creating and injecting mock objects in unit tests.

@Mock is used to create a mock object for a class or interface. When this annotation is used, Mockito creates a mock object for the specified class or interface, which can then be used to define the behavior of the object during testing.

@InjectMocks is used to inject mock objects into the class being tested. When this annotation is used, Mockito looks for fields in the test class that are annotated with @Mock and injects them into the corresponding fields in the class being tested.
### 10. What is the stubbing?
Stubbing is a technique used in software testing to define the behavior of a mock object during unit testing. It involves providing a pre-defined response or behavior for a method call made to a mock object.

In other words, stubbing is the process of setting up a mock object to return a specific value or perform a specific action when a particular method is called. This allows developers to test their code in isolation without relying on the actual implementation of the dependencies.

### 11. what is Mockito ArgumentMatchers
Mockito provides the ArgumentMatchers class, which contains a set of methods that can be used to match arguments passed to a mocked method. These methods are typically used in conjunction with the when() method to stub a mocked method to return a specific value or perform a specific action based on the arguments passed to it.

### 12. what is Hamcrest Matchers
Hamcrest Matchers is a library of matchers for use with JUnit, TestNG, and other testing frameworks. It provides a set of reusable matchers that can be used to test whether a value meets a certain condition, such as whether a string contains a certain substring or whether a collection contains a specific item.

### 13. do you know @spy? what is difference between @spy and @Mock?
@Spy is another annotation provided by Mockito, which can be used to create a partial mock object. A partial mock object is a real object that is partially mocked, meaning that some of its methods are mocked while others are not.

The @Mock annotation, on the other hand, is used to create a fully mocked object, where all of its methods are mocked.

The key difference between @Spy and @Mock is that with @Spy, the real methods of the object are executed by default, whereas with @Mock, all methods are replaced by default with mock implementations.
### 14. briefly reading this articles
    a. https://www.javatpoint.com/examples-of-mockito-and-junit-in-eclipse-ide
    b. https://www.javatpoint.com/junit-tutorial
    c.  https://www.javatpoint.com/testng-tutorial
    d.  https://www.javatpoint.com/jmeter-tutorial
### 15. Add unit test for CommentServiceImpl, the coverage should be 100%.
 