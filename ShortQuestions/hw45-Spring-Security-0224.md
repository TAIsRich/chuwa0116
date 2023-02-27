# hw45-Spring-Security-0224

### 1 List all of the annotations you learned from class and homework to annotaitons.md

### 2 What is the authentication?

Authentication (AuthN) is a process that verifies that someone or something is who they say they are. Technology systems typically use some form of authentication to secure access to an application or its data. For example, when you need to access an online site or service, you usually have to enter your username and password. Then, behind the scenes, it compares the username and password you entered with a record it has on its database. If the information you submitted matches, the system assumes you are a valid user and grants you access. System authentication in this example presumes that only you would know the correct username and password. It, therefore, authenticates you by using the principle of something only you would know.

### 3 What is the authorization?

Authorization is the security process that determines a user or service's level of access. In technology, we use authorization to give users or services permission to access some data or perform a particular action. If we revisit our coffee shop example, Rahul and Lucia have different roles in the coffee shop. As Rahul is a barista, he may only place and view orders. Lucia, on the other hand, in her role as manager, may also have access to the daily sales totals. Since Rahul and Lucia have different jobs in the coffee shop, the system would use their verified identity to provide each user with individual permissions. It is vital to note the difference here between authentication and authorization. Authentication verifies the user (Lucia) before allowing them access, and authorization determines what they can do once the system has granted them access (view sales information).

### 4 What is the difference between authentication and authorization?

| S.NO | AUTHENTICATION                                               | AUTHORIZATION                                                |
| ---- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1    | In authentication process, the identity of users are checked for providing the access to the system. | While in authorization process, person’s or user’s authorities are checked for accessing the resources. |
| 2    | In authentication process, users or persons are verified.    | While in this process, users or persons are validated        |
| 3    | It is done before the authorization process.                 | While this process is done after the authentication process. |
| 4    | It needs usually user’s login details.                       | While it needs user’s privilege or security levels.          |
| 5    | Authentication determines whether the person is user or not. | While it determines What permission do user have?            |
| 6    | Generally, transmit information through an ID Token.         | Generally, transmit information through an Access Token.     |
| 7    | Example : Employees in a company are required to authenticate through the network before accessing their company email. | Example : After an employee successfully authenticates, the system determines what information the employees are allowed to access. |

### 5 What is HTTP Session?

A session is used to save information on the server momentarily so that it may be utilized across various pages of the website. It is the overall amount of time spent on an activity. The user session begins when the user logs in to a specific network application and ends when the user logs out of the program or shuts down the machine.

Session values are far more secure since they are saved in binary or encrypted form and can only be decoded at the server. When the user shuts down the machine or logs out of the program, the session values are automatically deleted. We must save the values in the database to keep them forever.

### 6 What is Cookie? 

A cookie is a small text file that is saved on the user’s computer. The maximum file size for a cookie is 4KB. It is also known as an HTTP cookie, a web cookie, or an internet cookie. When a user first visits a website, the site sends data packets to the user’s computer in the form of a cookie.

The information stored in cookies is not safe since it is kept on the client-side in a text format that anybody can see. We can activate or disable cookies based on our needs.

### 7 What is the difference between Session and Cookie?

| **Cookie**                                                   | **Session**                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| Cookies are client-side files on a local computer that hold user information. | Sessions are server-side files that contain user data.       |
| Cookies end on the lifetime set by the user.                 | When the user quits the browser or logs out of the programmed, the session is over. |
| It can only store a certain amount of info.                  | It can hold an indefinite quantity of data.                  |
| The browser’s cookies have a maximum capacity of 4 KB.       | We can keep as much data as we like within a session, however there is a maximum memory restriction of 128 MB that a script may consume at one time. |
| Because cookies are kept on the local computer, we don’t need to run a function to start them. | To begin the session, we must use the session start() method. |
| Cookies are not secured.                                     | Session are more secured compare than cookies.               |
| Cookies stored data in text file.                            | Session save data in encrypted form.                         |
| Cookies stored on a limited data.                            | Session stored a unlimited data.                             |
| In PHP, to get the data from Cookies , $_COOKIES the global variable is used | In PHP  , to get the data from Session, $_SESSION the global variable is used |
| We can set an expiration date to delete the cookie’s data. It will automatically delete the data at that specific time. | In PHP, to destroy or remove the data stored within a session, we can use the session_destroy() function, and to unset a specific variable, we can use the unset() function. |

### 8 How do we use session and cookie to keep user information across the the application? 

Sessions and cookies are commonly used in web applications to keep user information across multiple requests. Here's a brief overview of how to use sessions and cookies:

1. Sessions: Sessions allow you to store user information on the server side. When a user logs in, the server creates a unique session ID and stores it in a cookie on the user's browser. The server then uses this session ID to identify the user and retrieve their information from the server-side session store. To use sessions in your application, you typically need to:

   - Create a session when a user logs in and store their information in the session data

   - Use the session ID to retrieve the user's information on subsequent requests

   - Destroy the session when the user logs out or their session expires

