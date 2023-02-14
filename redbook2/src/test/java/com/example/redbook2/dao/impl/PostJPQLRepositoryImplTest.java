package com.example.redbook2.dao.impl;

import com.example.redbook2.entity.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class PostJPQLRepositoryImplTest {
    @Autowired
    private PostJPQLRepositoryImpl repository;

    private Post post = new Post(null, "title test", "decription test", "content test", null, null);

    @Test
    void getAllPostWithJPQL(){
        List<Post> posts = repository.getAllPostWithJPQL();
        System.out.println(posts);
    }

    @Test
    void insertPost(){
        //防止 Post title 重复
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
    }

    @Test
    void updatePost(){
        //update should provide id
        post.setId(12L);
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
    }

    @Test
    void getPostById(){
        Post postById = repository.getPostById(12L);
        System.out.println(postById);
    }

    @Test
    void deleteById(){
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertPost(post);
        System.out.println(savedPost);
        Long id = savedPost.getId();
        repository.deleteById(id);
        Post postById = repository.getPostById(id);
        System.out.println(postById);
    }

    @Test
    void insertData(){
        post.setTitle(post.getTitle() + LocalDateTime.now());
        Post savedPost = repository.insertData(post);
        System.out.println(savedPost);
    }

    /**
     * learn SessionFactory
     * 注意要在Post entity 的date那里加    @Column(name = "update_date_time")
     */

    @Test
    void testSessionFactory(){
        //step1: 根据配置文件，创建一个sessionFactory
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        //step2: sessionFactory 创建出一个session
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            //step3: session 开始一个 transaction
            transaction = session.beginTransaction();

            //step4: execute txn
            post.setTitle(post.getTitle() + LocalDateTime.now());
            post.setCreateDateTime(LocalDateTime.now());
            post.setUpdateDateTime(LocalDateTime.now());
            Post savedPost = (Post) session.merge(post);
            System.out.println(savedPost);

            //step5: commit txn, 该txn 要么成功，要么失败，是个原子操作
            transaction.commit();
        }catch(Exception e){
            if(transaction != null){
                //txn 失败则回滚
                transaction.rollback();
            }
            e.printStackTrace();
        }finally {
            //step6: close session
            session.close();
        }
    }


}
