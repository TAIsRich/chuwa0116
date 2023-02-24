## Spring Security

Name: Zijun Zhou

##### 1.List all of the annotations you learned from class and homework to
`annotaitons.md`
The annotations are now updated in the `annotations.md`
##### 2. What is the authentication?
Authentication verifies the identity of a user or a service

##### 3. What is the authorization?
Authorization would determine the rights of the user or service

##### 4. What is the difference between authentication and authorization?
Take the server base on SpringBoot for example, the process of authentication is just to verify that you have the right to enter the server, however, which apis that user would have rights to access would be determined by the process of authorization. The apis which the user does not have rights to access would not permit that user to access.

##### 5. What is HTTP Session?
HTTP sessions is an industry standard feature that allows Web servers to maintain user identity and to store user-specific data during multiple request/response interactions between a client application and a Web application.

##### 6. What is Cookie?
HTTP cookies (also called web cookies, Internet cookies, browser cookies, or simply cookies) are small blocks of data created by a web server while a user is browsing a website and placed on the user's computer or other device by the user's web browser. Cookies are placed on the device used to access a website, and more than one cookie may be placed on a user's device during a session.

##### 7. What is the difference between Session and Cookie?
Cookie stores on the client's browser, however, the Session files are stored on the server. Cookie lifetime is determined by the user, however, the lifetime of session is determined by the duration of user using the service.

##### 8. How do we use session and cookie to keep user information across the the application?
We could actually maintain a session_id and its relevant data in the server-side, then, the server could set the cookie to contain that session_id. In this way, for the multiple requests sent by the user, the server could determine which information is related to that user.

##### 9. What is JWT?
JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA.

##### 10. What is the spring security filter
Spring Security maintains a filter chain internally where each of the filters has a particular responsibility and filters are added or removed from the configuration depending on which services are required. The ordering of the filters is important as there are dependencies between them.

##### 11. decribe how do JWT work
The client would first enter the authenticate url to let the system verify its identity, if successful, the system would set the user's cookie to a specific JWT. For the latter requests sent from the users, the users could be authenticated by validating their JWT using secret key stored in the server.

##### 12. Do you use any Encoder to encode Password?
Yes, I would often use BCryptPasswordEncoder to verify whether the user's password is correct.

##### 13. What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?
First, if a user has not been authenticated, the authenticationFilter would filter it, and then pass the authentication request to AuthenticationManager, then AuthenticationManager would delegate the authentication to AuthenticationProvider, if authenticated successfully, the relevant UserDetailService would be encapsulated in the Authentication class so that the user is now authenticated.


##### 14. What is the disadvantage of Session? how to overcome the disadvantage?

Performance overhead in case of large number of user, because of session data stored in server memory. 
This could be overcome by utilizing cookies, store some information on the users' cookie so that the server does not need to waste lots of memory to store users' information.


##### 15. how to get value from application.properties?
We could create a class specifically to read the properties from application.properties, and then mark it with @ConfiguationProperties(prefix="org"), in this way, all the properties prefixed with org would be automatically imported into the field of that class. In case we need to use that information, we could simply @Autowire that configuration properties class.

##### 16. What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?
This could help configure Spring Security so that we could do some advanced settings.

##### 17. What is Spring security authentication and authorization?
The authentication in Spring Security is just to use password encoder to match the input password and the correct password stored in the database, if correct, the spring security would authorize users by fetching their relevant roles.


