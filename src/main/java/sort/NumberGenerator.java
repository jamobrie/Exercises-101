package sort;

import java.util.Random;

public class NumberGenerator {

    //TODO Jimmy ---> Test traditional forLoop with 2 elements

    public static int[] generateRandomNumberArray() {
        int[] unsortedArray = new int[100];

        for(int i = 0; i < 100; i ++) {
            unsortedArray[i] = new Random().nextInt();
        }

        return unsortedArray;
    }

}
