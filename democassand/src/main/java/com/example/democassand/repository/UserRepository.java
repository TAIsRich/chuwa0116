package com.example.democassand.repository;

import com.example.democassand.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    @Autowired(required = false)
    private CassandraTemplate cassandraTemplate;

    public List<User> getAll(){
        List<User> ans = cassandraTemplate.select("SELECT userid, fname, lname FROM users", User.class);
        return ans;
    }
}
