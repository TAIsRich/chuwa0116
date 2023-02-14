# Annotations in springboot
## Entity
1. `@Entity`, `@Table`
    ```java
    @Entity
    @Table(
            name = "posts",
            uniqueConstraints =  {
                    @UniqueConstraint(columnNames = {"title"})
            }
    )
    ```
2. `@Id`, `@GeneratedValue(strategy = GenerationType.IDENTITY)`, `@Column(name = "description", nullable = false)`, `@CreationTimestamp`
    ```java
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "title", nullable = false)
    private String title;
    
    @CreationTimestamp
    private LocalDateTime createDateTime;
    ```
3. `@OneToMany`: Current class object may contains multiple objects of another class
 ```java
 @OneToMany(mappedBy = "posts", cascade = CascadeType.ALL, orphanRemoval = true)
 private Set<Comment> comments = new HashSet<>();
 ```
4. `@ManyToOne`: Current class objects may be included into on objects of another class
 ```java
 @ManyToOne(fetch = FetchType.LAZY)
 @JoinColumn(name = "post_id", nullable = false)
 private Post post;
 ```
5. `@ManyToMany`: Current class object may contains multiple objects of another class, and vice versa
 ```java
     @ManyToMany(fetch = FetchType.LAZY)
     @JoinTable(name = "sku_inventory",
             joinColumns = @JoinColumn(name = "sku_id"),
             inverseJoinColumns = @JoinColumn(name = "inventory_id"))
     private Set<PmsInventory> pmsInventories = new HashSet<>();
 ```
6. `@NamedQuery`
   * `@NamedQuery` is an annotation used to define the single named query.
     `@NamedQuery(name = "Post.getAll", query = "select p from Post p")`
   * `@NameQueries` is an annotation used to specify multiple `@NamedQuery`
  ```java
      @NamedQueries({
          @NamedQuery(name="Country.findAll",
                      query="SELECT c FROM Country c"),
          @NamedQuery(name="Country.findByName",
                      query="SELECT c FROM Country c WHERE c.name = :name"),
      }) 
  ```
## Controller
1. `@RestController`, `@RequestMapping("/api/v1/posts")`, `@Autowired`, `@PostMapping`
    ```java
    @RestController
    @RequestMapping("/api/v1/posts")
    public class PostController {
    
        @Autowired
        private PostService postService;
    
        @PostMapping
        public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO postDTO) {
            PostDTO postResponse = postService.createPost(postDTO);
    
            return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
        }
    }
    ```
## Repository
1. `@Repository`
    ```java
    @Repository
    public interface PostRepository extends JpaRepository<Post, Long> {
        // no need to write anything here (yet)
    }
    ```
2. `@Query`
   * This annotation can only be used to annotate repository interface methods. We write this annotation in
     out repository interface.
   ```java
   @Query("select p from Post p where p.id = ?1 or p.title = ?2")
       Post getPostByIDOrTitleWithJPQLIndexParameters(Long id, String title);
   ```