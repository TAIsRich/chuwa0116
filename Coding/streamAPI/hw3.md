### 1. "Obtain a list of product with category = \"Books\" and price > 100"
```
public void exercise1() {
		List<Product> result = productRepo.findAll().stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100).collect(Collectors.toList());
		result.forEach(p -> log.info(p.toString()));
	}
```

### 1a. "Obtain a list of product with category = \"Books\" and price > 100 (using Predicate chaining for filter)"
```
public void exercise1a() {
		Predicate<Product> categoryFilter = p -> p.getCategory().equalsIgnoreCase("Books");
		Predicate<Product> priceFilter = p -> p.getPrice() > 100;	
		List<Product> result = productRepo.findAll()
				.stream().filter(p -> categoryFilter.and(priceFilter).test(p))
				.collect(Collectors.toList());

		result.forEach(p -> log.info(p.toString()));
	}
```
### 1b. "Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)"
```
public void exercise1b() {
		BiPredicate<Product, String> categoryFilter = ((product, s) -> product.getCategory().equalsIgnoreCase(s));

		List<Product> result = productRepo.findAll()
				.stream()
				.filter(product -> categoryFilter.test(product, "Books") && product.getPrice() >100)
				.collect(Collectors.toList());

		result.forEach(p -> log.info(p.toString()));
	}

```
### 2. "Obtain a list of order with product category = \"Baby\""
```
public void exercise2() {
		long startTime = System.currentTimeMillis();
		List<Order> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getProducts()
						.stream().anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());

		long endTime = System.currentTimeMillis();

		log.info(String.format("exercise 2 - execution time: %1$d ms", (endTime - startTime)));
		result.forEach(o -> log.info(o.toString()));

	}
```
### 3. "Obtain a list of product with category = “Toys” and then apply 10% discount\""
public void exercise3() {
		long startTime = System.currentTimeMillis();

		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9))
				.collect(Collectors.toList());

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 3 - execution time: %1$d ms", (endTime - startTime)));
		result.forEach(o -> log.info(o.toString()));

	}

### 4. "Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021"
```
public void exercise4() {
		long startTime = System.currentTimeMillis();
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(order -> order.getCustomer().getTier() == 2)
				.filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2,1)) >=0)
				.filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2,1)) <=0)
				.flatMap(order -> order.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 4 - execution time: %1$d ms", (endTime - startTime)));
		result.forEach(o -> log.info(o.toString()));
	}
```

### 5. "Get the 3 cheapest products of \"Books\" category"
```
public void exercise5() {
		long startTime = System.currentTimeMillis();
//              Optional<Product> result = productRepo.findAll()
//                              .stream()
//                              .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
//                              .sorted(Comparator.comparing(Product::getPrice))
//                              .findFirst();

		List<Product> result = productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equalsIgnoreCase("Books"))
				.sorted(Comparator.comparing(Product::getPrice))
				.limit(3)
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 5 - execution time: %1$d ms", (endTime - startTime)));
}
```
### 6. "Get the 3 most recent placed order"
```
public void exercise6() {
		long startTime = System.currentTimeMillis();
		List<Order> result = orderRepo.findAll().stream()
						.sorted(Comparator.comparing(Order::getOrderDate).reversed())
						.limit(3)
						.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 6 - execution time: %1$d ms", (endTime - startTime)));
		result.forEach(o -> log.info(o.toString()));
	}

```

### 7. "Get a list of products which was ordered on 15-Mar-2021"
```
public void exercise7() {
		long startTime = System.currentTimeMillis();
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 7 - execution time: %1$d ms", (endTime - startTime)));
		result.forEach(o -> log.info(o.toString()));
	}
```

### 8. "Calculate the total lump of all orders placed in Feb 2021"
```
public void exercise8() {
		long startTime = System.currentTimeMillis();
		double result = orderRepo.findAll()
				.stream()
				.filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021,2,1))>=0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(order -> order.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.sum();
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 8 - execution time: %1$d ms", (endTime - startTime)));
		log.info("Total lump sum = " + result);
	}

```

