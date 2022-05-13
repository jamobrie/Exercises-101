package threadsafety.counter;

public class SynchronizedCounter {

    private int counter = 0;

    public SynchronizedCounter(int counter) {
        this.counter = counter;
    }

    //JIMMY -> Note to remember:
    //Since one thread at a time can access a synchronized method, one thread will execute the incrementCounter() method, and in turn, others will do the same. No overlapping execution will occur whatsoever.

//    public synchronized void incrementCounter() {
//        counter += 1;
//    }

    //This is more efficient than the above
    public void incrementCounter() {
        // additional unsynced operations
        synchronized(this) {
            counter += 1;
        }
    }

    public int getCounter() {
        return counter;
    }

}
