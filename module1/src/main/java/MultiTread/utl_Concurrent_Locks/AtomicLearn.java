package MultiTread.utl_Concurrent_Locks;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLearn {
    //利用CAS实现
    public int incrementAndGet(AtomicInteger var){
        int prev, next;
        do{
            prev = var.get();
            next = prev + 1;
        }while(!var.compareAndSet(prev, next));
        return next;
    }
}

class IdGenerator{
    AtomicLong var = new AtomicLong(0);

    public long getNextId(){
        return var.incrementAndGet();
    }
}
