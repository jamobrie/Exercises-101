package superKeyword;

import java.io.Serializable;

public class ChildClass extends ParentClass {

    //Super use cases:
    //1. On parent variables
    //2. On parent methods ---> @Override required
    //3. On parent constructor

    //1.
    private int num = 2;

    //2A. With no arg constructor
    ChildClass() {
        super();    // to call default parent constructor
        System.out.println("Child class default Constructor");
    }

    //2B. With arg constructor
    ChildClass(String arg) {
        super("Call Parent");    // to call parameterised constructor.
        System.out.println("Child class default Constructor");
    }

    void printNum() {
        System.out.println("child num value is " + num);
        System.out.println("parent num value is + " + super.num); //prints the value of num of parent class
    }


    //3.
    @Override
    public void foo(String childString) {
        System.out.println("This is the child class! with a child arg String of " + childString);
        super.foo(childString); //Calls foo method of Parent class inside the Overriden foo method of Child class.
    }

}
