package com.chuwa.mongoblog.payload;

import lombok.Data;

@Data
public class PostDTO {
    private String id;
    private String title;
    private String description;
    private String content;
}
