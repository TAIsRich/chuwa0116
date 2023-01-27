package stream_api;

import optional.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamApiCreationTest {
    @Test
    public void testCollection(){
        List<Integer> col = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> stream = col.stream();
        System.out.println("Stream object: " + stream);

        Stream<Integer> parallelStream = col.parallelStream();
        System.out.println("Parallel Stream Object: " + parallelStream);
    }

    @Test
    public void testArrays(){
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);
        System.out.println("Stream object: " + stream);

        Employee e1 = new Employee(1001, "tom", 20, 2222);
        Employee e2 = new Employee(1002, "jerry", 18, 5000);
        Employee[] arr1 = {e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);
        System.out.println("Stream object " + stream1);
    }

    @Test
    public void testOf(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream);
    }

    @Test
    public void testIterate(){
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
        List<Integer> collect = Stream.iterate(0, t -> t + 1).limit(10).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void testGenerate(){
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        streamGenerated.forEach(System.out::println);
    }

    @Test
    public void testBuilder(){
        Stream<String> stringBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println("Stream Object: " + stringBuilder);
        stringBuilder.forEach(System.out::println);
    }

    @Test
    public void testStreamOfPrimitives(){
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        System.out.println("Stream Object:  " + intStream);
        intStream.forEach(System.out::println);

        System.out.println("Stream Object:  " + longStream);
        longStream.forEach(System.out::println);
    }
}
