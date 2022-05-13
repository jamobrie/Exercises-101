package sort.bubblesort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortAttempt {

    public static void main(String[] args) {
        int[] unsortedIntArray = new int[10];

        for (int i = 0; i < unsortedIntArray.length - 1; i++) {
            unsortedIntArray[i] = new Random().nextInt();
        }

        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < unsortedIntArray.length - 1; i++) {
                if (unsortedIntArray[i] > unsortedIntArray[i + 1]) {
                    temp = unsortedIntArray[i];
                    unsortedIntArray[i + 1] = unsortedIntArray[i];
                    unsortedIntArray[i] = temp;
                    sorted = false;
                }
            }
        }

        Arrays.stream(unsortedIntArray).forEach(abc -> System.out.println(abc));

    }

}
