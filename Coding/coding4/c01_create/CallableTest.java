package c01_create;

import java.util.concurrent.Callable;

public class CallableTest {
  public static void main(String[] args) {
    final int n = 10;
    Callable<Integer> sumTask =
        new Callable<Integer>() {
          @Override
          public Integer call() throws Exception {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
              sum += i;
            }
            return sum;
          }
        };

    try {
      Integer call = sumTask.call();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("done");
  }
}
