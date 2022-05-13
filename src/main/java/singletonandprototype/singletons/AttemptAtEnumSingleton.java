package singletonandprototype.singletons;

//TODO Try this again!
public enum AttemptAtEnumSingleton {

    INSTANCE("Info about class");

    private String info;

    private AttemptAtEnumSingleton(String info){
        this.info = info;
    }

    public AttemptAtEnumSingleton getInstance(){
        return INSTANCE;
    }

    public String getInfo(){
        return this.info;
    }

    private void setInfo(){
        this.info = info;
    }

}
