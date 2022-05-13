package garbagecollection;

public class GarbageCollectionHowToTrigger {

    //3 ways to trigger GC
    //A). System.gc(); ...... more convenient
    //B). Runtime.getRuntime().gc();

    //NB ---> native keyword used for Runtime

    //Garbage collector releases the heap memory by destroying the unreachable objects.
    // System gc and Runtime gc are two methods to request JVM to run Garbage collector.
    // The basic difference between System gc and Runtime gc in Java is that System gc is a class method while Runtime gc is an instance method.
    //Usually, System gc is more convenient than Runtime gc.

    public void howToEnterGarbageCollector() {
        System.gc(); // ---> A class method (static)
        Runtime.getRuntime().gc(); // ---> An instance method (native) ... not static

        Teacher teacher = new Teacher("Jimmy", "Dublin");
    }

    public class Teacher {
        private String name;
        private String address;

        public Teacher(String name, String address) {
            this.name = name;
            this.address = address;
        }
    }

    //    As soon as the garbage collector clears the object, the compiler executes the finalize() method.
//This method generally contains actions which the JVM performs just before the object gets deleted.
    public void finalize() {

    }

    //3  Ways to make anobject eligble for GC:
    //1  Mark as null
    //2. Point reference to another object (original will be deleted)
    //3. Island of Isolation 


}
