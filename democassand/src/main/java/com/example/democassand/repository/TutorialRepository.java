package com.example.democassand.repository;

import com.example.democassand.model.Tutorial;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;
import java.util.UUID;

public interface TutorialRepository extends CassandraRepository<Tutorial, UUID> {

    @AllowFiltering
    List<Tutorial> findByPublished(boolean published);

    //List<Tutorial> findByTitleContaining(String title);

}
