#Spring Boot REST

##1.Defination: 
    1)@Controller: 
        @RequestMapping
        Marking @Contraoller on a class, along with the @RequestMapping annotiation, allows you to define multiple interfaces 
        wtihin a class. The class marked by @Controller is actually a SpringMVC Controller object. It is a controller classs where 
        the @RequestMapping methods are scanned  by the distrubution handler to distribute different requests to the corresponding 
        interface.
    2)@RestController
    
```
@RestController
//@RequestMapping
@RequestMapping("/api/v1/posts")
public class PostController {

}

```

##2.Common annotations for parameter binding:
    1)for handling request body: @RequestParam（）, @RequestBody
```
@PostMapping(path = "/json/user/set/name", produces = MediaType.APPLICATION_JSON_VALUE)
public User setUserName(@RequestParam String name) {
    user.setName(name);
    return user;
}

```

    2)for handling request URIs: @PathVariable
```
@PutMapping("/{id}")
public ResponseEntity<PostDTO> updatePostById(@RequestBody PostDTO postDTO, @PathVariable(name = "id") long id){
   PostDTO postResponse = postService.updatePost(postDTO, id);
   return new ResponseEntity<>(postResponse, HttpStatus.OK);
}
```
    3)for handling reqeust Headers: @RequestHeader, @CookieValue
```
@GetMapping(path = "/html/demo/header")
public String htmlHeader(@RequestHeader(value = "Accept") String acceptHeader, HttpServletRequest request) {
    return "<html><body>Request 'Accept' header value : " + acceptHeader + " </body></html>";
}

```

    4)for handling attributes: @SessionAttributes, @ModelAttribute


##3. Exception:
    1.@RestControllerAdvice

##4.Cross-Domain:
    1.@CrossOrigin


#Web MVC Annotation Driver

##1.Annotation Configuration:
    @Configuration

##2.Component Activation:
    @EnableWebMvc

##3.Custom Component:
    @WebMvcConfigurer

##4.Model Attribute:
    @ModelAttribute

##5.Request header:
    @RequestHeader

##6.Cookie:
    @CookieValue

##7.Check Parameter:
    @Valid, @Validated

##8.Annotation Processing:
    @ExceptionHandler

##9.Aspect Advice:
    @ControllerAdvice



##@Autowired：
    @Autowired is a annotation, which can annotate member variables, methods and constructors to complete the auto-assembly work. 
    @Autowired annotation can be placed on member variables, or on the set method of member variables, or on any method representation, 
    and automatically executes the current method. If the method has parameters, Parameters of the same type are automatically 
    found in the IOC container for their values.
```
@Autowired
    ItemRepository groceryItemRepo;

@Autowired
	CustomItemRepository customRepo;

```

##@Service
    @Service is used on class, and marks the current class as a service class. Adding this annotation can automatically inject 
    the current class into the spring container, which eliminates the need to define beans in the applicationContext.xml file.



##@RequestMapping(value = "/users", method =RequestMethod.GET)
##@RequestMapping(value = "/users", method =RequestMethod.POST)
##@RequestMapping(value = "/users", method =RequestMethod.PUT)
##@RequestMapping(value = "/users", method =RequestMethod.DELETE)







