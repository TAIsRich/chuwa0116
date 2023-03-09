1. List all of the new learned annotations to your annotations.md
2. what is selenium(YouTube)?  
   Selenium is an open-source tool used for automating web browsers. It provides a framework for automating web applications for testing purposes, but it can also be used for web scraping, data extraction, and other web-based tasks.  
   
    With Selenium, testers and developers can write scripts to automate repetitive tasks such as filling out forms, clicking on links, and submitting data. This helps to increase the efficiency of testing and reduces the time required to manually test applications.

    Selenium can also be used for web scraping and data extraction, allowing analysts to extract data from web pages and process it for analysis. Overall, Selenium is a powerful and flexible tool for automating web-based tasks and improving the efficiency of web development and testing.
3. what is cucumber(youtuebe)?  
   Cucumber is a testing framework that is used for behavior-driven development (BDD). It provides a way for software developers and testers to write executable specifications in a natural language format that can be easily understood by non-technical stakeholders.

    Cucumber uses a feature file format, which is a plain text file that describes the behavior of an application in a structured way. Each feature file contains scenarios, which are test cases that describe a particular behavior or use case of the application.

4. what is JMeter(youtube)?  
   JMeter is an open-source tool used for load testing and performance testing of software applications. It is designed to simulate a heavy load on a server, network or object to measure the application's performance under different load conditions.
5. what is unit-test?  
   A unit test is a way of testing a unit - the smallest piece of code that can be logically isolated in a system. In most programming languages, that is a function, a subroutine, a method or property.
6. What is the lifecircle of Junit?  
   In JUnit 5, the test lifecycle is driven by four primary annotations i.e. @BeforeAll, @BeforeEach, @AfterEach and @AfterAll. Along with it, each test method must be marked with @Test annotation from package org.
![img.png](img.png)
7. Is @BeforeAll method should be Class level(static)?
No,  @BeforeAll and @AfterAll lifecycle methods must not be static when declared within a @Nested test class.
8. What is Mockito? and what is its limitations?  
   Mockito is a popular open-source Java testing framework that allows developers to easily create and use mock objects in unit tests. Mock objects are objects that simulate the behavior of real objects in a controlled way, allowing developers to test their code in isolation.  
   * Mockito cannot mock static methods, constructors, or final classes and methods.
   * Mockito can only mock non-private methods, so if a private method needs to be mocked, the enclosing class must be refactored.
   * Mockito relies on Java reflection, which can be slow and may cause issues in certain environments.
   * Mockito can make it easy to write tests that are too focused on implementation details, rather than testing the behavior of the system under test.
   * Mockito can lead to overuse of mock objects, which can make tests brittle and hard to maintain.
9. What is @Mock and what is @InjectMocks?  
   @Mock is used to create a mock object of a class or interface. A mock object is a fake implementation of an interface or class, which is used to simulate the behavior of real objects in a controlled way. Mock objects are useful for testing because they allow you to isolate the code being tested and verify that it is behaving as expected without the need for real dependencies.

@InjectMocks is used to inject the mocks created with @Mock into the object being tested. The object being tested is typically an instance of a class, and @InjectMocks injects the mock objects into the class, replacing any real dependencies. This allows you to test the behavior of the class in isolation, without the need for real dependencies.

```java
@RunWith(MockitoJUnitRunner.class)
public class MyTest {

    @Mock
    private Dependency dependency;

    @InjectMocks
    private MyClass myClass;

    @Test
    public void testMyMethod() {
        // Setup expectations on the dependency
        when(dependency.doSomething()).thenReturn("mock result");

        // Call the method being tested
        String result = myClass.myMethod();

        // Verify the result
        assertEquals("mock result", result);
    }
}
```
10. What is the stubbing?  
    a short piece remaining after something has been cut, removed, etc.
11. what is Mockito ArgumentMatchers  
    Argument matchers are mainly used for performing flexible verification and stubbing in Mockito. It extends ArgumentMatchers class to access all the matcher functions. Mockito uses equal() as a legacy method for verification and matching of argument values.
12. what is Hamcrest Matchers  
    Hamcrest is a framework for writing matcher objects allowing 'match' rules to be defined declaratively. There are a number of situations where matchers are invaluable, such as UI validation or data filtering, but it is in the area of writing flexible tests that matchers are most commonly used.
13. do you know @spy? what is difference between @spy and @Mock?  
    While @Mock creates a completely new mock object, @Spy creates a partial mock object that is a real object with some of its methods stubbed out. In other words, @Spy allows you to create a mock object that still has some of the real behavior of the original object.
```java
public class MyClass {

    public String doSomething() {
        return "real result";
    }
}

@RunWith(MockitoJUnitRunner.class)
public class MyTest {

    @Mock
    private MyClass mockObject;

    @Spy
    private MyClass spyObject;

    @Test
    public void testMockObject() {
        when(mockObject.doSomething()).thenReturn("mock result");

        String result = mockObject.doSomething();

        assertEquals("mock result", result);
    }

    @Test
    public void testSpyObject() {
        when(spyObject.doSomething()).thenReturn("mock result");

        String result = spyObject.doSomething();

        assertEquals("mock result", result);
    }
}
```
14. briefly reading this articles
    a. https://www.javatpoint.com/examples-of-mockito-and-junit-in-eclipse
    -ide
    b. https://www.javatpoint.com/junit-tutorial
    c.  https://www.javatpoint.com/testng-tutorial
    d.  https://www.javatpoint.com/jmeter-tutorial
15. Add unit test for CommentServiceImpl, the coverage should be 100%.
 