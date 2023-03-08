1. List all of the new learned annotations to your annotations.md
2. what is selenium(YouTube)?\
   Selenium is a free, open-source automation testing suite for web applications across different browsers and platforms.
3. what is cucumber(youtuebe)?\
   Cucumber is a testing tool that supports Behavior Driven Development (BDD). Cucumber reads executable specifications written in plain text and validates that the software does what those specifications say. The specifications consists of multiple scenarios.
4. what is JMeter(youtube)?\
    Jmeter is application is open source software, a 100% pure Java application designed to load test functional behavior and measure performance.
5. what is unit-test?\
   A unit test is a way of testing a unit - the smallest piece of code that can be logically isolated in a system. In most programming languages, that is a function, a subroutine, a method or property.
6. What is the lifecircle of Junit?\
   In JUnit 5, the test lifecycle is driven by four primary annotations i.e. @BeforeAll, @BeforeEach, @AfterEach and @AfterAll.
7. Is @BeforeAll method should be Class level(static)?
8. What is Mockito? and what is its limitations?\
   Mocking is a way to test the functionality of a class in isolation. Mocking does not require a database connection or properties file read or file server read to test a functionality. Mock objects do the mocking of the real service. A mock object returns a dummy data corresponding to some dummy input passed to it.\
    Limitations:  you cannot mock static and private methods.
9. What is @Mock and what is @InjectMocks?
    * @InjectMocks annotation is used to create and inject the mock object
    * @Mock annotation is used to create the mock object to be injected
10. What is the stubbing?\
    A stub is a fake class that comes with preprogrammed return values. It’s injected into the class under test to give you absolute control over what’s being tested as input. A typical stub is a database connection that allows you to mimic any scenario without having a real database.
11. what is Mockito ArgumentMatchers\
    Argument matchers are mainly used for performing flexible verification and stubbing in Mockito
12. what is Hamcrest Matchers\
    Hamcrest is a framework for writing matcher objects allowing 'match' rules to be defined declaratively.
13. do you know @spy? what is difference between @spy and @Mock?
    * Mockito provides option to create spy on real objects. When spy is called, then actual method of real object is called.
    * When Mockito creates a mock, it does so from the Class of a Type, not from an actual instance. The mock simply creates a bare-bones shell instance of the Class, entirely instrumented to track interactions with it.
On the other hand, the spy will wrap an existing instance. It will still behave in the same way as the normal instance; the only difference is that it will also be instrumented to track all the interactions with it.

14. briefly reading this articles
    a. https://www.javatpoint.com/examples-of-mockito-and-junit-in-eclipse -ide
    b. https://www.javatpoint.com/junit-tutorial
    c. https://www.javatpoint.com/testng-tutorial
    d. https://www.javatpoint.com/jmeter-tutorial
15. Add unit test for CommentServiceImpl, the coverage should be 100%.
    