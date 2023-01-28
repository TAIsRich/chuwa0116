package stream_api;

import optional.Employee;
import optional.EmployeeData;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Collections 讲的是数据，Stream讲的是计算（CPU）
 * 1. Stream 自己不会存储元素
 * 2. Stream 不会改变源对象，相反，他们会返回一个持有结果的新stream
 * 3. Stream操作是延迟执行的，这意味着他们会等到需要结果的时候才执行。
 * Stream执行流程：
 * 1. 创建Stream： 获取一个数据源
 * 2. 中间操作： 一个操作链： 对数据进行处理
 * 3. 终止操作： 一旦执行中止操作，则会开始执行中间操作链，并产生结果。之后，不会再被使用。
 */
public class StreamApiEndOperation {
    /**
     * 终止操作
     * 一， 匹配与查找
     * 1， allMatch(Predicate p) - 检查是否匹配所有的元素
     * 2， anyMatch(Predicate p) - 检查是否至少匹配一个元素
     * 3， noneMatch(Predicate p) - 检查是否没有匹配的元素
     * 4, findFirst - 返回第一个元素
     * 5， findAny - 返回当前流中的任意元素
     * 6, count - 返回流中元素的个数
     * 7, max(Comparator c) - 返回流中的最大值
     * 8, min(Comparator c) - 返回流中的最小值
     * 9, forEach(Consumer c) - 内部迭代
     * <p>
     * 二，归约
     * 1, reduce(T identity, BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
     * 2, reduce(BinaryOperator) - 可以将流中的元素反复结合起来，得到一个值
     * <p>
     * 三， 收集
     * 1, collect(Collector c)
     */

    private static final List<Employee> EMPLOYEES = EmployeeData.getEmployees();

    /**
     * collect最重要
     */
    @Test
    public void testCollect(){
        List<Employee> collect = EMPLOYEES.stream().filter(e -> e.getId() > 1002).collect(Collectors.toList());
        collect.forEach(System.out::println);

        Set<Employee> collect1 = EMPLOYEES.stream().filter(p -> p.getId() > 1002).collect(Collectors.toSet());
        collect1.forEach(System.out::println);
    }

    /**
     * 1， allMatch(Predicate p) - 检查是否匹配所有的元素
     * 2， anyMatch(Predicate p) - 检查是否至少匹配一个元素
     * 3， noneMatch(Predicate p) - 检查是否没有匹配的元素
     */
    @Test
    public void testMatch(){
        boolean allMatch = EMPLOYEES.stream().allMatch(e -> e.getName().length() > 2);
        System.out.println(allMatch);

        boolean anyMatch = EMPLOYEES.stream().anyMatch(e -> e.getName().length() > 3);
        System.out.println(anyMatch);

        boolean noneMatch = EMPLOYEES.stream().noneMatch(e -> e.getName().startsWith("Yun"));
        System.out.println(noneMatch);
    }

    /**
     * 4, findFirst - 返回第一个元素
     * 5， findAny - 返回当前流中的任意元素
     */
    @Test
    public void testFind(){
        Optional<Employee> employee = EMPLOYEES.stream().findFirst();
        System.out.println(employee);

        Optional<Employee> any = EMPLOYEES.parallelStream().findAny();
        System.out.println(any);
    }

    /**
     * 6, count - 返回流中元素的个数
     * 7, max(Comparator c) - 返回流中的最大值
     * 8, min(Comparator c) - 返回流中的最小值
     */
    @Test
    public void testCountMaxMin(){
        long count = EMPLOYEES.stream().filter(p -> p.getAge() > 40).count();
        System.out.println("num of employees(age > 40): " + count);

        Stream<Integer> stream = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> max = stream.max(Integer::compare);
        System.out.println("max age is: " + max);

        Optional<Employee> min = EMPLOYEES.stream().min(Comparator.comparingInt(Employee::getId));
        System.out.println("min age is : " + min);

        EMPLOYEES.stream()
                .filter(p -> p.getAge() > 40)
                .map(p -> p.getName() + " : OLD PPL")
                .forEach(System.out::println);

        List<String> collect = EMPLOYEES.stream()
                .filter(p -> p.getAge() > 40)
                .map(p -> p.getName() + " OLD PPL")
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    /**
     * 9, forEach(Consumer c) - 内部迭代
     * 使用集合的迭代
     */
    @Test
    public void testIteration(){
        EMPLOYEES.stream().forEach(System.out::println);

        System.out.println("\n********************************\n");

        EMPLOYEES.forEach(System.out::println);
    }

    @Test
    public void testReduce(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);

        Stream<Integer> stream1 = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> reduce1 = stream1.reduce(Integer::sum);
        System.out.println(reduce1);

        Stream<Integer> stream2 = EMPLOYEES.stream().map(Employee::getAge);
        Optional<Integer> reduce2 = stream2.reduce((d1, d2) -> d1 + d2);
        System.out.println(reduce2.get());
    }

    /**
     * map是必须要有return的
     */
    @Test
    public void testChain(){
        List<Double> collect = EMPLOYEES.stream()
                .filter(p -> p.getAge() < 40)
                .map(p -> p.getSalary() * 0.8)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

        System.out.println("********************");

        Optional<Integer> reduce = EMPLOYEES.stream()
                .filter(p -> p.getAge() < 40)
                .map(p -> p.getSalary() * 0.8)
                .map(p -> {
                    System.out.println(p);
                    return p.intValue();
                })
                .reduce(Integer::sum);
        System.out.println(reduce.get());

        // 在终止操作后，可以继续跟一个新的.stream()来构建chain.
        Optional<Integer> reduce1 = EMPLOYEES.stream()
                .filter(p -> p.getAge() < 40)
                .collect(Collectors.toList())
                .stream()
                .map(p -> p.getSalary() * 0.8)
                .map(p -> {
                    System.out.println(p);
                    return p.intValue();
                })
                .reduce(Integer::sum);
        System.out.println(reduce1.get());
    }

    @Test
    public void testGroupBy(){
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

    /**
     * 构建一个map, key是员工ID，value是员工的工资。
     */
    @Test
    public void testToMap(){
        Map<Integer, Double> collect = EMPLOYEES.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getSalary
                ));
    }
}
