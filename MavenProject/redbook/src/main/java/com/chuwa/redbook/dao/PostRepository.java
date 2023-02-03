package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/1/23
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
