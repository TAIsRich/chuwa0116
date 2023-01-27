```
List<Integer> list=new ArrayList<Integer>();

for(int i=1;i< 10;i++){
    list.add(i);
}

Stream<Integer> stream=list.stream();
Integer[]evenNumbersArr=stream.filter(i->i%2==0).toArray(Integer[]::new);
System.out.print(evenNumbersArr);
```
```
List<Integer> list=new ArrayList<Integer>();

for(int i=1;i< 10;i++){
    list.add(i);
}

Stream<Integer> stream=list.stream();
List<Integer> evenNumbersList = stream
        .filter(i->i%2==0)
        .collect(Collectors.toList());
System.out.print(evenNumbersList);
```

```
Stream<String> streamEmpty=Stream.empty()
```

```agsl
Collection<String> collection=Arrays.asList("a","b","c");
Stream<String> streamOfCollection=collection.stream();
```
```agsl
String[]arr=new String[]{"a","b","c"};
Stream<String> streamOfArrayFull=Arrays.stream(arr);
Stream<String> streamOfArrayPart=Arrays.stream(arr,1,3); 
```
```agsl
Stream<String> streamBuilder = Stream.<String>builder()
        .add("a")
        .add("b")
        .add("c")
        .build();
```

```agsl
Stream<String> streamGenerated = Stream.generate(()->"element").limit(10);
```

```agsl
Stream<Integer> streamIterated = Stream.iterate(40,n->n+2).limit(20);
```

```agsl
IntStream intStream = IntStream.range(1,3);
LongStream longStream = LongStream.rangeClosed(1,3);
Random random = new Random();
DoubleStream doubleStream = random.doubles(3);
```

```agsl
IntStream streamOfChars = "abc".chars();
```
```agsl
Path path=Paths.get("C:\\file.txt");
Stream<String> streamOfStrings = Files.lines(path);
Stream<String> streamWithCharset = Files.lines(path,Charset.forName("UTF-8"));
```

```agsl
Stream<String> stream = Stream.of("a","b","c")
        .filter(element->element.contains("b"));    // stream object
Optional<String> anyElement = stream.findAny(); // success since stream object can be used only once.
Optional<String> firstElement = stream.findFirst(); // failed, throw IllegalStateException. since it can not be reused
```
```agsl
List<String> elements = Stream.of("a","b","c")
        .filter(element->element.contains("b"))
        .collect(Collectors.toList());
Optional<String> anyElement = elements.stream().findAny();
Optional<String> firstElement = elements.stream().findFirst();
```

## String Termination Operations
+ Stream.forEach()
```agsl
memberNames.forEach(System.out::println);
```
+ Stream.collect()
```agsl
List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
```
+ Stream.match()
```agsl
boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));
matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));
matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));
```

+ Stream.count()
```agsl
long totalMatched = memberNames.stream() .filter((s) -> s.startsWith("A")) .count();
```

+ Stream.reduce()
```agsl
Optional<String> reduced = memberNames.stream() .reduce((s1,s2) -> s1 + "#" + s2);
reduced.ifPresent(System.out::println);
Amitabh#Shekhar#Aman#Rahul#Shahrukh#Salman#Yana#Lokesh
```

```agsl

List<Integer>list=new ArrayList<Integer>();
for(int i=1;i<10;i++){
list.add(i);
}
Stream<Integer>stream=list.parallelStream();
Integer[]evenNumberArr=stream.filter(i->i%2==0).toArray(Integer[]::new);
System.out.print(evenNumbersArr);
```
