# Chuwa 1.23 HW3
## ``Exercise 1``
```
@Test
	@DisplayName("Obtain a list of product with category = \"Books\" and price > 100")
	public void exercise1() {
		List<Product>ans = productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equalsIgnoreCase("Books"))
				.filter(product -> product.getPrice()>100)
				.collect(Collectors.toList());
		ans.forEach(product -> log.info(product.toString()));
	}
```
## ``Exercise 2``
```
@Test
	@DisplayName("Obtain a list of order with product category = \"Baby\"")
	public void exercise2() {
		List<Product>ans = productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equalsIgnoreCase("Baby"))
						.collect(Collectors.toList());
		ans.forEach(o -> log.info(o.toString()));

	}
```
## ``Exercise 3``
```
@Test
	@DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount\"")
	public void exercise3() {
		List<Product>ans = productRepo.findAll()
				.stream()
				.filter(product -> product.getCategory().equalsIgnoreCase("Toys"))
				.map(o -> o.withPrice(o.getPrice()*0.9))
				.collect(Collectors.toList());
		ans.forEach(o ->log.info(o.toString()));
	}
```