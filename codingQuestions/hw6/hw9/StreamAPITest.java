package hw9;

import java.util.Arrays;

public class StreamAPITest {
    public static void main(String[] args) {
        int array[] = new int []{20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
        Double avg = Arrays.stream(array).asDoubleStream().average().getAsDouble();
        System.out.println(avg);
    }
}
