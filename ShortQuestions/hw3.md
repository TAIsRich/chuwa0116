Exercise 1

```java
List<Product> result = productRepo.findAll()
  .stream()
  .filter(p -> p.getCategory().equalsIgnoreCase("Books") && p.getPrice()>100)
  .collect(Collectors.toList());
```

Exercise 2

```java
List<Order> result = orderRepo.findAll().stream().filter(o - > o.getProducts().stream.anyMatch(p -> p.getCategory.equalsIgnoreCase("Baby")))
.collect(Collectors.toList());
```

Exercise 3

```java
List<Product> result = productRepo.findAll().stream.filter(p -> p.getCategory.equalsIgnoreCase("Toys")).map(p -> p.withPrice(p.getPrice()*0.9))
.collect(Collectors.toList());
```

Exercise 4

```java
List<Product> result = orderRepo.findAll().stream.filter(o -> o.getCustomer().getTier()==2).filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0) .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0) 
.flatMap(o -> o.getProducts().stream()).distinct().
collect(Collectors.toList());
```

Exercise 5

```java
List<Product> result = productRepo.findAll().stream().filter(p -> p.getCategory().equalsIgnoreCase("Books"))
.sorted(Comparator.comparing(Product::getPrice))
.findFirst();
```

Exercise 6

```java
List<Order> result = OrderRepo.findAll().stream().sorted(Comparator.comparing(Order::getOrderDate).reversed())
    .limit(3).collect(Collectors.toList());
```

Exercise 7

```java
List<Order> result = orderRepo.findAll().stream()
.filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
.peek(o->System.out.println(o.toString()))
.flatMap(o->o.getProducts().stream())
.distinct()
.collect(Collectors.toList());
```

Exercise 8

```java
Double result = orderRepo.findAll()
.stream()
.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
.flat(o->o.getProducts().stream()).mapToDouble(p->p.getPrices())
.sum();
```

Exercise 9

```java
Double result = orderRepo.findAll().stream().filter(o->o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
.flatMap(o->o.getProducts().stream())
.mapToDouble(p-p.getPrice())
.average().getAsDouble();
```

Exercise 10

```java
  DoubleSummaryStatistics statistics = productRepo.findAll()
    .stream()
    .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
    .mapToDouble(p -> p.getPrice())
    .summaryStatistics();
  
  System.out.println(String.format("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f", 
    statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum())));
```

Exercise 11

```java
Map<Long, Integer> result =orderRepo.findAll().stream().collect(Collectors.toMap(order -> order.getId(), order -> order.getProduct().size()));
```

Exercise 12

```java
Map<Customer, List<Order>> result = orderRepo.findAll().stream().collect(Collectors.groupinBy(Order::getCustomer));
```

Exercise 13

```java
Map<Order, Double > result = orderRepo.findAll().stream.collect(Collectors.toMap(Function.identity(),order -> order.getProducts().stream().mapToDouble(p->p.getPrice()).sum()));
```

Exercise 14

```java
Map<String, List<String>> result = productRepo.findAll().stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(product -> product.getName(), Collectors.toList())));
```

Exercise 15

```java
Map<String, Optional<Product>> result = productRepo.findAll().stream().collect(Collectors.groupingBy(Product::getCategory, Collectors.maxBy(Comparator.comparing(Product::getPrice)))
```

