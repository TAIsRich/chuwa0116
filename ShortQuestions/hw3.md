### Exercise 1
```java
@Test
@DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
public void exercise1() {
        long startTime = System.currentTimeMillis();
        List<Product> result = productRepo.findAll()
        .stream()
        .filter(product -> product.getCategory().equals("Books") && product.getPrice() > 100)
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 1 - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(p -> log.info(p.toString()));
        }
        
@Test
@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using Predicate chaining for filter)")
public void exercise1a() {
        Predicate<Product> productFilter = product -> product.getCategory().equalsIgnoreCase("Books");
        Predicate<Product> priceFilter = product -> product.getPrice() > 100;
        long startTime = System.currentTimeMillis();
        List<Product> result = productRepo.findAll()
        .stream()
        .filter(product -> productFilter.and(priceFilter).test(product))
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 1a - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(p -> log.info(p.toString()));
        }
@Test
@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)")
public void exercise1b() {
        BiPredicate<Product, String> categoryFilter = (product, category) -> product.getCategory().equalsIgnoreCase(category);
        long startTime = System.currentTimeMillis();
        List<Product> result = productRepo.findAll()
        .stream()
        .filter(product -> categoryFilter.test(product, "Books"))
        .filter(product -> product.getPrice() > 100)
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 1b - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(p -> log.info(p.toString()));
        }
```

### Exercise 2
```java
@Test
@DisplayName("Obtain a list of order with product category = \"Baby\"")
public void exercise2() {
        long startTime = System.currentTimeMillis();
        List<Order> result = orderRepo.findAll()
        .stream()
        .filter(order -> order.getProducts()
        .stream()
        .anyMatch(product -> product.getCategory().equalsIgnoreCase("Baby"))
        )
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 2 - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(o -> log.info(o.toString()));
        }
```


### Exercise 3
```java
@Test
@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
public void exercise3() {
        long startTime = System.currentTimeMillis();
        List<Product> result = productRepo.findAll()
        .stream()
        .filter(product -> product.getCategory().equalsIgnoreCase("Toys"))
        .map(product -> {
        product.setPrice(product.getPrice() * 0.9);
        return product;
        })
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 3 - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(o -> log.info(o.toString()));
        }
```

### Exercise 4
```java
@Test
@DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
public void exercise4() {
        Predicate<Order> dateFilter =
        o -> o.getOrderDate().isAfter(LocalDate.of(2021, 1, 1))
        && o.getOrderDate().isBefore(LocalDate.of(2021,4,1));
        long startTime = System.currentTimeMillis();
        List<Product> result =orderRepo.findAll()
        .stream()
        .filter(o -> o.getCustomer().getTier() == 2)
        .filter(dateFilter)
        .flatMap(o -> o.getProducts().stream())
        .distinct()
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 4 - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(o -> log.info(o.toString()));
        }
```

### Exercise 5
```java
@Test
@DisplayName("Get the 3 cheapest products of \"Books\" category")
public void exercise5() {
        long startTime = System.currentTimeMillis();
        Optional<Product> result = productRepo.findAll()
        .stream()
        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
        .min(Comparator.comparing(Product::getPrice));
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 5 - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.get().toString());
        }
```

### Exercise 6
```java
@Test
@DisplayName("Get the 3 most recent placed order")
public void exercise6() {
        long startTime = System.currentTimeMillis();
        List<Order> result = orderRepo.findAll()
        .stream()
        .sorted(Comparator.comparing(Order::getOrderDate).reversed())
        .limit(3)
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 6 - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(o -> log.info(o.toString()));
        }
```

### Exercise 7
```java
@Test
@DisplayName("Get a list of products which was ordered on 15-Mar-2021")
public void exercise7() {
        long startTime = System.currentTimeMillis();
        List<Product> result = orderRepo.findAll()
        .stream()
        .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
        .flatMap(o -> o.getProducts().stream())
        .distinct()
        .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 7 - execution time: %1$d ms", (endTime - startTime)));
        result.forEach(o -> log.info(o.toString()));
        }
```

