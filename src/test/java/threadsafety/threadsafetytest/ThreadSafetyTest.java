package threadsafety.threadsafetytest;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreadSafetyTest {


    @Test
    public void testCounter() {
        MyCounter counter = new MyCounter();
        for (int i = 0; i < 500; i++) {
            counter.increment();
        }
        assertEquals(500, counter.getCount());
    }

    @Test
    public void testCounterWithConcurrency() throws InterruptedException {
        int numberOfThreads = 100;

        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        MyCounter counter = new MyCounter();
        for (int i = 0; i < numberOfThreads; i++) {
            service.execute(() -> {
                counter.increment();
                latch.countDown();
            });
        }
        latch.await();
        assertEquals(numberOfThreads, counter.getCount());
    }

    @Test
    public void testSummationWithConcurrency() throws InterruptedException {
        int numberOfThreads = 2;

        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);

        MyCounter counter = new MyCounter();
        for (int i = 0; i < numberOfThreads; i++) {
            service.submit(() -> {
                try {
                    counter.incrementSynchronously();
                } catch (InterruptedException e) {
                    // Handle exception
                }
                latch.countDown();
            });
        }
        latch.await();
        assertEquals(numberOfThreads, counter.getCount());
    }

    //TODO Jimmy ---> Look at Agent, and look here for implementing better library so we don't alter the code
    //https://www.baeldung.com/java-testing-multithreaded
    //https://dzone.com/articles/how-to-test-if-a-class-is-thread-safe-in-java
    //https://gowthamy.medium.com/concurrent-programming-fundamentals-thread-safety-6b44c026bd2a

}
