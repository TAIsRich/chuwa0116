package java8.stream;

import common.pojos.Employee;
import common.utils.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/27/23
 */
public class StreamApiIntermediateOperation {

    @Test
    public void testFilter() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = list.stream();
        stream.filter(t -> t % 2 == 0)
            .forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream()
            .map(Employee::getName)
            .filter(name -> name.length() > 12)
            .forEach(System.out::println);
    }

    @Test
    public void testLimit() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
            .limit(3)
            .forEach(System.out::println);
    }

    @Test
    public void testSkip() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream()
            .skip(2)
            .forEach(System.out::println);
    }

    @Test
    public void testDistinct() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 4, 2, 5);
        list.stream()
            .distinct()
            .forEach(System.out::println);
    }

    @Test
    public void testMap() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }

    @Test
    public void testFlatMap() {
        List<String> lists1 = Arrays.asList("1", "2", "33", "4", "5");
        List<String> lists2 = Arrays.asList("6", "7", "8", "9", "10");
        List<List<String>> listsOfStrings = new ArrayList<>();
        listsOfStrings.add(lists1);
        listsOfStrings.add(lists2);

        Stream<Stream<String>> streamStream = listsOfStrings.stream()
            .map(list -> list.stream());

        int res = listsOfStrings.stream()
            .flatMap(list -> list.stream())
            .mapToInt(Integer::parseInt)
            .max().getAsInt();
        System.out.println(res);
    }

    @Test
    public void testIntermediateOperationChain() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> collected = list2.stream()
            .filter(n -> n % 2 == 0)
            .map(e -> e * 10)
            .collect(Collectors.toList());
        list1.addAll(collected);
        System.out.println(list1);
    }

    @Test
    public void testSorted() {
        List<Integer> list = Arrays.asList(87, 2, 65, 34, 72, 12);
        list.stream()
            .sorted()
            .forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream()
            .sorted(Comparator.comparing(Employee::getAge))
            .forEach(System.out::println);


    }
}
