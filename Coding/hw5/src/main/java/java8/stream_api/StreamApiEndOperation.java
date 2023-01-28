package java8.stream_api;

import java8.Employee;
import java8.EmployeeData;
import org.junit.Test;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiEndOperation {
    private static final List<Employee> EMPLOYEES = EmployeeData.getEmployees();

    @Test
    public void testCollect() {
        List<Employee> list = EMPLOYEES.stream().filter(e -> e.getId() > 1002).collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("************************************");

        Set<Employee> set = EMPLOYEES.stream().filter(e -> e.getId() > 1002).collect(Collectors.toSet());
        set.forEach(System.out::println);

    }

    @Test
    public void testMatch() {
        boolean allMatch = EMPLOYEES.stream().allMatch(e -> e.getName().length() > 2);
        System.out.println(allMatch);
        System.out.println("************************************");

        boolean anyMatch= EMPLOYEES.stream().anyMatch(e -> e.getName().length() > 3);
        System.out.println(anyMatch);
        System.out.println("************************************");

        boolean noneMatch = EMPLOYEES.stream().noneMatch(e -> e.getName().startsWith("Yun"));
        System.out.println(noneMatch);
        System.out.println("************************************");
    }

    @Test
    public void testFind() {
        Optional<Employee> employeeOptional = EMPLOYEES.stream().findFirst();
        System.out.println(employeeOptional);

        Optional<Employee> any = EMPLOYEES.stream().findAny();
        System.out.println(any);
    }

    @Test
    public void testCountMaxMin() {
        long count = EMPLOYEES.stream().filter(e -> e.getAge() > 40).count();
        System.out.println("Age > 40" + count);

        Optional<Integer> max = EMPLOYEES
                .stream()
                .map(Employee::getAge)
                .max(Integer::compare);
        System.out.println("Max age is : " + max);

        Optional<Integer> min = EMPLOYEES
                .stream()
                .map(Employee::getAge)
                .min(Integer::compare);
        System.out.println("Min age is : " + min);

        EMPLOYEES.stream()
                .filter(e -> e.getAge() > 40)
                .map(e -> e.getName() + " : Old People")
                .forEach(System.out::println);

        List<String> collect = EMPLOYEES.stream()
                .filter(e -> e.getAge() > 40)
                .map(e -> e.getName() + " : Old People")
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    @Test
    public void testIteration() {
        EMPLOYEES.stream().forEach(System.out::println);
        System.out.println("*****************************");
        EMPLOYEES.forEach(System.out::println);
    }

    @Test
    public void testReduce() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer ans = list.stream().reduce(0, Integer::sum);
        System.out.println(ans);

        Optional<Integer> res = EMPLOYEES.stream().map(Employee::getAge).reduce(Integer::sum);
        System.out.println(res);

        Optional<Integer> res2 = EMPLOYEES.stream().map(Employee::getAge).reduce((e1, e2) -> e1 + e2);
        System.out.println(res2.get());
    }

    @Test
    public void testChain() {
        List<Double> collect = EMPLOYEES.stream()
                .filter(e -> e.getAge() < 40)
                .map(e -> e.getSalary() * 0.8)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("********************");

        Optional<Integer> reduce = EMPLOYEES.stream()
                .filter(e -> e.getAge() < 40)
                .map(e -> e.getSalary() * 0.8)
                .map(e -> {
                    System.out.println(e);
                    return e.intValue();
                })
                .reduce(Integer::sum);
        System.out.println(reduce.get());

        Optional<Integer> reduce1 = EMPLOYEES.stream()
                .filter(e -> e.getAge() < 40)
                .collect(Collectors.toList())
                .stream()
                .map(e -> e.getSalary() * 0.8)
                .map(e -> {
                    System.out.println(e);
                    return e.intValue();
                })
                .reduce(Integer::sum);
        System.out.println(reduce1.get());
    }

    @Test
    public void testGroupBy() {
        Map<String, Optional<Employee>> collect = EMPLOYEES
                .stream()
                .collect(Collectors
                        .groupingBy(
                        Employee::getGender,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))
                ));
        System.out.println("male max salary: " + collect.get("male"));
        System.out.println("female max salary: " + collect.get("female"));
    }

    @Test
    public void testToMap() {
        Map<Integer, Double> collect = EMPLOYEES.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getSalary
                ));
        System.out.println(collect);
    }
}
