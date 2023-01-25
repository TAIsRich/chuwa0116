# hw3

## ex1
```
List<Product> result = productRepo.findAll()
        .stream()
        .filter(p-> p.getCategory().equals("Books") && p.getPrice() > 100).collect(Collectors.toList());

```
## ex2
```
List<Order> result = orderRepo.findAll()
        .stream()
        .filter(o ->
            o.getProducts()
                .stream()
                .anyMatch(p->p.getCategory().equals("Baby"))
        )
        .collect(Collectors.toList());
```
## ex3
```
List<Product> result = productRepo.findAll()
        .stream()
        .filter(p->p.getCategory().equals("Toys"))
        .map(p -> {
            p.setPrice(p.getPrice()*0.9);
            return p;
        })
        .collect(Collectors.toList());
```
## ex4
```
List<Product> result = orderRepo.findAll()
        .stream()
        .filter(o -> o.getCustomer().getTier() == 2)
        .filter(o -> o.getDeliveryDate().compareTo(LocalDate.of(2021,2,1)) >= 0 )
        .filter(o -> o.getDeliveryDate().compareTo(LocalDate.of(2021,4,1)) <= 0 )
        .flatMap(o -> o.getProducts().stream())
        .distinct()
        .collect(Collectors.toList());
```
## ex5
```
List<Product> result = productRepo.findAll()
        .stream()
        .filter(p->p.getCategory().equals("Books"))
        .sorted(Comparator.comparing(Product::getPrice))
        .limit(3)
        .collect(Collectors.toList());
```
## ex6
```
List<Order> result = orderRepo.findAll()
        .stream()
        .sorted(Comparator.comparing(Order::getOrderDate).reversed())
        .limit(3)
        .collect(Collectors.toList());
```
## ex7
```
List<Product> result = orderRepo.findAll()
        .stream()
        .filter(o->o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
        .flatMap(o -> o.getProducts().stream())
        .distinct()
        .collect(Collectors.toList());
```
## ex8
```
double result = orderRepo.findAll()
        .stream()
        .filter(o->o.getOrderDate().compareTo(LocalDate.of(2021,2,1))>=0)
        .filter(o->o.getOrderDate().compareTo(LocalDate.of(2021,2,28))<=0)
        .flatMap(o->o.getProducts().stream())
        .reduce(0D, (acc, product) -> acc + product.getPrice(), Double::sum);
```
## ex9
```
double result = orderRepo.findAll()
        .stream()
        .filter(o->o.getOrderDate().isEqual(LocalDate.of(2021,3,15)))
        .flatMap(o->o.getProducts().stream())
        .mapToDouble(p->p.getPrice())
        .average().getAsDouble();
```
## ex10
```
DoubleSummaryStatistics statistics = productRepo.findAll()
        .stream()
        .filter(p -> p.getCategory().equals("Books"))
        .mapToDouble(Product::getPrice)
        .summaryStatistics();
```
## ex11
```
Map<Long, Integer> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.toMap(
                Order::getId,
                o -> o.getProducts().size()
        ));
```
## ex12
```
Map<Customer, List<Order>> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(Order::getCustomer));
```
## ex13
```
Map<Order, Double> result = orderRepo.findAll()
        .stream()
        .collect(Collectors.toMap(
                o->o,
                o->o.getProducts().stream().mapToDouble(Product::getPrice).sum()
        ));
```
## ex14
```
Map<String, List<String>> result = productRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.mapping(p->p.getName(), Collectors.toList())
        ));

```
## ex15
```
Map<String, Optional<Product>> result = productRepo.findAll()
        .stream()
        .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.maxBy(Comparator.comparing(Product::getPrice))
        ));
```


