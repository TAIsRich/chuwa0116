### Exercise 1

```java
List<Product> result = productRepo.findAll()
    .stream()
    .filter(e -> "Books".equalsIgnoreCase(e.getCategory()))
    .filter(e -> e.getPrice() > 100)
    .collect(Collectors.toList());
```



### Exercise 2

```java
List<Order> result = orderRepo.findAll()
    .stream()
    .filter(e -> e.getProducts()
        .stream()
        .anyMatch(p -> "Baby".equalsIgnoreCase(p.getCategory())))
    .collect(Collectors.toList());
```



### Exercise 3

```java
List<Product> result = productRepo.findAll()
            .stream()
            .filter(e -> "Toys".equalsIgnoreCase(e.getCategory()))
            .map(e -> e.withPrice(e.getPrice() * 0.9))
            .collect(Collectors.toList());
```



### Exercise 4

```java
List<Product> result = orderRepo.findAll()
            .stream()
            .filter(e -> e.getCustomer().getTier() == 2)
            .filter(e -> e.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
            .filter(e -> e.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
            .flatMap(e -> e.getProducts().stream())
            .distinct()
            .collect(Collectors.toList());
```



### Exercise 5

```java
Optional<Product> result = productRepo.findAll()
            .stream()
            .filter(e -> "Books".equalsIgnoreCase(e.getCategory()))
            .min(Comparator.comparing(Product::getPrice));
```



### Exercise 6

```java
List<Order> result = orderRepo.findAll()
            .stream()
            .sorted(Comparator.comparing(Order::getOrderDate).reversed())
            .limit(3)
            .collect(Collectors.toList());
```



### Exercise 7

```java
List<Product> result = orderRepo.findAll()
            .stream()
            .filter(e -> e.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
            .peek(e -> System.out.println(e))
            .flatMap(e -> e.getProducts().stream())
            .collect(Collectors.toList());
```



### Exercise 8

```java
double result = orderRepo.findAll()
            .stream()
            .filter(e -> e.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
            .filter(e -> e.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
            .flatMap(e -> e.getProducts().stream())
            .mapToDouble(e -> e.getPrice())
            .sum();
```



### Exercise 9

```java
double result = orderRepo.findAll()
            .stream()
            .filter(e -> e.getOrderDate().isEqual(LocalDate.of(2021, 3, 14)))
            .flatMap(e -> e.getProducts().stream())
            .mapToDouble(Product::getPrice)
            .average()
            .getAsDouble();
```



### Exercise 10

```java
DoubleSummaryStatistics statistics = productRepo.findAll()
            .stream()
            .filter(e -> "Books".equalsIgnoreCase(e.getCategory()))
            .mapToDouble(Product::getPrice)
            .summaryStatistics();
```



### Exercise 11

```java
Map<Long, Integer>  result = orderRepo.findAll()
            .stream()
            .collect(Collectors.toMap(
                e -> e.getId(),
                e -> e.getProducts().size()
            ));
```



### Exercise 12

```java
Map<Customer, List<Order>> result = orderRepo.findAll()
            .stream()
            .collect(Collectors.groupingBy(Order::getCustomer));
```



### Exercise 13

```java
Map<Order, Double> result = orderRepo.findAll()
            .stream()
            .collect(
                Collectors.toMap(
                    Function.identity(),
                    e -> e.getProducts()
                        .stream()
                        .mapToDouble(Product::getPrice)
                        .sum()
                )
            );
```



### Exercise 14

```java
Map<String, List<String>> result = productRepo.findAll()
            .stream()
            .collect(
                Collectors.groupingBy(
                    Product::getCategory,
                    Collectors.mapping(Product::getName, Collectors.toList())
                )
            );
```



### Exercise 15

```java
Map<String, Optional<Product>> result = productRepo.findAll()
            .stream()
            .collect(
                Collectors.groupingBy(
                    Product::getCategory,
                    Collectors.maxBy(Comparator.comparing(Product::getPrice))
                )
            );
```



