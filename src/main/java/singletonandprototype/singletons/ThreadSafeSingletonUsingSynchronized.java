package singletonandprototype.singletons;

//Using synchronized and volatile
public class ThreadSafeSingletonUsingSynchronized {

    private static volatile ThreadSafeSingletonUsingSynchronized INSTANCE;
    private String info = "Initial class info";

    private ThreadSafeSingletonUsingSynchronized() {
        info = "Hello I am part of the singleton class";
    }

    //TODO Test this in practice with a non threadsafe singleton
    public static ThreadSafeSingletonUsingSynchronized getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeSingletonUsingSynchronized.class) {
                INSTANCE = new ThreadSafeSingletonUsingSynchronized();
            }
        }

        return INSTANCE;
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}


