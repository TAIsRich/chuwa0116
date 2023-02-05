package com.chuwa.mongoblog.service;

import com.chuwa.mongoblog.DAO.BlogPost;

public interface BlogService {
    BlogPost saveBlog(BlogPost blogPost);
}
