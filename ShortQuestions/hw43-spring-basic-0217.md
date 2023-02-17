# hw43-spring-basic-0217

### 1 List all of the annotations you learned from class and homework to annotaitons.md

### 2 What is Spring and Springboot? What is the benfits of using Srpingboot?

|                                                             | Spring                                                       | Spring Boot                                                  |
| ----------------------------------------------------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| What is it?                                                 | An open-source web application framework based on Java.      | An extension or module built on the Spring framework.        |
| What does it do?                                            | Provides a flexible, completely configurable environment using tools and libraries of prebuilt code to create customized, loosely coupled web apps. | Provides the ability to create, standalone Spring applications that can just run immediately without the need for annotations, XML configuration, or writing lots of additional code. |
| When should I use it?                                       | Use Spring when you want: Flexibility; An unopinionated approach; To remove dependencies from your custom code; To implement a very unique configuration; To develop enterprise applications. | Use Spring Boot when you want: Ease of use; An opinionated approach; To get quality apps running quickly and reduce development time; To avoid writing boilerplate code or configuring XML; To develop REST APIs. |
| What's its key feature?                                     | Dependency injection                                         | Autoconfiguration                                            |
| Does it have embedded servers?                              | No. In Spring, you'll need to set up the servers explicitly. | Yes, Spring Boot comes with built-in HTTP servers like Tomcat and Jetty. |
| How is it configured?                                       | The Spring framework provides flexibility, but its configuration has to be built manually. | Spring Boot configures Spring and other third-party frameworks automatically by the default "convention over configuration" principle. |
| Do I need to know how to work with XML?                     | In Spring, knowledge of XML configuration is required.       | Spring Boot does not require XML configuration.              |
| Are there CLI tools for dev/testing apps?                   | The Spring framework alone doesn't provide CLI tools for developing or testing apps. | As a Spring module, Spring Boot has a CLI tool for developing and testing Spring-based apps. |
| Does it work from an opinionated or unopinionated approach? | Unopinionated*                                               | Opinionated*                                                 |

### Benefits of Spring Boot

- **Reduces time in development and increases productivity**—Spring Boot makes it much easier to develop Spring-based apps with Java. Its opinionated approach to the Spring framework decreases the time spent on decisions and repetitive tasks and frees up time to focus on creating and testing the apps.
- **Decreases the need to write boilerplate code, annotations, and XML configuration**—There's no need for developers to generate code or configure XML or even learn the Spring framework, if they don't want to.
- **Integrates apps in the Spring project family**—Spring Boot apps integrate seamlessly with other projects in the Spring framework ecosystem—such as Spring Data, Spring Cloud, Spring Security—as well as with other trusted cloud services such as Microsoft Azure Spring Cloud.
- **Provides dev/test tools**—With Spring Boot's command-line interface (CLI) tool and embedded HTTP servers, it makes it very simple to create environments to dev/test Spring-based apps.
- **Offers plugins and tools to make development easier**—Spring Boot offers plugins to be able to work with in-memory databases, as well as other popular build automation tools such as Apache Maven.

### 3 What is IOC and What is DI?

+ Inversion of Control is a principle in software engineering which transfers the control of objects or portions of a program to a container or framework. We most often use it in the context of object-oriented programming.

  In contrast with traditional programming, in which our custom code makes calls to a library, IoC enables a framework to take control of the flow of a program and make calls to our custom code. To enable this, frameworks use abstractions with additional behavior built in. If we want to add our own behavior, we need to extend the classes of the framework or plugin our own classes.

+ Dependency injection is a pattern we can use to implement IoC, where the control being inverted is setting an object's dependencies.

  Connecting objects with other objects, or “injecting” objects into other objects, is done by an assembler rather than by the objects themselves.

### 4 What is  @ComponentScan?

We use the `@ComponentScan` annotation along with the `@Configuration` annotation to specify the packages that we want to be scanned. `@ComponentScan` without arguments tells Spring to scan the current package and all of its sub-packages.

### 5 How to define which package spring need to scan in xml and annotaiton? 

+ in xml: To autodetect these classes and register the corresponding beans, you need to include the following element in XML, where the base-package element is a common parent package for the two classes. 

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xmlns:context="http://www.springframework.org/schema/context"
         xsi:schemaLocation="http://www.springframework.org/schema/beans 
             http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
             http://www.springframework.org/schema/context
             http://www.springframework.org/schema/context/spring-context-3.0.xsd">
                 
       <context:component-scan base-package="org.example"/>
       
  </beans>
  ```

+ in annotation: `@ComponentScan`

### 6 What is  @SpringbootApplication?

Spring Boot `@SpringBootApplication` annotation is used to mark a configuration class that declares one or more `@Bean` methods and also triggers `auto-configuration` and component scanning. It’s same as declaring a class with `@Configuration`, `@EnableAutoConfiguration` and `@ComponentScan` annotations.

### 7 How many ways we can define a bean?

+ Class level: `@Component` `@Service` `@Repository` `@Controller`

+ Method level: `@Bean` (used with `@Configuration`) together

+ XML: 

  ```xml
  <bean id="dataNucleusChuwaNoComponent" 
   class="com.chuwa.springbasic.components.impl.DataNu
  cleusChuwaNoComponent"></bean>

### 8 What is default bean name for @Component and  @Bean?

The default bean name is the annotated method name.

### 9 What is the difference between @component and @service,@repository?

- `@Component` is a generic stereotype for any Spring-managed component.
- `@Service` annotates classes at the service layer.
- `@Repository` annotates classes at the persistence layer, which will act as a database repository

The major difference between these stereotypes is that they are used for different classifications. When we annotate a class for auto-detection, we should use the respective stereotype.

