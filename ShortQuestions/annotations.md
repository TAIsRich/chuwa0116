Common Annotation
@Override:
While overriding a method in the child class, we should use this annotation to mark that method. This makes code readable and avoid maintenance issues, such as: while changing the method signature of parent class, you must change the signature in child classes (where this annotation is being used) otherwise compiler would throw compilation error. This is difficult to trace when you haven’t used this annotation.

public class MyParentClass {

    public void justaMethod() {
        System.out.println("Parent class method");
    }
}


public class MyChildClass extends MyParentClass {

    @Override
    public void justaMethod() {
        System.out.println("Child class method");
    }
}
@Deprecated
@Deprecated annotation indicates that the marked element (class, method or field) is deprecated and should no longer be used. The compiler generates a warning whenever a program uses a method, class, or field that has already been marked with the @Deprecated annotation. When an element is deprecated, it should also be documented using the Javadoc @deprecated tag, as shown in the following example. Make a note of case difference with @Deprecated and @deprecated. @deprecated is used for documentation purpose.

@Deprecated
public void anyMethodHere(){
    // Do something
}
@SuppressWarnings
This annotation instructs compiler to ignore specific warnings. For example in the below code, I am calling a deprecated method (lets assume that the method deprecatedMethod() is marked with @Deprecated annotation) so the compiler should generate a warning, however I am using @@SuppressWarnings annotation that would suppress that deprecation warning.

@SuppressWarnings("deprecation")
    void myMethod() {
        myObject.deprecatedMethod();
}
Creating Custom Annotations
Annotations are created by using @interface, followed by annotation name as shown in the below example.
An annotation can have elements as well. They look like methods. For example in the below code, we have four elements. We should not provide implementation for these elements.
All annotations extends java.lang.annotation.Annotation interface. Annotations cannot include any extends clause.
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyCustomAnnotation{
    int studentAge() default 18;
    String studentName();
    String stuAddress();
    String stuStream() default "CSE";
}
Note: All the elements that have default values set while creating annotations can be skipped while using annotation. For example if I’m applying the above annotation to a class then I would do it like this:

@MyCustomAnnotation(
    studentName="Chaitanya",
    stuAddress="Agra, India"
)
public class MyClass {
...
}
As you can see, we have not given any value to the studentAge and stuStream elements as it is optional to set the values of these elements (default values already been set in Annotation definition, but if you want you can assign new value while using annotation just the same way as we did for other elements). However we have to provide the values of other elements (the elements that do not have default values set) while using annotation.

Note: We can also have array elements in an annotation. This is how we can use them: Annotation definition:

@interface MyCustomAnnotation {
    int      count();
    String[] books();
}
Usage:

@MyCustomAnnotation(
    count=3,
    books={"C++", "Java"}
)
public class MyClass {

}
Lets back to the topic again: In the custom annotation example we have used these four annotations: @Documented, @Target, @Inherited & @Retention. Lets discuss them in detail.

@Documented
@Documented annotation indicates that elements using this annotation should be documented by JavaDoc. For example:

java.lang.annotation.Documented
@Documented
public @interface MyCustomAnnotation {
  //Annotation body
}
@MyCustomAnnotation
public class MyClass { 
     //Class body
}
While generating the javadoc for class MyClass, the annotation @MyCustomAnnotation would be included in that.

@Target
It specifies where we can use the annotation. For example: In the below code, we have defined the target type as METHOD which means the below annotation can only be used on methods.

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
public @interface MyCustomAnnotation {

}
public class MyClass {
   @MyCustomAnnotation
   public void myMethod()
   {
       //Doing something
   }
}
Note: 1) If you do not define any Target type that means annotation can be applied to any element. \2) Apart from ElementType.METHOD, an annotation can have following possible Target values. ElementType.METHOD ElementType.PACKAGE ElementType.PARAMETER ElementType.TYPE ElementType.ANNOTATION_TYPE ElementType.CONSTRUCTOR ElementType.LOCAL_VARIABLE ElementType.FIELD

@Inherited
The @Inherited annotation signals that a custom annotation used in a class should be inherited by all of its sub classes. For example:

java.lang.annotation.Inherited

@Inherited
public @interface MyCustomAnnotation {

}
@MyCustomAnnotation
public class MyParentClass { 
  ... 
}
public class MyChildClass extends MyParentClass { 
   ... 
}
Here the class MyParentClass is using annotation @MyCustomAnnotation which is marked with @inherited annotation. It means the sub class MyChildClass inherits the @MyCustomAnnotation.

