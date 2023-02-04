package service;

import entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import repository.PostRepository;

import java.util.List;

import static entity.Post.SEQUENCE_NAME;

public class MongoAutoSequenceExampleApplication {
    @Autowired
    private PostRepository repository;

    @Autowired
    private SequenceGeneratorService service;

    @PostMapping("/saveBook")
    public Post save(@RequestBody Post post){
        //generate sequence
        post.setId(service.getSequenceNumber(SEQUENCE_NAME));
        return repository.save(post);
    }

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(MongoAutoSequenceExampleApplication.class, args);
    }
}
