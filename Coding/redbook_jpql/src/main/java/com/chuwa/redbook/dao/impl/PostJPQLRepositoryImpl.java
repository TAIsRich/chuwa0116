package com.chuwa.redbook.dao.impl;

import com.chuwa.redbook.dao.PostJPQLRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.chuwa.redbook.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class PostJPQLRepositoryImpl implements PostJPQLRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Post> getAllPostWithJPQL(){
        TypedQuery<Post>posts=entityManager.createQuery("Post.getAll",Post.class);
        return posts.getResultList();
    }
    public Post insertPost(Post post){
        return entityManager.merge(post);
    }
    public Post updatePost(Post post){
        return entityManager.merge(post);
    }
    public void deleteById(Long id){
        Post post=entityManager.find(Post.class, id);
        entityManager.remove(post);
    }
    public <T> T insertData(T t){
        return entityManager.merge(t);
    }

}