@Retention
It indicates how long annotations with the annotated type are to be retained.

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface MyCustomAnnotation {
    
}
Here we have used RetentionPolicy.RUNTIME. There are two other options as well. Lets see what do they mean: RetentionPolicy.RUNTIME: The annotation should be available at runtime, for inspection via java reflection. RetentionPolicy.CLASS: The annotation would be in the .class file but it would not be available at runtime. RetentionPolicy.SOURCE: The annotation would be available in the source code of the program, it would neither be in the .class file nor be available at the runtime.

That’s all for this topic “Java Annotation”. Should you have any questions, feel free to drop a line below.

JPA Annotation
JPA 注解

@Service
@Service注解用于类上，标记当前类是一个service类，加上该注解会将当前类自动注入到spring容器中，不需要再在applicationContext.xml文件定义bean了。 @Service注解的用法?: @Service /Service注解用于类上，标记当前类是一个service类，加上该注解会将当前类自动注入到spring容器中/

public class UserServiceImpl implements UserService {

@Autowired   /*注意我们用@Service注解自动注入到spring容器中:
    然后我们在调用该service类的时候只需要将该类注入接口中即可：*/
 
UserMapper userMapper;  //获取UserMapper里面的方法
public User login(String username, String pwd){
    return userMapper.selectByNameAndPwd(username,pwd);//返回userMappe并调用里面的方法.
}

 @RestController
    @RequestMapping("user")
public class UserController {
        @Autowired   //这个注解就是spring可以自动帮你把bean里面引用的对象的setter/getter方法省略，它会自动帮你set/get。
    UserService userService;
    //登录功能
    @RequestMapping("login")
    public CommonResult login(String username, String pwd, HttpSession session){
        User login = userService.login(username, pwd);
        if (login!=null){
            session.setAttribute("user",login);
            return new CommonResult(2000,"登录成功",null);
        }
            return new CommonResult(5000,"登录失败",null);
    }
注意我们用@Service注解自动注入到spring容器中:

然后我们在调用该service类的时候只需要将该类注入接口中即可：

@Entity
@Entity注解加在实体类上，定义对象将会成为被JPA管理的实体，将映射到指定的数据库

必须与**@id**注解 结合使用
否则 No identifier specified for entity:
name 属性
(可选)实体名称。 缺省为实体类的非限定名称。
该名称用于引用查询中的实体。
该名称不能是Java持久性查询语言中的保留字面值。

不与@Table结合的话 表名 默认为 SnakeCaseStrategy(命名策略 )为表名
若使用 name属性 且没有与@Table结合 则表名为 name值的SnakeCaseStrategy(命名策略 )
例如：
@Entity
public class UserEntity{...} 表名 user_entity
@Entity(name="UE")
public class UserEntity{...} 表名 ue
@Entity(name="UsEntity")
public class UserEntity{...} 表名 us_entity

@Id
表名是表的自增主键，一个Entity里只能又一个

@Table
用来说明该实体类对应的表和数据库，其中name =“xxx"，用来表示数据表的名字，catalog = “xxx"是数据库的名字

@Table 用于指定数据库表的表名

package javax.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
  	// 表的名字，可选。如果不填写，系统认为和实体的名字一样为表名
    String name() default "";
  	// 此表的catalog，可选
    String catalog() default "";
  	// 此表的schema，可选
    String schema() default "";
  	// 唯一性约束，只有创建表的时候有用，默认不需要
    UniqueConstraint[] uniqueConstraints() default {};
  	//索引，只有创建表的时候使用，默认不需要
    Index[] indexes() default {};
}
@GeneratedValue(strategy = GenerationType.IDENTITY)
指定自增主键的自增策略，GenerationType有四个值：TABLE、SEQUENCE、IDENTITY、AUTO，我们常用的是后两种，一般mysql数据库使用SEQUENCE，AUTO的话是让JPA自己选择合适的策略，默认的策略就是AUTO。

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface GeneratedValue {
  	// Id的生成策略
    GenerationType strategy() default GenerationType.AUTO;
		// 通过Sequence生成Id，常见的是Oracle数据库Id生成规则，需要配合@SequenceGenerator使用
    String generator() default "";
}
GenerationType一共有四个值

public enum GenerationType {
		// 通过表产生主键，框架由表模拟序列产生主键，使用该策略可以使应用更易于数据库移植
    TABLE,
    // 通过序列产生主键，通过@SequenceGenerator注解指定序列名称，MySQL不支持这种方式
    SEQUENCE,
    // 采用数据库ID自增长，一般用于MYSQL数据库
    IDENTITY,
    // JPA自动选择合适的策略，是默认选项。
    AUTO;

