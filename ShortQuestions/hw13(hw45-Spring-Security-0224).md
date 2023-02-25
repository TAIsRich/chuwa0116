### 1. List all of the annotations you learned from class and homework to annotaitons.md
### 2. What is the authentication?
Authentication is a term that refers to the process of proving that some fact or some document is genuine. In computer science, this term is typically associated with proving a user’s identity. Usually, a user proves their identity by providing their credentials, that is, an agreed piece of information shared between the user and the system.

### 3. What is the authorization?
Authorization is the process of giving someone the ability to access a resource.

### 4. What is the difference between authentication and authorization?
```
Authentication               | Authorization
------------------------------------------------------------------
Determines whether users are | Determines what users can and cannot 
who they claim to be         | access
------------------------------------------------------------------
Challenges the user to       | Verifies whether access is allowed 
validate credentials (for    | through policies and rules
example, through passwords,  |
answers to security questions| 
or facial recognition)       |
------------------------------------------------------------------
Usually done before authori  | Usually done after successful 
-zation                      | authentication
------------------------------------------------------------------
Generally, transmits info    | Generally, transmits info through 
through an ID Token          | an ID Token
------------------------------------------------------------------
Generally governed by the    | Generally governed by the OAuth 2.0 
OpenID Connect (OIDC)        | framework
protocol                     |
------------------------------------------------------------------
```

### 5. What is HTTP Session?
HTTP Session is a way for web servers to maintain stateful communication with web clients (usually web browsers) over the stateless HTTP protocol. In a typical web application, the server needs to remember some information about a client's requests and actions, such as login credentials, shopping cart contents, or user preferences. HTTP Session provides a mechanism to store this information on the server and associate it with a particular client.

When a client first connects to a web server, the server creates a new session for that client and assigns it a unique session ID. This session ID is then sent back to the client in the form of a cookie or a URL parameter. The client includes this session ID in all subsequent requests to the server, allowing the server to associate those requests with the appropriate session.

The server can store session data in various ways, such as in memory, in a database, or on disk. The session data is typically encrypted and tamper-proof to prevent unauthorized access or modification.

HTTP Session provides a powerful tool for building interactive web applications that can maintain user-specific state and context across multiple requests and pages. However, it also introduces some challenges, such as scalability, session management, and security, that need to be carefully addressed in large-scale web applications.

### 6. What is Cookie?
A cookie is a small piece of data that a website stores on a user's computer or mobile device when the user visits the website. Cookies are used to remember user preferences, login information, shopping cart contents, and other information that can be used to enhance the user experience or track user behavior.

Cookies are typically created by the web server and sent to the user's browser as a response header. The browser stores the cookie and sends it back to the server with every subsequent request, allowing the server to retrieve the stored information and personalize the user's experience.

Cookies can be categorized into two types: session cookies and persistent cookies. Session cookies are temporary and are deleted when the user closes the browser. They are typically used to store information that only needs to be remembered during a single browsing session, such as shopping cart contents or login credentials. Persistent cookies, on the other hand, remain on the user's device even after the browser is closed and can be used to remember user preferences or track user behavior over a longer period of time.

Cookies can be set with various attributes, such as expiration date, domain, path, and secure flag, to control their lifespan, scope, and security. However, cookies can also raise privacy concerns if they are used to track users without their knowledge or consent. As a result, many web browsers provide options for users to block or delete cookies and for websites to disclose their use of cookies in their privacy policies.

### 7. What is the difference between Session and Cookie?
Session and cookie are both mechanisms used by web servers to maintain stateful communication with web clients, but they differ in several key aspects.

Data Storage: The main difference between session and cookie is where the data is stored. Session data is stored on the server-side, while cookie data is stored on the client-side.

Lifespan: Session data typically lasts only for the duration of the user's session on the website, which ends when the user closes their browser or logs out. In contrast, cookie data can be stored for a longer period of time, depending on the cookie's expiration date.

Security: Since session data is stored on the server-side, it is generally considered to be more secure than cookie data, which can be accessed by the client-side scripts and potentially tampered with or stolen. However, both session and cookie data can be secured with appropriate measures such as encryption and tamper-proofing.

Capacity: Session data is usually limited by the server's memory capacity, while cookie data is typically limited by the browser's cookie storage capacity.

Usage: Session data is typically used for storing sensitive information such as login credentials and shopping cart contents, while cookie data is often used for storing user preferences and tracking user behavior.

In summary, session and cookie are two different mechanisms used for maintaining stateful communication between web servers and clients, and each has its own advantages and limitations depending on the specific requirements of the web application.

### 8. How do we use session and cookie to keep user information across the the application?
Session and cookie can be used in different ways to keep user information across the application, depending on the specific requirements of the application. Here are some general guidelines:

Session: If the user information needs to be secure and not accessible by the client-side scripts, session can be used to store the data on the server-side. Here are the general steps for using session:

When the user logs in or performs an action that requires the information to be stored, the server creates a session for the user and assigns a unique session ID.
The session ID is stored in a cookie or URL parameter and sent back to the client.
Subsequent requests from the client include the session ID, which the server uses to retrieve the session data and personalize the user's experience.
When the user logs out or the session expires, the session data is deleted from the server-side.
Cookie: If the user information needs to be accessible by the client-side scripts, cookie can be used to store the data on the client-side. Here are the general steps for using cookie:

When the user logs in or performs an action that requires the information to be stored, the server creates a cookie and sets the relevant data as the cookie value.
The cookie is sent back to the client and stored in the browser's cookie storage.
Subsequent requests from the client include the cookie, which the client-side scripts can access and use to personalize the user's experience.
The cookie can have an expiration date or be deleted manually by the user or the server.
It's worth noting that both session and cookie have limitations and security considerations that need to be addressed in the implementation, such as preventing session hijacking, XSS attacks, and cookie theft. Additionally, the type of information being stored, the sensitivity of the information, and the application's performance and scalability requirements should be taken into account when choosing between session and cookie.

### 9. What is JWT?
JWT stands for JSON Web Token, which is a compact and self-contained way of transmitting information between parties as a JSON object. JWTs are often used for authentication and authorization in web applications.

A JWT consists of three parts separated by dots: a header, a payload, and a signature. The header describes the algorithm used to sign the token, such as HMAC SHA256 or RSA. The payload contains the claims or statements about the user or entity being authenticated, such as user ID, name, email, and roles. The signature is used to verify that the token has not been tampered with and was issued by a trusted party.

JWTs are typically created by the server after the user logs in or performs an action that requires authentication. The server generates a JWT and sends it back to the client as a response. The client stores the JWT, such as in local storage or a cookie, and sends it back to the server with each subsequent request as an authorization header or query parameter. The server verifies the signature and the claims in the JWT to determine if the request is authorized.

### 10. What is the spring security filter?
Spring Security is a powerful and flexible framework for securing Java applications. One of the core components of Spring Security is its filter chain, which provides a layered approach to securing web requests.

The Spring Security filter chain consists of a series of filters that intercept incoming requests and perform various security-related operations, such as authentication, authorization, and session management. Each filter performs a specific task and can be customized or replaced to meet the specific needs of the application.

Here are some of the key filters in the Spring Security filter chain:

Authentication filter: This filter is responsible for authenticating the user based on the credentials provided, such as username and password, token, or certificate. It typically interacts with an authentication provider or manager, such as a database, LDAP server, or OAuth provider.

Authorization filter: This filter is responsible for checking if the authenticated user has the necessary permissions to access the requested resource, based on roles, privileges, or other criteria. It typically interacts with an access control mechanism, such as role-based or attribute-based access control.

Session management filter: This filter is responsible for managing the user's session, such as creating a new session, invalidating an existing session, or handling session timeouts. It typically interacts with a session repository, such as a cache or database.

CORS filter: This filter is responsible for handling Cross-Origin Resource Sharing (CORS) requests, which enable web applications to access resources from different domains. It typically sets the appropriate headers and handles preflight requests.

CSRF filter: This filter is responsible for preventing Cross-Site Request Forgery (CSRF) attacks, which can hijack the user's session and perform unauthorized actions. It typically generates and validates a CSRF token in the request and response.

### 11. decribe how do JWT work(slides ⾥有图， 26页)
Once a JWT is created by the server, it can be sent to the client in the HTTP response as a string. The client can then store the JWT in local storage, session storage, or a cookie, depending on the application's requirements.

For subsequent requests, the client sends the JWT back to the server as an Authorization header or query parameter. The server then verifies the signature and the claims in the JWT to authenticate and authorize the user. If the signature or claims are invalid or expired, the server rejects the request.

JWTs provide several benefits, such as statelessness, decentralization, and scalability. However, JWTs also require careful consideration of the token lifespan, revocation, expiration, and payload size, as well as the potential risks of token theft or exposure.

### 12. Do you use any Encoder to encode Password?
BCryptPasswordEncoder: This is a widely used encoder in the Spring Security framework that uses the BCrypt hashing algorithm to encode passwords. BCrypt is a strong hashing algorithm that generates a salted hash of the password, making it difficult to crack.

MessageDigest: This is a built-in Java class that can be used to generate a hash of the password using various hashing algorithms, such as MD5, SHA-1, and SHA-256. However, it is recommended to use a stronger hashing algorithm than MD5 or SHA-1, which are vulnerable to collisions and rainbow table attacks.

PBKDF2WithHmacSHA256: This is a recommended key derivation function (KDF) that can be used to generate a strong and unique key from a password. It is an iterative process that uses a salt and a large number of iterations to make the computation slow and resistant to brute-force attacks.