Most web development frameworks provide built-in support for sessions, so you don't need to handle the details of creating and 	managing sessions yourself.

2. Cookies: Cookies allow you to store user information on the client side. When a user logs in, the server sets a cookie on the user's browser with the user's information. The browser then sends this cookie back to the server on subsequent requests, allowing the server to retrieve the user's information. To use cookies in your application, you typically need to:

   - Set a cookie with the user's information when they log in

   - Retrieve the cookie on subsequent requests to identify the user and retrieve their information

   - Expire the cookie when the user logs out or their session expires

Cookies can be set with various options, including the expiration time and whether they should be sent over secure connections only.

Both sessions and cookies have their advantages and disadvantages, and the best approach depends on the specific requirements of your application. Sessions are generally more secure, since the user's information is stored on the server side, but they can be more complex to manage. Cookies are simpler to use, but they can be less secure if the user's information is sensitive.

### 9 What is JWT?

JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA.

### 10 What is the spring security filter?

Spring Security is a powerful and highly customizable authentication and access-control framework for Java applications. Spring Security provides several built-in filters that are responsible for performing various security-related tasks, such as authentication, authorization, and CSRF protection. Here are a few commonly used Spring Security filters:

1. Authentication filter: This filter is responsible for authenticating the user based on the credentials provided in the request, such as a username and password. It's typically one of the first filters in the chain, and if authentication fails, the filter chain is stopped and an error response is sent to the client.
2. Authorization filter: This filter is responsible for verifying that the authenticated user has the necessary permissions to access the requested resource. It's typically one of the last filters in the chain and is only applied after the user has been authenticated.
3. CSRF filter: This filter is responsible for protecting against CSRF attacks by verifying that each non-idempotent request (such as POST, PUT, and DELETE) includes a valid CSRF token in the request header or body.
4. Session management filter: This filter is responsible for managing user sessions, including creating and invalidating sessions, and enforcing session timeouts.
5. Logout filter: This filter is responsible for logging the user out of the application by invalidating their session and clearing any associated authentication information.

These filters can be customized or extended to meet the specific security requirements of your application. The order in which the filters are applied can also be customized, allowing you to fine-tune the security behavior of your application.

### 11 Decribe how do JWT work(slides 里有图， 26页)

JWT (JSON Web Token) is a type of token that is used for authentication and authorization in web applications. JWTs are often used instead of session cookies to provide stateless authentication between a client and a server. Here is a high-level overview of how JWT works:

1. User logs in: When a user logs in to a web application, their credentials are validated by the server. If the credentials are valid, the server creates a JWT for the user.
2. JWT is sent to the client: The server sends the JWT back to the client, which typically stores the token in local storage or a cookie.
3. Client sends JWT in requests: On subsequent requests to the server, the client sends the JWT in the Authorization header of the HTTP request.
4. Server validates JWT: The server receives the JWT in the Authorization header and verifies that the token is valid and has not been tampered with. The server checks the signature of the token to ensure that it has been signed by a trusted source.
5. Server extracts information from JWT: Once the server has validated the JWT, it can extract the information contained in the token's payload, such as the user ID or other relevant data.
6. Access is granted or denied: Based on the information in the JWT, the server determines whether the user is authorized to access the requested resource. If the user is authorized, the server responds with the requested data. If not, the server responds with an error message.

JWTs can be signed using a secret key or a public/private key pair, which ensures that the token can only be created and verified by trusted parties. The contents of the JWT are typically encoded using Base64, which makes them easy to transmit over the network. Overall, JWTs provide a secure and efficient way of authenticating and authorizing users in web applications.

### 12 Do you use any Encoder to encode Password?

In Java, one commonly used password encoder is BCryptPasswordEncoder, which is part of the Spring Security framework. BCryptPasswordEncoder uses a strong cryptographic hashing algorithm to encode passwords and includes a salt to prevent attacks such as rainbow table attacks.

Other popular password encoders include Argon2, PBKDF2, and Scrypt. It's important to choose a password encoder that is appropriate for your specific use case and to follow best practices for password storage, such as salting and hashing the passwords, to ensure the security of your users' data.

### 13 What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?(把这几个名字看熟悉也行)

In Spring Security, these are key components in the authentication process:

1. UserDetailsService: A UserDetailsService is responsible for loading user-specific data, such as usernames, passwords, and authorities, from a data source. The data source can be a relational database, LDAP server, or any other authentication provider. The UserDetailsService is typically used by an AuthenticationProvider to authenticate a user.
2. AuthenticationProvider: An AuthenticationProvider is responsible for authenticating a user based on the credentials provided in an Authentication object. The AuthenticationProvider can use one or more UserDetailsService implementations to load user-specific data and validate the credentials. Once a user is authenticated, the AuthenticationProvider creates an Authentication object containing the user's information and authorities.
3. AuthenticationManager: An AuthenticationManager is responsible for managing the authentication process. It typically consists of one or more AuthenticationProvider implementations, which are used to authenticate users. When a user attempts to authenticate, the AuthenticationManager delegates to the appropriate AuthenticationProvider to perform the authentication.
4. AuthenticationFilter: An AuthenticationFilter is responsible for processing incoming requests and extracting authentication information from them. It typically reads credentials from a request, creates an Authentication object, and passes it to an AuthenticationManager for authentication. If the authentication is successful, the AuthenticationFilter creates a SecurityContext containing the authenticated user's information and sets it in the SecurityContextHolder for the duration of the request.

