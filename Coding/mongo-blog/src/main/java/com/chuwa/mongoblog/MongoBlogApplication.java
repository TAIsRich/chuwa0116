package com.chuwa.mongoblog;

import com.chuwa.mongoblog.model.GroceryItem;
import com.chuwa.mongoblog.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoBlogApplication {
//public class MongoBlogApplication implements CommandLineRunner {

//	@Autowired
//	private ItemRepository groceryItemRepo;

	public static void main(String[] args) {
		SpringApplication.run(MongoBlogApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Data creation started...");
//		groceryItemRepo.save(new GroceryItem("Whole Wheat Biscuit", "Whole Wheat Biscuit", 5, "snacks"));
//		groceryItemRepo.save(new GroceryItem("Kodo Millet", "XYZ Kodo Millet healthy", 2, "millets"));
//		groceryItemRepo.save(new GroceryItem("Dried Red Chilli", "Dried Whole Red Chilli", 2, "spices"));
//		groceryItemRepo.save(new GroceryItem("Pearl Millet", "Healthy Pearl Millet", 1, "millets"));
//		groceryItemRepo.save(new GroceryItem("Cheese Crackers", "Bonny Cheese Crackers Plain", 6, "snacks"));
//		System.out.println("Data creation complete...");
//	}
}
