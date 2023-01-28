package lambda;

import org.junit.Test;
import t00_common.Employee;
import java.util.List;
import t00_common.EmployeeData;
public class LambdaLearn {

    @Test
    public void overrideFoo() {
        Foo fooByIC = new Foo() {
            @Override
            public String aMethod(String string) {return string + "from foo";}

        };
        String hello = fooByIC.aMethod("Hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo2() {
        Foo foo = parameter -> parameter.toUpperCase() + " from Foo";
        String hello = foo.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void testFinal() {
        final String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };
        System.out.println(foo.aMethod("hello"));
    }
    @Test
    public void testEffectivelyFinal() {
        String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };
        System.out.println(foo.aMethod("hello"));
    }
    /**
     * 换object会报错，因为换了内存地址
     */
    @Test
    public void testFinal21() {
        String localVariable = "Local";
        localVariable = "LOCAL"; // 新的内存地址
        Foo foo = parameter -> {
//            return parameter + " " + localVariable;
            return parameter;
        };
        System.out.println(foo.aMethod("hello"));
    }


    @Test
    public void testFinal3() {
        // Employee is from other package
        List<Employee> employees = EmployeeData.getEmployees();
        Employee employee = employees.get(0);
        employee.setAge(55);
        Foo foo = parameter -> {
            return parameter + " " + employee;
        };
        System.out.println(foo.aMethod("hello"));
    }
}


