package com.example.cassandra.RESTAPI.repository;

import com.example.cassandra.RESTAPI.model.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ProductRepository extends CassandraRepository<Product,Integer> {
}

