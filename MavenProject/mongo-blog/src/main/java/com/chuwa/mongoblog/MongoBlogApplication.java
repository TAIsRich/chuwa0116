package com.chuwa.mongoblog;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableMongoAuditing
public class MongoBlogApplication {

	public static void main(String[] args) {
//		ConnectionString connectionString = new ConnectionString("mongodb+srv://admin:admin@cluster0.tdxy5.mongodb.net/?retryWrites=true&w=majority");
//		MongoClientSettings settings = MongoClientSettings.builder()
//				.applyConnectionString(connectionString)
//				.build();
//		MongoClient mongoClient = MongoClients.create(settings);
//		MongoDatabase database = mongoClient.getDatabase("mongoblogs");

		SpringApplication.run(MongoBlogApplication.class, args);


	}

}
