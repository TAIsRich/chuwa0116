package java8.stream;

import common.pojos.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/27/23
 */
public class StreamApiCreationTest {

    private void printStream(Stream stream) {
        System.out.println();
        stream.forEach(System.out::print);
        System.out.println();
    }

    @Test
    public void testCollection() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(System.out::println);

        Stream<Integer> stream = list.stream();
        printStream(stream);

        Stream<Integer> parallelStream = list.parallelStream();
        printStream(parallelStream);

    }

    @Test
    public void testArrays() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);
        stream.forEach(System.out::println);

        Employee e1 = new Employee(1001, "tom", 20, 2222);
        Employee e2 = new Employee(1002, "Jerry", 18, 5000);
        Employee[] arr1 = new Employee[]{e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);
        printStream(stream1);
    }

    @Test
    public void testOf() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        printStream(stream);
    }

    @Test
    public void testIterate() {
        Stream.iterate(0, t -> t + 2)
            .limit(10)
            .forEach(System.out::println);
    }

    @Test
    public void testGenerate() {
        Stream.generate(Math::random)
            .limit(10)
            .forEach(System.out::println);

        Stream<String> stream = Stream.generate(() -> "element")
            .limit(10);
        stream.forEach(System.out::println);
    }

    @Test
    public void testBuilder() {
        Stream<String> streamBuilder =
            Stream.<String>builder().add("a").add("b").add("c").build();
        printStream(streamBuilder);
    }

    @Test
    public void testStreamOfPrimitives() {
        IntStream intStream = IntStream.range(1, 3);
        LongStream longStream = LongStream.rangeClosed(1, 3);

        intStream.forEach(System.out::println);

        longStream.forEach(System.out::println);
    }
}
