package com.chuwa.redbook.payload;

import com.chuwa.redbook.entity.Post;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/1/23
 */
public class PostDto {

    private Long id;
    private String title;
    private String description;
    private String content;

    public PostDto() {}

    public PostDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.description = post.getDescription();
        this.content = post.getContent();
    }

    public Post mapToPost() {
        Post post = new Post();
        post.setTitle(getTitle());
        post.setDescription(getDescription());
        post.setContent(getContent());
        return post;
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

    @Override
    public String toString() {
        return "PostDTO{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", description='" + description + '\'' +
            ", content='" + content + '\'' +
            '}';
    }

}
