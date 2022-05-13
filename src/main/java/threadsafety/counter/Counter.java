package threadsafety.counter;

public class Counter {

    private int counter = 0;

    public Counter(int counter) {
        this.counter = counter;
    }

    public void incrementCounter() {
        counter += 1;
    }

    public int getCounter() {
        return counter;
    }

}
