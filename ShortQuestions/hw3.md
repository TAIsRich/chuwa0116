##1.Obtain a list of product with category = \"Books\" and price > 100
```
@Test
    @DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
    public void exercise1() {
        List<Product> results = productRepo.findAll()
                                            .stream()
                                            .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                                            .filter(p -> p.getPrice() > 100)
                                            .collect(Collectors.toList());
        results.forEach(product -> log.info(product.toString()));
    }

```

```
@Test
    @DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using Predicate chaining for filter)")
    public void exercise1a() {
        Predicate<Product> categoryFilter = product -> product.getCategory().equalsIgnoreCase("Books");
        Predicate<Product> priceFilter = product -> product.getPrice() > 100;
        //Predicates can be used in combination，  Predicate.and(), Predicate.or() 和 Predicate.negate()
        List<Product> results = productRepo.findAll()
                                .stream()
                                .filter(product -> categoryFilter.and(priceFilter).test(product))
                                .collect(Collectors.toList());
        results.forEach(product -> log.info(product.toString()));
    }

```
```
@Test
    @DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)")
    public void exercise1b() {
        //BiPredicate is a functional interface that takes two arguments and returns a Boolean value.
        BiPredicate<Product, String> categoryFilter = (product, category) -> product.getCategory().equalsIgnoreCase(category);
        List<Product> results = productRepo.findAll()
                                .stream()
                                .filter(product -> categoryFilter.test(product, "Books") && product.getPrice() > 100)
                                .collect(Collectors.toList());
        results.forEach(product -> log.info(product.toString()));
    }

```

##2.Obtain a list of order with product category = "Baby"
```
public void exercise2() {
        List<Order> results = orderRepo.findAll()
                                .stream()
                                .filter(order -> order.getProducts()
                                                        .stream()
                                                        .anyMatch(product -> product.getCategory().equalsIgnoreCase("Baby"))
                                )
                                .collect(Collectors.toList());
        results.forEach(order -> log.info(order.toString()));
    }

```

##3.Obtain a list of product with category = “Toys” and then apply 10% discount"
```
public void exercise3() {
        List<Product> results = productRepo.findAll()
                                .stream()
                                .filter(product -> product.getCategory().equalsIgnoreCase("Toys"))
                                .map(product -> product.withPrice(product.getPrice() * 0.9))
                                .collect(Collectors.toList());
        results.forEach(product -> log.info(product.toString()));
    }

```

##4.Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
```
public void exercise4() {
        //Note: the distinct() operation needs to follow flatMap() operation
        List<Product> results = orderRepo.findAll()
                                .stream()
                                .filter(order -> order.getCustomer().getTier() == 2)
                                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                                .flatMap(order -> order.getProducts().stream())
                                .distinct()
                                .collect(Collectors.toList());
        results.forEach(product -> log.info(product.toString()));
    }

```

##5.Get the 3 cheapest products of "Books" category
```
public void exercise5() {
        List<Product> results = productRepo.findAll()
                                .stream()
                                .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                                .min(Comparator.comparing(Product :: getPrice))
                                .stream()
                                .collect(Collectors.toList());
        results.forEach(product -> log.info(product.toString()));
    }

```

##6.Get the 3 most recent placed order
```
public void exercise6() {
        List<Order> results = orderRepo.findAll()
                                .stream()
                                .sorted(Comparator.comparing(Order :: getOrderDate).reversed())
                                .limit(3)
                                .collect(Collectors.toList());
        results.forEach(order -> log.info(order.toString()));
    }

```
##7.Get a list of products which was ordered on 15-Mar-2021
```
public void exercise7() {
        List<Product> results = orderRepo.findAll()
                                .stream()
                                .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                                .flatMap(order -> order.getProducts().stream())
                                .distinct()
                                .collect(Collectors.toList());

        results.forEach(product -> log.info(product.toString()));
    }

```

##8.Calculate the total lump of all orders placed in Feb 2021
```
public void exercise8() {
        double results = orderRepo.findAll()
                            .stream()
                            .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2,1)) >= 0)
                            .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                            .flatMap(order -> order.getProducts().stream())
                            .mapToDouble(Product :: getPrice)
                            .sum();
        log.info("Total lump sum = " + results);
    }

```

