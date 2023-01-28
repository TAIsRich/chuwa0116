package java8.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda {

    @org.junit.jupiter.api.Test
    public void overrideFoo() {
        Foo fooByOR = new Foo() {
            @Override
            public String aMethod(String string) {
                System.out.println("Provides body via override");
                return string;
            }
        };
        System.out.println(fooByOR.aMethod("Hello"));
    }

    @Test
    public void lambdaFoo() {
        Foo foo = str -> {
            System.out.println("Provides body via lambda expression");
            return str;
        };
        System.out.println(foo.aMethod("Hello"));
    }


    @Test
    public void lambdaFoo2() {
        Foo foo = str -> {
            System.out.println("Provides any body via lambda2 expression");
            return str;
        };
        System.out.println(foo.aMethod("Hello"));
    }

    @Test
    public void testEffectiveFinal() {
        String localVar = "Local Variable";
        Foo foo = str -> str + localVar;
        System.out.println(foo.aMethod("Hello from "));
    }

    @Test
    public void testEffectiveFinal2() {
        String localVar = "Local Variable";

        localVar = "New Local"; // address of localVar will change -> constant string pool

//        Foo foo = str -> str + localVar; // localVar must be final or effective final!
        Foo foo = str -> str;

        System.out.println(foo.aMethod("Hello from "));
    }

    @Test
    public void testEffectiveFinal3() {
        String localVar = "Local Variable";

//        Foo foo = str -> str + localVar; // localVar must be final or effective final!
        Foo foo = str -> str;

        localVar = "New Local"; // address of localVar will change -> constant string pool

        System.out.println(foo.aMethod("Hello from "));
    }

     @Test
     // use set for object still results in effective final -> address of the list do not change.
    public void testEffectiveFinal4() {
         List<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
         list.set(0, "Four");

         Foo foo = str -> str + list; //

         System.out.println(foo.aMethod("Hello from: "));
     }

}
