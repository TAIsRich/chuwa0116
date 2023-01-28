package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMultiArgumentMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        multiArgument(1.23234, list, "hello");
    }

    public static <T1, T2, T3> void multiArgument (T1 x, T2 y, T3 z) {
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);
        System.out.println("Z is: " + z);
    }


}
