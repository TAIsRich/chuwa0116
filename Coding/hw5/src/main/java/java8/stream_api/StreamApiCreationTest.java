package java8.stream_api;

import java8.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiCreationTest {
    @Test
    public void testCollection() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        list.forEach(System.out::println);

        Stream<Integer> stream = list.stream();
        System.out.println("Stream: " + stream);

        Stream<Integer> parallelStream = list.parallelStream();
        System.out.println("Parallel: " + parallelStream);
    }

    @Test
    public void testArrays() {
        int[] list = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(list));

        IntStream stream = Arrays.stream(list);
        System.out.println("Stream: " + stream);

        Employee e1 = new Employee(1001, "tom", 20, 2222);
        Employee e2 = new Employee(1002, "Jerry", 18, 5000);
        Employee[] arr1 = new Employee[]{e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);
        System.out.println("Object Stream: " + stream1);
    }

    @Test
    public void testIterate() {
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);
    }

    @Test
    public void testGenerate() {
        Stream.generate(Math::random).limit(10).forEach(System.out::println);

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
        streamGenerated.forEach(System.out::println);
    }

    @Test
    public void testBuilder() {
        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();
        System.out.println("Stream Object Builder: " + streamBuilder);
        streamBuilder.forEach(System.out::println);
    }
}