- `@Component` We can use `@Component` across the application to mark the beans as Spring's managed components. Spring will only pick up and register beans with `@Component`, and doesn't look for `@Service` and `@Repository` in general.
- `@Repository`’s job is to catch persistence-specific exceptions and re-throw them as one of Spring’s unified unchecked exceptions**.
- We mark beans with `@Service` to indicate that they're holding the business logic. Besides being used in the service layer, there isn't any other special use for this annotation.

### 10 How many annotaitons we can use to inject the bean?

In Spring Boot, we can use Spring Framework to define our beans and their dependency injection. The `@ComponentScan` annotation is used to find beans and the corresponding injected with `@Autowired` annotation.

If you followed the Spring Boot typical layout, no need to specify any arguments for `@ComponentScan` annotation. All component class files are automatically registered with Spring Beans.

### 11 Tell me the three types to do dependency injection(How can we inject the beans in Spring)? Which way is better and why?

+ Constructor Injection
+ Setter Injection
+ Field Injection

A class that takes a required dependency as a constructor argument can only be instantiated if that argument is provided (you should have a guard clause to make sure the argument is not null) (or use a non-nullable type in Kotlin). A constructor therefore enforces the dependency requirement whether or not you're using Spring, making it container-agnostic.

If you use setter injection, the setter may or may not be called, so the instance may never be provided with its dependency. The only way to force the setter to be called is using `@Required` or `@Autowired` , which is specific to Spring and is therefore not container-agnostic.

So to keep your code independent of Spring, use constructor arguments for injection. This applies to tests; you'll have an easier time instantiating and testing the class in a normal unit test, without needing to configure an application context or the complexity that comes along with setting up an integration test.

### 12 If we have multiple beans for one type, how to set one is primary? and how to let the spring to pick one bean to inject if no primay.

+ The identifier of the parameter doesn’t match any of the bean names from the context and you have the following options:
  + You marked one of the beans as primary. In this case, Spring selects the primary bean for injection.
  + You can explicitly select a specific bean using the `@Qualifier` annotation.
  + If none of the beans are primary and you don’t use `@Qualifier` either, the app fails with an exception, complaining of the fact that the context contains more beans of the same type, and Spring doesn’t know which one to choose.

+ The identifier of the parameter matches the name of one of the beans from the context (which is the same as the name of the method annotated with `@Bean` that returns its value). In this case, Spring chooses that bean for which the name is the same as the parameter.

### 13 What is the difference between BeanFactory and ApplicationContext in Spring?

|                         BeanFactory                          |                      ApplicationContext                      |
| :----------------------------------------------------------: | :----------------------------------------------------------: |
| It is a fundamental container that provides the basic functionality for managing beans. | It is an advanced container that extends the BeanFactory that provides all basic functionality and adds some advanced features. |
|       It is suitable to build standalone applications.       | It is suitable to build Web applications, integration with AOP modules, ORM and distributed applications. |
|    It supports only Singleton and Prototype bean scopes.     | It supports all types of bean scopes such as Singleton, Prototype, Request, Session etc. |
| It does not support Annotations. In Bean Autowiring, we need to configure the properties in XML file only. | It supports Annotation based configuration in Bean Autowiring. |
| This interface does not provides messaging (i18n or internationalization) functionality. | ApplicationContext interface extends MessageSource interface, thus it provides messaging (i18n or internationalization) functionality. |
| BeanFactory does not support Event publication functionality. | Event handling in the ApplicationContext is provided through the ApplicationEvent class and ApplicationListener interface. |
| In BeanFactory, we need to manually register BeanPostProcessors and BeanFactoryPostProcessors. | The ApplicationContext automatically registers BeanFactoryPostProcessor and BeanPostProcessor at startup. |
| BeanFactory will create a bean object when the getBean() method is called thus making it Lazy initialization. | ApplicationContext loads all the beans and creates objects at the time of startup only thus making it Eager initialization. |
| BeanFactory interface provides basic features only thus requires less memory. For standalone applications where the basic features are enough and when memory consumption is critical, we can use BeanFactory. | ApplicationContext provides all the basic features and advanced features, including several that are geared towards enterprise applications thus requires more memory. |

### 14 What is the Scope of a Bean?  and list the examples for each scope.

| Sr.No. | Scope & Description                                          |
| ------ | ------------------------------------------------------------ |
| 1      | **singleton**This scopes the bean definition to a single instance per Spring IoC container (default). |
| 2      | **prototype**This scopes a single bean definition to have any number of object instances. |
| 3      | **request**This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext. |
| 4      | **session**This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext. |
| 5      | **global-session**This scopes a bean definition to a global HTTP session. Only valid in the context of a web-aware Spring ApplicationContext. |

Singleton:

```java
package com.tutorialspoint;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}


package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

      objA.setMessage("I'm object A");
      objA.getMessage();

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();
   }
}
```

```xml
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" scope = "singleton">
   </bean>

</beans>
```

Prototype:

```java
package com.tutorialspoint;

public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public void getMessage(){
      System.out.println("Your Message : " + message);
   }
}
```

```java
package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

      objA.setMessage("I'm object A");
      objA.getMessage();

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      objB.getMessage();
   }
}
```

```xml
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

   <bean id = "helloWorld" class = "com.tutorialspoint.HelloWorld" scope = "prototype">
   </bean>

</beans>
```

### 15 Configure a bean using xml. If bean has parameters/dependencies, how can we configure the bean? (you can google the tutorial how to configure beans in xml, and feel free to ask me any quesitons if you don't understand. it is a little bit old, I am not sure if I need to exaplain it in class)

```java
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
    
    <bean class="com.baeldung.springbootxml.Pojo">
        <property name="field" value="sample-value"></property>
    </bean>
</beans>
```