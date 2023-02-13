package com.example.redbook2.dao.impl;

import com.example.redbook2.dao.PostJPQLRepository;
import com.example.redbook2.entity.Post;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class PostJPQLRepositoryImpl implements PostJPQLRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Post> getAllPostWithJPQL() {
        TypedQuery<Post> posts = entityManager.createNamedQuery("Post.getAll", Post.class);
        return posts.getResultList();
    }

    /**
     * entityManager:
     *  1. Insert Update: entityManager.merge()
     *  2. Select: entityManager.find();
     *  3. delete: entityManager.remove();
     *
     *  代码的测试在test package下
     */

    public Post insertPost(Post post){
        //post 中 可以没有 ID
        return entityManager.merge(post);
    }

    public Post updatePost(Post post){
        //post 中必须 有 id
        return entityManager.merge(post);
    }

    public Post getPostById(Long id){
        return entityManager.find(Post.class, id);
    }

    public void deleteById(Long id){
        Post post = entityManager.find(Post.class, id);
        entityManager.remove(post);
    }

    public <T> T insertData(T t){
        return entityManager.merge(t);
    }
}
