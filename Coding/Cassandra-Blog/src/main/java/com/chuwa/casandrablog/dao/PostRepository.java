package com.chuwa.casandrablog.dao;

import com.chuwa.casandrablog.entity.Post;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CassandraRepository<Post, String> {
}
