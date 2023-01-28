package java8.lambda;

import common.pojos.Employee;
import common.utils.EmployeeData;
import org.junit.Test;

import java.util.List;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/27/23
 */
public class LambdaLearn {

    @Test
    public void overrideFoo() {
        Foo fooByIC = new Foo() {
            @Override
            public String aMethod(String string) {
                return string + " from Foo";
            }
        };

        String hello = fooByIC.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo() {
        Foo foo = p -> p + " from Foo";

        String hello = foo.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo2() {
        Foo foo = p -> p.toUpperCase() + " from Foo";

        String hello = foo.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void testFinal() {
        final String localVar = "Local";
        Foo foo = p -> {
            return p + " " + localVar;
        };

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testEffectivelyFinal() {
        final String localVar = "Local";
        Foo foo = p -> {
            return p + " " + localVar;
        };

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal21() {
        String localVar = "Local";
        localVar = "LOCAL";

        Foo foo = p -> {
//            return p + " " + localVar;
            return p;
        };

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal22() {
        String localVar = "Local";

        Foo foo = p -> {
//            return p + " " + localVar;
            return p;
        };
        localVar = "LOCAL";

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal3() {
        List<Employee> employees = EmployeeData.getEmployees();

        Employee employee = employees.get(0);
        employee.setAge(55);
        Foo foo = p -> {
            return p + " " + employee;
        };

        System.out.println(foo.aMethod("hello"));
    }
}
