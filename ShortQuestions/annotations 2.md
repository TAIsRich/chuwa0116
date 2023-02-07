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