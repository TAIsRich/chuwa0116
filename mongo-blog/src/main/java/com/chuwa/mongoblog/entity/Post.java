package com.chuwa.mongoblog.entity;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("posts")
public class Post {

    @Transient
    public static final String SEQUENCE_NAME = "user_sequence";

    @Id
    private Long id;
    private String title;
    private String description;
    private String content;

//    private LocalDateTime createDateTime;
//
//    private LocalDateTime updateDateTime;

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

//    public LocalDateTime getCreateDateTime() {
//        return createDateTime;
//    }
//
//    public void setCreateDateTime(LocalDateTime createDateTime) {
//        this.createDateTime = createDateTime;
//    }
//
//    public LocalDateTime getUpdateDateTime() {
//        return updateDateTime;
//    }
//
//    public void setUpdateDateTime(LocalDateTime updateDateTime) {
//        this.updateDateTime = updateDateTime;
//    }
}
