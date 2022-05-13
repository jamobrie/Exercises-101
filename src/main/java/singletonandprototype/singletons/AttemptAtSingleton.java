package singletonandprototype.singletons;

public class AttemptAtSingleton {

    private static AttemptAtSingleton INSTANCE;
    private String info = "Initial Class Info";

    private AttemptAtSingleton() {
        info = "Hello I am part of the singleton class";
    }

    public static AttemptAtSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AttemptAtSingleton();
//            System.out.println("A new Instance has of " + Attempt.class + " has been created");
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
