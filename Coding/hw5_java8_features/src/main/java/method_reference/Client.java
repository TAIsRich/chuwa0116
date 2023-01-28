package method_reference;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> demo = new ArrayList<>(Arrays.asList("a", "b", "c"));

        demo.forEach(p -> System.out.println(p));

        demo.forEach(System.out::printf);
    }
}
