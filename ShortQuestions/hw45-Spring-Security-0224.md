1. List all of the annotations you learned from class and homework to annotaitons.md

2. What is the authentication?
Authentication verifies the identity of a user or service.

3. What is the authorization?
Authorization determines their access rights.
Authorization is the process of granting someone to do something. 
4. What is the difference between authentication and authorization?
Authentication confirms that users are who they say they are. Authorization gives those users permission to access a resource.

5. What is HTTP Session?
HTTP sessions is an industry standard feature that allows Web servers to maintain user identity and to store user-specific data during multiple request/response interactions between a client application and a Web application.

6. What is Cookie?
Cookies are text files with small pieces of data — like a username and password — that are used to identify your computer as you use a computer network.

7. What is the difference between Session and Cookie?
Cookies are client-side files that are stored on a local computer and contain user information. Sessions are server-side files that store user information. Cookies expire after the user specified lifetime. The session ends when the user closes the browser or logs out of the program.

8. How do we use session and cookie to keep user information across the application?
Session cookies help create a better browsing experience by showing them potentially interesting items based on their browsing activities. These cookies also help a website identify every user throughout their browsing session. In other words, session cookies can be considered the memory of a website.

9. What is JWT?
SON Web Token (JWT) is an open standard (RFC 7519) for securely transmitting information between parties as JSON object. It is compact, readable and digitally signed using a private key/ or a public key pair by the Identity Provider(IdP).

10. What is the spring security filter?
Spring Security maintains a filter chain internally where each of the filters has a particular responsibility and filters are added or removed from the configuration depending on which services are required. The ordering of the filters is important as there are dependencies between them.

11. decribe how do JWT work(slides ⾥有图， 26页) 
    * The application or client requests authorization to the authorization server. This is performed through one of the different authorization flows. For example, a typical OpenID Connect compliant web application will go through the /oauth/authorize endpoint using the authorization code flow.
    * When the authorization is granted, the authorization server returns an access token to the application.
    * The application uses the access token to access a protected resource (like an API).

12. Do you use any Encoder to encode Password?
    BCryptPasswordEncoder().

13. What is UserDetailService? AuthenticationProvider AuthenticationManager? AuthenticationFilter?(把这⼏个名字看熟悉也⾏)
    * UserDetailsService is used by DaoAuthenticationProvider for retrieving a username, a password, and other attributes for authenticating with a username and password.\
    * AuthenticationProvider indicates a class can process a specific Authentication implementation.
    * The AuthenticationManager is the main strategy interface for authentication.
    * A Filter that performs authentication of a particular request. 

14. What is the disadvantage of Session? how to overcome the disadvantage?
 Performance overhead in case of large number of user, because of session data stored in server memory. Overhead involved in serializing and De-Serializing session data because in case of StateServer and SQLServer session mode we need to serialize the object before store. We can use redis to handle this problem.

15. how to get value from application.properties?
@Value("${xxxx}")

16. What is the role of configure(HttpSecurity http) and
configure(AuthenticationManagerBuilder auth)?
configure(HttpSecurity) allows configuration of web based security at a resource level, based on a selection match. Class AuthenticationManagerBuilder. SecurityBuilder used to create an AuthenticationManager . Allows for easily building in memory authentication, LDAP authentication, JDBC based authentication, adding UserDetailsService , and adding AuthenticationProvider 's.

17. What is Spring security authentication and authorization?
Authentication is the process of knowing and identifying the user that wants to access. Authorization is the process to allow authority to perform actions in the application. 