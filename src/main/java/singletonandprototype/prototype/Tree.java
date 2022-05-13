package singletonandprototype.prototype;

public abstract class Tree {

    //Variables
    private int mass;
    private int height;
    private int position;

    public Tree(int mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    //Abstract method
    public abstract Tree copy();


    //Getters and Setters
    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
