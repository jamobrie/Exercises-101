package basicexercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicExercises2 {

    public static void main(String[] args) {


        //Tough exercises: On Binary
        //https://www.w3resource.com/java-exercises/basic/java-basic-exercise-17.php
        //https://www.w3resource.com/java-exercises/basic/java-basic-exercise-18.php
        //https://www.w3resource.com/java-exercises/basic/java-basic-exercise-19.php
        // converting types --> up to exercise 30.

        //31. Check if Java is installed
        System.out.println("java home is: " + System.getProperty("java.home"));
        System.out.println("java.version is: " + System.getProperty("java.version\n"));

        //33. Calculate number of digits in an Integer
        //    calculateSumOfDigits();

          interestingMathMethods();

        //36. Distance between 2 points ---> latitude(equator, lines going from east-west), longitude(north and south)

        //37. Reverse a String
//        reverseAString();

        //38 count all char, numb, spaces in a String
        countAllCharacters();
    }

    private static void countAllCharacters() {

        String allChar = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] characterList = allChar.toCharArray();
//        char[] characterList = new char[100];
//
//        for (int i = 0; i < allChar.length() - 1; i++) {
//            characterList[i] = allChar.charAt(i);
//        }

        int spaceCount = 0;
        int alphanumeric = 0;
        int number = 0;
        int otherCharacter = 0;

        //        for (int i = 0; i < characterList.length; i++) {
        //            if (Character.isAlphabetic(characterList[i])) {
        //                alphanumeric++;
        //            } else if (Character.isDigit(characterList[i])) {
        //                number++;
        //            } else if
        //            (Character.isWhitespace(characterList[i])) {
        //                spaceCount++;
        //            } else {
        //                System.out.println(characterList[i]);
        //                otherCharacter++;
        //            }
        //        }

        //TODO -> Improved for loop
        for (char c : characterList) {
            if (Character.isAlphabetic(c)) {
                alphanumeric++;
            } else if (Character.isDigit(c)) {
                number++;
            } else if
            (Character.isWhitespace(c)) {
                spaceCount++;
            } else {
                System.out.println(c);
                otherCharacter++;
            }
        }
//Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
        System.out.println("space: " + spaceCount);
        System.out.println("alphanumeric: " + alphanumeric);
        System.out.println("number: " + number);
        System.out.println("otherCharacter: " + otherCharacter);

    }

    private static void reverseAString() {
        Scanner in33 = new Scanner(System.in);
        System.out.println("Enter a name and we will reverse the order of it for you!");
        String name = in33.nextLine();

        //in.nextLine().toCharArray(); ---> is even better as it creates the array for us!

        //TODO Jimmy -> Try various approaches using String list vs String array
        List<String> arrayOfLetters = new ArrayList<>();
        String[] arrayOfLetters2 = new String[100];

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            arrayOfLetters.add(String.valueOf(c));
//            arrayOfLetters2[i] = String.valueOf(c);
        }

        for (int i = 100; i < 1000; i++) {
            System.out.println("jimmy " + i);
        }

        StringBuilder reversedWord = new StringBuilder();
        for (int i = arrayOfLetters.size() - 1; i >= 0; i--) {
            reversedWord.append(arrayOfLetters.get(i));
        }

        System.out.println("The reversed word should be neirboymmij and is: " + reversedWord);

        //TODO ---> Failed assert returns -1 as opposed to 0
        assert reversedWord.equals("neirboymmij");

    }

    private static void interestingMathMethods() {
        // (6 * s^2) ---> 6*(s*s)
        // (4*tan(π/6) ---> (4*Math.tan(Math.PI/6)
        Math.tan(123);
        Math.cos(23);
        Math.sin(12312);
        Math.toRadians(23432); // For longitude/latitude
        //Hexagon = 6
        //polygon = many

        Math.pow(22, 6);// where 6 represents the power of, and 22 to the power of 6


        int a = 56;
        int b = 20;
        int c = 94;
        int  d = 444 ;
        Math.min(a, b);

        Math.max(c, d);

        //Difference between 2 varialbes in Match
        System.out.printf("Distance difference between the two of the integers: %d%n", Math.abs(10 - 16));


    }

    private static void calculateSumOfDigits() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number and we'll tell you the sum of the overall digits!");
        int numberInputted = in.nextInt();

        //1. So basically divide by 10 to works from far right of digits.
        //2. Then do calculation on each digit be iterating through to next one
        int sum = 0;
        while (numberInputted != 0) {
            int temp = numberInputted;
            System.out.println("The number is currently: " + numberInputted);
            sum += numberInputted % 10;//modulus 3/10 ---> will still return 3
            System.out.println("The variable to add to sum is: " + temp % 10);
            numberInputted /= 10; // /3/10 ---> will return 0
            System.out.println("NumberInputted divided by 10 is: " + (temp /= 10));
        }

        System.out.println("Sum of digits is: " + sum);
//        in.close();
        System.out.println("Scanner should be closed now ... ");
    }

}