```
 public void exercise8a() {
        //BiFunction is a functional interface; It takes two arguments and returns an object.
        BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();
        double results = orderRepo.findAll()
                            .stream()
                            .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2,1)) >= 0)
                            .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                            .flatMap(order -> order.getProducts().stream())
                            .reduce(0D, accumulator, Double :: sum);
        log.info("Total lump sum = " + results);
    }

```

##9.Calculate the average price of all orders placed on 15-Mar-2021
```
public void exercise9() {
        double results = orderRepo.findAll()
                            .stream()
                            .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                            .flatMap(order -> order.getProducts().stream())
                            .mapToDouble(Product :: getPrice)
                            .average()
                            .getAsDouble();
        log.info("Average = " + results);
    }

```
##10.Obtain statistics summary of all products belong to "Books" category
```
 public void exercise10() {
        DoubleSummaryStatistics statistics = productRepo.findAll()
                                                .stream()
                                                .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                                                .mapToDouble(Product :: getPrice)
                                                .summaryStatistics();
        log.info(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
                statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum()));

    }

```

##11.Obtain a mapping of order id and the order's product count
```
 public void exercise11() {
        Map<Long, Integer> results = orderRepo.findAll()
                                        .stream()
                                        .collect(
                                                Collectors.toMap(Order :: getId, order -> order.getProducts().size())
                                        );
        log.info(results.toString());
    }

```

##12.Obtain a data map of customer and list of orders
```
public void exercise12() {
        Map<Customer, List<Order>> results = orderRepo.findAll()
                                                .stream()
                                                .collect(
                                                        Collectors.groupingBy(Order :: getCustomer)
                                                );
        log.info(results.toString());
    }

```
```
 @Test
    @DisplayName("Obtain a data map of customer_id and list of order_id(s)")
    public void exercise12a() {
        HashMap<Long, List<Long>> results = orderRepo.findAll()
                                            .stream()
                                            .collect(
                                                    Collectors.groupingBy(
                                                            order -> order.getCustomer().getId(),
                                                            HashMap :: new, Collectors.mapping(Order :: getId, Collectors.toList())
                                                    )
                                            );
        log.info(results.toString());
    }

```

##13.Obtain a data map with order and its total price
```
 public void exercise13() {
        //When we use Stream, we convert it to another container or Map. This is where Function.identity() is used.
        //identity() is a static method of the Function interface.
        //Function.identity() returns a Lambda expression object whose output is the same as the input, equivalent to a Lambda expression of the form t -> t.
        Map<Order, Double> results = orderRepo.findAll()
                                        .stream()
                                        .collect(
                                                Collectors.toMap(Function.identity(),
                                                                    order -> order.getProducts().stream().mapToDouble(Product::getPrice).sum())
                                        );
        log.info(results.toString());
    }

```

```
@Test
    @DisplayName("Obtain a data map with order and its total price (using reduce)")
    public void exercise13a() {
        Map<Long, Double> results = orderRepo.findAll()
                                        .stream()
                                        .collect(
                                                Collectors.toMap(Order :: getId,
                                                                    order -> order.getProducts().stream()
                                                                                .reduce(0D, (acc, product) -> acc + product.getPrice(), Double :: sum)
                                                )
                                        );
        log.info(results.toString());
    }

```

##14.Obtain a data map of product name by category
```
 public void exercise14() {
        Map<String, List<String>> results = productRepo.findAll()
                                                .stream()
                                                .collect(
                                                        Collectors.groupingBy(Product :: getCategory,
                                                                Collectors.mapping(Product :: getName, Collectors.toList()))
                                                );
        log.info(results.toString());
    }

```

##15.Get the most expensive product per category
```
  public void exercise15() {
        Map<String, Optional<Product>> results = productRepo.findAll()
                                                    .stream()
                                                    .collect(
                                                            Collectors.groupingBy(
                                                                    Product :: getCategory,
                                                                    Collectors.maxBy(Comparator.comparing(Product :: getPrice))
                                                            )
                                                    );
        log.info(results.toString());

    }
```

```
 @Test
    @DisplayName("Get the most expensive product (by name) per category")
    void exercise15a() {
        Map<String, String> results = productRepo.findAll()
                                        .stream()
                                        .collect(
                                                Collectors.groupingBy(
                                                        Product :: getCategory,
                                                        Collectors.collectingAndThen(
                                                                Collectors.maxBy(Comparator.comparing(Product :: getPrice)),
                                                                optionalProduct -> optionalProduct.map(Product :: getName).orElse(null)
                                                        )
                                                )
                                        );
        log.info(results.toString());
    }
```