### 13. What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?(把这⼏个名字看熟悉也⾏)
In Spring Security, the following are some of the key interfaces and classes related to user authentication:

UserDetailsService: This is an interface that provides a way to retrieve user information from a data store, such as a database or LDAP directory. It has a single method, loadUserByUsername(), which returns a UserDetails object containing the user's username, password, and other details, such as authorities and account status.

AuthenticationProvider: This is an interface that defines how to authenticate a user based on the user's credentials, such as a username and password. It has a single method, authenticate(), which takes an Authentication object representing the user's credentials and returns an authenticated Authentication object, or throws an AuthenticationException if authentication fails.

AuthenticationManager: This is an interface that delegates the authentication request to one or more AuthenticationProviders, and returns an authenticated Authentication object, or throws an AuthenticationException if all providers fail to authenticate the user.

AuthenticationFilter: This is a class that intercepts incoming HTTP requests and attempts to authenticate the user based on the credentials provided in the request, such as in the HTTP header or request parameters. It uses an AuthenticationManager to authenticate the user, and upon successful authentication, creates a SecurityContext containing the authenticated user's details, and stores it in the SecurityContextHolder.

In summary, the UserDetailsService is responsible for retrieving user information from a data store, the AuthenticationProvider is responsible for authenticating the user based on the user's credentials, the AuthenticationManager is responsible for delegating the authentication request to one or more AuthenticationProviders, and the AuthenticationFilter is responsible for intercepting HTTP requests and attempting to authenticate the user based on the credentials provided in the request. Together, these interfaces and classes form the core of the Spring Security authentication process.

### 14. What is the disadvantage of Session? how to overcome the disadvantage?
There are several disadvantages of using HTTP sessions, including:

Server-side storage: Session data is stored on the server, which requires additional storage and can impact server performance, especially in high-traffic applications.

Scalability: As the number of concurrent users increases, the amount of server-side storage required for session data also increases, which can limit scalability.

Timeouts: Session data is often stored on the server for a certain period of time, and if a user's session expires, they may lose data or have to log in again.

Security: Sessions can be hijacked if session IDs are compromised or stolen, leading to potential security breaches.

To overcome these disadvantages, there are several approaches that can be taken:

Use token-based authentication: Token-based authentication, such as JSON Web Tokens (JWT), eliminates the need for server-side storage by encoding user information into the token itself. This approach is scalable and secure, but may require additional setup and configuration.

Use stateless session management: Stateless session management stores session data in the client's browser or in a third-party service, rather than on the server. This approach reduces the impact of session data on server performance, but may require additional setup and configuration.

Use caching: Caching can help reduce the impact of session data on server performance by storing frequently accessed data in memory or on disk. This approach can improve scalability and performance, but may require additional configuration and management.

Use session clustering: Session clustering distributes session data across multiple servers, which can improve scalability and reduce the impact of server-side storage on individual servers. This approach requires additional setup and configuration, but can be effective in high-traffic applications.

### 15. how to get value from application.properties?
In Spring Boot, you can use the @Value annotation to inject values from properties files into your Spring components. Here's an example of how to do this:

Define your properties in the application.properties file:

```java
app.name=MyApp
app.version=1.0.0
```
Inject the values into your Spring component using the @Value annotation:

```java
@Component
public class MyComponent {
    @Value("${app.name}")
    private String appName;
    
    @Value("${app.version}")
    private String appVersion;
    
    // Use the values in your component
    public void doSomething() {
        System.out.println("Running " + appName + " version " + appVersion);
    }
}
```
In this example, the @Value annotation is used to inject the values of app.name and app.version into the appName and appVersion fields of the MyComponent class. The values can then be used in the doSomething() method or any other method within the class.

### 16. What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?
configure(HttpSecurity http) is used to configure the security settings for HTTP requests. This method defines which requests should be allowed or denied based on the authentication and authorization settings. It also configures settings such as cross-site request forgery (CSRF) protection, session management, and login/logout handling.

configure(AuthenticationManagerBuilder auth) is used to configure the authentication settings for the application. This method defines how users are authenticated and what credentials they need to provide. It also specifies the user details service to use for authentication, and any custom authentication providers.

### 17. What is Spring security authentication and authorization?
Authentication is the process of verifying the identity of a user or system. In the context of Spring Security, this typically involves validating a user's credentials (such as username and password) against some type of data store, such as a database or LDAP server. Spring Security provides a range of authentication options, including form-based authentication, OAuth2, and OpenID Connect, among others.

Authorization is the process of determining whether a user is allowed to perform a particular action or access a particular resource. In Spring Security, authorization is typically based on roles, which are collections of permissions that determine what actions or resources a user is allowed to access. Spring Security provides a variety of ways to implement authorization, including through configuration-based rules, expressions, or custom access decision voters.

In summary, Spring Security authentication and authorization work together to ensure that only authorized users can access the resources and perform the actions they are allowed to do within an application.