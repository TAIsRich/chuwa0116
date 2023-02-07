#@Override
类或接口继承时用于标记重写的方法
```java
class fruit{
    public class eat{
        System.out.println("eat fruit");
    }
}
class apple extends fruit{
    @Override
    public class eat{
        System.out.println("eat apple");
    }
}
```
#@Deprecated
标记过时的元素
```java
public class Hero {
    @Deprecated
    public void say(){
        Log.d("Hero","I have nothing to say");
    }
    
}
```
#@Test
标记test接口，用于测试
```java
public class MyMathTest {

    @Test
    public void add() {
    }
}
```
#@Service
在service层前
```java
@Service
public class service{
    
}
```
#@Component
组件，没有明确的角色,用于把当前类对象存入Spring容器中。

#@Controller
用于cotrller层前。
```java
@Controller
public class controller{
    
}
```
#@Repository
用在DAO层
```java
@Repository
public class DAO{
    
}
```
#@RestController
是@ResponseBody和@Controller的组合注解。可以返回json
```java
@RestController
public class HelloController {

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String sayHello(){
        return "hello";
    }
}
```
#@RequestMapping
配置url映射，作用在控制器的某个方法上，也可以作用在此控制器类上。
```java
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method= RequestMethod.GET)
    public String sayHello(){
        return "hello";
    }
}
```
#@Autowired
可以对成员变量、方法和构造函数进行标注，来完成自动装配的工作，@Autowired标注可以放在成员变量上，也可以放在成员变量的set方法上，也可以放在任意方法上表示，自动执行当前方法，如果方法有参数，会在IOC容器中自动寻找同类型参数为其传值。
```java
public class MovieRecommender {
 
    private final CustomerPreferenceDao customerPreferenceDao;
 
    @Autowired
    private MovieCatalog movieCatalog;
 
    @Autowired
    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
        this.customerPreferenceDao = customerPreferenceDao;
    }
 
    // ...
}
```
#@PostMapping    
@PostMapping是@RequestMapping注解的专用版本，用作@RequestMapping(method = RequestMethod.POST)的快捷方式。 @PostMapping带注解的方法处理与给定 URI 表达式匹配的 HTTP POST请求。
```java
@PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
public void addMember(@RequestBody Member member) {
	//code
}
```
#@GetMapping
@GetMapping是@RequestMapping注解的专用版本，用作@RequestMapping(method = RequestMethod.GET)的快捷方式。 @GetMapping带注解的方法处理与给定 URI 表达式匹配的 HTTP GET请求。
```java
@GetMapping("/members/{id}")
public String getMembers(Model model) {
	return "member";
}
```
#@PutMapping
同上，处理Put请求
```java
@PutMapping()
public void putMemebers(@RequestBody Model model){
    //code
}
```
#@DeleteMapping
同上，处理Delete请求
```java
@DeleteMapping()
public void deleteMemebers(@RequestBody Model model){
    //code
}
```