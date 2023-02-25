1. List all of the annotations you learned from class and homework to annotaitons.md

    Pls see annotaitons.md

2. What is the authentication?

    Authentication refers to the process of verifying the identity of a user, device, or system. It is the process of confirming that a user or device is who they claim to be. Authentication can be achieved through various mechanisms such as passwords, biometric identification (such as fingerprint or facial recognition), or hardware tokens (such as smart cards). Authentication is typically the first step in any access control system.

3. What is the authorization?

    Authorization, on the other hand, refers to the process of granting or denying access to a resource or system based on the identity of the user or device. Once a user has been authenticated, authorization determines what actions they are allowed to perform and what resources they can access. Authorization is typically implemented through a set of permissions or access controls that define what users or groups are allowed to do within a system or application.

4. What is the difference between authentication and authorization?

    Authentication is the process of verifying the identity of a user or device, while authorization is the process of granting or denying access to a resource based on that identity.

5. What is HTTP Session?

    HTTP Session is a mechanism for maintaining state between a web server and a web client over a series of requests and responses. HTTP is a stateless protocol, which means that each request and response is independent of all other requests and responses. However, in many web applications, it is necessary to maintain state information between requests in order to keep track of a user's session or to store information about a user's preferences or settings.

    The HTTP Session mechanism allows web servers to maintain state information about a user's session by assigning a unique identifier (known as a session ID) to each user session. This session ID is typically stored as a cookie in the user's browser, and is sent back to the server with each subsequent request. The server can then use the session ID to retrieve the session data associated with that user, and use it to maintain the state of the user's session between requests.

    Session data can include any information that needs to be maintained between requests, such as user preferences, shopping cart contents, or authentication tokens. Session data is stored on the server side, typically in memory or in a database, and is associated with the user's session ID.

    In summary, HTTP Session is a mechanism for maintaining state information between a web server and a web client over a series of requests and responses. It allows web servers to keep track of a user's session by assigning a unique identifier (session ID) to each user session and storing session data associated with that ID.

6. What is Cookie? 

    A cookie is a small piece of data that is sent from a website to a user's browser and is stored on the user's computer. Cookies can be used to store information about a user's preferences or login status, and can be used to customize a user's experience on a website. They can also be used for tracking and advertising purposes.

7. What is the difference between Session and Cookie?

    The main difference between cookies and sessions is where the data is stored. Cookies are stored on the client side, while sessions are stored on the server side. Cookies can be useful for storing small amounts of data that do not require high security, such as user preferences. Sessions are better suited for storing more sensitive information, such as login credentials or payment information, as they are stored on the server and are more difficult for attackers to access.

8. How do we use session and cookie to keep user information across the the application? 
   
    To use session and cookie to keep user information across the application, you can follow these steps:

    Create a session: When a user logs in to the application or performs some other action that requires state to be maintained, create a session on the server side. The session will be associated with a unique session ID, which will be sent to the client as a cookie.

    Store data in the session: Once the session has been created, you can store any data that needs to be maintained across the application in the session. This can include information such as user preferences, shopping cart contents, or authentication tokens.

    Retrieve data from the session: Whenever the user performs an action that requires access to the stored data, retrieve the data from the session on the server side using the session ID sent by the client.

    Update the data in the session: If the user performs an action that changes the stored data, update the data in the session on the server side.

    Store the session data: The session data is typically stored on the server side, either in memory or in a database. Make sure to store the session data securely to prevent unauthorized access.

    Use cookies to maintain the session: The session ID is sent to the client as a cookie, which allows the client to send the session ID back to the server with each subsequent request. This allows the server to retrieve the session data associated with that ID and maintain state across the application.

    By using sessions and cookies to maintain user information across the application, you can provide a more personalized and seamless experience for your users. However, it's important to make sure that you store the session data securely to protect sensitive information.

9.  What is JWT?

    JWT stands for JSON Web Token. It is an open standard for securely transmitting information between parties as a JSON object. JWT is often used for authentication and authorization purposes in web applications.

    A JWT is composed of three parts: a header, a payload, and a signature. The header contains metadata about the token, such as the algorithm used to sign the token. The payload contains the data that is being transmitted, such as user information or access permissions. The signature is used to verify the integrity of the token and ensure that it has not been tampered with.

    JWTs are often used for authentication purposes, where a user logs in to a web application and receives a JWT as a result. The JWT is then sent with each subsequent request to the server, allowing the server to verify that the user is authenticated and authorized to perform the requested action.

    One advantage of using JWTs for authentication is that they can be easily verified on the client side without the need for a server-side database lookup. This can improve performance and scalability in large-scale web applications.

    However, it's important to use JWTs securely, as a compromised token can grant unauthorized access to sensitive information or resources. Best practices for using JWTs include using strong encryption algorithms, limiting the lifetime of tokens, and storing them securely on the client side.

