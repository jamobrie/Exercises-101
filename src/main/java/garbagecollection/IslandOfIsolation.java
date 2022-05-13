package garbagecollection;

public class IslandOfIsolation {

    //object destruction is taken care of by the garbage Collector module and the objects which do not have any references to them are eligible for garbage collection.

    //IslandOfIsolation definition:
    //1. Object 1 references Object 2 and Object 2 references Object 1. Neither Object 1 nor Object 2 is referenced by any other object. That’s an island of isolation.
    //2. group of objects that reference each other but are not referenced by any active object in the application. Strictly speaking, even a single unreferenced object is an island of isolation too.

    IslandOfIsolation islandVariable;

    public static void main(String[] args) {

        IslandOfIsolation islandOne = new IslandOfIsolation();
        IslandOfIsolation islandTwo = new IslandOfIsolation();

        islandOne.islandVariable = islandTwo;
        islandTwo.islandVariable = islandOne;
        // Both the objects have external references t1 and t2.

        //No object eligible for collection
        System.gc();
        islandOne = null; // ---> Both the objects can be reached via islandTwo.islandVariable and islandTwo respectively.

        //No object eligible for collection
        System.gc();
        islandTwo = null; // ---> No way to reach any of the objects.

        //.......... At this point ... Now, both the objects are eligible for garbage collection as there is no way we can call them.
        // This is popularly known as Island of Isolation.

        // Objects NOW eligible
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }

}