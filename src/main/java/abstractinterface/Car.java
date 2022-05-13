package abstractinterface;

abstract class Car {

    //final, static and non-final, and non-static allowed
    private final String avc = "";
    private static String avc1 = "";

    protected void accelerate() {
        System.out.println("Do something to accelerate");
    }

    private void applyBrakes() {
        System.out.println("Do something to apply brakes");
    }

    protected abstract void changeGears();
}