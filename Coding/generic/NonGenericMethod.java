package Coding.generic;

public class NonGenericMethod {
    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5,
                MaxNonGeneric.getMax(3, 4, 5));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
                MaxNonGeneric.getMax(6.6, 8.8, 7.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange",
                MaxNonGeneric.getMax("pear", "apple", "orange"));
    }

    }
class MaxNonGeneric {
    public static int getMax(int x, int y, int z) {
        return x;
    }

    public static String getMax(String x, String y, String z) {
        return x;
    }

    public static double getMax(double x, double y, double z) {
        return x;
    }
}
