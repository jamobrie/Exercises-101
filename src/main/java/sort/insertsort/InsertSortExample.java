package sort.insertsort;

import sort.NumberGenerator;

import java.util.Arrays;

public class InsertSortExample {

    public static void main(String[] args) {

        int[] insertSortArray = NumberGenerator.generateRandomNumberArray();

        for (int i = 1; i < insertSortArray.length; i++) {
            int current = insertSortArray[i];
            int j = i - 1;
            while (j >= 0 && current < insertSortArray[j]) {
                insertSortArray[j + 1] = insertSortArray[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            insertSortArray[j + 1] = current;
        }

        //TODO -> The method execute statement -> class ::::: method
        Arrays.stream(insertSortArray).forEach(System.out::println);
    }

}