### 8a. "Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)"
```
public void exercise8a() {
		//    T - the type of the first argument to the function
		//    U - the type of the second argument to the function
		//    R - the type of the result of the function
		BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();

		long startTime = System.currentTimeMillis();
		// identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
		// Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
		// Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized or
		// when there's a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.reduce(0D, accumulator, Double::sum);

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 8a - execution time: %1$d ms", (endTime - startTime)));
		log.info("Total lump sum = " + result);
	}
```

### 9. "Calculate the average price of all orders placed on 15-Mar-2021"
```
public void exercise9() {
		long startTime = System.currentTimeMillis();
		double result = orderRepo.findAll()
				.stream()
				.filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
				.flatMap(order -> order.getProducts().stream())
				.mapToDouble(p -> p.getPrice())
				.average().getAsDouble();
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 9 - execution time: %1$d ms", (endTime - startTime)));
		log.info("Average = " + result);
	}
```

### 10. "Obtain statistics summary of all products belong to \"Books\" category"
```
public void exercise10() {
		long startTime = System.currentTimeMillis();
		// summaryStatistics(). It returns a data type DoubleSummaryStatistics which contains all the required figures.
		DoubleSummaryStatistics statistics = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.mapToDouble(Product::getPrice)
				.summaryStatistics();

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 10 - execution time: %1$d ms", (endTime - startTime)));
		log.info(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
				statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));

	}
```

### 11. "Obtain a mapping of order id and the order's product count"
```
public void exercise11() {
		long startTime = System.currentTimeMillis();
		Map<Long, Integer> result = orderRepo.findAll()
				.stream()
				.collect(Collectors.toMap(
						order -> order.getId(),
						order -> order.getProducts().size()
				));

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 11 - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
	}

```

### 12. "Obtain a data map of customer and list of orders"
```
public void exercise12() {
		long startTime = System.currentTimeMillis();
		Map<Customer, List<Order>> result = orderRepo.findAll()
				.stream()
				.collect(Collectors.groupingBy(Order::getCustomer));

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 12 - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
	}
```

### 12a. "Obtain a data map of customer_id and list of order_id(s)"
```
public void exercise12a() {
		long startTime = System.currentTimeMillis();
		HashMap<Long, List<Long>> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								order -> order.getCustomer().getId(),
								HashMap::new,
								Collectors.mapping(Order::getId, Collectors.toList())));
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 12a - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
	}
```

### 13. "Obtain a data map with order and its total price"
```
public void exercise13() {
		long startTime = System.currentTimeMillis();
		Map<Order, Double> result = orderRepo.findAll()
				.stream()
				.collect(
					Collectors.toMap(
							Function.identity(),
							order -> order.getProducts().stream()
										.mapToDouble(Product::getPrice).sum())
					);

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 13 - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
	}
```

### 13a. "Obtain a data map with order and its total price (using reduce)"
```
public void exercise13a() {
		long startTime = System.currentTimeMillis();
		Map<Long, Double> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Order::getId,
								order -> order.getProducts().stream()
										.reduce(0D, (acc, product) -> acc + product.getPrice(), Double::sum)
						));

		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 13a - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
	}

```
### 14. "Obtain a data map of product name by category")
```
public void exercise14() {
		long startTime = System.currentTimeMillis();	
		Map<String, List<String>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.mapping(Product::getName, Collectors.toList()))
						);


		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 14 - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
	}

```

### 15. "Get the most expensive product per category"
```
void exercise15() {
		long startTime = System.currentTimeMillis();
		Map<String, Optional<Product>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.maxBy(Comparator.comparing(Product::getPrice)))
						);
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 15 - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
//		result.forEach((k,v) -> {
//			log.info("key=" + k + ", value=" + v.get());
//		});

	}
```

### 15a. "Get the most expensive product (by name) per category"
```void exercise15a() {
		long startTime = System.currentTimeMillis();
		Map<String, String> result = productRepo.findAll()
				.stream()
				.collect(Collectors.groupingBy(
						Product::getCategory,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)),
								optionalProduct -> optionalProduct.map(Product::getName).orElse(null))
				));
		long endTime = System.currentTimeMillis();
		log.info(String.format("exercise 15a - execution time: %1$d ms", (endTime - startTime)));
		log.info(result.toString());
	}

```