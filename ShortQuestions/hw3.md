```Java

@Test
@DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
public void exercise1() {
    List<Product> result = productRepo.findAll()
    .stream()
    .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
    .filter(product -> product.getPrice() > 100)
    .collect(Collectors.toList());
}

@Test
@DisplayName("Obtain a list of order with products belong to category \"Baby\"")
public void exercise2() {
    List<Product> result = productRepo.findAll()
    .stream()
    .filter(product -> product.getCategory().stream().anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
    .collect(Collectors.toList());
}

@Test
@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount")
public void exercise3() {
    List<Product> result = productRepo.findAll()
    .stream()
    .filter(product -> product.getCategory().equalsIgnoreCase("Toys"))
    .map(product -> product.writePrice(product.getPrice() * 0.9))
    .collect(Collectors.toList());
}

@Test
@DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
public void exercise4() {
    List<Product> result = productRepo.findAll()
    .stream()
    .filter(order -> order.getCustomer().getTier() == 2)
    .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021,2,1)) >= 0)
    .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021,4,1)) <= 0)
    .flatMap(order -> order.getProducts().stream())
    .distinct()
    .collect(Collectors.toList());
}

@Test
@DisplayName("Get the cheapest products of \"Books\" category")
public void exercise5() {
    Optional<Product> result = productRepo.findAll()
    .stream()
    .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
    .sorted(Comparator.comparing(Product::getPrice))
    .findFirst()
}

@Test
@DisplayName("Get the 3 most recent placed order")
public void exercise6() {
    List<Product> result = productRepo.findAll()
    .stream()
    .sort(Comparator.comparing(Product::orderTime().reversed()))
    .limit(3)
    .collect(Collector.toList());
}

@Test
@DisplayName("Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list")
public void exercise7() {
    List<Product> result = productRepo.findAll()
    .stream()
    .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
    .peek(order -> System.out.println(order.toString()))
    .flatMap(order -> order.getProducts().stream())
    .distinct()
    .collect(Collectors.toList());
}

@Test
@DisplayName("Calculate total lump sum of all orders placed in Feb 2021")
public void exercise8() {
    Double result = productRepo.findAll()
    .stream()
    .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
    .filter(order -> order.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
    .flatMap(order -> order.getProducts().stream())
    .mapToDouble(product -> product.getPrice())
    .sum();
}

@Test
@DisplayName("Calculate order average payment placed on 14-Mar-2021")
public void exercise9() {
    Double result = productRepo.findAll()
    .stream()
    .filter(order -> order.getOrderDate().isEqual(LocalDate.of(2021, 3, 14)))
    .flatMap(order -> order.getProducts().stream())
    .mapToDouble(product -> product.getPrice())
    .average().getAsDouble();
}

@Test
@DisplayName("Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category \"Books\"")
public void exercise10() {
    DoubleSummaryStatistics statistics = productRepo.findAll()
    .stream()
    .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
    .mapToDouble(product -> product.getPrice())
    .summaryStatistics();

    System.out.println(statistics.getCount() + " " + statistics.getAverage() + " " + statistics.getMax() + " " + statistics.getMin() + " " + statistics.getSum())));
}

@Test
@DisplayName("Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category \"Books\"")
public void exercise11() {
    Map<Long, Integer> result = orderRepo.findAll()
    .stream()
    .collect(
        Collectors.toMap(
            order -> order.getId(), order -> order.getProducts().size();
        )
    );
}

@Test
@DisplayName("Produce a data map with order records grouped by customer")
public void exercise12() {
    Map<Customer, List<Order>> result = orderRepo.findAll()
    .stream()
    .collect(
        Collectors.groupingby(Order::getCustomer)
    );
}

@Test
@DisplayName("Produce a data map with order record and product total sum")
public void exercise13() {
    Map<Customer, Double> result = orderRepo.findAll()
    .stream()
    .collect(
        Collectors.toMap(
            Function.identity(), order -> order.getProducts.stream().mapToDouble(p -> p.getPrice()).sum())
        )
    );
}

@Test
@DisplayName("Produce a data map with order record and product total sum")
public void exercise13() {
    Map<Customer, Double> result = orderRepo.findAll()
    .stream()
    .collect(
        Collectors.toMap(
            Function.identity(), order -> order.getProducts.stream().mapToDouble(p -> p.getPrice()).sum())
        )
    );
}

@Test
@DisplayName("Obtain a data map with list of product name by category")
public void exercise14() {
    Map<Customer, Double> result = orderRepo.findAll()
    .stream()
    .collect(
        Collectors.toMap(
            Product::getCategory(), Collectors.mapping(product -> product.getNmae(), Collectors.toList())
        )
    );
}

@Test
@DisplayName("Get the most expensive product by category")
public void exercise15() {
    Map<Customer, Double> result = orderRepo.findAll()
    .stream()
    .collect(
        Collectors.groupingBy(
            Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice))
        )
    );
}

```