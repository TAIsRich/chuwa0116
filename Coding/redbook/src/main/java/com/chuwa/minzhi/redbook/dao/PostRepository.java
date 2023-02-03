package com.chuwa.minzhi.redbook.dao;

import com.chuwa.minzhi.redbook.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// todo: define DAO (data access object), creating mapping functionality (table-wise CRUD) provided by vendor
// Post is post object, Long is id
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
