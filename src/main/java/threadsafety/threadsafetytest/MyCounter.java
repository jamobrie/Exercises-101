package threadsafety.threadsafetytest;

public class MyCounter {

    private int count;

    public void increment() {
        int temp = count;
        count = temp + 1;
    }

    //To control the interleaving of threads so that we can reveal concurrency issues
    public synchronized void incrementSynchronously() throws InterruptedException {
        int temp = count;
        wait(100);
        count = temp + 1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
