package com.chuwa.mongoblog.DAO;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("mongo-blog")
public class BlogPost {
    @Id
    private String id;

    private String title;
    private String description;
    private String conetent;

    public BlogPost(String id, String title, String description, String conetent) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.conetent = conetent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getConetent() {
        return conetent;
    }

    public void setConetent(String conetent) {
        this.conetent = conetent;
    }
}
