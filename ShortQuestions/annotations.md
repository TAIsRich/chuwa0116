`@FunctionalInterface`
@FunctionalInterface annotation is used to ensure that the functional interface can’t have more than one abstract method. In case more than one abstract methods are present, the compiler flags an ‘Unexpected @FunctionalInterface annotation’ message. However, it is not mandatory to use this annotation
`@Test`
The Test annotation **tells JUnit that the public void method to which it is attached can be run as a test case**. To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method. Any exceptions thrown by the test will be reported by JUnit as a failure.
`@Repository`
This annotation is used to mark a class as a data access layer in the application. It is typically used for database operations.
`@Column`
This annotation is used to specify the properties of a column.
