package com.example.cassandrablog.dao;

import com.example.cassandrablog.entity.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CassandraRepository<Post, Long> {
    // no need to write anything here (yet)
}
