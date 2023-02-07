package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int[] array = new int[]{20, 3, 78, 9, 6, 53, 73, 99, 24, 32};
        Double result = Arrays.stream(array).average().orElse(Double.NaN);
    }
}
