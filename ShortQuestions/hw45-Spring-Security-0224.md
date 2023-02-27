### What is the authentication?

Authentication is the act of validating that users are whom they claim to be. This is the first step in any security process. 



### What is the authorization?

Authorization in system security is the process of giving the user permission to access a specific resource or function. This term is often used interchangeably with access control or client privilege.



### What is the difference between authentication and authorization?

Authentication is who you are, authorization is I know who you are, and let't find out what can you do.



### What is HTTP Session?

HTTP sessions is an industry standard feature that allows Web servers to maintain user identity and to store user-specific data during multiple request/response interactions between a client application and a Web application.



### What is Cookie? 

Cookies are small files of information that a web server generates and sends to a web browser. Web browsers store the cookies they receive for a predetermined period of time, or for the length of a user's session on a website. They attach the relevant cookies to any future requests the user makes of the web server.



### What is the difference between Session and Cookie?

| Basis of Comparison | Cookie                                                       | Session                                                      |
| :------------------ | :----------------------------------------------------------- | ------------------------------------------------------------ |
| Definition          | Cookies are client-side files that are stored on a local computer and contain user information. | Sessions are server-side files that store user information.  |
| Expiry              | Cookies expire after the user specified lifetime.            | The session ends when the user closes the browser or logs out of the program. |
| Data storage        | It can only store a limited amount of data.                  | It is able to store an unlimited amount of information.      |
| Capacity            | Cookies can only store up to a maximum of 4 KB of data in a browser. | There is a maximum memory restriction of 128 megabytes that a script may consume at one time. However, we are free to maintain as much data as we like within a session. |
| Function            | It is not necessary for us to execute a function in order to get cookies going because they are stored on the local computer. | Utilizing the session start()method is required before we can begin the session. |
| Data Format         | Cookies are used to store information in a text file.        | The data is saved in an encrypted format during sessions.    |
| Storage             | Cookies are stored on a limited amount of data.              | A session can store an unlimited amount of data.             |



### How do we use session and cookie to keep user information across the application? 

Cookie is sent to the web server with every requests. Session keep user's information in the server side (shared cache).



### What is JWT?

**JWT**, or JSON Web Token, is an open standard used to share security information between two parties — a client and a server. Each JWT contains encoded JSON objects, including a set of claims. JWTs are signed using a cryptographic algorithm to ensure that the claims cannot be altered after the token is issued.



### What is the spring security filter?

Spring Security maintains a filter chain internally where each of the filters has a particular responsibility and filters are added or removed from the configuration depending on which services are required. The ordering of the filters is important as there are dependencies between them. If you have been using [namespace configuration](https://docs.spring.io/spring-security/site/docs/3.0.x/reference/ns-config.html), then the filters are automatically configured for you and you don't have to define any Spring beans explicitly but here may be times when you want full control over the security filter chain, either because you are using features which aren't supported in the namespace, or you are using your own customized versions of classes.



https://docs.spring.io/spring-security/site/docs/3.0.x/reference/security-filter-chain.html



### Decribe how do JWT work(slides 里有图， 26页)

1. Client: POST/authenticate with username and password.
2. Server: Validate the username and password. Generate JWT using secret key.
3. Server: Return the genereted key.
4. Client: GET /hello with JWT in the header.
5. Server: Validate JWT using secret key.
6. Server: Return the response.



### Do you use any Encoder to encode Password?

```java
public class PasswordEncoderGenerator {
    public static void main(String[] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new 
BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("admin"));
    }
}
```



### What is UserDetailService? AuthenticationProvider? AuthenticationManager? AuthenticationFilter?(把这几个名字看熟悉也行)

The ***UserDetailsService*** interface is used to retrieve user-related data. It has one method named *loadUserByUsername()* which can be overridden to customize the process of finding the user.

It is used by the *DaoAuthenticationProvider* to load details about the user during authentication

**An Authentication request is processed by an AuthenticationProvider,** and a fully authenticated object with full credentials is returned.

The standard and most common implementation is the *DaoAuthenticationProvider,* which retrieves the user details from a simple, read-only user DAO, the *UserDetailsService*. This User Details Service **only has access to the username** in order to retrieve the full user entity, which is enough for most scenarios.



**AuthenticationManager** trys to authenticate the passed [`Authentication`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/Authentication.html) object, returning a fully populated `Authentication` object (including granted authorities) if successful.



**AuthenticationFilter** 

A `Filter` that performs authentication of a particular request. An outline of the logic:

- A request comes in and if it does not match [`setRequestMatcher(RequestMatcher)`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/web/authentication/AuthenticationFilter.html#setRequestMatcher(org.springframework.security.web.util.matcher.RequestMatcher)), then this filter does nothing and the `FilterChain` is continued. If it does match then...
- An attempt to convert the `HttpServletRequest` into an [`Authentication`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/Authentication.html) is made. If the result is empty, then the filter does nothing more and the `FilterChain` is continued. If it does create an [`Authentication`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/Authentication.html)...
- The [`AuthenticationManager`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/authentication/AuthenticationManager.html) specified in [`AuthenticationFilter(AuthenticationManager, AuthenticationConverter)`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/web/authentication/AuthenticationFilter.html#(org.springframework.security.authentication.AuthenticationManager,org.springframework.security.web.authentication.AuthenticationConverter)) is used to perform authentication.
- The [`AuthenticationManagerResolver`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/authentication/AuthenticationManagerResolver.html) specified in [`AuthenticationFilter(AuthenticationManagerResolver, AuthenticationConverter)`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/web/authentication/AuthenticationFilter.html#(org.springframework.security.authentication.AuthenticationManagerResolver,org.springframework.security.web.authentication.AuthenticationConverter)) is used to resolve the appropriate authentication manager from context to perform authentication.
- If authentication is successful, [`AuthenticationSuccessHandler`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/web/authentication/AuthenticationSuccessHandler.html) is invoked and the authentication is set on [`SecurityContextHolder`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/core/context/SecurityContextHolder.html), else [`AuthenticationFailureHandler`](https://docs.spring.io/spring-security/site/docs/current/api/org/springframework/security/web/authentication/AuthenticationFailureHandler.html) is invoked



### What is the disadvantage of Session? how to overcome the disadvantage?

Disadvantages: Performance overhead in case of large volumes of data/user, because session data is stored in server memory. Overhead involved in serializing and de-serializing session data, because in the case of StateServer and SQLServer session modes, we need to serialize the objects before storing them.

Also we can use shared cache.



### how to get value from application.properties?

```java
@Value("${app.jwt-secret}")
```



### What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?



**configure(HttpSecurity)** allows configuration of web based security at a resource level, based on a selection match



**configure(AuthenticationManagerBuilder)** is used to establish an authentication mechanism by allowing AuthenticationProviders to be added easily



### What is Spring security authentication and authorization?



| **AUTHENTICATION**                                           | **AUTHORIZATION**                                            |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| In authentication process, the identity of users are checked for providing the access to the system. | While in authorization process, person’s or user’s authorities are checked for accessing the resources. |
| In authentication process, users or persons are verified.    | While in this process, users or persons are validated.       |
| It is done before the authorization process.                 | While this process is done after the authentication process. |
| It needs usually user’s login details.                       | While it needs user’s privilege or security levels.          |
| Authentication determines whether the person is user or not. | While it determines **What permission do user have?**        |
| Generally, transmit information through an ID Token.         | Generally, transmit information through an Access Token.     |
| **Example** : Employees in a company are required to authenticate through the network before accessing their company email. | **Example :** After an employee successfully authenticates, the system determines what information the employees are allowed to access. |

