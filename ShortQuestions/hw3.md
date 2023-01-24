1. "Obtain a list of product with category = \"Books\" and price > 100"
    ```
        @Test
	       @DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
        public void exercise1() {
            long startTime = System.currentTimeMillis();
            List<Product> result = productRepo.findAll()
                    .stream()
                    .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                    .filter(p -> p.getPrice() > 100)
                    .collect(Collectors.toList());
            long endTime = System.currentTimeMillis();

            log.info(String.format("exercise 1 - execution time: %1$d ms", (endTime - startTime)));
            result.forEach(p -> log.info(p.toString()));
        }
    ```

2. "Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)"
    ```
        @Test
        @DisplayName("Obtain a list of product with category = \"Books\" and price > 100 (using BiPredicate for filter)")
        public void exercise1b() {
            BiPredicate<Product, String> categoryFilter = (product, category) -> product.getCategory().equalsIgnoreCase(category);

            long startTime = System.currentTimeMillis();
            List<Product> result = productRepo.findAll()
                    .stream()
                    .filter(product -> categoryFilter.test(product, "Books") && product.getPrice() > 100)
                    .collect(Collectors.toList());
            long endTime = System.currentTimeMillis();

            log.info(String.format("exercise 1b - execution time: %1$d ms", (endTime - startTime)));
            result.forEach(p -> log.info(p.toString()));
        }

    ```

3. "Obtain a list of order with product category = \"Baby\""
    ```
        @Test
        @DisplayName("Obtain a list of order with product category = \"Baby\"")
        public void exercise2() {
            long startTime = System.currentTimeMillis();
            List<Order> result = orderRepo.findAll()
                    .stream()
                    .filter(o -> 
                            o.getProducts()
                            .stream()
                            .anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
                            )
                    .collect(Collectors.toList());
            long endTime = System.currentTimeMillis();

            log.info(String.format("exercise 2 - execution time: %1$d ms", (endTime - startTime)));
            result.forEach(o -> log.info(o.toString()));
        }   
    ```

4. "Obtain a list of product with category = “Toys” and then apply 10% discount\""
    ```
        @Test
        @DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
        public void exercise3() {
            long startTime = System.currentTimeMillis();

            List<Product> result = productRepo.findAll()
                    .stream()
                    .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                    .map(p -> p.withPrice(p.getPrice() * 0.9))
                    .collect(Collectors.toList());

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 3 - execution time: %1$d ms", (endTime - startTime)));
            result.forEach(o -> log.info(o.toString()));
        }
    ```
5. "Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021"
    ```
        @Test
        @DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
        public void exercise4() {
            long startTime = System.currentTimeMillis();
            List<Product> result = orderRepo.findAll()
                    .stream()
                    .filter(o -> o.getCustomer().getTier() == 2)
                    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
                    .flatMap(o -> o.getProducts().stream())
                    .distinct()
                    .collect(Collectors.toList());

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 4 - execution time: %1$d ms", (endTime - startTime)));
            result.forEach(o -> log.info(o.toString()));
        }
    ```

6. "Get the 3 cheapest products of \"Books\" category" (this question seems get the cheapest product of "Books")
    ```
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

7. "Get the 3 most recent placed order" 
    ```
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

8. "Get a list of products which was ordered on 15-Mar-2021"
    ```
        @Test
        @DisplayName("Get a list of products which was ordered on 15-Mar-2021")
        public void exercise7() {
            long startTime = System.currentTimeMillis();
            List<Product> result = orderRepo.findAll()
                    .stream()
                    .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                    .peek(o -> System.out.println(o.toString()))
                    .flatMap(o -> o.getProducts().stream())
                    .distinct()
                    .collect(Collectors.toList());

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 7 - execution time: %1$d ms", (endTime - startTime)));
            result.forEach(o -> log.info(o.toString()));
        }
    ```

9. "Calculate the total lump of all orders placed in Feb 2021"
    ```
        @Test
        @DisplayName("Calculate the total lump of all orders placed in Feb 2021")
        public void exercise8() {
            long startTime = System.currentTimeMillis();
            double result = orderRepo.findAll()
                    .stream()
                    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                    .flatMap(o -> o.getProducts().stream())
                    .mapToDouble(Product::getPrice)
                    .sum();

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 8 - execution time: %1$d ms", (endTime - startTime)));
            log.info("Total lump sum = " + result);
        }
    ```

10. "Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)"

    Reduce method and example: https://juejin.cn/post/6844904037989646344

    BiFunction: https://www.wdbyte.com/java8/java8-bifunction/#_1-bifunction
    ```
        @Test
        @DisplayName("Calculate the total lump of all orders placed in Feb 2021 (using reduce with BiFunction)")
        public void exercise8a() {
            BiFunction<Double, Product, Double> accumulator = (acc, product) -> acc + product.getPrice();

            long startTime = System.currentTimeMillis();
            double result = orderRepo.findAll()
                    .stream()
                    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
                    .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 3, 1)) < 0)
                    .flatMap(o -> o.getProducts().stream())
                    .reduce(0D, accumulator, Double::sum);

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 8a - execution time: %1$d ms", (endTime - startTime)));
            log.info("Total lump sum = " + result);
        }
    ```

