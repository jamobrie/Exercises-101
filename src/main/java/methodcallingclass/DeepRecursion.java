package methodcallingclass;

//This is a build error
class DeepRecursion {
    int fun() {
        int result;
        result = fun();
//        System.out.println("results: " + result);
        return result;
    }
}

class Driver {
    public static void main(String args[]) {
        DeepRecursion ib = new DeepRecursion();
        System.out.print(ib.fun());
    }
}