    private GenerationType() {
    }
}
@Basic
表示属性到数据库字段的映射，实体类的属性不加任何注解的时候默认是@Basic注解。 如果字段需要特别说明的话，我们使用@Column注解，该注解定义属性对应数据库的列名，以及是否为空等的限制；@NonNull注解这注解和@Column(nullable = false)的效果是一样的

@Basic 如果实体的字段没有任何注解，默认即为@Basic

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Basic {
  	// 可选，EAGER为立即加载，LAZY为延迟加载
    FetchType fetch() default FetchType.EAGER;
		// 可选，设置这个字段是否为null，默认为true
    boolean optional() default true;
}
@Transient
@Transient表示该属性并非一个到数据库表字段的映射，表示持久化属性，与@Basic作用相反。JPA映射数据库的时候就会忽略它。

@Column
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
		// 数据库中表的列明。可选，默认为与实体属性名保持一样，如果实体属性名中由大写，它会自动分割
    String name() default "";
		// 是否唯一，默认false，可选
    boolean unique() default false;
		// 数据字段是否允许为空，可选，默认为true
    boolean nullable() default true;
		// 执行insert操作的时候是否包含此字段，可选，默认为true
    boolean insertable() default true;
    // 执行update的时候是否包含此字段，可选，默认为true
    boolean updatable() default true;
		// 表示该字段在数据库中的实际类型
    String columnDefinition() default "";
		// 数据库字段的长度，可选，默认为255
    int length() default 255;
}
@Temporal
@Temporal用来设置Date类型的属性映射到对应精准的字段。

@Temporal(TemporalType.DATA)映射为日期 --data @Temporal(TemporalType.TIME)映射为日期 --time @Temporal(TemporalType.TIMESTAMP)映射为日期 --data time @Enumerated @Enumerated很好用，直接映射enum枚举类型的字段

public @interface Enumerated {
		// 枚举映射的类型，默认为ORDINAL
    EnumType value() default EnumType.ORDINAL;
}
EnumType可选：

ORDINAL：映射枚举的下标 SIRING：映射枚举的name 示例：

// 定义一个枚举类
public enum Gender{
	MAIL("男性"),FMAIL("女性");
	
	private String value;
	
	private Gender(String value){
		this.valus = valus;
	}

}
//实体类中的使用

@Entity
@Table(name = "tb_user")
public class User implements Serializable{
	@Enumerated(EnumType.STRING)
	@Column(name = "user_gender")
	private Gender gender;

}
@Lob
Lob将属性映射为数据库支持的大对象类型，支持以下两种数据库类型的字段

Clob类型是长字符串类型，java.sql.Clob、Character[]、char[]和String将被映射为Clobl类型 Blob类型是字节类型，java.sql.Blob、Byte[]、byte[]和实现了Serializable接口的类型将被映射为Blob类型 Clob、Blob占用内存空间较大，一般配合@Basic(fatch=FechType.LAZY)将其设置为延迟加载 关联关系注解 @JoinColumn 定义外键关联的字段名称

public @interface JoinColumn {
		// 目标表的字段名，必填
    String name() default "";
		// 本实体的字段名，非必填，默认为本表ID
    String referencedColumnName() default "";
		// 外键字段是否唯一，默认为false
    boolean unique() default false;
		// 外键字段是否允许为空，默认为允许
    boolean nullable() default true;
		// 是否跟随一起新增
    boolean insertable() default true;
		// 是否跟随一起修改
    boolean updatable() default true;
}
用法：主要配合@OneToOne、@ManyToOne、@OneToMany一起使用，但是使用没有意义。

@OneToOne
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OneToOne {
		// 关系目标实体，非必填，默认为该字段的类型
    Class targetEntity() default void.class;
		// cascade 级联操作策略
    	// PERSIST 级联新建
    	// REMOVE 级联删除
    	// REFRESH 级联刷新
    	// MERGE 级联更新
    	// ALL 四项权限
    CascadeType[] cascade() default {};
		// 数据获取方式，立即加载和延迟加载
    FetchType fetch() default FetchType.EAGER;
		// 是否允许为空
    boolean optional() default true;
		// 关联关系被谁维护，非必填，一般不需要特别指定
    String mappedBy() default "";
		// 是否级联删除，和CascadeType.REMOVE的效果一样，只要配置了两种的一种就会自动级联删除
    boolean orphanRemoval() default false;
}
用法：@OneToOne需要配合@JoinCloumn一起使用。注意：可以双相关联，也可以只配置一方，需要视需求而定。

