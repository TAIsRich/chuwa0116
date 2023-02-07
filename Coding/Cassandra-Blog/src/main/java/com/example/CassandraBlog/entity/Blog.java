package com.example.CassandraBlog.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Blog {
    @PrimaryKey
    private long Id;
    private String title;
    private String content;

    public Blog() {
    }

    public Blog(long blogId, String title, String content) {
        this.Id = blogId;
        this.title = title;
        this.content = content;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
