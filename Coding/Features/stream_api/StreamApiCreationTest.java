import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamApiCreationTest {
    public void testCollection(){
        List<Integer>col=Arrays.asList(1,2,3,4,5);
        col.forEach(System.out::printLn);
        Stream<Integer>stream=col.stream();
        System.out.println("Stream object:      " + stream);
        Stream<Integer>parallelStream=col.parallelStream();
        System.out.println("Parallel Stream object:     " + parallelStream);
    }
    public void testArrays(){
        int []arr=new int[]{1,2,3,4,5};
        IntStream stream=Arrays.stream(arr);
        System.out.println("Stream object:      " + stream);
        Employee e1 = new Employee(1001, "tom", 20, 2222);
        Employee e2 = new Employee(1002, "Jerry", 18, 5000);
        Employee[]arr1=new Employee[]{e1,e2};
        Stream<Employee>stream1=Arrays.stream(arr1);
        System.out.println("Stream object:     " + stream1);
    }

    public  void testOf(){
        Stream<Integer>stream=stream.of(1,2,3,4,5);
        System.out.println("Stream object:     " + stream);
    }
    public void testCreate(){
        Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);
    }
    public void testGenerate(){
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        Stream<String>streamGenerated=Stream.generate(()->"element").limit(10);
        streamGenerated.forEach(System.out::println);
    }
    public void testStreamOfPrimitives(){
        IntStream intStream=InStream.range(1,3);
        LongStream longStream=LongStream.range(1,3);
        System.out.println("Stream Object:  " + intStream);
        intStream.forEach(System.out::println);
        System.out.println("Stream Object:  " + longStream);
        longStream.forEach(System.out::println);
    }
}