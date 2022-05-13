package singletonandprototype.singletons;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class SingletonInAction {

    public static void main(String[] args) {
        PracticalExampleOfSingleton classSingleton1 = PracticalExampleOfSingleton.getInstance();
        System.out.println(classSingleton1.getInfo()); //Initial class info

        PracticalExampleOfSingleton classSingleton2 = PracticalExampleOfSingleton.getInstance();
        classSingleton2.setInfo("New class info");

        System.out.println(classSingleton1.getInfo()); //New class info
        System.out.println(classSingleton2.getInfo()); //New class info


        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE.getInstance();

        System.out.println(enumSingleton1.getInfo()); //Initial enum info

        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE.getInstance();
        enumSingleton2.setInfo("New enum info");

        System.out.println(enumSingleton1.getInfo()); // New enum info
        System.out.println(enumSingleton2.getInfo()); // New enum info

        AttemptAtSingleton attemptAtSingleton = AttemptAtSingleton.getInstance();
        System.out.println("The info for the class is: " + attemptAtSingleton.getInfo() + "and the class in memory is: " + attemptAtSingleton.toString());

        AttemptAtSingleton attemptAtSingleton2 = AttemptAtSingleton.getInstance();
        System.out.println("The info for the class is: " + attemptAtSingleton2.getInfo() + "and the class in memory is: " + attemptAtSingleton2.toString());

        AttemptAtSingleton attemptAtSingleton3 = AttemptAtSingleton.getInstance();
        System.out.println("The info for the class is: " + attemptAtSingleton3.getInfo() + "and the class in memory is: " + attemptAtSingleton3.toString());

        ThreadSafeSingletonUsingSynchronized threadSafeSingletonUsingSynchronized = ThreadSafeSingletonUsingSynchronized.getInstance();
        System.out.println("The info for the class is: " + threadSafeSingletonUsingSynchronized.getInfo());

        if(attemptAtSingleton.hashCode() == attemptAtSingleton2.hashCode() && attemptAtSingleton3.hashCode() == attemptAtSingleton.hashCode()){
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            String error = "Three objects DO NOT point to the same memory location on the heap";
            System.out.println(error);

            throw new RuntimeException(error);
        }

        List<PracticalExampleOfSingleton> practicalExampleOfSingletonsList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            PracticalExampleOfSingleton classSingleton5 = PracticalExampleOfSingleton.getInstance();

            byte[] array = new byte[7]; // length is bounded by 7
            new Random().nextBytes(array);
            String generatedString = new String(array, StandardCharsets.UTF_8);

            classSingleton5.setInfo(generatedString);
            System.out.println(classSingleton5.toString() + "the generated info value of: " + classSingleton5.getInfo());

            practicalExampleOfSingletonsList.add(classSingleton5);
        }

        //TODO - Collect all hash and see if counts of unique is > 1
        Stream<Integer> practiceHash = practicalExampleOfSingletonsList.stream().map(Object::hashCode);
//        System.out.println("The hash count (if unique) should be 1 and it is: " + practiceHash.distinct().map(abc->abc.intValue()));
//        practiceHash.distinct().forEach(distinct -> System.out.println(practiceHash.distinct().map(abc->abc.intValue())));
//        assert practiceHash.distinct(). == 1;

    }


//    We distinguish two types of issues with SingletonAndPrototype.singletons:
//
//existential (do we need a singleton?)
//implementational (do we implement it properly?)

}
