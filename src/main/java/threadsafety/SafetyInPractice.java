package threadsafety;

import threadsafety.counter.AtomicCounter;
import threadsafety.counter.Counter;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SafetyInPractice {

    //Jimmy - Note to remember!
    //intrinsic locking used in 'synchronized collections' ---> methods can be accessed by only one thread at a time, while other threads will be blocked until the method is unlocked by the first thread.
    //Performance impacted as such
    public static void main(String[] args) {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread1 = new Thread(() -> syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Thread thread2 = new Thread(() -> syncCollection.addAll(Arrays.asList(7, 8, 9, 10, 11, 12)));
        thread1.start();
        thread2.start();

        Map<String,String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("1", "one");
        concurrentMap.put("2", "two");
        concurrentMap.put("3", "three");

        //Not thread safe ---> operators are not ATOMIC
        Counter counter = new Counter(0);
        counter.incrementCounter();
        counter.getCounter();

        //This is thread safe as it uses ATOMIC
        AtomicCounter atomicCounter = new AtomicCounter(5);
        atomicCounter.incrementCounter();
        atomicCounter.getCounter();
    }

}
