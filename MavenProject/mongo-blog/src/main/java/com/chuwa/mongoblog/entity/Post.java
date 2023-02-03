package com.chuwa.mongoblog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/3/23
 */
@Document("post")
public class Post {

    @Id
    private String id;

    private String title;

    private String description;

    private String content;

    public Post() {}

    public Post(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public Post(String id, String title, String description, String content,
                LocalDateTime createDateTime, LocalDateTime updateDateTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
