1.  List all of the new learned annotations to your annotations.md
2.  what is selenium(YouTube)?
Selenium is an automation testing tool that can simulate user interactions on a webpage, such as clicking, typing, scrolling, and more. 
3.  what is cucumber(youtube)?
Cucumber is a testing tool that facilitates Behavior-Driven Development (BDD), a methodology that focuses on defining the behavior of a software application through examples in plain language. Cucumber allows for collaboration between developers, testers, and business stakeholders by providing a common language to describe and test the behavior of an application.
4.  what is JMeter(youtube)?
JMeter is an open-source software testing tool that is used for performance testing, load testing, and stress testing of web applications. JMeter can simulate a large number of users and their interactions with a web application, allowing developers and testers to identify performance issues, bottlenecks, and other problems that may arise when the application is under heavy load.
5.  what is unit-test?
A unit test is a type of software testing that focuses on testing individual units or components of a software application in isolation from the rest of the system. The purpose of unit testing is to verify that each unit of code performs as expected and to detect and fix defects early in the development process.
6.  What is the lifecircle of Junit?
The complete lifecycle of a test case can be seen in three phases with the help of annotations.

    * Setup: This phase puts the the test infrastructure in place. JUnit provides class level setup (@BeforeAll) and method level setup (@BeforeEach). Generally, heavy objects like databse comnections are created in class level setup while lightweight objects like test objects are reset in the method level setup.
    * Test Execution: In this phase, the test execution and assertion happen. The execution result will signify a success or failure.
    * Cleanup: This phase is used to cleanup the test infrastructure setup in the first phase. Just like setup, teardown also happen at class level (@AfterAll) and method level (@AfterEach).

7. Is @BeforeAll method should be Class level(static)?
Yes.
8.  What is Mockito? and what is its limitations?
Mockito is a popular Java testing framework used for creating mock objects and stubs in unit testing. It allows developers to create test doubles of dependencies, such as classes or interfaces, and define their behavior during testing. One of the main limitations of Mockito is that it is designed for unit testing, and therefore does not provide support for testing interactions between multiple objects or systems. It is also not designed to test performance or scalability, as it is primarily used for testing individual components in isolation.
9.  What is @Mock and what is @InjectMocks?
In Mockito, the @Mock annotation is used to create a mock object of a class or interface that is used as a dependency of the class being tested. 
In Mockito, the @InjectMocks annotation is used to inject the mock objects created using the @Mock annotation into the class being tested. 
10. What is the stubbing?
Stubbing is a technique used in software testing with mock objects, where a method or function is given a specific response when it is called. This is typically done to isolate a component being tested from its dependencies and to control the behavior of those dependencies during the test.
11. what is Mockito ArgumentMatchers
In Mockito, ArgumentMatchers is a class that provides a set of methods for matching method arguments when defining the behavior of mock objects. ArgumentMatchers allows you to define flexible rules for matching arguments, making it easier to create mock objects that behave in a way that is appropriate for the test scenario.
12. what is Hamcrest Matchers
Hamcrest Matchers is a library of matchers for use in software testing frameworks, such as JUnit and Mockito. It provides a set of functions for writing assertions that are more expressive and easier to read than traditional assertions.
Hamcrest matchers are designed to work seamlessly with testing frameworks, making it easy to use them in your existing tests. They provide a wide range of matchers for different types of objects, including strings, numbers, collections, and more.
13. do you know @spy? what is difference between @spy and @Mock?
When you use @Mock, Mockito creates a mock object that has no connection to the real object being mocked. All of its methods return default values unless you specifically set up behavior for them. This is useful for isolating the code under test and ensuring that it is not affected by changes to its dependencies.
On the other hand, when you use @Spy, Mockito creates a mock object that wraps around the real object being mocked. This means that some methods of the real object are called, while others are intercepted by the spy and can be stubbed out or verified. This is useful when you want to partially mock an object and test only certain methods, while allowing others to use the real implementation.
14. briefly reading this articles
a. https://www.javatpoint.com/examples-of-mockito-and-junit-in-eclipse
-ide
b. https://www.javatpoint.com/junit-tutorial
c.  https://www.javatpoint.com/testng-tutorial
d.  https://www.javatpoint.com/jmeter-tutorial
15. Add unit test for CommentServiceImpl, the coverage should be 100%.
 