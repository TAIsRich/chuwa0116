### 2. What is the authentication?
Authentication is the process of recognizing a user’s identity. It is the mechanism of associating an incoming request with a set of identifying credentials. The credentials provided are compared to those on a file in a database of the authorized user’s information on a local operating system or within an authentication server.

### 3. What is the authorization?
Authorization is the process of giving someone the ability to access a resource.

### 4. What is the difference between authentication and authorization?
| authentication  | authorization |
| ------------- |:-------------:|
| In authentication process, users or persons are verified. | In authorization process, users or persons are validated |
| It is done before the authorization process.  | It is done after the authentication process. |
| It needs usually user's login details | It needs user's privilege or security levels. |
| Authentication determines whether the person is user or not. | Authorization determines what permission do user have. |
| Generally, transmit information through an ID token  | Generally, transmit information through an Access Token. |

### 5. What is HTTP Session?
Sessions are used to temporarily store data on the server so that it can be utilized on a variety of different websites. To put it more simply, a session is the amount of time that a user spends engaged in a particular activity. This period of time begins when the user accesses any website or program and continues until the user exits the application or shuts down the computer.

Because the HTTP protocol does not keep track of the user's status, the web server does not recognize the user as they are navigating the apps available on the internet. The information that the user enters into the program on the home page or any other page will not be moved to any other pages in the application. Sessions are what are used to remove this limitation from the game. Session variables, which can be of any sort, are where the user's data can be saved if they are chosen to do so. The data that is stored by session variables is either encrypted or converted to a binary form on the server, which protects the data from being accessed by a third party.

When the user of the application logs out of that application or closes down their computer, the session value is automatically detached. It is necessary for the session values to be saved in the database if they are to be retained for a longer period of time. Every single session is unique to the individual user, and there is no limit to the number of sessions that can be used within a single application because there are no constraints placed on it. A user can be recognized with the assistance of a session, which is a one-of-a-kind number that is kept on the server in the form of a cookie, a form field, or a URL.

The Session ID, which is a one-of-a-kind number that is temporarily stored on the server, is what is used to identify the user. It is either a cookie, a form field, or a URL that is saved.

### 6. What is Cookie?
Cookies are text files with small pieces of data — like a username and password — that are used to identify your computer as you use a computer network. Specific cookies known as HTTP cookies are used to identify specific users and improve your web browsing experience.

Data stored in a cookie is created by the server upon your connection. This data is labeled with an ID unique to you and your computer.

When the cookie is exchanged between your computer and the network server, the server reads the ID and knows what information to specifically serve to you.

### 7. What is the difference between Session and Cookie?
Despite the fact that cookies and sessions are both ways to store data on a server or on web pages, the way in which the data is accessed is distinct between the two methods. The data that is kept in cookies is solely kept on the client's side, whereas the information that is kept in sessions is kept on both the client and server's sides.

Cookies are considered to be less safe than sessions since a third-party can manipulate the data that is stored in them, whereas sessions are stored in an encrypted form that the user alone can read.

Sessions also save the passwords on the computer and form data, which means that every time the user accesses an application, that program will not ask the user to log in again. This is because the passwords and form data are saved.

| Cookie  | Session |
| ------------- |:-------------:|
| Cookies are client-side files that are stored on a local computer and contain user information | Sessions are server-side files that store user information |
| Cookies expire after the user specified lifetime  | The session ends when the user closes the browser or logs out of the program  |
| It can only store a limited amount of data.  | It is able to store an unlimited amount of information.  |
| Cookies can only store up to a maximum of 4 KB of data in a browser.  | There is a maximum memory restriction of 128 megabytes that a script may consume at one time. However, we are free to maintain as much data as we like within a session. |
| It is not necessary for us to execute a function in order to get cookies going because they are stored on the local computer.  | Utilizing the session start()method is required before we can begin the session. |
| Cookies are used to store information in a text file.  | The data is saved in an encrypted format during sessions. |

### 8. How do we use session and cookie to keep user information across the the application?
The client request to the server via GET or POST method. The sessionID is created on the server, and it saves the sessionID into the database. It returns the sessionId with a cookie as a response to the client. Cookie with sessionID stored on the browser is sent back to the server. The server matches this id with the saved sessionID and sends a response HTTP200.

### 9. What is JWT?
JSON Web Token (JWT) is an open standard (RFC 7519) that defines a compact and self-contained way for securely transmitting information between parties as a JSON object. This information can be verified and trusted because it is digitally signed. JWTs can be signed using a secret (with the HMAC algorithm) or a public/private key pair using RSA or ECDSA.

### 10. What is the spring security filter?
Spring Security maintains a filter chain internally where each of the filters has a particular responsibility and filters are added or removed from the configuration depending on which services are required. 