示例：假设一个部门只有一个员工

@OneToOne @JoinColumn(name=“employee_id”,referencedColumnName = “id”) private Employee employeeAttribute = new Employee(); employee_id指的是Department里面的字段，而referencedColumnName="id"指的是Employee表里面的字段

如果需要双相关联，Employee的内容如下

@OneToOne(mappedBy = “employeeAttribute”) private Department department; 当然不使用mappedBy，和下面效果是一样的

@OneToOne @JoinColumn(name = “id”, referencedColumnName = “employee_id”) private Employee employeeAttribute = new Employee(); @OneToMany与@ManyToOne @OneToMany与@ManyToOne可以相对存在，也可以只存在一方

@Entity
@Table(name = "user")
public class User {
    @Id
    private Long id;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user"
    )
    private Set<Role> setRole;

}

@Entity
@Table(name = "role")
public class Role {
    @Id
    private Long id;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "user_id")
    private User user;
}
@OrderBy关联查询时排序
public @interface OrderBy {
		// 要排序的字段，格式如下
		//  orderby_list::=orderby_item[,orderby_item]*
		//  orderby_item::=[property_or_field_name][ASC|DESC]
    String value() default "";
}
用法

@Entity
@Table(name = "user")
public class User {
    @Id
    private Long id;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "user"
    )
    @OrderBy("roleName DESC ")
    private Set<Role> setRole;

}
OrderBy中的字段对应的是实体中的名称

@JoinTable
如果对象与对象之间有一个关联关联表的时候，就会用到@JoinTable，一般和@ManyToMany一起使用。

public @interface JoinTable {
		// 中间关联关系表名
    String name() default "";
		// 表的catelog
    String catalog() default "";
		// 表的schema
    String schema() default "";
		// 主链接表的字段
    JoinColumn[] joinColumns() default {};
		// 被联机的表外键字段
    JoinColumn[] inverseJoinColumns() default {};
}
示例：

假设Blog和Tag是多对多的关系，有一个关联关系表blog_tag_relation，表中有两个属性blog_id和tag_id，那么Blog实体里面的写法如下：

@Entity
public class Blog {
    @Id
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "blog_tag_relation",
            joinColumns = @JoinColumn(name = "blog_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id")

    )
    private List<Tag> tags = new ArrayList<>();
}
@ManyToMany
public @interface ManyToMany {
    Class targetEntity() default void.class;

    CascadeType[] cascade() default {};

    FetchType fetch() default FetchType.LAZY;

    String mappedBy() default "";
}
@ManyToMany表示多对多，和@OneToOne、@ManyToOne一样也有单向、双向之分。单向双向和注解没有关系，只看实体类之间是否相互引用。

示例：一个博客可以有多个标签，一个标签也可以在多个博客上，Blog和Tag就是多对多的关系

// 单向多对多

@Entity
public class Blog {
    @Id
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "blog_tag_relation",
            joinColumns = @JoinColumn(name = "blog_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id")

    )
    private List<Tag> tags = new ArrayList<>();
}


@Entity
public class BlogTagRelation {
    @Column(name = "blog_id")
    private Integer blogId;

    @Column(name = "tag_id")
    private Integer tag_id;

}
// 双向多对多

@Entity
public class Blog {
    @Id
    private Long id;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name = "blog_tag_relation",
            joinColumns = @JoinColumn(name = "blog_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id", referencedColumnName = "id")

    )
    private List<Tag> tags = new ArrayList<>();
}
@Entity
public class Tag {
    @Id
    private String id;

    @ManyToMany(mappedBy = "BlogTagRelation")
    private List<Blog> blog = new ArrayList<>();
}
@EntityGraph&@NamedEntityGraph
JPA2.1推出的@EnttiyGraph、@NamedEntityGraph用来提高查询效率，很好地解决了N+1条SQL的问题。两者配合起来使用，缺一不可。

1、现在Entity里面定义@NamedEntityGraph，其他不变，其中，@NamedAttributeNode可以有多个，也可以有一个

@NamedEntityGraph(
        name = "UserInfoEntity.addressEntityList",
        attributeNodes = {
                @NamedAttributeNode("addressEntityList"),
                @NamedAttributeNode("userBlogEntityList")
        })
@Entity(name = "UserInfoEntity")
@Table(name = "user_info", schema = "test")
public class UserInfoEntity implements Serializable {
    @Id
    @Column(name = "id", nullable = true)
    private Integer id;

