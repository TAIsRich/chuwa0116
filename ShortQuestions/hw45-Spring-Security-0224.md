1. List all of the annotations you learned from class and homework to
   annotations.md
2. What is the authentication?
   * It's the process of verifying are who your say you are, normally based on:
     1. Something you are: fingerprint, facial recognition
     2. Something you have: badge, student card
     3. Something you know: username and password
3. What is the authorization?
   * It refers to the range of abilities a specific user can perform
4. What is the difference between authentication and authorization?
   1. authentication verifies the user's identity, and if the user is verified, then authorization 
      decides what capabilities the user can have in the system.
5. What is HTTP Session?
    1. HTTP sessions is an industry standard feature that allows Web servers to maintain user identity and 
       to store user-specific data during multiple request/response interactions between a client application 
       and a Web application.
6. What is Cookie?
    1. Cookies are small files of information that a web server generates and sends to a web browser. 
      Web browsers store the cookies they receive for a predetermined period of time, or for the length of a 
    user's session on a website. They attach the relevant cookies to any future requests the user makes of the 
    web server.
7. What is the difference between Session and Cookie?
   1. Session: server-side file stored on remote web server, storage upto 128MB
   2. Cookie: client-side file stored on local computer, limited storage space
8. How do we use session and cookie to keep user information across the the
   application?
    1. Because HTTP protocols are stateless, and in order to maintain a state, we need session and cookie to
       preserve related user information.
9. What is JWT?
    1. Jason Web Tokens (JWT) is one of the very popular ways to implement user authorization in web apps,
       and they normally consist of three parts separated by dots(.)
10. What is the spring security filter?
    1. It's an engine that provided chained filters during the authentication process, examples:
        * SecurityContextPersistenceFilter (restores Authentication from JSESSIONID)
        * UsernamePasswordAuthenticationFilter (performs authentication)
        * ExceptionTranslationFilter (catch security exceptions from FilterSecurityInterceptor)
        * FilterSecurityInterceptor (may throw authentication and authorization except
11. decribe how do JWT work(slides 里有图， 26页)
    1. Client: Sends POST request with username and password to Server
    2. Server: Validate credentials and generate JWT using a secret key and send JWT back to Client
    3. Client: Sends GET request with JWT in the header instead of session id
    4. Server: Validate JWT using the secret key and return responses to the client
12. Do you use any Encoder to encode Password?
    1. Yes, it's the `PasswordEncoder` interface, implemented by `BCryptPasswordEncoder` to encoder our password.
13. What is UserDetailService? AuthenticationProvider?AuthenticationManager?
    AuthenticationFilter?(把这几个名字看熟悉也行)
    1. `UserDetialService`: an interface provided by Spring Security, can be implemented by overriding 
       `loadUserByUsername()`, which aims to retrieve the user data from the database using DAO
    2. `AuthenticationProvider`: defines how the JWT tokens can be generated, parsed, and validated
    3. `AuthenticationManager`: parse first time incoming request with username and password and generate JWT as response
       for the first time.
    4. `AuthenticationFilter`: parse incoming request with JWT and perform JWT validation using the AuthenticationProvider
14. What is the disadvantage of Session? how to overcome the disadvantage?
    1. You have to store the session id in a shared cache, for example, Redis, to handle the case of loadbalancer
       redirecting incoming requests into different servers.
    2. Instead of storing the user reference ID on server side, we can give the user a token which already have all the 
       related credentials and context encrypted into the token value, that way we don't need to use session id to store 
       the user reference information.
15. how to get value from application.properties?
     ```
     @Value("${my.property}")
     private String myProperty;
     ```
16. What is the role of configure(HttpSecurity http) and
    configure(AuthenticationManagerBuilder auth)?
    1. configure(HttpSecurity http): configures how the HTTP request are handled
    2. configure(AuthenticationManagerBuilder auth): configures how the User are authenticated, throught database
       or third-party provider
17. What is Spring security authentication and authorization?
    1. Spring authentication: is performed by a series of chained authentication providers, which can be configured 
    to use different authentication mechanisms

    2. Spring authorization: is typically performed by a series of chained authorization rules, which can be 
    configured to use different access control mechanisms, such as role-based access control
18. Reading, 泛读一下即可，自己觉得是重点的，可以多看两眼。https://www.intervi
    ewbit.com/spring-security-interview-questions/#is-security-a-cross-cutting-con
    cern
    a. 1-12
    b. 17 - 30
 