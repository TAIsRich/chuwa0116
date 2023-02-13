package com.example.redbook2.dao;

import com.example.redbook2.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostJPQLRepository {
    List<Post> getAllPostWithJPQL();
}
