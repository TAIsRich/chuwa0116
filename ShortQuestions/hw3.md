### Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
```java
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
```
### Exercise 2 — Obtain a list of order with products belong to category “Baby” 
```java
@Test
@DisplayName("Obtain a list of order with product category = \"Baby\"")
public void exercise2() {
    List<Order> result = orderRepo.findAll()
            .stream()
            .filter( o ->
                    o.getProducts()
                            .stream()
                            .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
            ).collect(Collectors.toList());
    
    result.forEach(o -> log.info(o.toString()));
}
```

### Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount 
```java
@Test
@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
public void exercise3() {;
    List<Product> result = productRepo.findAll()
            .stream()
            .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
            .map(p -> p.withPrice(p.getPrice()*0.9))
            .collect(Collectors.toList());
    
    result.forEach(o -> log.info(o.toString()));
}
```

### Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
```java
@Test
@DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
public void exercise4() {
    List<Product> result = orderRepo.findAll()
            .stream()
            .filter(o -> o.getCustomer().getTier() == 2)
            .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
            .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021,4,1)) <= 0)
            .flatMap(o -> o.getProducts().stream())
            .distinct()
            .collect(Collectors.toList());
    
    result.forEach(o -> log.info(o.toString()));
}
```

### Exercise 5 — Get the cheapest products of “Books” category   
```java
@Test
@DisplayName("Get the 3 cheapest products of \"Books\" category")
public void exercise5() {
        List<Product> result = productRepo.findAll()
        .stream()
        .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
        .sorted(Comparator.comparing(Product::getPrice))
        .limit(3)
        .collect(Collectors.toList());
        
        result.forEach(p -> log.info(p.toString()));
        }
```

### Exercise 6 — Get the 3 most recent placed order
```java
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

### Exercise 7 — Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
```java
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

### Exercise 8 — Calculate total lump sum of all orders placed in Feb 2021 
```java
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
```

### Exercise 9 — Calculate order average payment placed on 14-Mar-2021 
```java
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

### Exercise 10 — Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books” 
```java
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

### Exercise 11 — Obtain a data map with order id and order’s product count 
```java
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

### Exercise 12 — Produce a data map with order records grouped by customer 
```java
@Test
@DisplayName("Obtain a data map of customer and list of orders")
public void exercise12() {
    Map<Customer, List<Order>> result = orderRepo.findAll()
            .stream()
            .collect(Collectors.groupingBy(Order::getCustomer));
    
    log.info(result.toString());
}
```

### Exercise 13 — Produce a data map with order record and product total sum
```java
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

### Exercise 14 — Obtain a data map with list of product name by category
```java
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

### Exercise 15 — Get the most expensive product by category
```java
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