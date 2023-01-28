package java8.optional;

import com.beust.ah.A;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    @Test
    public void testOptionalWithNotHandleException() {
        Mobile mobile = new Mobile();
        Optional<Mobile> optional = Optional.of(mobile);

        mobile = null;
        Optional<Mobile> optional1 = Optional.of(mobile);
    }

    // handles the null pointer exception
    @Test(expected = NullPointerException.class)
    public void test1() {
        Mobile mobile = new Mobile();
        Optional<Mobile> optional = Optional.of(mobile);

        mobile = null;
        Optional<Mobile> optional1 = Optional.of(mobile);
    }

    @Test
    public void testOfNullable() {
        Mobile mobile = new Mobile();
        Optional<Mobile> optional = Optional.ofNullable(mobile);
        System.out.println(mobile); // java8.optional.Mobile@759ebb3d

        mobile = null;
        Optional<Mobile> optional1 = Optional.ofNullable(mobile);
        System.out.println(optional1); // Optional.empty
    }


    @Test
    public void testOrElse() {
        Mobile mobile = new Mobile();
        Optional<Mobile> optional = Optional.ofNullable(mobile);
        System.out.println(mobile); // java8.optional.Mobile@759ebb3d

        mobile = null;
        Optional<Mobile> optional1 = Optional.ofNullable(mobile);
        System.out.println(optional1); // Optional.empty

        System.out.println(optional1.orElse(new Mobile()));
    }

//    @Test(expected = RuntimeException.class)
    @Test
    public void testOrElseThrow() {
        Mobile mobile = new Mobile();
        Optional<Mobile> optional = Optional.ofNullable(mobile);
        System.out.println(mobile); // java8.optional.Mobile@759ebb3d

        mobile = null;
        Optional<Mobile> optional1 = Optional.ofNullable(mobile);
        System.out.println(optional1); // Optional.empty

        System.out.println(optional1.orElseThrow(() -> new RuntimeException("Exception!!!")));
    }
}
