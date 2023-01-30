package c01_create;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
  @Override
  public Object call() throws Exception {
    Thread.sleep(5000);
    return "Start new thread using Callable";
  }
}
