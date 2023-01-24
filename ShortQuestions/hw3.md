# 1
```
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());
```

# 2
```
		List<Order> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getProducts()
						.stream()
						.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());
```

# 3
```
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9))
				.collect(Collectors.toList());
```

# 4
```
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getCustomer()
						.getTier() == 2)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) >= 0)
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());
```

# 5
```
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
				.limit(3)
				.collect(Collectors.toList());
```

# 6
```
		List<Order> result = orderRepo.findAll()
				.stream()
				.sorted((o1, o2) -> o2.getOrderDate().compareTo(o1.getOrderDate()))
				.limit(3)
				.collect(Collectors.toList());
```

# 7
```
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.peek(o -> System.out.println(o.toString()))
				.flatMap(o -> o.getProducts()
						.stream())
				.distinct()
				.collect(Collectors.toList());
```

# 8
```
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.sum();
```

# 9
```
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.average().getAsDouble();
```

# 10
```
		DoubleSummaryStatistics statistics = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.mapToDouble(Product::getPrice)
				.summaryStatistics();
```

# 11
```
		Map<Long, Integer>  result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Order::getId,
								order -> order.getProducts().size())
						);
```

# 12
```
		Map<Customer, List<Order>> result = orderRepo.findAll()
				.stream()
				.collect(Collectors.groupingBy(Order::getCustomer));
```

# 13
```
		HashMap<Long, List<Long>> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								order -> order.getCustomer().getId(),
								HashMap::new,
								Collectors.mapping(Order::getId, Collectors.toList())));
```

# 14
```
		Map<String, List<String>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.mapping(Product::getName, Collectors.toList()))
						);
```

# 15
```
		Map<String, Optional<Product>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.maxBy(Comparator.comparing(Product::getPrice)))
						);
```
