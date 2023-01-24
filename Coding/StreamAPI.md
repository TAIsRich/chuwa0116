## Stream API Practice

More info here: https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82

#### 1.Obtain a list of product with category = "Books" and price > 100
```java
    public void exercise1() {
        List<Product> result = productRepo.findAll()
    	  .stream()
	  .filter(p -> p.getCategory().matches("Books")) // match精确匹配 或 equalsIgnoreCase("Books")忽略大小写
	  .filter(p -> p.getPrice() > 100)
	  .collect(Collectors.toList());
    
          result.forEach(p -> log.info(p.toString()));
        }
```

#### 2.Obtain a list of order with product category = "Baby"
```java
public void exercise2() {
		//anymatch()： 一个order里有很多products
		//allmatch（）只返回当且仅当只有一个product category为Baby的order
		//anymatch（）返回购买了Baby products的order
		List<Order> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
				.collect(Collectors.toList());

    // print out result
		result.forEach(o -> log.info(o.toString()));
		result.forEach(o -> log.info(o.getProducts().toString()));

	}
```

#### 3.Obtain a list of product with category = “Toys” and then apply 10% discount"
```java
public void exercise3() {
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
				.map(p -> p.withPrice(p.getPrice()*0.9))
				.collect(Collectors.toList());

		result.forEach(o -> log.info(o.toString()));

	}
```

#### 4.Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
```java
public void exercise4() {
		List<Order> order = orderRepo.findAll()
				.stream()
				.filter(o -> o.getCustomer().getTier() == 2)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
				.collect(Collectors.toList());

		//order.forEach(o -> log.info(o.toString()));

		List<Product> result = order.stream() // 再次stream， 或者和上边一起（和链接里的一样）
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());

		result.forEach(p -> log.info(p.toString()));
	}

```

#### 5.Get the 3 cheapest products of "Books" category
```java
public void exercise5() {
		List<Product> result = productRepo.findAll()
				.stream()
				.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
				.sorted(Comparator.comparing(p -> p.getPrice()))  // find cheapest with .min(Comparator.comparing(Product::getPrice));
				.limit(3)
				.collect(Collectors.toList());

		result.forEach(o -> log.info(o.toString()));

	}

```
#### 6.Get the 3 most recent placed order
```java
public void exercise6() {
		List<Order> result = orderRepo.findAll()
				.stream()
				.sorted(Comparator.comparing(Order::getOrderDate).reversed())
				.limit(3)
				.collect(Collectors.toList());

		result.forEach(o -> log.info(o.toString()));
	}
```

#### 7.Get a list of products which was ordered on 15-Mar-2021
```java
public void exercise7() {
		List<Product> result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.distinct()
				.collect(Collectors.toList());

		result.forEach(o -> log.info(o.toString()));
	}
```

#### 8.Calculate the total lump of all orders placed in Feb 2021
```java
public void exercise8() {
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.sum();

		log.info("lump sum = " + result);
	}
```

#### 8a.Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)
```java
public void exercise8a() {
		BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();
  
		double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
				.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
				.flatMap(o -> o.getProducts().stream())
				.reduce(0d,accumulator,Double::sum); //reduce负责把上次累加的结果和本次的元素 进行运算

		log.info("Total lump sum = " + result);
	}
```
#### 9.Calculate the average price of all orders placed on 15-Mar-2021
```java
public void exercise9() {
		Double result = orderRepo.findAll()
				.stream()
				.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
				.flatMap(o -> o.getProducts().stream())
				.mapToDouble(Product::getPrice)
				.average().getAsDouble();

		log.info("Average = " + result);
	}
```
#### 10.Obtain statistics summary of all products belong to "Books" category
```java
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
#### 11.Obtain a mapping of order id and the order's product count
```java
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
#### 12.Obtain a data map of customer and list of orders
```java
public void exercise12() {
		Map<Customer, List<Order>> result = orderRepo.findAll()
				.stream()
				.collect(Collectors.groupingBy(Order::getCustomer));

		log.info(result.toString());
	}
```
#### 12a.Obtain a data map of customer_id and list of order_id(s)
```java
public void exercise12a() {
		HashMap<Long, List<Long>> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								o -> o.getCustomer().getId(),
								HashMap::new,
								Collectors.mapping(Order::getId, Collectors.toList())));
		log.info(result.toString());
	}
```
#### 13.Obtain a data map with order and its total price
```java
public void exercise13() {
		//functional.identity 返回map的时候，返回本身
		Map<Order, Double> result = orderRepo.findAll()
				.stream()
				.collect(
					Collectors.toMap(
							//Functional.identity() == o ->o
							o ->o,
							o -> o.getProducts().stream().mapToDouble(Product::getPrice).sum())
				);

		log.info(result.toString());
	}
```
```java 
public void exercise13a() {  // using reduce
		Map<Long, Double> result = orderRepo.findAll()
				.stream()
				.collect(
						Collectors.toMap(
								Order::getId,
								order -> order.getProducts().stream()
										.reduce(0d, (acc, product) -> acc + product.getPrice(), Double::sum)
						));

		log.info(result.toString());
	}
```
#### 14.Obtain a data map of product name by category
```java
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
#### 15.Get the most expensive product per category
```java
void exercise15() { //by prod price
		Map<String, Optional<Product>> result = productRepo.findAll()
				.stream()
				.collect(
						Collectors.groupingBy(
								Product::getCategory,
								Collectors.maxBy(Comparator.comparing(Product::getPrice)))
						);
```
```java
void exercise15a() { // by prod name
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
