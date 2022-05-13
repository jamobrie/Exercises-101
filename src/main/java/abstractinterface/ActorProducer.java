package abstractinterface;

//TODO - explore this further
public interface ActorProducer extends Actor, Producer {

    //Interface features:
    //1. Abstract methods only
    //2. Variables ---> Only static and final
    //3. Interfaces



    //note how these are redundant
    static String asdasdadwd = null;
    final String asdasd = null;

    abstract String doSomething();

    //Making a private method in an interface requires it to have a body!
    private String doSomethingToo() {
        return null;
    }

    // some statements
}