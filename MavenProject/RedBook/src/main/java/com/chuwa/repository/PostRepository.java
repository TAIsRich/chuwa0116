package com.chuwa.repository;

import com.chuwa.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
	@Query("select p from Post p where p.id = :key or p.title = :title")
	Post getPostByIdOrTitle(@Param("key")Long id,@Param("title")String title);
}
