package util_concurrent_locks;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLearn {
    public long incrementAndGet(AtomicLong var){
        long prev, next;
        do {
            prev = var.get();
            next = prev + 1;
        } while ( !var.compareAndSet(prev, next));
        return next;
    }
}

class IDGenerator{
    AtomicLong var = new AtomicLong(0);

    public long getNextId(){
        return var.incrementAndGet();
    }
}
