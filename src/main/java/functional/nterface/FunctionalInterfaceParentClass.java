package functional.nterface;

@FunctionalInterface
public interface FunctionalInterfaceParentClass {

    //Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as lambda expressions.

    //Note that Java 8's default methods are not abstract and do not count; a functional interface may still have multiple default methods. We can observe this by looking at the Function's documentation.

    String determineName();


    //So we can add defined methods in an interface by adding default keyword
    default String findValue() {
        return "";
    }

}
