package repository;

import entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Post,String> {
}