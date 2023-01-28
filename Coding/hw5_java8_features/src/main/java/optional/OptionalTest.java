package optional;
import org.junit.Test;

import java.util.Optional;
public class OptionalTest {
    @Test
    public void testOptionalWithNotHandleException(){
        Employee employee = new Employee();
        Optional<Employee> optional1 = Optional.of(employee);

        employee = null;
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test(expected =  NullPointerException.class)
    public void test1(){
        Employee employee = new Employee();
        Optional<Employee> optional = Optional.of(employee);

        employee = null;
        Optional<Employee> optional2 = Optional.of(employee);
    }

    @Test
    public void testOfNullable(){
        Employee employee1 = new Employee();
        Optional<Employee> optional1 = Optional.ofNullable(employee1);
        System.out.println(optional1);

        Employee employee2 = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee2);
        System.out.println(optional2);
    }

    @Test
    public void testOrElse(){
        Employee employee1 = new Employee();
        Optional<Employee> optional1 = Optional.ofNullable(employee1);
        System.out.println(optional1);

        Employee employee2 = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee2);
        System.out.println(optional2);

        Employee employee3 = Optional.ofNullable(employee2).orElse(new Employee(1, "JCole", 30, 6666));
        System.out.println(employee3);
    }

    @Test
    public void testOrElseThrow(){
        Employee employee1 = new Employee();
        Optional<Employee> optional = Optional.ofNullable(employee1);
        System.out.println(optional);

        Employee employee2 = null;
        Optional<Employee> optional2 = Optional.ofNullable(employee2);
        System.out.println(optional2);

        Employee employee3 = Optional.ofNullable(employee1).orElseThrow(() -> new RuntimeException("Wow Exception"));
        System.out.println(employee3);
    }
}
