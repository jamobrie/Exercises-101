package relfection;

//TODO Learn from this!
//Jimmy -> Note, the implemented method does not have to be explicit in the case of this Abstract class!
public abstract class Animal implements Eating {

    public static String CATEGORY = "domestic";
    private String name;

    protected abstract String getSound();

    // constructor, standard getters and setters omitted
}