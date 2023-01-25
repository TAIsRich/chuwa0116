# Chuwa 1.23 HW3
## ``Exercise 1``
```
@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
	public void exercise1() {
		List<Product>ans = productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equalsIgnoreCase("Books"))
				.filter(product -> product.getPrice()>100)
				.collect(Collectors.toList());
		ans.forEach(product -> log.info(product.toString()));
	}
```
## ``Exercise 2``
```
@Test
	@DisplayName("Obtain a list of order with product category = \"Baby\"")
	public void exercise2() {
		List<Product>ans = productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equalsIgnoreCase("Baby"))
						.collect(Collectors.toList());
		ans.forEach(o -> log.info(o.toString()));

	}
```
## ``Exercise 3``
```
@Test
	@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
	public void exercise3() {
		List<Product>ans = productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equalsIgnoreCase("Toys"))
				.map(o -> o.withPrice(o.getPrice()*0.9))
				.collect(Collectors.toList());
		ans.forEach(o ->log.info(o.toString()));
	}
```
## ``Exercise 4``
```
@Test
	@DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
	public void exercise4() {
		List<Product> ans = orderRepo.findAll()
				.stream()
				.filter(p -> p.getCustomer().getTier() == 2)
				.filter(p -> p.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
				.filter(p -> p.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.flatMap(p -> p.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());
		ans.forEach(o -> log.info(o.toString()));
	}
```
## ``Exercise 5``
```
@Test
	@DisplayName("Get the 3 cheapest products of \"Books\" category")
	public void exercise5() {
		List<Product> ans = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.sorted(Comparator.comparing(Product::getPrice))
				.limit(3)
				.collect(Collectors.toList());

		ans.forEach(o -> log.info(o.toString()));

	}
```
## ``Exercise 6``
```
@Test
	@DisplayName("Get the 3 most recent placed order")
	public void exercise6() {
		List<Order> ans = orderRepo.findAll()
				.stream()
				.sorted(Comparator.comparing(Order::getOrderDate).reversed())
				.limit(3)
				.collect(Collectors.toList());

		ans.forEach(o -> log.info(o.toString()));
	}
```
## ``Exercise 7``
```
	@Test
	@DisplayName("Get a list of products which was ordered on 15-Mar-2021")
	public void exercise7() {
		List<Product> ans = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());
		ans.forEach(o -> log.info(o.toString()));
	}
```
## ``Exercise 8``
```
	@Test
	@DisplayName("Calculate the total lump of all orders placed in Feb 2021")
	public void exercise8() {
		double ans = orderRepo.findAll()
					.stream()
					.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1))<=0)
					.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1))>=0)
					.flatMap(o -> o.getProducts().stream())
					.distinct()
					.mapToDouble(Product::getPrice)
					.sum();
		log.info("total lump: "+ans);
		

	}
```
## ``Exercise 9``
```
	@Test
	@DisplayName("Calculate the average price of all orders placed on 15-Mar-2021")
	public void exercise9() {
		OptionalDouble avg = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.average();
		log.info("Avg: " + avg.getAsDouble());
	}
```
## ``Exercise 10``
```
@Test
	@DisplayName("Obtain statistics summary of all products belong to \"Books\" category")
	public void exercise10() {

		DoubleSummaryStatistics ans = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.mapToDouble(Product::getPrice)
				.summaryStatistics();

		log.info(ans.toString());

	}
```
## ``Exercise 11``
```
	@Test
	@DisplayName("Obtain a mapping of order id and the order's product count")
	public void exercise11() {
		Map<Long, Integer>ans = orderRepo.findAll()
				.stream().collect(
						Collectors.toMap(
								Order::getId,o->o.getProducts().size()
						)
				);
		log.info(ans.toString());
	}
```
## ``Exercise 12``
```
	@Test
	@DisplayName("Obtain a data map of customer and list of orders")
	public void exercise12() {
		Map<Customer,List<Order>>ans = orderRepo.findAll()
						.stream()
								.collect(Collectors.groupingBy(Order::getCustomer));
		log.info(ans.toString());
	}
```
## ``Exercise 13``
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
```
## ``Exercise 14``
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
## ``Exercise 15``
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
```