### Testing

##### 1. List all of the new learned annotations to your annotations.md
The updates have been reflected in the relevant file.

##### 2. what is selenium(YouTube)?
Selenium is an open-source tool that automates web browsers. It provides a single interface that lets you write test scripts in programming languages like Ruby, Java, NodeJS, PHP, Perl, Python, and C#, among others.

##### 3. what is cucumber(youtuebe)?
Cucumber is a testing tool that supports Behavior Driven Development (BDD). It offers a way to write tests that anybody can understand, regardless of their technical knowledge. 

##### 4. what is JMeter(youtube)?
The Apache JMeter is an open-source, purely Java-based software. The software is used to perform performance testing, functional testing, and load testing of web applications. It is used to test load testing functional behavior and measuring performance.

##### 5. what is unit-test?
A unit test is a way of testing a unit - the smallest piece of code that can be logically isolated in a system. In most programming languages, that is a function, a subroutine, a method or property.

##### 6. What is the life cycle of Junit:
the test lifecycle is driven by four primary annotations i.e. @BeforeAll, @BeforeEach, @AfterEach and @AfterAll. Along with it, each test method must be marked with @Test annotation from package org.

##### 7. Is @BeforeAll method should be Class level(static)?
Yes, it should be class Level, because it must be run before all the test cases.

##### 8. What is Mockito? and what is its limitations?
When we need to test the units of our system, there are possibly some dependencis not yet implemented, so we could use mocking to replace that dependency. And Mockito is one of that framework that could be chosen for Java projects, and it's easy to read and understand. The limitations: it could not mock static methods, and constructors, final and private methods could not be mocked.

##### 9. What is @Mock and what is @InjectMocks?
In the context of testing with the Mockito framework, the @Mock annotation is used to create a mock object of a class or interface, and the @InjectMocks annotation is used to inject the mock objects into a test class.

##### 10. What is the stubbing?
A stub is a small piece of code that takes the place of another component during testing. The benefit of using a stub is that it returns consistent results, making the test easier to write. And you can run tests even if the other components are not working yet.

##### 11.what is Mockito ArgumentMatchers
Argument matchers are mainly used for performing flexible verification and stubbing in Mockito. It extends ArgumentMatchers class to access all the matcher functions. Mockito uses equal() as a legacy method for verification and matching of argument values.

##### 12. what is Hamcrest Matchers
Hamcrest is a framework for writing matcher objects allowing 'match' rules to be defined declaratively. There are a number of situations where matchers are invaluable, such as UI validation or data filtering, but it is in the area of writing flexible tests that matchers are most commonly used.

##### 13. do you know @spy? what is difference between @spy and @Mock?
Both can be used to mock methods or fields. The difference is that in mock, you are creating a complete mock or fake object while in spy, there is the real object and you just spying or stubbing specific methods of it. When using mock objects, the default behavior of the method when not stub is do nothing. However, the @Spy would return the real value when you do not stub any code for that method.

##### 15. Add unit test for CommentServiceImpl, the coverage should be 100%.
The code has been stored on MavenProject.