    @OneToOne(optional = true)
    @JoinColumn(
            referencedColumnName = "id",
            name = "address_id",
            nullable = false
    )
    private UserReceivingAddressEntity addressEntityList;

    @OneToMany
    @JoinColumn(name = "create_user_id", referencedColumnName = "id")
    private List<UserBlogEntity> userBlogEntityList;
}
2、只需要在查询方法上加@EntityGraph注解即可，其中value就是@NamedEntityGraph中的name。

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    @EntityGraph(value = "UserInfoEntity.addressEntityList")
    List<User> findAll();
}
关于关系查询的一些坑 1、所有的注解要么配置在字段上，要么配置在get方法上，不要混用

2、所有的关联都是支持单向关联和双相关联的。JSON序列化的时候双向注解会产生死循环，需要人为手动转化一次，或者使用@JsonIgnore

3、在所有的关联查询中，表一般是不需要建立外键索引

4、级联删除比较危险，建议考虑清楚，或者完全掌握

5、不同的关联关系的设置，@JoinCloum里面的name、referencedCloumName代表的意思是不一样的，很容易混淆，可以根据打印出来的sql调整

6、当配置这些关联关系的时候建议直接在表上面，把外键建好，然后通过工具生成，这样可以减少调试的时间

Bean Factory Annotation
@Autowired
https://blog.csdn.net/weixin_43521890/article/details/122137844

https://www.codedemo.club/spring-autowire/

UserService

1、@Autowired 注解@Autowired是Spring对组件自动装配的一种方式。常用于在一个组件中引入其他组件。

//引入Person组件 @Autowired Person person;

自动装配：spring通过依赖注入（DI），完成IOC容器中各个组件依赖的关系赋值

2、@Autowired自动装配详解 (1) @Autowired自动装配，默认优先按照类型取IOC容器中寻找对应的组件 annotationConfigApplicationContext.getBean(Person.class);

(2) 如果有多个相同类型的组件，再将属性的名称作为组件的id去容器中查找 annotationConfigApplicationContext.getBean("person");

(3) @Autowired配合@Primary使用，当使用@Autowired自动装配时，默认优先选择被注解@Primary标注的组件 @Primary @Bean public Person person(){ return new Person("张三"); }

(4) @Autowired配合@Qualifier使用，使用注解@Qualifier可以指定需要装配组件的id @Qualifier("person") @Autowired Person person;

(5) 使用@Autowired自动装配，如果在容器中找不到对应的组件，则会报错 Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.dashu.bean.Person' available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}

(6) @Autowired属性required，默认为true,如果在容器中找不到对应的组件，则会报错;如果为false，如果在容器中找不到对应的组件，则不装配，不会报错； @Autowired(required = false) Person person;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE}) @Retention(RetentionPolicy.RUNTIME) @Documented public @interface Autowired {

boolean required() default true;

}

web.bind.annotation 注解详解
web.bind

处理request
@RequestBody @RequestHeader @RequestMapping @RequestParam @RequestPart @CookieValue @PathVariable; 传送门

处理response
@ResponseBody @ResponseStatus

处理attribute属性
@SessionAttributes, 传送门 @ModelAttribute; 传送门

处理Exception
@ExceptionHandler

实现aop
@ControllerAdvice 传送门

其他处理
@InitBinder @Mapping @MatrixVariable @Restcontroller @ValueConstants

接口
@RequestMethod GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE 处理requet URL

@GetMapping
@GetMapping("/get")
public @ResponseBody ResponseEntity<String> get() {
    return new ResponseEntity<String>("GET Response", HttpStatus.OK);
}
Copy
@GetMapping("/get/{id}")
public @ResponseBody ResponseEntity<String>
  getById(@PathVariable String id) {
    return new ResponseEntity<String>("GET Response : " 
      + id, HttpStatus.OK);
}Copy
@PostMapping
@PostMapping("/post")
public @ResponseBody ResponseEntity<String> post() {
    return new ResponseEntity<String>("POST Response", HttpStatus.OK);
}Copy
@PutMapping
@PutMapping("/put")
public @ResponseBody ResponseEntity<String> put() {
    return new ResponseEntity<String>("PUT Response", HttpStatus.OK);
}Copy
@DeleteMapping
@DeleteMapping("/delete")
public @ResponseBody ResponseEntity<String> delete() {
    return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
}Copy
@PatchMapping
@PatchMapping("/patch")
public @ResponseBody ResponseEntity<String> patch() {
    return new ResponseEntity<String>("PATCH Response", HttpStatus.OK);
}Copy