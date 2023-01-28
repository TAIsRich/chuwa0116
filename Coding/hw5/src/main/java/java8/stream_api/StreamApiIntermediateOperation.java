package java8.stream_api;

import java8.Employee;
import java8.EmployeeData;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiIntermediateOperation {
    @Test
    public void testFilter() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        stream.filter(n -> n % 2 == 0).forEach(System.out::println);

        // get employees with their name length longer than 3
        List<Employee> employeeList = EmployeeData.getEmployees();
        Stream<String> nameStream = employeeList.stream().map(Employee::getName);
        nameStream.filter(name -> name.length() > 6).forEach(System.out::println);
    }

    @Test
    public void testLimit() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().limit(3).forEach(System.out::println);
    }

    @Test
    public void testSkip() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().skip(2).forEach(System.out::println);
    }

    @Test
    public void testDistinct() {
        int[] list = new int[]{1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(list);
        stream.distinct().forEach(System.out::println);
    }

    @Test
    public void testMap() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    @Test
    public void testFlatMap(){
        List<String> list1 = Arrays.asList("1", "2", "33", "4", "5");
        List<String> list2 = Arrays.asList("6", "7", "8", "9", "10");
        List<List<String>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        System.out.println("List of strings" + list);

        Stream<String> stream1 = list.stream().flatMap(Collection::stream);
        Stream<Stream<String>> stream2 = list.stream().map(Collection::stream);

        OptionalInt max = stream1.mapToInt(Integer::parseInt).max();
        System.out.println(max.getAsInt());

        int asInt = list
                .stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
        System.out.println(asInt);
    }

    @Test
    public void testIntermediaOperationChain(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // 找出list2中的偶数，并乘以10
        List<Integer> collect = list2.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 10)
                .collect(Collectors.toList());

        list1.addAll(collect);

        System.out.println(list1);
    }

    @Test
    public void testSorted() {
        List<Integer> list = Arrays.asList(87, 2, 65, 34, 72, 12);
        list.stream().sorted().forEach(System.out::println);

        System.out.println("\n***********\n");

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);

        System.out.println("\n***********\n");

        employees.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
    }
}