10. What is the spring security filter?

    One of the key components of Spring Security is its filter chain, which is responsible for handling incoming HTTP requests and enforcing security policies.

    The Spring Security filter chain is implemented as a series of servlet filters that intercept incoming requests before they are processed by the application's controllers. Each filter in the chain performs a specific security-related task, such as authentication, authorization, or CSRF protection.

    The filter chain is configured using a set of configuration classes or XML files, which define the order and behavior of the individual filters. This allows developers to customize the security behavior of their applications by adding or modifying filters as needed.

    Some of the key filters included in the Spring Security filter chain include:

    Authentication filter: This filter is responsible for authenticating incoming requests and creating an authenticated session for the user.
    Authorization filter: This filter is responsible for enforcing access control policies and ensuring that the user is authorized to perform the requested action.
    CSRF filter: This filter is responsible for preventing CSRF (Cross-Site Request Forgery) attacks by adding a unique token to each form submission.
    Session management filter: This filter is responsible for managing user sessions, including invalidating sessions that have timed out or been invalidated due to security issues.
    By using the Spring Security filter chain, developers can easily add robust security features to their Java-based web applications. The filter chain provides a flexible and extensible framework for enforcing security policies and protecting against common security threats.

11. decribe how do JWT work(slides 里有图， 26页)

    JWTs consist of three parts: a header, a payload, and a signature. The header typically contains information about the type of token and the algorithm used to sign it. The payload contains the data that is being transmitted, such as user information or access permissions. The signature is used to verify the authenticity of the token and ensure that it has not been tampered with.

    When a user logs in to a web application, the server creates a JWT containing the user's identity and other relevant information, signs it with a secret key, and sends it to the client as a response to the login request. The client then stores the token, typically in local storage or a cookie, and sends it with each subsequent request to the server.

    When the server receives a request with a JWT, it verifies the signature of the token using the same secret key that was used to sign it. If the signature is valid, the server can extract the user information and perform any necessary authorization checks before processing the request.

12. Do you use any Encoder to encode Password?

    In Java, the java.security.MessageDigest class provides several secure hashing algorithms, such as SHA-256 and SHA-512. To encode a password using one of these algorithms, you would typically:

    Generate a salt: A salt is a random string of characters that is appended to the password before hashing. This helps prevent attackers from using precomputed hash tables to crack the password.

    Concatenate the password and salt: Concatenate the password and salt together into a single string.

    Hash the password/salt string: Use the MessageDigest class to hash the password/salt string using a secure hashing algorithm.

    Store the salt and hashed password in the database: Store the salt and hashed password in the database, rather than the plain text password.

    When a user logs in, you would retrieve the salt and hashed password from the database, concatenate the entered password with the stored salt, hash the resulting string, and compare the resulting hash with the stored hash. If they match, the user is authenticated. This approach helps ensure that even if an attacker gains access to the database, they will not be able to easily recover the original passwords.

13. What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?(把这几个名字看熟悉也行)

    In Spring Security, UserDetailsService, AuthenticationProvider, AuthenticationManager, and AuthenticationFilter are all components that work together to handle user authentication and authorization.

    UserDetailsService: This is an interface that is responsible for loading user-specific data. When a user attempts to log in, Spring Security calls the loadUserByUsername() method of the UserDetailsService implementation to retrieve the user's details, such as their username, password, and authorities (roles or permissions). The retrieved user details are then used to construct an Authentication object, which represents the user's identity and credentials.

    AuthenticationProvider: This is an interface that is responsible for verifying the credentials of an Authentication object. When an Authentication object is created, Spring Security calls the supports() method of each AuthenticationProvider implementation to determine which provider is capable of authenticating the user. The selected AuthenticationProvider then calls the authenticate() method of the Authentication object to verify the user's credentials. If the authentication is successful, the AuthenticationProvider constructs and returns an updated Authentication object that includes the user's authorities.

    AuthenticationManager: This is an interface that is responsible for managing a collection of AuthenticationProvider instances. When a user attempts to log in, Spring Security calls the authenticate() method of the AuthenticationManager implementation, which in turn delegates the authentication to one of its AuthenticationProvider instances. If the authentication fails, the AuthenticationManager may try another provider, or it may throw an exception indicating that the authentication was unsuccessful.

    AuthenticationFilter: This is a class that is responsible for intercepting incoming requests and authenticating the user based on the provided credentials. When a request is received, the AuthenticationFilter extracts the user's credentials from the request (e.g. username and password from a login form), constructs an Authentication object, and passes it to the AuthenticationManager for authentication. If the authentication is successful, the AuthenticationFilter creates a session or token for the user and sends it back to the client as a cookie or in the response header.

    Together, these components form the core of Spring Security's authentication and authorization framework. By using a combination of UserDetailsService, AuthenticationProvider, AuthenticationManager, and AuthenticationFilter, you can implement a flexible and secure authentication mechanism for your web application.

