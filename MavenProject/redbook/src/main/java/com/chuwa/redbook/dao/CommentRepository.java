package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/6/23
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByPostId(long postId);

}
