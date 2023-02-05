package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// DAO = Data access object
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // No need to write anything here (yet)
}
