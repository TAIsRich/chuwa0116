package org.example.features.lambda;
import org.junit.Test;

public class LambdaLearn {

    @Test
    public void overrideFoo(){
        Foo fooByIC = new Foo() {
            @Override
            public String aMethod(String string) {
                return string + " from foo";
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

    @Test
    public void testFinal21(){
        String localVariable = "Local";
        localVariable = "LOCAL";
        Foo foo = parameter -> {
            //return parameter + " " + localVariable;
            return parameter;
        };
        System.out.println(foo.aMethod("hello"));
    }

    @Test
    public void testFinal22(){
        String localVariable = "Local";
        Foo foo = parameter -> {
            //return parameter + " " + localVariable;
            return parameter;

        };
        localVariable = "LOCAL";
        System.out.println(foo.aMethod("hello"));
    }
}
