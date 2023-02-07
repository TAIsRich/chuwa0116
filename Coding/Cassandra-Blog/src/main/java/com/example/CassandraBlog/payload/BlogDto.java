package com.example.CassandraBlog.payload;

public class BlogDto {
    private long Id;
    private String title;
    private String content;

    public BlogDto() {
    }

    public BlogDto(long Id, String title, String content) {
        this.Id = Id;
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
