package core.multithreading.c01_create;

import java.util.concurrent.Callable;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "Start new thread using Callable";
    }
}
