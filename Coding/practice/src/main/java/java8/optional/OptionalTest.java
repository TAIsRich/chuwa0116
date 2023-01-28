package java8.optional;

import common.pojos.Employee;
import org.junit.Test;

import java.util.Optional;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/27/23
 */
public class OptionalTest {

    @Test(expected = NullPointerException.class)
    public void testOptionalWithNotHandleException() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test
    public void testOfNullable() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);
    }

    @Test
    public void testOrElse() {
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);

        Employee employee1 = Optional.ofNullable(employee)
            .orElse(new Employee(1, "John", 30, 65666));
        System.out.println(employee1);
    }

    @Test
    public void testOrElseThrow() {
        Employee employee = null;
        Employee employee1 = Optional.ofNullable(employee)
            .orElseThrow(() -> new RuntimeException("Wow Exception"));
        System.out.println(employee1);
    }
}
