### what is selenium(YouTube)?

**Selenium** is an open-source tool that automates web browsers. It provides a single interface that lets you write test scripts in programming languages like Ruby, Java, NodeJS, PHP, Perl, Python, and C#, among others.

### what is cucumber(youtuebe)?

**Cucumber** is a testing tool that supports Behavior Driven Development (BDD). It offers a way to write tests that anybody can understand, regardless of their technical knowledge. In BDD, users (business analysts, product owners) first write scenarios or acceptance tests that describe the behavior of the system from the customer’s perspective, for review and sign-off by the product owners before developers write their codes



### what is JMeter(youtube)?

The **Apache JMeter™** application is open source software, a 100% pure Java application designed to load test functional behavior and measure performance. It was originally designed for testing Web Applications but has since expanded to other test functions.



### what is unit-test?

Unit testing involves the testing of each unit or an individual component of the software application.

The purpose is to validate that each unit of the software code performs as expected.

Unit testing is done during develpment of an application by the developers.

Unit may be a anindividual function, method, procedure, module and object.

<mark> Even though we have QA, usually the developer who developed the new code write unit test by themselves </mark>



### What is the lifecircle of Junit?

Normally, a test class contains multiple test methods. JUnit manages the execution of each test method in form of a lifecycle. 

The complete lifecycle of a test case can be seen in **three phases** with the help of annotations.

1. **Setup**: This phase puts the the test infrastructure in place. JUnit provides *class level setup* (*[@BeforeAll](https://howtodoinjava.com/junit5/before-all-annotation-example/)*) and *method level setup* (*[@BeforeEach](https://howtodoinjava.com/junit5/before-each-annotation-example/)*). Generally, heavy objects like databse comnections are created in class level setup while lightweight objects like test objects are reset in the method level setup.
2. **Test Execution**: In this phase, the *test execution and assertion* happen. The execution result will signify a success or failure.
3. **Cleanup**: This phase is used to cleanup the test infrastructure setup in the first phase. Just like setup, teardown also happen at *class level ([@AfterAll](https://howtodoinjava.com/junit5/after-all-annotation-example/))* and *method level ([@AfterEach](https://howtodoinjava.com/junit5/after-each-annotation-example/))*.

[![Test lifecycle](https://howtodoinjava.com/wp-content/uploads/2021/11/JUnit-Test-Life-Cycle-1.jpg)](https://howtodoinjava.com/wp-content/uploads/2021/11/JUnit-Test-Life-Cycle-1.jpg)



### Is @BeforeAll method should be Class level(static)?

Yes



### What is Mockito? and what is its limitations?

**Answer:** There are a lot of use cases of mocking that aid in unit testing of the code under isolation and make the test highly repeatable and predictable.

**Mocking is generally required when :**

**a)** The component under test has dependencies that are not yet implemented or the implementation is in progress.

A good example can be a REST API endpoint which will be available later at some point in time, but you have consumed it in the code via a dependency.

Now as the real implementation is still not available, you really know most of the time what is the expected response of that API. Mocks allow you to test those kinds of integration.

**b)** Component updates the state in the system.

**Example:** DB calls – you would not want to update your DB with data that is just for testing purposes. This might result in corrupting the data, moreover, the availability of DB is another challenge when the test is executed.

Thus to avoid such behavior, DB calls could be mocked in the component under test. Hence there is no direct coupling of DB and the component under test.



**Answer:** Mockito is a framework of choice for most of the java based projects. It is easy to implement, read and understand.

**Some of the drawbacks or limitations in terms of functionality are:**

- Its inability to mock static methods.

- Constructors, private methods and final classes cannot be mocked

  

### What is @Mock and what is @InjectMocks?

@Mock

We can use *@Mock* to create and inject mocked instances without having to call *Mockito.mock* manually.

```java
@Test
public void whenNotUseMockAnnotation_thenCorrect() {
    List mockList = Mockito.mock(ArrayList.class);
    
    mockList.add("one");
    Mockito.verify(mockList).add("one");
    assertEquals(0, mockList.size());

    Mockito.when(mockList.size()).thenReturn(100);
    assertEquals(100, mockList.size());
}Copy
```



Now we'll do the same, but we'll inject the mock using the *@Mock* annotation:

```java
@Mock
List<String> mockedList;

@Test
public void whenUseMockAnnotation_thenMockIsInjected() {
    mockedList.add("one");
    Mockito.verify(mockedList).add("one");
    assertEquals(0, mockedList.size());

    Mockito.when(mockedList.size()).thenReturn(100);
    assertEquals(100, mockedList.size());
}
```



*@InjectMocks* 

Inject mock fields into the tested object automatically.

```java
@Mock
Map<String, String> wordMap;

@InjectMocks
MyDictionary dic = new MyDictionary();

@Test
public void whenUseInjectMocksAnnotation_thenCorrect() {
    Mockito.when(wordMap.get("aWord")).thenReturn("aMeaning");

    assertEquals("aMeaning", dic.getMeaning("aWord"));
}Copy
```

Here is the class *MyDictionary*:

```java
public class MyDictionary {
    Map<String, String> wordMap;

    public MyDictionary() {
        wordMap = new HashMap<String, String>();
    }
    public void add(final String word, final String meaning) {
        wordMap.put(word, meaning);
    }
    public String getMeaning(final String word) {
        return wordMap.get(word);
    }
}
```



### What is the stubbing?

A stub is a controllable replacement for an **Existing Dependency** (or collaborator) in the system. By using a stub, you can test your code without dealing with the dependency directly



### What is Mockito ArgumentMatchers

Allow flexible verification or stubbing. See also [`AdditionalMatchers`](https://javadoc.io/static/org.mockito/mockito-core/2.2.7/org/mockito/AdditionalMatchers.html).

[`Mockito`](https://javadoc.io/static/org.mockito/mockito-core/2.2.7/org/mockito/Mockito.html) extends ArgumentMatchers so to get access to all matchers just import Mockito class statically.

```
 //stubbing using anyInt() argument matcher
 when(mockedList.get(anyInt())).thenReturn("element");

 //following prints "element"
 System.out.println(mockedList.get(999));

 //you can also verify using argument matcher
 verify(mockedList).get(anyInt());
 
```



### What is Hamcrest Matchers

https://www.baeldung.com/java-junit-hamcrest-guide



### Do you know @spy? what is difference between @spy and @Mock?

**Answer:** Spy is a type of partial mock supported by Mockito.

**This essentially means is a type of instance where:**

**a)** When no mock is setup, any interaction on spy results in calling the real methods. But it still allows you to verify the interactions with the spied object like – was a method actually called, how many times the method was called, what were the arguments using which the method was called etc.

**b)** It gives you the flexibility to set up partial mocks.

**For Example,** if you have an object with 2 methods – method1 and method2 and you want method1 to be called and method2 to be mocked. Spies provide this kind of setup.

So, the difference between a mock and a stub in simple terms is – a mock is created from a type and not from an instance whereas a stub wraps an actual instance of the class object.