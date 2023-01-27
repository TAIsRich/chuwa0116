package feature.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LambdaLearn {
    @Test
    public void overrideFoo(){
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
    public void lambdaFoo(){
        Foo foo = parameter -> parameter + " from Foo";
        String hello = foo.aMethod("hello");
        System.out.println(hello);

    }

    @Test
    public void lambdaFoo2(){
        Foo foo = parameter -> parameter.toUpperCase() + " from Foo";
        String hello = foo.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void testFinal(){
        final String localVaraible = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVaraible;
        };
        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testEffectivelyFinal(){
        String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter + " " + localVariable;
        };
        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal21(){
        String localVariable = "Local";
        localVariable = "LOCAL";

        Foo foo = parameter -> {
            return parameter;
        };
        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal22(){
        String localVariable = "Local";
        Foo foo = parameter -> {
            return parameter;
        };
        localVariable = "LOCAL";
        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal3(){
        List<Employee> employees = EmployeData.getEmployees();
        Employee employee = employees.get(0);
        employee.setAge(55);
        Foo foo = parameter -> {
            return parameter + " " + employee;
        };
        System.out.println(foo.aMethod("hello"));
    }



}
class EmployeData{
    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1001, "Yun Ma", 50, 30000.00, "male"));
        list.add(new Employee(1002, "Huateng Ma", 49, 22222.22, "male"));
        list.add(new Employee(1003, "Yanhong Li", 30, 123123, "male"));
        list.add(new Employee(1004, "Jun Lei", 43, 12234.12, "female"));
        list.add(new Employee(1005, "Bill Gates", 65, 999999, "female"));
        list.add(new Employee(1006, "Mark Elliot Zuckerberg", 29, 88888, "male"));
        list.add(new Employee(1007, "Zhengfei Ren", 78, 66666, "male"));

        return list;
    }

}
