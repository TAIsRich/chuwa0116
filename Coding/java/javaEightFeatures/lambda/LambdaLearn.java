package com.chuwa.tutorial.t06_java8.features.lambda;


import com.chuwa.tutorial.t00_common.pojos.Employee;
import com.chuwa.tutorial.t00_common.utils.EmployeeData;
import org.junit.Test;

import java.util.List;

public class LambdaLearn{
    @Test
    public void overrideFoo() {
        Foo FooByIC = new Foo(){
            @Override
            public String aMethod(String string){
                return string + "from foo";
            }
        };
        String hello = fooByIC.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo(){
        Foo foo = p -> p + "from foo";
        String hello = fooByIC.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo2(){
        Foo foo = p -> p.toUpperCase() + "from foo";
        String hello = fooByIC.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void testFinal(){
        final String localVariable = "local";
        Foo foo = p -> {
            return p + localVariable;
        };
        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testEffectivlyFinal(){
        String localVariable = "local";
        Foo foo = p -> {
            return p + localVariable;
        };
        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal21() {
        String localVariable = "Local";
        localVariable = "LOCAL";

        Foo foo = p -> {
            return p;
        };

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal22() {
        String localVariable = "Local";

        Foo foo = p -> {
            return p;
        };

        localVariable = "LOCAL";

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