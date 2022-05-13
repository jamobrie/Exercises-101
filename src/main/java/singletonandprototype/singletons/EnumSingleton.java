package singletonandprototype.singletons;

//Alternative -> 3. Lazy initialization
public enum EnumSingleton {

    //Enum Singletons ---> This approach has serialization and thread-safety guaranteed
    // by the enum implementation itself, which ensures internally that only the single instance is available,
    // correcting the problems pointed out in the class-based implementation.

    INSTANCE("Initial class info");

    private String info;

    private EnumSingleton(String info) {
        this.info = info;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info = info;
    }

}