These components work together to provide a flexible and customizable authentication framework in Spring Security. By configuring the appropriate UserDetailsService, AuthenticationProvider, AuthenticationManager, and AuthenticationFilter, you can implement a wide range of authentication scenarios to meet the specific security requirements of your application.

### 14 What is the disadvantage of Session? how to overcome the disadvantage?

The main disadvantage of using sessions in web applications is that they can be resource-intensive and can affect the scalability of the application. Here are some of the reasons why sessions can be a disadvantage:

1. Server-side storage: Sessions are typically stored on the server side, which means that the server must allocate memory to store session data for each client. This can lead to performance issues, especially if the application has a large number of concurrent users.
2. Resource-intensive: Storing session data in memory can be resource-intensive, especially for large applications with complex session data structures. This can cause memory usage to grow quickly and may require additional resources to scale the application.
3. Limited scalability: Sessions can limit the scalability of the application, as they require a centralized data store that can become a bottleneck when the application is under heavy load.

To overcome these disadvantages, one alternative is to use stateless authentication mechanisms such as JSON Web Tokens (JWTs). JWTs are self-contained tokens that contain all the information necessary for authentication and authorization, including user information and permissions. They do not require server-side storage, making them more scalable and less resource-intensive than sessions.

Another approach is to use distributed caching solutions such as Redis or Memcached to store session data. These solutions can improve performance and scalability by distributing session data across multiple servers and reducing the load on any single server.

Ultimately, the choice between using sessions or stateless authentication mechanisms will depend on the specific requirements of your application and the tradeoffs you are willing to make between scalability, performance, and security.

### 15 how to get value from application.properties?

In a Spring Boot application, you can access values from the `application.properties` file using the `@Value` annotation or the `Environment` object.

Here's an example of how to use `@Value` to get a value from `application.properties`:

1. Define a property in `application.properties`:

   ```java
   my.property=value
   ```

2. In a class, annotate a field or setter method with `@Value`:

   ```java
   @Value("${my.property}")
   private String myProperty;
   ```

   This will inject the value of `my.property` into the `myProperty` field.

Here's an example of how to use the `Environment` object to get a value from `application.properties`:

1. Autowire the `Environment` object:

   ```java
   @Autowired
   private Environment env;
   ```

2. Use the `getProperty` method to get a property value:

   ```java
   String myProperty = env.getProperty("my.property");
   ```

   This will return the value of `my.property`.

Note that in both cases, the `${}` syntax is used to reference a property defined in `application.properties`. The name inside the `${}` must match the name of the property in `application.properties`.

Additionally, you can also use the `@ConfigurationProperties` annotation to map properties in `application.properties` to fields in a class. This is a convenient way to group related properties together and use them as a configuration object.

### 16 What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?

In Spring Security, the `configure(HttpSecurity http)` and `configure(AuthenticationManagerBuilder auth)` methods have different roles in the authentication and authorization process:

1. `configure(HttpSecurity http)`: This method is used to configure the security of HTTP requests in an application. It defines the rules that determine which requests are allowed and which ones are denied based on the user's authentication and authorization status. The `HttpSecurity` object passed to this method provides a fluent API for configuring security constraints such as authentication mechanisms, access control rules, and login/logout pages.
2. `configure(AuthenticationManagerBuilder auth)`: This method is used to configure the authentication mechanism of an application. It defines how users are authenticated, and what roles and permissions they have. The `AuthenticationManagerBuilder` object passed to this method provides a fluent API for building an authentication system that can use different providers such as in-memory users, JDBC, LDAP, or custom providers.

In practice, these two methods are often used together to implement a complete security configuration for an application. 

### 17 What is Spring security authentication and authorization?

Spring Security is a powerful and highly customizable authentication and authorization framework for Java applications. It provides a robust and flexible security infrastructure that can be easily integrated into any Spring-based application.

Authentication is the process of verifying the identity of a user. In a Spring Security context, this means that a user must provide some form of credentials (e.g. username and password) to prove that they are who they claim to be. Once a user's identity has been verified, they can be granted access to the application.

Authorization is the process of determining what actions a user is allowed to perform within an application. This is usually based on the user's roles and permissions. In a Spring Security context, authorization is often implemented using access control rules, which specify which users can access which parts of the application.

### 18 Reading, 泛读一下即可，自己觉得是重点的，可以多看两眼。https://www.interviewbit.com/spring-security-interview-questions/#is-security-a-cross-cutting-concern
	a. 1-12
	b. 17 - 30