package core.multithreading.c06_util_concurrent_locks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Function:
 *
 * @author haoyu
 * @Date 1/29/23
 */
public class AtomicLearn {
    public int incrementAndGet(AtomicInteger atomicInteger) {
        int prev;
        int next;
        do {
            prev = atomicInteger.get();
            next = prev + 1;
        } while (!atomicInteger.compareAndSet(prev, next));
        return next;
    }
}

class IdGenerator {
    AtomicLong atomicLong = new AtomicLong(0);

    public long getNextId() {
        return atomicLong.incrementAndGet();
    }
}
