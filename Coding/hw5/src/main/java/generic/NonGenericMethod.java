package generic;

public class NonGenericMethod {
    public static void main(String[] args) {
        System.out.println("Max of 1, 4 and 2 is: " + maximum(1, 4, 2));
        System.out.println("Max of 1.1, 4.1 and 2.8 is: " + maximum(1.1, 4.1, 2.8));
        System.out.println("Max apple, banana, and pear is: " + maximum("apple", "banana", "pear"));
    }


    public static int maximum(int x, int y, int z){
        int max = x;

        if (y > max)
            max = y;

        if (z > max)
            max = z;

        return max;
    }

    public static double maximum(double x, double y, double z){
        double max = x;

        if (y > max)
            max = y;

        if (z > max)
            max = z;

        return max;
    }

    public static String maximum(String x, String y, String z){
        String max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}

