package util_concurrent_locks;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentCollection {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>(16);

        map.put("A", "1");
        map.put("B", "2");
        String a = map.get("A");

        /*
         但是它实际上是用一个包装类包装了非线程安全的Map，然后对所有读写方法都用synchronized加锁，
         这样获得的线程安全集合的性能比java.util.concurrent集合要低很多，所以不推荐使用。
         */
        HashMap<Objects, Objects> unsafeMap = new HashMap<>(16);
        Map<Objects, Objects> threadSafeMap = Collections.synchronizedMap(unsafeMap);
    }
}
