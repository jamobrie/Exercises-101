package singletonandprototype.singletons;

//Alternative -> 2. Early initialization
public class ThreadSafeSingletonUsingEarlyInit {

    private static final ThreadSafeSingletonUsingEarlyInit INSTANCE = new ThreadSafeSingletonUsingEarlyInit();

    public static ThreadSafeSingletonUsingEarlyInit getInstance() {
        return INSTANCE;
    }

    // private constructor and other methods...
}
