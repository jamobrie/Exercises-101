package looping;

import java.util.ArrayList;
import java.util.List;

public class UniqueCombinationOfNumbers {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        //TODO ---> Return to this: https://www.w3resource.com/java-exercises/basic/java-basic-exercise-39.php
        int sumOfAllNum = 0;
        for (Integer number : numberList) {
            for (int i = 0; i < number; i++) {
                sumOfAllNum ++;

            }
        }

        System.out.println("Sum of all numbers is: " + sumOfAllNum);

    }

}
