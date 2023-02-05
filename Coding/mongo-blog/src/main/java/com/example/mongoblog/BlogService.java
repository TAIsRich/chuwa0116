package com.example.mongoblog;

public interface BlogService {

    Blog findBlogByName(String name);

    Blog saveBlog(Blog blog);
}
