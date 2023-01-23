```java
public class Exercise {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private ProductRepo productRepo;

    @Test
    @DisplayName("Obtain a list of products belongs to category “Books” with price > 100")
    public void exercise1(){
        List<Product> result = productRepo.findAll()
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
        result.forEach(p -> log.info(p.toString()));
    }

    @Test
    @DisplayName("Obtain a list of order with products belong to category “Baby”")
    public void exercise2(){
        List<Order> result = orderRepo.findAll()
                .stream()
                .filter(o ->
                        o.getProducts()
                                .stream()
                                .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
                )
                .collect(Collectors.toList());
        result.forEach(order -> log.info(order.toString()));
    }

    @Test
    @DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount")
    public void exercise3(){
        List<Product> result = productRepo.findAll()
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .map(p -> p.withPrice(p.getPrice() * 0.9))
                .collect(Collectors.toList());

        result.forEach(o -> log.info(o.toString()));
    }

    @Test
    @DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
    public void exercise4(){
        List<Product> result = orderRepo.findAll()
                .stream()
                .filter(o -> o.getCustomer().getTier() == 2)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4,1)) <= 0)
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
        result.forEach(o -> log.info(o.toString()));
    }

    @Test
    @DisplayName("Get the cheapest products of “Books” category")
    public void exercise5(){
        Optional<Product> result = productRepo.findAll()
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .min(Comparator.comparing(Product::getPrice));
        log.info(result.get().toString());
    }

    @Test
    @DisplayName("Get the 3 most recent placed order")
    public void exercise6(){
        List<Order> result = orderRepo.findAll()
                .stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
        result.forEach(o -> log.info(o.toString()));
    }

    @Test
    @DisplayName("Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list")
    public void exercise7(){
        List<Product> result = orderRepo.findAll()
                .stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
                .peek(o -> System.out.println(o.toString()))
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
        result.forEach(o -> log.info(o.toString()));
    }

    @Test
    @DisplayName("Calculate total lump sum of all orders placed in Feb 2021")
    public void exercise8(){
        Double result = orderRepo.findAll()
                .stream()
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021,2,1)) >= 0)
                .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021,3,1)) < 0)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(p -> p.getPrice())
                .sum();
        log.info(result.toString());
    }

    @Test
    @DisplayName("Calculate order average payment placed on 14-Mar-2021")
    public void exercise9(){
        Double result = orderRepo.findAll()
                .stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021,3,14)))
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(p -> p.getPrice())
                .average().getAsDouble();
        log.info(result.toString());
    }

    @Test
    @DisplayName("Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”")
    public void exercise10(){
        DoubleSummaryStatistics statistics = productRepo.findAll()
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(p -> p.getPrice())
                .summaryStatistics();
        System.out.println(String.format("count = %1$d, average = %2$f, max = %3$f, min = %44f, sum = %5$f",
                statistics.getCount(),statistics.getAverage(),statistics.getMax(),statistics.getMin(),statistics.getSum()));
    }

    @Test
    @DisplayName("Obtain a data map with order id and order’s product count")
    public void exercise11(){
        Map<Long, Integer> result = orderRepo.findAll()
                .stream()
                .collect(
                        Collectors.toMap(
                                order -> order.getId(),
                                order -> order.getProducts().size()
                        )
                );
        log.info(result.toString());
    }

    @Test
    @DisplayName("Produce a data map with order records grouped by customer")
    public void exercise12(){
        Map<Customer, List<Order>> result = orderRepo.findAll()
                .stream()
                .collect(Collectors.groupingBy(Order::getCustomer));
        log.info(result.toString());
    }

    @Test
    @DisplayName("Produce a data map with order record and product total sum")
    public void exercise13(){
        Map<Order, Double> result = orderRepo.findAll()
                .stream()
                .collect(
                        Collectors.toMap(
                                Function.identity(),
                                order -> order.getProducts().stream()
                                        .mapToDouble(p -> p.getPrice()).sum()
                        )
                );
        log.info(result.toString());
    }

    @Test
    @DisplayName("Obtain a data map with list of product name by category")
    public void exercise14(){
        Map<String, List<String>> result = productRepo.findAll()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.mapping(product -> product.getName(), Collectors.toList())
                        )
                );
        log.info(result.toString());
    }

    @Test
    @DisplayName("Get the most expensive product by category")
    public void exercise15(){
        Map<String, Optional<Product>> result = productRepo.findAll()
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Product::getCategory,
                                Collectors.maxBy(Comparator.comparing(Product::getPrice))
                        )
                );
        log.info(result.toString());
    }
}


```