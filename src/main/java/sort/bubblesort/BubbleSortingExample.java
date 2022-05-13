package sort.bubblesort;

import sort.NumberGenerator;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortingExample {

    //1. Worst sort in terms of performance
    //2. Very easy, handy for small scale collections

    public static void main(String[] args) {

        int[] bubbleArray = NumberGenerator.generateRandomNumberArray();

        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < bubbleArray.length - 1; i++) {
                if (bubbleArray[i] > bubbleArray[i + 1]) {
                    temp = bubbleArray[i];
                    bubbleArray[i] = bubbleArray[i + 1];
                    bubbleArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        Arrays.stream(bubbleArray).forEach(element -> System.out.println(element));
    }

}
