package com.chuwa.repository;

import com.chuwa.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostJPQLRepository {
	List<Post> getAllPostWithJPQL();
}
