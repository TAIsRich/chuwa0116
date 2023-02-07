package controller;

import entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BlogRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class BlogController {
    @Autowired
    BlogRepository blogRepository;

    @PostMapping("/posts")
    public ResponseEntity addPosts(@RequestBody Post p)
    {
        Long id = Long.valueOf(new Random().nextInt());
        Post savedPost = new Post(id, p.getTitle(), p.getDescription(), p.getContent());
        blogRepository.save(savedPost);
        return new ResponseEntity<> (savedPost, HttpStatus.CREATED);
    }

    @GetMapping("/posts")
    public List<Post> getPosts()
    {
        Iterable<Post> result = blogRepository.findAll();
        List<Post> employeesList = new ArrayList<Post>();
        result.forEach(employeesList::add);
        return employeesList;
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getEmployee(@PathVariable Long id)
    {
        Optional<Post> emp = blogRepository.findById(String.valueOf(id));
        return emp;
    }

    @PutMapping("/posts/{id}")
    public Optional<Post> updateEmployee(@RequestBody Post post, @PathVariable Long id)
    {
        Optional<Post> optionalEmp = blogRepository.findById(String.valueOf(id));
        if (optionalEmp.isPresent()) {
            Post p = optionalEmp.get();
            p.setTitle(post.getTitle());
            p.setDescription(post.getDescription());
            p.setContent(post.getContent());
            blogRepository.save(p);
        }
        return optionalEmp;
    }

    @DeleteMapping(value = "/posts/{id}", produces = "application/json; charset=utf-8")
    public String deleteEmployee(@PathVariable Long id) {
        Boolean result = blogRepository.existsById(String.valueOf(id));
        blogRepository.deleteById(String.valueOf(id));
        return "{ \"success\" : "+ (result ? "true" : "false") +" }";
    }
}