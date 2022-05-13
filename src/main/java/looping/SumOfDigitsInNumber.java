package looping;

import java.util.Scanner;

public class SumOfDigitsInNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1. accept number
        int inputtedNumber = in.nextInt();

        //2. calculate sum of digits in number
        sumDigits(inputtedNumber);
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

}
