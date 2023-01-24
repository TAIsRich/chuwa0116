## Homework 3

Name: Zijun Zhou

### Practice the Stream API at least three times:

#### 1. Test the Predicate anonymous class in filter method of stream API
```
	@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
	public void exercise1() {
		List<Product> result = productRepo.findAll()
		.stream()
		.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
		.filter(p -> p.getPrice() > 100)
		.collect(Collectors.toList());
		result.forEach(p -> log.info(p.toString()));
	}

	@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using Predicate chaining for filter)")
	public void exercise1a() {
		Predicate<Product> categoryFilter = product -> product.getCategory().equalsIgnoreCase("Books");
		Predicate<Product> priceFilter = product -> product.getPrice() > 100;
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(product -> categoryFilter.and(priceFilter).test(product))
				.collect(Collectors.toList());
		result.forEach(p -> log.info(p.toString()));
	}

	@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)")
	public void exercise1b() {
		BiPredicate<Product, String> categoryFilter = (product, category) -> product.getCategory().equalsIgnoreCase(category);
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(product -> categoryFilter.test(product, "Books") && product.getPrice() > 100)
				.collect(Collectors.toList());
		result.forEach(p -> log.info(p.toString()));
	}

```

#### 2. Test the anyMatch method
```
	@Test
	@DisplayName("Obtain a list of order with product category = \"Baby\"")
	public void exercise2() {
		List<Order> result = orderRepo.findAll()
				.stream()
				.filter(o ->
					o.getProducts()
					.stream()
					.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
				)
				.collect(Collectors.toList());
		result.forEach(o -> log.info(o.toString()));

	}
```

#### 3. Test filter and Map methods in Stream API
```
	@Test
	@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
	public void exercise3() {
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9))
				.collect(Collectors.toList());
		result.forEach(o -> log.info(o.toString()));

	}
```

#### 4. Test the flatMap to get a series of distinct products from the relevant order meeting the criteria
```
	@Test
	@DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
	public void exercise4() {
		List<Product> result = orderRepo.findAll()
		.stream()
		.filter(o -> o.getCustomer().getTier() == 2)
		.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
		.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
		.flatMap(o -> o.getProducts().stream())
		.distinct()
		.collect(Collectors.toList());
		result.forEach(o -> log.info(o.toString()));
	}
```

#### 5. Combine the Optional class with Stream API
```
	@Test
	@DisplayName("Get the 3 cheapest products of \"Books\" category")
	public void exercise5() {
		Optional<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.min(Comparator.comparing(Product::getPrice));
		log.info(result.get().toString());
	}
```

#### 6. Use both sorted and limit to get the top several elements
```
	@Test
	@DisplayName("Get the 3 most recent placed order")
	public void exercise6() {
		List<Order> result = orderRepo.findAll()
				.stream()
				.sorted(Comparator.comparing(Order::getOrderDate).reversed())
				.limit(3)
				.collect(Collectors.toList());
		result.forEach(o -> log.info(o.toString()));
	}
```

#### 7. Try the use of Peek()
```
	@Test
	@DisplayName("Get a list of products which was ordered on 15-Mar-2021")
	public void exercise7() {
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.peek(o -> System.out.println(o.toString()))
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());
		result.forEach(o -> log.info(o.toString()));
	}
```

#### 8. Test the flatMap, mapToDouble, BiFunction, sum and Reduce in Stream API
```
	@Test
	@DisplayName("Calculate the total lump of all orders placed in Feb 2021")
	public void exercise8() {
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.sum();
		log.info("Total lump sum = " + result);
	}
    
    @Test
	@DisplayName("Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)")
	public void exercise8a() {
		BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.reduce(0D, accumulator, Double::sum);
		log.info("Total lump sum = " + result);
	}
```
#### 9. Similarly, here we still test the use of filter, flatMap, mapToDouble and avergae
```
	@Test
	@DisplayName("Calculate the average price of all orders placed on 15-Mar-2021")
	public void exercise9() {
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.average().getAsDouble();
		log.info("Average = " + result);
	}
```

#### 10. Test the use of the summaryStatistics in Stream API
```
	@Test
	@DisplayName("Obtain statistics summary of all products belong to \"Books\" category")
	public void exercise10() {
		DoubleSummaryStatistics statistics = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.mapToDouble(Product::getPrice)
				.summaryStatistics();
		log.info(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
				statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));
	}
```

#### 11. Convert the stream of list to Map
```
	@Test
	@DisplayName("Obtain a mapping of order id and the order's product count")
	public void exercise11() {
		Map<Long, Integer>  result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Order::getId,
								order -> order.getProducts().size())
						);
		log.info(result.toString());
	}
```

#### 12. Test the use of groupingBy
```
	@Test
	@DisplayName("Obtain a data map of customer and list of orders")
	public void exercise12() {
		Map<Customer, List<Order>> result = orderRepo.findAll()
				.stream()
				.collect(Collectors.groupingBy(Order::getCustomer));
		log.info(result.toString());
	}

	@Test
	@DisplayName("Obtain a data map of customer_id and list of order_id(s)")
	public void exercise12a() {
		HashMap<Long, List<Long>> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								order -> order.getCustomer().getId(),
								HashMap::new,
								Collectors.mapping(Order::getId, Collectors.toList())));
		log.info(result.toString());
	}
```

#### 13. Test the use of toMap
```
	@Test
	@DisplayName("Obtain a data map with order and its total price")
	public void exercise13() {
		Map<Order, Double> result = orderRepo.findAll()
				.stream()
				.collect(
					Collectors.toMap(
							Function.identity(),
							order -> order.getProducts().stream()
										.mapToDouble(Product::getPrice).sum())
					);
		log.info(result.toString());
	}

	@Test
	@DisplayName("Obtain a data map with order and its total price (using reduce)")
	public void exercise13a() {
		Map<Long, Double> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Order::getId,
								order -> order.getProducts().stream()
										.reduce(0D, (acc, product) -> acc + product.getPrice(), Double::sum)
						));
		log.info(result.toString());
	}
```


#### 14. Test the use of groupingBy
```
	@Test
	@DisplayName("Obtain a data map of product name by category")
	public void exercise14() {
		Map<String, List<String>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.mapping(Product::getName, Collectors.toList()))
						);
		log.info(result.toString());
	}
```

#### 15.
```
	@Test
	@DisplayName("Get the most expensive product per category")
	void exercise15() {
		Map<String, Optional<Product>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.maxBy(Comparator.comparing(Product::getPrice)))
						);
		log.info(result.toString());
	}
	
	@Test
	@DisplayName("Get the most expensive product (by name) per category")
	void exercise15a() {
		Map<String, String> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.collectingAndThen(
										Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)),
										optionalProduct -> optionalProduct.map(Product::getName).orElse(null)
								)
						));
		log.info(result.toString());
	}
```