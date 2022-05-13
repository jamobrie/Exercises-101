package superKeyword;

public class SuperKeyword {


    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        ChildClass childClassWithStringArg = new ChildClass("StringArg");

        childClass.foo("zzz999");
        childClassWithStringArg.foo("abc123");
    }


}
