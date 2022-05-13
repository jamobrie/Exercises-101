package singletonandprototype.singletons;

//Alternative -> 3. Lazy initialization
public class ThreadSafeSingletonUsingLazyInit {

    private static class InstanceHolder {
        private static final ThreadSafeSingletonUsingLazyInit INSTANCE = new ThreadSafeSingletonUsingLazyInit();
    }

    public static ThreadSafeSingletonUsingLazyInit getInstance() {
        return InstanceHolder.INSTANCE;
    }

    // private constructor and other methods...



    //And of the course the most thread safe is Enum class ...
}