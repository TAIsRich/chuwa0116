package com.example.redbook.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "posts",
        uniqueConstraints = {
                @UniqueConstraint(columnNames =  {"title"})
        }
)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "content", nullable = false)
    private String content;
    @CreationTimestamp
    private LocalDateTime createDataTime;
    @UpdateTimestamp
    private LocalDateTime updateDataTime;

    public Post(){

    }

    public Post(String title, String description, String content) {
        this.title = title;
        this.description = description;
        this.content = content;
    }

    public Post(Long id, String title, String description, String content, LocalDateTime createDataTime, LocalDateTime updateDataTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.content = content;
        this.createDataTime = createDataTime;
        this.updateDataTime = updateDataTime;
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

    public LocalDateTime getCreateDataTime() {
        return createDataTime;
    }

    public void setCreateDataTime(LocalDateTime createDataTime) {
        this.createDataTime = createDataTime;
    }

    public LocalDateTime getUpdateDataTime() {
        return updateDataTime;
    }

    public void setUpdateDataTime(LocalDateTime updateDataTime) {
        this.updateDataTime = updateDataTime;
    }

}