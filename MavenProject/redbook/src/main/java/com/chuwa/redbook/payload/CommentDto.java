package com.chuwa.redbook.payload;

import com.chuwa.redbook.entity.Comment;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/6/23
 */
public class CommentDto {

    private long id;
    private String name;
    private String email;
    private String body;

    public CommentDto() {
    }

    public CommentDto(String name, String email, String body) {
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public CommentDto(long id, String name, String email, String body) {
        this(name, email, body);
        this.id = id;
    }

    public CommentDto(Comment comment) {
        this.id = comment.getId();
        this.name = comment.getName();
        this.email = comment.getEmail();
        this.body = comment.getBody();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "CommentDto{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", body='" + body + '\'' +
            '}';
    }

    public Comment mapToComment() {
        Comment comment = new Comment();
        comment.setId(getId());
        comment.setName(getName());
        comment.setEmail(getEmail());
        comment.setBody(getBody());
        return comment;
    }
}
