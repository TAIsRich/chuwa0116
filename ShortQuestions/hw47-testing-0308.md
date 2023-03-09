### 2. what is selenium(YouTube)?
Selenium is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms.

### 3. what is cucumber(youtuebe)?
Cucumber is a tool used for behavior-driven development (BDD) to write acceptance tests for web applications. It uses the Gherkin language to describe the expected behavior of the application in plain English.

### 4. what is JMeter(youtube)?
The Apache JMeter™ application is open source software, a 100% pure Java application designed to load test functional behavior and measure performance.

### 5. what is unit-test?
A unit test is a way of testing a unit - the smallest piece of code that can be logically isolated in a system. In most programming languages, that is a function, a subroutine, a method or property. 

Generally though, smaller is better. Smaller tests give you a much more granular view of how your code is performing. 

### 6. What is the lifecircle of Junit?
In JUnit 5, the test lifecycle is driven by four primary annotations i.e. `@BeforeAll`, `@BeforeEach`, `@AfterEach` and `@AfterAll`. Along with it, each test method must be marked with `@Test` annotation from package org.junit.jupiter.api.

The complete lifecycle of a test case can be seen in three phases with the help of annotations.

1. Setup: This phase puts the the test infrastructure in place. JUnit provides class level setup (`@BeforeAll`) and method level setup (`@BeforeEach`). Generally, heavy objects like databse comnections are created in class level setup while lightweight objects like test objects are reset in the method level setup.
2. Test Execution: In this phase, the test execution and assertion happen. The execution result will signify a success or failure.
3. Cleanup: This phase is used to cleanup the test infrastructure setup in the first phase. Just like setup, teardown also happen at class level (`@AfterAll`) and method level (`@AfterEach`).

### 7. Is @BeforeAll method should be Class level(static)?
Yes, the `@BeforeAll` method should be a static method because it is called before any instance of the test class is created.

### 8. What is Mockito? and what is its limitations?
Mockito is a mocking framework, JAVA-based library that is used for effective unit testing of JAVA applications. Mockito is used to mock interfaces so that a dummy functionality can be added to a mock interface that can be used in unit testing. Its main limitation is that it can only mock public and protected methods, and cannot mock final classes or methods.

### 9. What is @Mock and what is @InjectMocks?
- `@Mock` is an annotation used in Mockito to create a mock object of a class or interface. It is used to replace real objects in a test scenario with a fake implementation, allowing developers to simulate specific behavior and test their code more effectively.
- `@InjectMocks` is an annotation that is used to inject the mocked dependencies into the object that is being tested. In other words, `@InjectMocks` is used to inject the dependencies into the object being tested that has the `@Mock` objects created.

### 10. What is the stubbing?
Stubbing involves creating a small piece of code, known as a stub. A stub is a small piece of code that takes the place of another component during testing. The benefit of using a stub is that it returns consistent results, making the test easier to write.

### 11. what is Mockito ArgumentMatchers
Argument matchers are mainly used for performing flexible verification and stubbing in Mockito. It extends ArgumentMatchers class to access all the matcher functions. Mockito uses equal() as a legacy method for verification and matching of argument values.

### 12. what is Hamcrest Matchers
Hamcrest is a framework for writing matcher objects allowing 'match' rules to be defined declaratively. There are a number of situations where matchers are invaluable, such as UI validation or data filtering, but it is in the area of writing flexible tests that matchers are most commonly used.

### 13. do you know @spy? what is difference between @spy and @Mock?
`@Spy` is an annotation used in Mockito to create a spy object, which is a real object that has been wrapped with a Mockito spy. 

The difference is that in mock, you are creating a complete mock or fake object while in spy, there is the real object and you just spying or stubbing specific methods of it. When using mock objects, the default behavior of the method when not stub is do nothing.