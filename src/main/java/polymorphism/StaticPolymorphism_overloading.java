package polymorphism;

//Dynamic binding/Run-Time binding/Late binding/Method overriding
//in different classes
public class StaticPolymorphism_overloading {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String args[]) {
        StaticPolymorphism_overloading obj = new StaticPolymorphism_overloading();
        obj.sum(10, 10, 10);  // 30
        obj.sum(20, 20);     //40

        //TODO when to make a method static?
        //You can call a static method without creating any object, just by using its class name.
        //e.g. java.lang.Math .... StringUtils
        //limitation to static methods:
        //1. you can not override static methods in Java. TODO why?  static methods are bonded during compile time using Type of reference variable, and not Object.
        //2. You can overload static methods
        //static methods are resolved or bonded during compile time, and only information that is available, and used by the compiler is a type of reference variable. Since p was a reference variable of the Parent type, the name() method from the Parent class was called. Now, In order to prove that static method can be hidden
    }


// -------------- Invalid overload commented out below -----------

    public int calculateArea(double sideA, double sideB) {

        return 5;
    }

    public int calculateArea(int sideA, int sideB) {

        return 5;
    }

    //TODO Not valid example -> having different return type is not allowed when all other conditions are same!
//    public double calculateArea(int sideA, int sideB){
//     return 5.5;
//    }


    // -------------- Example of static class access -> Can't use object reference, must use class itself!
    public static class TestForStatic {
        public int calculateSomeValue() {
            return 10 + 7;
        }
    }

    public class nonStatic {
        public int CalculateStatic() {
            TestForStatic testForStatic = new TestForStatic();
            return testForStatic.calculateSomeValue();
        }
    }

}

// -------------- Example of static class access -> Can't use object reference, must use class itself!

class StaticOverrideTest {

    public static void main(String[] args) {

        Parent p = new Parent();
        p.name();   // should call static method from super class (Parent)
        // because type of reference variable
        // p is Parent
        Parent.name();

        p = new Child();
        p.name();  // as per overriding rules this should call to child's static
        // overridden method. Since static method can not be overridden
        // , it will call parent static method
        // because Type of p is Parent.

        Child c = new Child();
        c.name();  // will call child static method because static method
        // get called by type of Class

    }
}

class Parent {
    /*
     * original static method in super class which will be hidden
     * in subclass.
     */
    public static void name() {
        System.out.println("static method from Parent");
    }
}

class Child extends Parent {

    /*
     * Static method with same signature as in super class,
     * Since static method can not be overridden, this is called
     * method hiding. Now, if you call Child.name(), this method
     * will be called, also any call to name() in this particular
     * class will go to this method, because super class method is hidden.
     */
    public static void name() {
        System.out.println("static method from Child");
    }

}


