package singletonandprototype.prototype;

public class PineTree extends Tree{

    public PineTree(int mass, int height) {
        super(mass, height);
        System.out.println("Class affected is: " + this);
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
    }

}
