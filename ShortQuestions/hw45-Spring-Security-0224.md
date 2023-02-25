1. List all of the annotations you learned from class and homework to
    annotaitons.md
2. What is the authentication?  
Authentication is the process of determining whether someone or something is, in fact, who or what it says it is. Authentication technology provides access control for systems by checking to see if a user's credentials match the credentials in a database of authorized users or in a data authentication server. In doing this, authentication assures secure systems, secure processes and enterprise information security.
3. What is the authorization?  
   Authorization is the process of giving someone the ability to access a resource
4. What is the difference between authentication and authorization?  
   Authentication and authorization are two vital information security processes that administrators use to protect systems and information. Authentication verifies the identity of a user or service, and authorization determines their access rights.
5. What is HTTP Session?  
   HTTP Session is a mechanism used by web applications to maintain user-specific state information across multiple requests and responses between the client and server.
6. What is Cookie?  
   Cookies are text files with small pieces of data — like a username and password — that are used to identify your computer as you use a computer network.
7. What is the difference between Session and Cookie?  
Session and Cookie are both mechanisms used by web applications to maintain state information between the client and the server, but there are some key differences between them.
* Scope: Cookies are stored on the client side, usually in the form of text files, and can be accessed and modified by the client or the server. Sessions, on the other hand, are stored on the server side, usually in memory or a database, and can only be accessed and modified by the server. 
* Security: Cookies can be easily modified by the client or a third party, making them vulnerable to attacks such as cookie tampering and session hijacking. Sessions are generally more secure than cookies because they are stored on the server side and can be encrypted and protected using various security mechanisms. 
* Persistence: Cookies can be configured to have a longer lifespan and can persist even after the client's browser is closed. Sessions, on the other hand, are typically short-lived and expire after a period of inactivity or when the client's browser is closed. 
* Usage: Cookies are typically used to store small amounts of data, such as user preferences and login credentials, while sessions are used to store more complex data, such as shopping cart contents and user-specific information.
8. How do we use session and cookie to keep user information across the the
    application?  
   In a web application, we can use session and cookie to keep user information across the application.

> Session:  
> > When a user logs in to a web application, a session is created on the server-side, and a unique session ID is generated and stored in a cookie on the client-side. This session ID is used to identify the user's session on subsequent requests.  
> > We can store user information in the session object, which is available to all the pages within the same session.  
> > To use session in Java, we can use the HttpSession object. We can store data in the session object using the setAttribute() method, and retrieve data using the getAttribute() method.    

> Cookie:
> > A cookie is a small piece of data that is sent from a web server to a user's web browser and is stored on the user's computer as a text file.  
> > We can store user information in the cookie, which is available to all the pages within the same domain.  
> > To use cookie in Java, we can use the Cookie class in the javax.servlet.http package. We can create a new cookie using the Cookie() constructor, set its value using the setValue() method, and add it to the response using the addCookie() method. To retrieve a cookie, we can use the getCookies() method of the request object.  
9. What is JWT?  
   JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA.
10. What is the spring security filter?  
    Spring Security filter is a set of filters that are added to the Servlet filter chain to handle security concerns in a Spring-based web application. These filters perform various security-related tasks such as authentication, authorization, and other security-related functions like session management, remember-me functionality, and logout handling.
11. decribe how do JWT work(slides 里有图， 26页)  
* A user logs into a web application with their credentials, such as username and password. 
* The web application verifies the user's credentials and generates a JWT token that contains some claims or information about the user, such as their username, role, and expiration time. 
* The JWT token is returned to the user as a response to their login request. 
* The user stores the JWT token, typically in local storage or a cookie, and includes it in all subsequent requests to the application. 
* The application receives the request and extracts the JWT token from the request header or query parameter. 
* The application validates the JWT token by checking the signature and expiration time to ensure that the token has not been tampered with or expired. 
* If the token is valid, the application extracts the user information from the token's claims and uses it to authorize the user to perform the requested action. 
* If the token is invalid, the application rejects the request and may prompt the user to log in again.
12. Do you use any Encoder to encode Password?  
Such as Spring Security, Jasypt, or Apache Shiro.
13. What is UserDetailService? AuthenticationProvider?AuthenticationManager?
    AuthenticationFilter?(把这几个名字看熟悉也行)
* UserDetailsService: This is an interface that provides a method to load user-specific data. It is used to retrieve user details from a data store or any other source, such as a file or an LDAP server. 
* AuthenticationProvider: This is an interface that authenticates the user by taking the user's credentials and comparing them with the credentials stored in the database. It can also perform other tasks, such as checking if the account is locked, disabled, or expired. 
* AuthenticationManager: This is an interface that delegates the authentication process to an AuthenticationProvider. It manages the list of AuthenticationProviders and selects the appropriate one based on the type of authentication request. 
* AuthenticationFilter: This is a filter that intercepts the incoming request and checks if the request has a valid token. If not, it redirects the user to the login page.
14. What is the disadvantage of Session? how to overcome the disadvantage?  
    The main disadvantage of using sessions is that they can consume a significant amount of server resources, especially if a large number of users are accessing the application simultaneously. This can lead to decreased performance and scalability issues.

    To overcome this disadvantage, some possible solutions include:

    * Use of distributed caching mechanisms to store session data outside of the application server's memory. This can improve performance by reducing the load on the server and providing better scalability. 
    * Limit the size and duration of sessions. By setting an appropriate timeout value and configuring the application to invalidate sessions when they are no longer needed, the amount of server resources consumed by sessions can be minimized. 
    * Use of stateless authentication mechanisms, such as JSON Web Tokens (JWT), which do not require server-side storage of session data. This can simplify the application architecture and improve scalability.
15. how to get value from application.properties?  
    in Spring, we can get the values from the application.properties file by using the @Value annotation or the Environment object.
```java
@Component
public class MyComponent {

    @Value("${my.property}")
    private String myProperty;

    // ...
}
```
16. What is the role of configure(HttpSecurity http) and
    configure(AuthenticationManagerBuilder auth)?  
    configure(HttpSecurity http) is used to configure the security of the web application based on the HTTP request. In this method, you can specify which endpoints require authentication, what kind of authentication is needed, and what roles are required to access certain endpoints. You can also configure other security features, such as CSRF protection and session management.  

    configure(AuthenticationManagerBuilder auth) is used to configure the authentication mechanism for the web application. In this method, you can specify the user details service, authentication provider, and password encoder. You can also specify how users will be authenticated, such as through a database or LDAP server.

17. What is Spring security authentication and authorization?  
    Spring Security is a framework that provides authentication, authorization, and other security features for Spring-based applications.

    Authentication is the process of verifying the identity of a user. In Spring Security, this can be done through various mechanisms such as username and password, token-based authentication like JSON Web Tokens (JWT), OAuth2, and more.

    Authorization is the process of determining whether a user has access to a particular resource or functionality within the application. This is typically based on the user's role, permissions, or other attributes.
18. Reading, 泛读一下即可，自己觉得是重点的，可以多看两眼。https://www.intervi
    ewbit.com/spring-security-interview-questions/#is-security-a-cross-cutting-con
    cern
    a. 1-12
    b. 17 - 30
 