11. "Calculate the average price of all orders placed on 15-Mar-2021"
    ```
        @Test
        @DisplayName("Calculate the average price of all orders placed on 15-Mar-2021")
        public void exercise9() {
            long startTime = System.currentTimeMillis();
            double result = orderRepo.findAll()
                    .stream()
                    .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 15)))
                    .flatMap(o -> o.getProducts().stream())
                    .mapToDouble(Product::getPrice)
                    .average().getAsDouble();

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 9 - execution time: %1$d ms", (endTime - startTime)));
            log.info("Average = " + result);
        }
    ```

12. "Obtain statistics summary of all products belong to \"Books\" category"
    ```
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

13. "Obtain a mapping of order id and the order's product count"
    ```
        @Test
        @DisplayName("Obtain a mapping of order id and the order's product count")
        public void exercise11() {
            long startTime = System.currentTimeMillis();
            Map<Long, Integer> result = orderRepo.findAll()
                    .stream()
                    .collect(
                        Collectors.toMap(
                            Order::getId,
                            o -> o.getProducts().size()
                        )
                    );
            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 11 - execution time: %1$d ms", (endTime - startTime)));
            log.info(result.toString());
        }
    ```

14. "Obtain a data map of customer and list of orders"
    ```
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
    ```

15. "Obtain a data map of customer_id and list of order_id(s)"
    ```
        @Test
        @DisplayName("Obtain a data map of customer_id and list of order_id(s)")
        public void exercise12a() {
            long startTime = System.currentTimeMillis();
            HashMap<Long, List<Long>> result = orderRepo.findAll()
                    .stream()
                    .collect(
                        Collectors.groupingBy(
                            o -> o.getCustomer().getId(),
                            HashMap::new,
                            Collectors.mapping(Order::getId, Collectors.toList())
                        )
                    );
            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 12a - execution time: %1$d ms", (endTime - startTime)));
            log.info(result.toString());
        }
    ```

16. "Obtain a data map with order and its total price"
    ```
        @Test
        @DisplayName("Obtain a data map with order and its total price")
        public void exercise13() {
            long startTime = System.currentTimeMillis();
            Map<Order, Double> result = orderRepo.findAll()
                    .stream()
                    .collect(
                        Collectors.toMap(
                            Function.identity(), //Function.identity() 返回一个输出跟输入一样的Lambda表达式对象，等价于形如 t -> t 形式的Lambda式
                            o -> o.getProducts().stream()
                                .mapToDouble(Product::getPrice).sum())
                        );

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 13 - execution time: %1$d ms", (endTime - startTime)));
            log.info(result.toString());
        }
    ```

17. "Obtain a data map with order and its total price (using reduce)"
    ```
        @Test
        @DisplayName("Obtain a data map with order and its total price (using reduce)")
        public void exercise13a() {
            long startTime = System.currentTimeMillis();
            Map<Long, Double> result = orderRepo.findAll()
                    .stream()
                    .collect(
                        Collectors.toMap(
                            Order::getId,
                            o -> o.getProducts().stream()
                                .reduce(0D, (acc, product) -> product.getPrice(), Double::sum)
                        )
                    );

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 13a - execution time: %1$d ms", (endTime - startTime)));
            log.info(result.toString());
        }
    ```

18. "Obtain a data map of product name by category"
    ```
        @Test
        @DisplayName("Obtain a data map of product name by category")
        public void exercise14() {
            long startTime = System.currentTimeMillis();
            Map<String, List<String>> result = productRepo.findAll()
                    .stream()
                    .collect(
                        Collectors.groupingBy(
                            Product::getCategory,
                            Collectors.mapping(Product::getName, Collectors.toList())
                        )
                    );

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 14 - execution time: %1$d ms", (endTime - startTime)));
            log.info(result.toString());
        }
    ```

19. "Get the most expensive product per category"
    ```
        @Test
        @DisplayName("Get the most expensive product per category")
        void exercise15() {
            long startTime = System.currentTimeMillis();
            Map<String, Optional<Product>> result = productRepo.findAll()
                    .stream()
                    .collect(
                        Collectors.groupingBy(
                            Product::getCategory,
                            Collectors.maxBy(Comparator.comparing(Product::getPrice))
                        )
                    );
            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 15 - execution time: %1$d ms", (endTime - startTime)));
            log.info(result.toString());
        }
    ```

20. "Get the most expensive product (by name) per category"
    ```
        @Test
        @DisplayName("Get the most expensive product (by name) per category")
        void exercise15a() {
            long startTime = System.currentTimeMillis();
            Map<String, String> result = productRepo.findAll()
                    .stream()
                    .collect(
                        Collectors.groupingBy(
                            Product::getCategory,
                            Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)),
                                optionalProduct -> optionalProduct.map(Product::getName).orElse(null)
                            )
                        )
                    );

            long endTime = System.currentTimeMillis();
            log.info(String.format("exercise 15a - execution time: %1$d ms", (endTime - startTime)));
            log.info(result.toString());
        }
    ```