package relfection;

public class Goat extends Animal implements Locomotion {

    private String animalName;

    public Goat(String animalName) {
        this.animalName = animalName;
    }

    @Override
    protected String getSound() {
        return "bleat";
    }

    @Override
    public String getLocomotion() {
        return "walks";
    }

    @Override
    public String eats() {
        return "grass";
    }

    // constructor omitted
}