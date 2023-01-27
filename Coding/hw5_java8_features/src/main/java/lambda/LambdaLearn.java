package lambda;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaLearn {
    @Test
    public void overrideFoo(){
        Foo foo = new Foo(){
            @Override
            public String aMethod(String string){
                return string + " from Foo";
            }
        };

        String hello = foo.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo(){
        Foo foo = p -> p + " from foo";
        String hello = foo.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void lambdaFoo2(){
        Foo foo = p -> p.toUpperCase() + " from Foo";

        String hello = foo.aMethod("hello");
        System.out.println(hello);
    }

    @Test
    public void testFinal() {
        final String localVariable = "Local";
        Foo foo = p -> {
            return p + " " + localVariable;
        };

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testEffectivelyFinal() {
        String localVariable = "Local";
        Foo foo = p -> {
            return p + " " + localVariable;
        };

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal21() {
        String localVariable = "Local";
        localVariable = "LOCAL";

        Foo foo = p -> {
//            return p + " " + localVariable;
            return p;
        };

        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal3() {
        List<String> employees = new ArrayList<>(Arrays.asList("a", "b", "c"));

        employees.set(0, "d");

        Foo foo = p -> {
            return p + " " + employees;
        };

        System.out.println(foo.aMethod("hello"));
    }
}

