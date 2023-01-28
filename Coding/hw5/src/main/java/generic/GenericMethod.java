package generic;

public class GenericMethod {
    public static void main(String[] args) {
        System.out.println("Max of 1, 4 and 2 is: " + maximum(1, 4, 2));
        System.out.println("Max of 1.1, 4.1 and 2.8 is: " + maximum(1.1, 4.1, 2.8));
        System.out.println("Max apple, banana, and pear is: " + maximum("apple", "banana", "pear"));
    }


    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }
}

