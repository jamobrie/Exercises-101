package superKeyword;

public class ParentClass {

    protected int num = 1;

    ParentClass(){
        System.out.println("Parent class default constructor.");
    }

    ParentClass(String x){
        System.out.println("Parent class parameterised constructor.");
    }

    public void foo(String parentString){
        System.out.println("This is the parent class which has a string arg of " + parentString);
    }

}
