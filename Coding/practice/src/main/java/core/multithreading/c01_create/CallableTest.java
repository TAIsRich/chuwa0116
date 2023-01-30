package core.multithreading.c01_create;

import java.util.concurrent.Callable;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class CallableTest {

    public static void main(String[] args) {
        final int n = 10;

        Callable<Integer> sumTast = new Callable<Integer>() {
            @Override
            public Integer call() {
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        try {
            Integer res = sumTast.call();
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}
