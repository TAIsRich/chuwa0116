package com.example.mongoblog.service.Impl;

import com.example.mongoblog.entity.DbSequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;


@Service
public class SequenceGenerator {

    @Autowired
    private MongoOperations mongoOperations;

    public Long getSequenceNumber(String sequenceName) {
        Query query = new Query(Criteria.where("id").is(sequenceName));
        Update update = new Update().inc("seq", 1);
        DbSequence counter = mongoOperations
                .findAndModify(query,
                        update,
                        options().returnNew(true).upsert(true),
                        DbSequence.class);

        return !Objects.isNull(counter) ? (long) counter.getSeq() : 1;
    }
}
