1. Obtain a list of products belongs to category “Books” with price > 100
```
List<Product>result=ProductRepo.findAll() 
.stream()
.filter(p->p.getCategroy()).equalsIgnoreCase("Books)
.filter(p -> p.getPrice() > 100)
.collect(Collectors.toList())
```
2. Obtain a list of order with products belong to category “Baby”
```   List<Order> result = orderRepo.findAll()
   .stream()
   .filter(o ->
   o.getProducts()
   .stream()
   .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
   )
   .collect(Collectors.toList());
```
3. Obtain a list of product with category = “Toys” and then apply 10% discount
```
    List<Product> result = productRepo.findAll()
   .stream()
   .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
   .map(p -> p.withPrice(p.getPrice() * 0.9))
   .collect(Collectors.toList());  
```
4. Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021
   ``` 
    List<Product> result = orderRepo.findAll()
   .stream()
   .filter(o -> o.getCustomer().getTier() == 2)
   .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
   .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
   .flatMap(o -> o.getProducts().stream())
   .distinct()
   .collect(Collectors.toList());
   ```
5. Get the cheapest products of “Books” category
```
   Optional<Product> result = productRepo.findAll()
   .stream()
   .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
   .sorted(Comparator.comparing(Product::getPrice))
   .findFirst();
```
6. Get the 3 most recent placed order
```
   List<Order> result = orderRepo.findAll()
   .stream()
   .sorted(Comparator.comparing(Order::getOrderDate).reversed())
   .limit(3)
   .collect(Collectors.toList());
  ```
7. Get a list of orders which were ordered on 15-Mar-2021, log the order records to the console and then return its product list
```
   List<Product> result = orderRepo.findAll()
   .stream()
   .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
   .peek(o -> System.out.println(o.toString()))
   .flatMap(o -> o.getProducts().stream())
   .distinct()
   .collect(Collectors.toList());
   ```
8. Calculate total lump sum of all orders placed in Feb 2021
```
 Double result = orderRepo.findAll()
.stream()
.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
.flatMap(o -> o.getProducts().stream())
.mapToDouble(p -> p.getPrice())
.sum();
```
9. Calculate order average payment placed on 14-Mar-2021
```
   Double result = orderRepo.findAll()
   .stream()
   .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
   .flatMap(o -> o.getProducts().stream())
   .mapToDouble(p -> p.getPrice())
   .average().getAsDouble();
```
10. Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”


```
DoubleSummaryStatistics statistics = productRepo.findAll()
.stream()
.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
.mapToDouble(p -> p.getPrice())
.summaryStatistics();

System.out.println(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f",
statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum())));

```

11. Obtain a data map with order id and order’s product count
```
    Map<Long, Integer>  result = orderRepo.findAll()
    .stream()
    .collect(
    Collectors.toMap(
    order -> order.getId(),
    order -> order.getProducts().size()
    )
    );
   ```
12. Produce a data map with order records grouped by customer
```
    Map<Customer, List<Order>> result = orderRepo.findAll()
    .stream()
    .collect(
    Collectors.groupingBy(Order::getCustomer)
    );
```
13. Produce a data map with order record and product total sum
```    
    Map<Order, Double> result = orderRepo.findAll()
    .stream()
    .collect(
    Collectors.toMap(
    Function.identity(),
    order -> order.getProducts().stream()
    .mapToDouble(p -> p.getPrice()).sum()
    )
    );
```
14. Obtain a data map with list of product name by category
```
    Map<String, List<String>> result = productRepo.findAll()
    .stream()
    .collect(
    Collectors.groupingBy(
    Product::getCategory,
    Collectors.mapping(product -> product.getName(), Collectors.toList()))
    );
```

15. Get the most expensive product by category
```
    Map<String, Optional<Product>> result = productRepo.findAll()
    .stream()
    .collect(
    Collectors.groupingBy(
    Product::getCategory,
    Collectors.maxBy(Comparator.comparing(Product::getPrice)))
    
   ```