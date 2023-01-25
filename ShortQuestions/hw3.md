## Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100

```java
	public void exercise1m() {
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.filter(p -> p.getPrice() > 100)
				.collect(Collectors.toList());

		result.forEach(p -> log.info(p.toString()));
	}
  
```

## Exercise 2 — Obtain a list of order with products belong to category “Baby”

```java
	public void exercise2m() {
		List<Order> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getProducts()
								.stream()
								.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
				)
				.collect(Collectors.toList());
		result.forEach(o -> log.info(o.toString()));
	}
```

## Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
```java
	public void exercise3m() {
		List<Product> toys = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice() * 0.9))
				.collect(Collectors.toList());
		toys.forEach(p -> log.info(p.toString()));
	}
```

## Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
```java
	public void exercise4m() {
		List<Product> collect = orderRepo.findAll()
				.stream()
				.filter(o -> o.getCustomer().getTier() == 2)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());
		collect.forEach(p -> log.info(p.toString()));
	}
```

## Exercise 5 — Get the cheapest products of “Books” category
```java
	public void exercise5m() {
		Optional<Product> book = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Book"))
				.min(Comparator.comparing(Product::getPrice));
		log.info(book.toString());
	}
```

## Exercise 6 — Get the 3 most recent placed order
```java
	public void exercise6m() {
		List<Order> collect = orderRepo.findAll()
				.stream()
				.sorted(Comparator.comparing(Order::getOrderDate).reversed())
				.limit(3)
				.collect(Collectors.toList());
		collect.forEach(o -> log.info(o.toString()));
	}
```

## Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
```java
	public void exercise7m() {
		List<Product> collect = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.peek(o -> System.out.println(o.toString()))
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());
		collect.forEach(o -> log.info(o.toString()));
	}
```

## Exercise 8 — Calculate total lump sum of all orders placed in Feb 2021
```java
	public void exercise8m() {
		double sum = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.sum();
		log.info("Total lump sum = " + sum);
	}
```

## Exercise 9 — Calculate order average payment placed on 14-Mar-2021
```java
	public void exercise9m() {
		double asDouble = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.average().getAsDouble();
		log.info("Average = " + asDouble);
	}
```

## Exercise 10 — Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”
```java
	public void exercise10m() {
		DoubleSummaryStatistics statistics = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.mapToDouble(Product::getPrice)
				.summaryStatistics();
		log.info(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
				statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));
	}
```

## Exercise 11 — Obtain a data map with order id and order’s product count
```java
	public void exercise11m() {
		Map<Long, Integer> collect = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Order::getId,
								o -> o.getProducts().size()
						)
				);
		log.info(collect.toString());
	}
```

## Exercise 12 — Produce a data map with order records grouped by customer
```java
	public void exercise12m() {
		Map<Customer, List<Order>> collect = orderRepo.findAll()
				.stream()
				.collect(Collectors.groupingBy(Order::getCustomer));
	}
```

## Exercise 13 — Produce a data map with order record and product total sum
```java
	public void exercise13m() {
		Map<Order, Double> collect = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Function.identity(),
								o -> o.getProducts().stream().mapToDouble(Product::getPrice).sum()
						)
				);
	}
```

## Exercise 14 — Obtain a data map with list of product name by category
```java
	public void m() {
		Map<String, List<String>> collect = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.mapping(Product::getName, Collectors.toList())
						)
				);
	}
```

## Exercise 15 — Get the most expensive product by category
```java
	void exercise15m() {
		Map<String, Optional<Product>> collect = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.maxBy(Comparator.comparing(Product::getPrice))
						)
				);
	}
```
