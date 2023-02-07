package com.chuwa.CassandraBlog.repository;

import com.chuwa.CassandraBlog.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface BlogRepository extends CrudRepository<Post,String> {
}
