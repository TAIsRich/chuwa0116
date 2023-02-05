package com.example.mongoblog;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document("blogitems")
public class Blog {
    @Id
    private String id;

    private String title;
    private String conetent;

    public Blog(String id, String title, String conetent) {
        this.id = id;
        this.title = title;
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

    public String getConetent() {
        return conetent;
    }

    public void setConetent(String conetent) {
        this.conetent = conetent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blog blog)) return false;
        return Objects.equals(id, blog.id) && Objects.equals(title, blog.title) && Objects.equals(conetent, blog.conetent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, conetent);
    }
}
