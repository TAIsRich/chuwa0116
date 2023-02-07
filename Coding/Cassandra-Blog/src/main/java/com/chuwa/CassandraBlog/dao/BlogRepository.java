package com.chuwa.CassandraBlog.dao;

import com.chuwa.CassandraBlog.Entity.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog, Long> {
}
