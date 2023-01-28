
@Test
@DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
public void exercise1() {
    List<Product> ans = productRepo.findAll()
                                .stream()
                                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                                .filter(p -> p.getPrice() > 100)
                                .collect(Collectors.toList());
    ans.forEach(p -> log.info(p.toString()));
}

@Test
@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using Predicate chaining for filter)")
public void exercise1a() {
    Predicate<Product> categoryFilter = product -> product.getCategory().equalsIgnoreCase("Books");
    Predicate<Product> priceFilter = product -> product.getPrice() > 100;
    List<Product> ans = productRepo.findAll()
                                .stream()
                                .filter(p -> categoryFilter.and(priceFilter).test(p))
                                .collect(Collectors.toList());
    ans.forEach(p -> log.info(p.toString()));
}

@Test
@DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)")
public void exercise1b() {
    BiPredicate<Product, String> categoryFilter = (product, category) -> product.getCategory().equalsIgnoreCase("Books");
    List<Product> ans = productRepo.findAll()
                                .stream()
                                .filter(product -> categoryFilter.test(product, "Books") && product.getPrice() > 100)
                                .collect(Collectors.toList());
    ans.forEach(p -> log.info(p.toString()));
}

@Test
@DisplayName("Obtain a list of order with product category = \"Baby\"")
public void exercise2() {
    List<Order> ans = orderRepo.findAll()
                            .stream()
                            .filter(order ->
                                        order.getProducts()
                                            .stream()
                                            .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
                            ).collect(Collectors.toList());

    ans.forEach(order -> log.info(order.toString()));
}

@Test
@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
public void exercise3() {
    List<Product> ans = productRepo.findAll()
                                .stream()
                                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                                .map(p -> p.withPrice(p.getPrice() * 0.9))
                                .collect(Collectors.toList());
    ans.forEach(p -> log.info(p.toString()));

}

@Test
@DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
public void exercise4() {
    List<Product> ans = orderRepo.findAll()
                                .stream()
                                .filter(order -> order.getCustomer().getTier() == 2)
                                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                                .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                                .flatMap(order -> order.getProducts().stream())
                                .distinct()
                                .collect(Collectors.toList());
    ans.forEach(product -> log.info(product.toString()));
}

@Test
@DisplayName("Get the 3 cheapest products of \"Books\" category")
public void exercise5() {
    Optional<Product> ans = productRepo.findAll()
                                    .stream()
                                    .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                                    .min(Comparator.comparing(Product :: getPrice));
    log.info(ans.get().toString());

}

@Test
@DisplayName("Get the 3 most recent placed order")
public void exercise6() {
    List<Order> ans = orderRepo.findAll()
                            .stream()
                            .sorted(Comparator.comparing(Order :: getOrderDate).reversed())
                            .limit(3)
                            .collect(Collectors.toList());
    ans.forEach(order -> log.info(order.toString()));
}

@Test
@DisplayName("Get a list of products which was ordered on 15-Mar-2021")
public void exercise7() {
    List<Product> ans = orderRepo.findAll()
                                .stream()
                                .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                                .flatMap(order -> order.getProducts().stream())
                                .distinct()
                                .collect(Collectors.toList());
    ans.forEach(product -> log.info(product.toString()));
}

@Test
@DisplayName("Calculate the total lump of all orders placed in Feb 2021")
public void exercise8() {
    double ans = orderRepo.findAll()
                        .stream()
                        .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                        .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                        .flatMap(order -> order.getProducts().stream())
                        .mapToDouble(Product :: getPrice)
                        .sum();
    log.info("Total lump sum = " + ans);
}

@Test
@DisplayName("Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)")
public void exercise8a() {
    BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();
    double ans = orderRepo.findAll()
                        .stream()
                        .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                        .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                        .flatMap(order -> order.getProducts().stream())
                        .reduce(0D, accumulator, Double :: sum);
    log.info("Total lump sum = " + ans);
}

