package com.chuwa.redbook.dao.impl;

import com.chuwa.redbook.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.provider.HibernateUtils;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostJPQLRepositoryImplTest {
    @Autowired
    private PostJPQLRepositoryImpl repository;

    private Post post = new Post(null, "title test", "decription test", "content test",
            null, null);

    @Test
    void getAllPostWithJPQL() {
        List<Post> posts = repository.getAllPostWithJPQL();
        System.out.println(posts);
    }

    @Test
    void insertPost() {
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
    }

    @Test
    void updatePost() {
        post.setId(12L);
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
    }

    @Test
    void getPostById() {
        Post postById = repository.getPostById(12L);
        System.out.println(postById);
    }

    @Test
    void deleteById() {
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
        Long id = savedPost.getId();
        repository.deleteById(id);
        Post postById = repository.getPostById(id);
        System.out.println(postById);
    }

    @Test
    void insertData() {
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertData(post);
        System.out.println(savedPost);
    }

    @Test
    void testSessionFactory() {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            post.setTitle(post.getTitle() + LocalDateTime.now());
            post.setCreateDateTime(LocalDateTime.now());
            post.setUpdateDateTime(LocalDateTime.now());
            Post savedPost = (Post) session.merge(post);
            System.out.println(savedPost);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}