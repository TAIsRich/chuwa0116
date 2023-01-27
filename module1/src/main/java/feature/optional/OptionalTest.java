package feature.optional;

import feature.lambda.Employee;
import org.junit.Test;

import java.util.Optional;

public class OptionalTest {
    @Test
    public void testOptionalWithNotHandleException(){
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        //Optional.of(T t) can not be null
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test(expected = NullPointerException.class)
    public void test1(){
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test
    public void testOfNullable(){
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);
    }

    @Test
    public void testOrElse(){
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);

        //Note:
        Employee employee1 = Optional.ofNullable(employee).orElse(new Employee(1, "JCole", 30, 6666));
        System.out.println(employee1);
    }

    @Test
    public void testOrElseThrow(){
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee);
        System.out.println(optional);

        employee = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee);
        System.out.println(optional2);

        Employee employee1 = Optional.ofNullable(employee).orElseThrow(() -> new RuntimeException("Exception!"));
        System.out.println(employee1);
    }
}