14. What is the disadvantage of Session? how to overcome the disadvantage?

    One of the main disadvantages of using sessions to manage user state in web applications is that they are server-side resources that require memory and processing power to manage. This can become a scalability issue as the number of concurrent users increases. Additionally, if the application is distributed across multiple servers, it can be difficult to maintain session state across all of them.

    To overcome these disadvantages, there are several approaches that can be taken:

    Use stateless authentication mechanisms: Instead of relying on sessions to manage user state, use stateless authentication mechanisms such as JWT (JSON Web Tokens). This allows authentication information to be stored in a secure token that is sent with each request, rather than being stored on the server.

    Use distributed session management: Instead of relying on a single server to manage sessions, use a distributed session management solution such as Hazelcast or Redis. This allows session state to be shared across multiple servers in a cluster.

    Implement session timeout and session invalidation: To prevent sessions from consuming too much memory and resources, implement a session timeout mechanism that automatically logs out inactive users after a set period of time. Additionally, implement session invalidation mechanisms to ensure that sessions are properly cleaned up and resources are released when they are no longer needed.

    Use a hybrid approach: Use a combination of session-based and stateless authentication mechanisms, depending on the needs of your application. For example, you might use stateless authentication for API requests, but use sessions for managing user state in the web UI.

15. how to get value from application.properties?

    In a Spring Boot application, you can use the @Value annotation to inject values from the application.properties file into your Spring components. Here is an example of how to use the @Value annotation to inject a property value into a Spring component:

    Define the property in application.properties:

    ```    
    myapp.message=Hello World
    ```

    Inject the property value in a Spring component using the @Value annotation:
    java

    ```    
    import org.springframework.beans.factory.annotation.Value;
    import org.springframework.stereotype.Component;

    @Component
    public class MyComponent {

        @Value("${myapp.message}")
        private String message;

        public void printMessage() {
            System.out.println(message);
        }
    }
    ```
    In this example, the @Value("${myapp.message}") annotation injects the value of the myapp.message property from application.properties into the message field of the MyComponent class.

    Note that the ${myapp.message} syntax is used to reference the property value, and the prefix myapp. corresponds to the prefix used in the property key in application.properties. Additionally, the @Component annotation is used to mark the MyComponent class as a Spring component that can be managed by the Spring application context.

16. What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?

    The configure(HttpSecurity http) method is used to configure the security constraints for HTTP requests. This method allows you to specify which URLs should be protected, which authentication mechanisms should be used, and what authorization rules should be applied. Here is an example of how to use the configure(HttpSecurity http) method to configure security constraints:

    ```
    @Configuration
    @EnableWebSecurity
    public class MySecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/user/**").hasRole("USER")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
        }
    }
    ```

    In this example, the authorizeRequests() method is used to specify which URLs should be protected and which authorization rules should be applied. The antMatchers() method is used to match specific URL patterns and apply authorization rules based on the user's roles. The anyRequest().authenticated() method is used to require authentication for any request that does not match a specific URL pattern. Finally, the formLogin() and httpBasic() methods are used to configure the authentication mechanisms that should be used for form-based and basic authentication, respectively.

    The configure(AuthenticationManagerBuilder auth) method is used to configure the authentication mechanism used by the application. This method allows you to specify how users are authenticated and how their credentials are stored. Here is an example of how to use the configure(AuthenticationManagerBuilder auth) method to configure authentication:

    ```
    @Configuration
    @EnableWebSecurity
    public class MySecurityConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}password").roles("ADMIN")
                .and()
                .withUser("user").password("{noop}password").roles("USER");
        }
    }
    ```
    In this example, the inMemoryAuthentication() method is used to specify that the application should authenticate users using an in-memory user store. The withUser() method is used to define two users with their usernames, passwords, and roles. The {noop} prefix is used to indicate that the passwords should be stored in plaintext.


17. What is Spring security authentication and authorization?

    Authentication refers to the process of verifying the identity of a user. In Spring Security, authentication is typically performed using a combination of a user's credentials and a user store that contains information about valid users and their roles. Spring Security supports a variety of authentication mechanisms, including form-based authentication, HTTP Basic authentication, and JSON Web Tokens (JWT). The framework also provides a range of options for customizing the authentication process, such as implementing custom user stores or password encoders.

    Authorization refers to the process of determining whether a user is allowed to access a particular resource or perform a particular action. In Spring Security, authorization is typically based on the user's roles or permissions, which are stored in a user store or other external system. Spring Security supports a range of authorization mechanisms, including URL-based authorization, method-level authorization, and expression-based authorization. The framework also provides options for customizing the authorization process, such as implementing custom access decision voters or using external authorization servers.

    Overall, Spring Security provides a powerful and flexible set of tools for implementing authentication and authorization mechanisms in Java applications. By leveraging Spring Security's built-in capabilities and customizable features, developers can easily implement secure, role-based access control and protect their applications from a wide range of security threats.