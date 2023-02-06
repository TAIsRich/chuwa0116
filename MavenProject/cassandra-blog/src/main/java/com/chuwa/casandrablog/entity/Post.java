package com.chuwa.casandrablog.entity;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;


import java.time.LocalDateTime;

@Data
public class Post {
    @PrimaryKey
    private String id;
    private String title;
    private String description;
    private String content;

    @CreatedDate
    private LocalDateTime createDateTime;
    @LastModifiedDate
    private LocalDateTime updateDateTime;
}