### Exercise 8
```java
@Test
@DisplayName("Calculate the total lump of all orders placed in Feb 2021")
public void exercise8() {
        long startTime = System.currentTimeMillis();
        double result = orderRepo.findAll()
        .stream()
        .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2021, 1, 31))
        && o.getOrderDate().isBefore(LocalDate.of(2021, 3, 1))
        )
        .flatMap(o -> o.getProducts().stream())
        .mapToDouble(Product::getPrice)
        .sum();
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 8 - execution time: %1$d ms", (endTime - startTime)));
        log.info("Total lump sum = " + result);
        }
@Test
@DisplayName("Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)")
public void exercise8a() {
        BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();
        long startTime = System.currentTimeMillis();
        double result = orderRepo.findAll()
        .stream()
        .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2021, 1, 31))
        && o.getOrderDate().isBefore(LocalDate.of(2021, 3, 1))
        )
        .flatMap(o -> o.getProducts().stream())
        .reduce(0D, accumulator, Double::sum);
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 8a - execution time: %1$d ms", (endTime - startTime)));
        log.info("Total lump sum = " + result);
        }
```

### Exercise 9
```java
@Test
@DisplayName("Calculate the average price of all orders placed on 15-Mar-2021")
public void exercise9() {
        long startTime = System.currentTimeMillis();
        double result = orderRepo.findAll()
        .stream()
        .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
        .flatMap(p -> p.getProducts().stream())
        .mapToDouble(Product::getPrice)
        .average()
        .getAsDouble();
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 9 - execution time: %1$d ms", (endTime - startTime)));
        log.info("Average = " + result);
        }
```

### Exercise 10
```java
@Test
@DisplayName("Obtain statistics summary of all products belong to \"Books\" category")
public void exercise10() {
        long startTime = System.currentTimeMillis();
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

### Exercise 11
```java
@Test
@DisplayName("Obtain a mapping of order id and the order's product count")
public void exercise11() {
        long startTime = System.currentTimeMillis();
        Map<Long, Integer> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.toMap(Order::getId,
        o -> o.getProducts().size())
        );
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 11 - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
```

### Exercise 12
```java
@Test
@DisplayName("Obtain a data map of customer and list of orders")
public void exercise12() {
        long startTime = System.currentTimeMillis();
        Map<Customer, List<Order>> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(Order::getCustomer));
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 12 - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
@Test
@DisplayName("Obtain a data map of customer_id and list of order_id(s)")
public void exercise12a() {
        long startTime = System.currentTimeMillis();
        HashMap<Long, List<Long>> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(
        o -> o.getCustomer().getId(),
        HashMap::new,
        Collectors.mapping(Order::getId, Collectors.toList()))
        );
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 12a - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
```


### Exercise 13
```java
@Test
@DisplayName("Obtain a data map with order and its total price")
public void exercise13() {
        long startTime = System.currentTimeMillis();
        Map<Order, Double> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.toMap(order -> order,
        order -> order.getProducts()
        .stream()
        .mapToDouble(Product::getPrice)
        .sum()
        )
        );
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 13 - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
@Test
@DisplayName("Obtain a data map with order and its total price (using reduce)")
public void exercise13a() {
        BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();
        long startTime = System.currentTimeMillis();
        Map<Long, Double> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.toMap(Order::getId,
        order -> order.getProducts()
        .stream()
        .reduce(0D, accumulator,Double::sum)
        )
        );
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 13a - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
```

### Exercise 14
```java
@Test
@DisplayName("Obtain a data map of product name by category")
public void exercise14() {
        long startTime = System.currentTimeMillis();
        Map<String, List<String>> result = productRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(
        Product::getCategory,
        Collectors.mapping(Product::getName, Collectors.toList())
        ));
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 14 - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
```


### Exercise 15
```java
@Test
@DisplayName("Get the most expensive product per category")
	void exercise15() {
            long startTime = System.currentTimeMillis();
            Map<String, Optional<Product>> result = productRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(
        Product::getCategory,
        Collectors.maxBy(Comparator.comparing(Product::getPrice, Double::compareTo))
        ));
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 15 - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
@Test
@DisplayName("Get the most expensive product (by name) per category")
	void exercise15a() {
            long startTime = System.currentTimeMillis();
            Map<String, String> result = productRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(
        Product::getCategory,
        Collectors.collectingAndThen(
        Collectors.maxBy(Comparator.comparing(Product::getPrice, Double::compareTo)),
        optionalProduct -> optionalProduct.map(Product::getName).orElse(null)
        )
        ));
        long endTime = System.currentTimeMillis();
        log.info(String.format("exercise 15a - execution time: %1$d ms", (endTime - startTime)));
        log.info(result.toString());
        }
```