@Test
@DisplayName("Calculate the average price of all orders placed on 15-Mar-2021")
public void exercise9() {
    double ans = orderRepo.findAll()
                        .stream()
                        .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                        .flatMap(order -> order.getProducts().stream())
                        .mapToDouble(Product :: getPrice)
                        .average().getAsDouble();
    log.info("Average = " + ans);
}

@Test
@DisplayName("Obtain statistics summary of all products belong to \"Books\" category")
public void exercise10() {
    DoubleSummaryStatistics statistics = productRepo.findAll()
                                                .stream()
                                                .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                                                .mapToDouble(Product :: getPrice)
                                                .summaryStatistics();
    log.info(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
        statistics.getCount(), statistics.getAverage(),  statistics.getMax(), statistics.getMin(), statistics.getSum()));
}

@Test
@DisplayName("Obtain a mapping of order id and the order's product count")
public void exercise11() {
    Map<Long, Integer> ans = orderRepo.findAll()
                                    .stream()
                                    .collect(
                                        Collectors.toMap(
                                            Order::getId,
                                            order -> order.getProducts().size()
                                        )
                                    );
    log.info(ans.toString());
}

@Test
@DisplayName("Obtain a data map of customer and list of orders")
public void exercise12() {
    Map<Customer, List<Order>> ans = orderRepo.findAll()
                                            .stream()
                                            .collect(Collectors.groupingBy(Order::getCustomer));
    log.info(ans.toString());
}

@Test
@DisplayName("Obtain a data map of customer_id and list of order_id(s)")
public void exercise12a() {
    HashMap<Long, List<Long>> ans = orderRepo.findAll()
                                            .stream()
                                            .collect(
                                                Collectors.groupingBy(
                                                    order -> order.getCustomer().getId(),
                                                    HashMap::new,
                                                    Collectors.mapping(Order::getId, Collectors.toList())
                                                )
                                            );
    log.info(ans.toString());
}

@Test
@DisplayName("Obtain a data map with order and its total price")
public void exercise13() {
    Map<Order, Double> ans = orderRepo.findAll()
                                    .stream()
                                    .collect(
                                        Collectors.toMap(
                                            Function.identity(),
                                            order -> order.getProducts().stream()
                                                            .mapToDouble(Product::getPrice).sum()
                                        )
                                    );
    log.info(ans.toString());
}

@Test
@DisplayName("Obtain a data map with order and its total price (using reduce)")
public void exercise13a() {
    Map<Long, Double> ans = orderRepo.findAll()
                                    .stream()
                                    .collect(
                                        Collectors.toMap(
                                                    Order::getId,
                                                    order -> order.getProducts().stream()
                                                                .reduce(0D, (acc, product)->acc + product.getPrice(), Double::sum)
                                        )
                                    );
    log.info(ans.toString());
}

@Test
@DisplayName("Obtain a data map of product name by category")
public void exercise14() {
    Map<String, List<String>> ans = productRepo.findAll()
                                            .stream()
                                            .collect(
                                                Collectors.groupingBy(
                                                        Product::getCategory,
                                                        Collectors.mapping(Product::getName, Collectors.toList())
                                                )
                                            );
    log.info(ans.toString());
}

@Test
@DisplayName("Get the most expensive product per category")
public void exercise15() {
    Map<String, Optional<Product>> ans = productRepo.findAll()
                                                    .stream()
                                                    .collect(
                                                        Collectors.groupingBy(
                                                                Product::getCategory,
                                                                Collectors.maxBy(Comparator.comparing(Product::getPrice))
                                                        )
                                                    );
    log.info(ans.toString());
}

@Test
@DisplayName("Get the most expensive product (by name) per category")
public void exercise15a() {
    Map<String, String> ans = productRepo.findAll()
                                        .stream()
                                        .collect(
                                            Collectors.groupingBy(
                                                    Product::getCategory,
                                                    Collectors.collectingAndThen(
                                                            Collectors.maxBy(Comparator.comparing(Product::getPrice)),
                                                            optionalProduct -> optionalProduct.map(Product::getName).orElse(null)
                                                    )
                                            )
                                        );
    log.info(ans.toString());
}