package basic.generics;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/26/23
 */
public class NonGeneric {
    public static int max(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }

    public static double max(double x, double y, double z) {
        return Math.max(x, Math.max(y, z));
    }

    public static String max(String x, String y, String z) {
        String max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(NonGeneric.max(100, 1, 10));
        System.out.println(NonGeneric.max(88.8, 888.8, 8.8));
        System.out.println(NonGeneric.max("apple", "avoid", "allocate"));
    }
}
