package com.example.CassandraBlog.service.Impl;

import com.example.CassandraBlog.dao.BlogRepository;
import com.example.CassandraBlog.entity.Blog;
import com.example.CassandraBlog.payload.BlogDto;
import com.example.CassandraBlog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public BlogDto createBlog(BlogDto blogDto) {
        Blog blog = mapToEntity(blogDto);
        //Blog savedPost = blogRepository.(blog);

        BlogDto blogResponse = mapToDTO(blog);
        return blogResponse;

    }

    @Override
    public List<BlogDto> getAllBlog() {
        return null;
    }

    @Override
    public BlogDto getBlogById(long id) {
        return null;
    }

    @Override
    public BlogDto updateBlog(BlogDto blog, long id) {
        return null;
    }

    @Override
    public void deleteBlogById(long id) {

    }

    private BlogDto mapToDTO(Blog blog) {
        BlogDto blogDto = new BlogDto();
        blogDto.setId(blog.getId());
        blogDto.setTitle(blog.getTitle());
        blogDto.setContent(blog.getContent());

        return blogDto;
    }

    private Blog mapToEntity(BlogDto blogDto) {
        Blog blog = new Blog();
        blogDto.setId(blogDto.getId());
        blogDto.setTitle(blogDto.getTitle());
        blogDto.setContent(blogDto.getContent());

        return blog;
    }
}
