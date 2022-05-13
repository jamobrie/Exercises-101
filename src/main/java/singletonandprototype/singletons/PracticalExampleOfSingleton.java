package singletonandprototype.singletons;

public class PracticalExampleOfSingleton {

    //In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.
    //After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created.
    //So whatever modifications we do to any variable inside the class through any instance, it affects the variable of the single instance
    // created and is visible if we access that variable through any variable of that class type defined.

    //Steps to make singleton:
    //1. Make constructor private
    //2. Lazy initialization ... to write STATIC method with return type object of the singleton class


    //TODO - test for thread safery -> "problematic in multithreading scenarios"
    private static PracticalExampleOfSingleton INSTANCE;
    private String info = "Initial info class";
    private String s = "Initial info class";

    private PracticalExampleOfSingleton() {
        s = "Hello I am a string part of Singleton class";
    }

    public static PracticalExampleOfSingleton getInstance() {
        //Not thread safe as 2 threads interleaving their execution could have instance == null ... resulting in 2 instances getting created
        //To ensure against that we can use 'synchronized' ---> greately impacts performance
        if(INSTANCE == null) {
            INSTANCE = new PracticalExampleOfSingleton();
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
