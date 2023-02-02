### @Entity
* Declaring an Object Entity
``` 
@Entity
public class Obj{

}
```
### @Table
* Declaring a Table and configuration
``` 
@Table(
        name="posts",
        uniqueConstraints = {
                @UniqueConstraint(columnNames={"title"})
        }
)
```
### @Id
* Declaring an Id as a primary key
``` 
@Id
private Long id;
```
### @GeneratedValue
* Declaring generation strategy
``` 
@GeneratedValue(strategy  = GenerationType.IDENTITY)
private Long id;
```
### @Column
* Declaring variable to table column mapping
``` 
@Column(name="title",nullable = false)
private String title;
```
### @CreationTimestamp
* declaring creation time
``` 
@CreationTimestamp
private LocalDateTime createDateTime;
```
### @UpdateTimestamp
* declaring update time
``` 
@UpdateTimestamp
private LocalDateTime updateDateTime;
```
### @Autowired 
* After enabling annotation injection, we can use autowiring on properties, setters, and constructors.
``` 
@Autowired
private PostService postService;
```
### @Repository
* a specialization of @Component annotation which is used to indicate that the class provides the mechanism for storage, retrieval, update, delete and search operation on objects 
``` 
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
```
### @PostMapping
* Annotation for mapping HTTP POST requests onto specific handler methods
``` 
@PostMapping
public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO){
    PostDTO postResponse=postService.createPost(postDTO);

    return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
}
```