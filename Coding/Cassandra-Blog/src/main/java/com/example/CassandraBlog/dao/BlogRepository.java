package com.example.CassandraBlog.dao;

import com.example.CassandraBlog.entity.Blog;
import org.springframework.data.repository.Repository;

public interface BlogRepository extends Repository<Blog, Long> {
}
