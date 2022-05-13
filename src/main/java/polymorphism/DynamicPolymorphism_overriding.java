package polymorphism;

class DynamicPolymorphism_overriding {


}

class Animal {
    String animalName;
    String animalAge = "18 years old";

    public void move() {
        System.out.println("Animals can move");
    }
//    public static void move() {
//        System.out.println("Animals can move");
//    }

    Animal() {
        System.out.println("I am a lion with no args constructor!");
    }

    Animal(String name) {
        this.animalName = name;
        System.out.println("I am a tiger with 1 constructor!");
        System.out.println("My name is: " + name);
        double animalAge = 4.5;
        this.animalAge = this.animalAge + animalAge;
    }

    @Override
    public String toString() {
        return "Animal name is: " + animalName;
    }
}

class Dog extends Animal {

    //NOTE -> When overridding a static method it will only print "Animals can move" ... so the child will not get invoked ---> method hiding
//    @Override
//    public static void move() {
//        System.out.println("Dogs can walk and run");
//    }

    @Override
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

class TestDog {

    public static void main(String[] args) {
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object
        Animal c = new Animal("Scar");//Showing overloading using diff constructor Args!
        System.out.println("Overload Animal with no args is: " + a.toString());
        System.out.println("Overload Animal with 1 args is: " + c.toString());

        a.move();//output: Animals can move

        b.move();//output:Dogs can walk and run

    }
}

