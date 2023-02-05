package com.chuwa.mongoblog.payload;

/**
 * Function:
 *
 * @author haoyu
 * @Date 2/3/23
 */
public class PostDTO {

    private String id;
    private String title;
    private String description;
    private String content;

    public PostDTO() {
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
