package com.chuwa.redbook.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.chuwa.redbook.entity.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
