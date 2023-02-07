package com.chuwa.cassandrablog.dao;


import com.chuwa.cassandrablog.entity.Post;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

// DAO = Data access object
@Repository
public interface PostRepository extends CassandraRepository<Post, Long> {
    // No need to write anything here (yet)
}
