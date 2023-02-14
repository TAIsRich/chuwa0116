package com.chuwa.redbook.dao.impl;

import com.chuwa.redbook.dao.PostJPQLRepository;
import com.chuwa.redbook.entity.Post;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
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
    public Post insertPost(Post post){

    }
     **/
}
