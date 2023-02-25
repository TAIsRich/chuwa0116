# hw44-Spring-MVC-0220 - Hao Jia

### What is the authentication?
Use username and account to log in.

### What is the authorization?
After logged in, check the role of the user and determine the restriction and access to the user.

### What is the difference between authentication and authorization?
Authentication is to check if an user is valid, while authorization is to check the role of the user.

### What is HTTP Session?
HTTP session is a mechanism used in web applications to maintain state and preserve user data across multiple requests and responses between a client and a server.

### What is Cookie?
A cookie is a small piece of data that is sent from a website to a user's web browser and stored on the user's computer or mobile device. Cookies are commonly used in web applications to maintain state and personalize the user experience.

### What is the difference between Session and Cookie?
+ Data storage: Session data is stored on the server-side, while cookie data is stored on the client-side (i.e. the user's browser).

+ Data size: Cookies are limited in size, typically up to a few kilobytes, while session data can be much larger since it is stored on the server-side.

+ Lifespan: Cookies can be either session cookies (which are deleted when the user closes their browser) or persistent cookies (which remain on the user's computer until they expire or are deleted). Sessions, on the other hand, typically expire after a set period of inactivity.

+ Security: Sessions are generally considered more secure than cookies because the session data is stored on the server-side and cannot be easily accessed or modified by the user. Cookies, on the other hand, are stored on the client-side and can be manipulated by the user, potentially leading to security vulnerabilities.

### How do we use session and cookie to keep user information across the the application?
+ When a user logs in to the application, you can create a session on the server-side and associate it with the user's account. You can also create a cookie with a unique identifier (such as a session ID) and send it to the user's browser.

+ On subsequent requests from the user, the browser will include the cookie with the session ID, allowing the server to retrieve the corresponding session data and maintain the user's state across the application.

+ You can store user information such as their preferences, settings, and login status in the session data. This information can be accessed and updated as needed throughout the application.

+ You can also use cookies to store user information such as their language preference or shopping cart items, which can be accessed across multiple sessions.

+ To ensure security, you should use secure cookies (i.e. cookies sent over HTTPS) and validate the session ID on the server-side to prevent session hijacking or other attacks.

### What is JWT?
JSON Web Token, including Header, Payload, Signature.

### What is the spring security filter?
The Spring Security filter contains a list of filter chains and dispatches a request to the first chain that matches it.

### decribe how do JWT work(slides 里有图， 26页)
+ Post /authenticate with username and password
+ Validate the username and password. Generate the JWT using secret key
+ Return the generated JWT
+ GET /hello with JWT in the Header
+ Validate JWT using secret key
+ Return the response

### Do you use any Encoder to encode Password?
BCryptPasswordEncoder.

### What is UserDetailService? AuthenticationProvider?AuthenticationManager? AuthenticationFilter?(把这几个名字看熟悉也行)
+ UserDetailsService: This is an interface that defines how to load user-specific data, such as their username, password, and authorities. Implementations of this interface are responsible for retrieving user information from a data store, such as a database or LDAP server.

+ AuthenticationProvider: This is an interface that defines how to authenticate a user based on their credentials. Implementations of this interface typically delegate to a UserDetailsService to load the user's data, and then compare the user's password to a hashed value stored in the data store. If the password matches, the AuthenticationProvider constructs an authenticated token for the user, which is used to enforce authorization rules.

+ AuthenticationManager: This is a top-level interface that delegates to one or more AuthenticationProviders to authenticate a user. The AuthenticationManager is responsible for selecting the appropriate AuthenticationProvider based on the type of credentials provided (e.g. username/password, token, etc.), and verifying that the user's credentials are correct.

+ AuthenticationFilter: This is a filter that intercepts requests and attempts to authenticate the user based on the credentials provided. The AuthenticationFilter delegates to the AuthenticationManager to authenticate the user, and if successful, stores the authenticated token in the SecurityContextHolder for use in subsequent requests.

### What is the disadvantage of Session? how to overcome the disadvantage?
When the application is deployed in several places, if one failed, the user cannot use the this application anymore.

user JWT. Once the user is logged in, each subsequent request will include the JWT, allowing the user to access resources that are permitted with that token.

### how to get value from application.properties?
using @Value annotation.

### What is the role of configure(HttpSecurity http) and configure(AuthenticationManagerBuilder auth)?
configure(HttpSecurity http) configures authorization based on url. configure(AuthenticationManagerBuilder auto) adds properties to a new/existing authenticationManager, used to configure the AuthenticationManager, which is used for all userDetails, including the PasswordEncoder password machine.

### What is Spring security authentication and authorization?
Authentication verifies if a user is really the user by the correct credentials. Authorization gives the user different privilege to do certain things based on their role.

