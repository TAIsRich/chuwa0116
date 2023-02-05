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