package com.example.CassandraBlog.repository;

import com.example.CassandraBlog.entity.Post;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface PostRepository extends CassandraRepository<Post, Long> {
    @AllowFiltering
    List<Post> findByPublished(boolean published);

    List<Post> findByTitleContaining(String title);
}
