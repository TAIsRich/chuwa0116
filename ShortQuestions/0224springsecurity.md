1. List all of the annotations you learned from class and homework to annotaitons.md
2. What is the authentication?
    * Authentication determines whether the person is a user or not.
3. What is the authorization?
    * Authorization determines what kind of authorities dose the use have.
4. What is the difference between authentication and authorization?
    * Authentication determines whether the person is a user or not.Authorization determines what kind of authorities dose the use have.
    * Authentication is done before Authorization. 
5. What is HTTP Session?
    * HTTP protocol is stateless. HTTP sessions is an industry standard feature that allows Web servers to maintain user identity and to store user-specific data
6. What is Cookie?
   * Cookies are text files with small pieces of data — like a username and password — that are used to identify your computer as you use a computer network.
7. What is the difference between Session and Cookie?
    * Cookies are kept in client-side. Session are kept in server-side.
    * Cookies end on the lifetime set by the user. When the user quits the browser or logs out of the programmed, the session is over.
8. How do we use session and cookie to keep user information across the application?
    * The session cookie is a server-specific cookie that cannot be passed to any machine other than the one that generated the cookie. 
    * The server creates a “session ID” which is a randomly generated number that temporarily stored in cookie. 
    * The cookie allows the server to identify the user and retrieve the user session from the session database, so that the user session is maintained.
9. What is JWT?
    * JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object.
10. What is the spring security filter?
    * If you use spring security in a web application, the request from the client will go through a chain of security filters. Security filters adapt this concept from Web Servlets. Basically, you have a controller to receive user requests. Security filters will intercept the incoming request and perform validation for authentication or authorization before redirecting the request to the target controller.
11. describe how do JWT work(slides 里有图， 26页)
    * The client authenticate with user name and password.
    * The server validate the username and password. Generate the JWT using secret key and return the generated jwt.
    * The client will use jwt in header when requesting. The server will validate jwt using secret key. If it's validated, the server will return the response.
12. Do you use any Encoder to encode Password?
    * Yes. I used BCryptPasswordEncoder in Spring Security in memory configure.
13. What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?(把这几个名字看熟悉也行)
    * UserDetailService: retrieve user detail information and authorities
    * AuthenticationProvider: An AuthenticationProvider is an abstraction for fetching user information from a specific repository (like a database, LDAP, custom third party source, etc. ). It uses the fetched user information to validate the supplied credentials.
    * AuthenticationManager: a static class that manages the authentication modules that an application uses.
    * AuthenticationFilter: is used to resolve the appropriate authentication manager from context to perform authentication.
14. What is the disadvantage of Session? how to overcome the disadvantage?
    * Performance overhead in case of large number of user, because of session data stored in server memory.
    * Overhead involved in serializing and De-Serializing session data because in case of StateServer and SQLServer session mode we need to serialize the object before store.
    * Use redis as cache database to store session information.
15. how to get value from application.properties?
    * @Value("${<property.name>}")
16. What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?
    * configure(HttpSecurity http): It allows configuring web based security for specific http requests.
    * configure(AuthenticationManagerBuilder auth):  SecurityBuilder used to create an AuthenticationManager. Allows for easily building in memory authentication, LDAP authentication, JDBC based authentication, adding UserDetailsService, and adding AuthenticationProvider's.
17. What is Spring security authentication and authorization?
    * Authentication determines whether the person is a user or not.
    * Authorization determines what kind of authorities dose the use have.
18. Reading,泛读一下即可，自己觉得是重点的，可以多看两眼。https://www.intervi ewbit.com/spring-security-interview-questions/#is-security-a-cross-cutting-con cern
    a. 1-12
    b. 17 - 30
