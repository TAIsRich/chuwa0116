package com.chuwa.mongoblog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("db_sequence")
@Data
public class DbSequence {
    @Id
    private String  id;
    private int seq;

    public DbSequence(){}

    public DbSequence(String id, int seq) {
        this.id = id;
        this.seq = seq;
    }
}