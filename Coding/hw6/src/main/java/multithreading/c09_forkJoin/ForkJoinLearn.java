package multithreading.c09_forkJoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class ForkJoinLearn {
    public static void main(String[] args) {
        ForkJoinTask forkJoinTask = new ForkJoinTask(1, 10000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future<Integer> future = forkJoinPool.submit(forkJoinTask);

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class ForkJoinTask extends RecursiveTask<Integer> {
    private final int threshold = 5;
    private int first;
    private int last;

    public ForkJoinTask(int first, int last) {
        this.first = first;
        this.last = last;
    }

    @Override
    protected Integer compute() {
        int result = 0;
        if (last - first <= threshold) {
            for (int i = first; i <= last; i++) {
                result += i;
            }
        } else {
            int middle = first + (last - first) / 2;
            ForkJoinTask leftTask = new ForkJoinTask(first, middle);
            ForkJoinTask rightTask = new ForkJoinTask(middle + 1, last);

            leftTask.fork();
            rightTask.fork();
            result = leftTask.join() + rightTask.join();
        }
        return result;
    }
}