### 11. decribe how do JWT work(slides 里有图， 26页)
1. The end user logs in, the client application sends an authentication request to API Gateway or to any third-party JWT issuer, to obtain a JWT token.
2. If API Gateway is the JWT issuer, then it validates the user or the application. If the user or application credentials are valid, API Gateway generates the JSON token using a private key that was specified in the JWT configuration, and sends the generated token to the client.
If the user credentials are invalid, API Gateway returns a specific error response.
3. Client sends the generated JSON token in the HTTP Authorization request header as a Bearer token to access the protected API in API Gateway.
4. API Gateway first identifies the application based on claims from the JWT, then validates the JWT using the public certificate of the issuer (the issuer can be API Gateway or a third-party issuer) and provides access to the protected resources.
If the validation fails, API Gateway returns a specific error response.

### 12. Do you use any Encoder to encode Password?
Yes. In Java, I have used BCryptPasswordEncoder, which is part of the Spring Security framework. BCryptPasswordEncoder uses a strong cryptographic hashing algorithm to encode passwords and includes a salt to prevent attacks such as rainbow table attacks.

### 13. What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?(把这几个名字看熟悉也行)
In Spring Security, these are key components in the authentication process:

- UserDetailsService: A UserDetailsService is responsible for loading user-specific data, such as usernames, passwords, and authorities, from a data source. The data source can be a relational database, LDAP server, or any other authentication provider. The UserDetailsService is typically used by an AuthenticationProvider to authenticate a user.
- AuthenticationProvider: An AuthenticationProvider is responsible for authenticating a user based on the credentials provided in an Authentication object. The AuthenticationProvider can use one or more UserDetailsService implementations to load user-specific data and validate the credentials. Once a user is authenticated, the AuthenticationProvider creates an Authentication object containing the user's information and authorities.
- AuthenticationManager: An AuthenticationManager is responsible for managing the authentication process. It typically consists of one or more AuthenticationProvider implementations, which are used to authenticate users. When a user attempts to authenticate, the AuthenticationManager delegates to the appropriate AuthenticationProvider to perform the authentication.
- AuthenticationFilter: An AuthenticationFilter is responsible for processing incoming requests and extracting authentication information from them. It typically reads credentials from a request, creates an Authentication object, and passes it to an AuthenticationManager for authentication. If the authentication is successful, the AuthenticationFilter creates a SecurityContext containing the authenticated user's information and sets it in the SecurityContextHolder for the duration of the request.

These components work together to provide a flexible and customizable authentication framework in Spring Security. By configuring the appropriate UserDetailsService, AuthenticationProvider, AuthenticationManager, and AuthenticationFilter, you can implement a wide range of authentication scenarios to meet the specific security requirements of your application.

### 14. What is the disadvantage of Session? how to overcome the disadvantage?
The biggest problem is that the session ID approach assumes something — that there is always just one monolithic server web application. That used to be the case typically in the past. But that’s no longer the case these days.

You have multiple servers that share the load that sit behind a load balancer. When a request comes in, the load balancer decides which server to route the request to. So, here’s the problem. The user could have had their login request routed to one server, but the next request goes through the load balancer and to a completely different server. Now this new server has no idea about this previous exchange

Solutions:
* Introduce a shared session cache that all these servers save sessions to and look up session tokens from. This is a typical use case for a Redis cache sitting over here for this very reason.

* Use JWT. JWTs are self-contained tokens that contain all the information necessary for authentication and authorization, including user information and permissions. They do not require server-side storage, making them more scalable and less resource-intensive than sessions.

### 15. how to get value from application.properties?
- Use the `@Value` annotation and access the property in whichever Spring bean you're using
```Java
@Value("${userBucket.path}")
private String userBucketPath;
```

-  injecting org.springframework.core.env.Environment to bean.
```Java
@Autowired
private Environment env;
....
public void method() {
    .....  
    String path = env.getProperty("userBucket.path");
    .....
}
```

- use `@ConfigurationProperties` annotation

    - This is mostly used in Spring projects to load configuration properties (map values from .properties( .yml also supported) to a POJO).

    - It initializes an entity based on property data.

    - `@ConfigurationProperties` identifies the property file to load.

    - `@Configuration` creates a bean based on configuration file variables.

```
@ConfigurationProperties(prefix = "user")
  @Configuration("UserData")
  class user {
    // Property & their getter / setter
  }

  @Autowired
  private UserData userData;

  userData.getPropertyName();
 ```


### 16. What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?
- configure(HttpSecurity) allows configuration of web based security at a resource level, based on a selection match - e.g. The example below restricts the URLs that start with /admin/ to users that have ADMIN role, and declares that any other URLs need to be successfully authenticated.
- configure(AuthenticationManagerBuilder) is used to establish an authentication mechanism by allowing AuthenticationProviders to be added easily

### 17. What is Spring security authentication and authorization?
 Authentication is the process of knowing and identifying the user that wants to access.
 
 Authorization is the process to allow authority to perform actions in the application.
We can apply authorization to authorize web request, methods and access to individual domain.
