package com.chuwa.redbook.payload;

public class CommentDTO {
    private long id;
    private String name;
    private String email;
    private String body;

    public CommentDTO() {
    }

    public CommentDTO(String name, String email, String body){
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public CommentDTO(long id, String name, String email, String body){
        this(name, email, body);
        this.id = id;
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
        return "CommentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
