# hw45-SpringSecurity

## 1 List all annotations
see annotations.md

## 2. What is the authentication?
Authentication is used by a server when the server needs to know exactly who is accessing their information or site.
Usually, authentication by a server entails the use of a user name and password. Other ways to authenticate can be through cards, retina scans, voice recognition, and fingerprints.

## 3. What is the authorization?
Authorization is a process by which a server determines if the client has permission to use a resource or access a file.

## 4. What is the difference between authentication and authorization?
Authentication verifies the identity of a user or service, and authorization determines their access rights.

## 5. What is HTTP Session?
HTTP sessions is an industry standard feature that allows Web servers to maintain user identity and to store user-specific data during multiple request/response interactions between a client application and a Web application.
## 6. What is Cookie?
HTTP cookies are small blocks of data created by a web server while a user is browsing a website and placed on the user's computer or other device by the user's web browser. Cookies are placed on the device used to access a website, and more than one cookie may be placed on a user's device during a session.

## 7. What is the difference between Session and Cookie?
Cookies are client-side files on a local computer that hold user information. Sessions are server-side files that contain user data. Cookies end on the lifetime set by the user. When the user quits the browser or logs out of the programmed, the session is over.

## 8. How do we use session and cookie to keep user information across the application?
When a user first visits a website or logs in, a session is created, and a unique session ID is generated and stored as a cookie in the user's browser. The session ID is used to retrieve the session data on the server side, allowing the application to maintain stateful behavior.

## 9. What is JWT?
It is compact, readable and digitally signed using a private key/ or a public key pair by the Identity Provider(IdP). So the integrity and authenticity of the token can be verified by other parties involved.

## 10. What is the spring security filter?
The Spring Security Filter is a chain of filters that intercepts incoming HTTP requests to your web application and applies security-related functionality to them. Each filter in the chain performs a specific task, such as authentication, authorization, session management, CSRF protection, and more.

## 11. describe how do JWT work(slides ⾥有图， 26页)
- user logs in, server authenticate user and generate JWT and return to the user
- user sends another request with JWT, server validates JWT using secrete key and return the response.

## 12. Do you use any Encoder to encode Password?
We use the PasswordEncoder that is defined in the Spring Security configuration to encode the password. For example, the passwords are encoded with the bcrypt algorithm because we set the PasswordEncoder as the password encoder in the configuration.

## 13. What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?(把这⼏个名字看熟悉也⾏)
UserDetailService: UserDetailService is an interface in Spring Security that provides user information to the authentication process. It has a method called loadUserByUsername() that loads user information from a data source (like a database) and returns a UserDetails object that contains information like the user's username, password, and roles. This information is used by Spring Security to authenticate the user.

AuthenticationProvider: AuthenticationProvider is an interface that performs authentication against a user repository. It takes an Authentication object (containing user credentials) and returns an authenticated Authentication object if the user is authenticated. AuthenticationProvider has a method called authenticate() that takes an Authentication object and returns an authenticated Authentication object.

AuthenticationManager: AuthenticationManager is responsible for authenticating a user. It takes an Authentication object (containing user credentials) and passes it to one or more AuthenticationProvider instances to authenticate the user. If any of the AuthenticationProvider instances return a successfully authenticated Authentication object, AuthenticationManager returns that object, otherwise, it throws an exception indicating that authentication failed.

AuthenticationFilter: AuthenticationFilter is a servlet filter that intercepts incoming requests to a web application and performs authentication. It takes the user's credentials (like username and password) from the request and uses an AuthenticationManager to authenticate the user. If the user is authenticated, AuthenticationFilter creates a security context for the user and attaches it to the request for use by other components in the application. If the user is not authenticated, the filter redirects the user to the login page.

## 14. What is the disadvantage of Session? how to overcome the disadvantage?
Server-side storage: Sessions require server-side storage, which can be a problem if you have limited server resources or if you are using a distributed environment.

Scalability issues: Because sessions require server-side storage, scaling a web application can become difficult as the number of users increases.

Security concerns: Sessions can be hijacked if a user's session ID is stolen, leading to potential security vulnerabilities.

Increased network traffic: Each time a session is created, modified, or destroyed, additional network traffic is generated, which can slow down your application's response times.

Solutions

Use client-side storage: You can use client-side storage mechanisms like cookies or localStorage to store session data, which can reduce server-side storage requirements.

Use a distributed cache: You can use a distributed cache like Redis to share session data across multiple servers in a distributed environment.

Use stateless authentication: Implementing stateless authentication mechanisms like JWT (JSON Web Tokens) can help reduce server-side storage requirements and improve scalability.

## 15. how to get value from application.properties?
by using the @Value annotation or the Environment object.

## 16. What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?
configure(HttpSecurity http) is responsible for configuring security settings for specific HTTP requests in the application. This method defines which security rules should apply to specific URLs, and how to handle authentication and authorization.

configure(AuthenticationManagerBuilder auth) is responsible for configuring the authentication mechanism for the application. This method defines how the application should authenticate users, including which data store to use (such as a database or LDAP), which authentication protocol to use (such as OAuth or SAML), and how to handle passwords.

## 17. What is Spring security authentication and authorization?
Spring Security supports a wide range of authentication mechanisms, including:

Form-based authentication: This is the most common way to authenticate users in web applications. The user is prompted to enter a username and password, which are then verified against a user database.

Token-based authentication: This mechanism uses a token (such as a JWT) to authenticate users. The token is usually generated by a third-party service, and can be used to authenticate users across multiple applications.

SSO (Single Sign-On): This allows users to log in once and access multiple applications without having to enter their credentials again. Spring Security supports several SSO protocols, including OAuth2 and OpenID Connect.

Spring Security provides a powerful and flexible authorization mechanism based on roles and permissions. You can define custom roles and permissions for your application, and configure Spring Security to enforce those rules.

## 18 reading... omitted




