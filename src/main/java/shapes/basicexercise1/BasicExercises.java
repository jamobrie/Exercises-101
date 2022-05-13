package shapes.basicexercise1;

import java.util.Scanner;

public class BasicExercises {

    static final int four = 4;
    static final int twelve = 12;

    public static void main(String[] args) {

        //1 Print hello and next line
        System.out.println("Hello World\nJimmy Obrien");

        //2. Sum of numbers
        int sum = four + twelve;
        System.out.println("The sum is " + sum);
        assert sum == 16: "Sum was not 16 "; // java.lang.AssertionError ---> Exception ----> AssertionError extends throwable

        //Best Practices:
        //The most important thing to remember about assertions is that they can be disabled, so never assume they'll be executed.
//Always check for null values and empty Optionals where appropriate
//Avoid using assertions to check inputs into a public method and instead use an unchecked exception such as IllegalArgumentException or NullPointerException
//Don't call methods in assertion conditions and instead assign the result of the method to a local variable and use that variable with assert
//Assertions are great for places in the code that will never be executed, such as the default case of a switch statement or after a loop that never finishes

        //3. Division of numbers
        int division = twelve / four;
        System.out.println("The division is: " + division);
        assert division == 3: "Division was not 3";

        //4. To enable assertions
        //In the VM options when running just add ---> -ea

        //5. bomdas
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9); //Pay attention to the reaminder here!
        assert (55 + 9) % 9 == 1;
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);


        //6 -> Enter numbers to be multiplied
        callScannerAddition();

        //7. Scanner with loop
        scannerLoop();

        //8. Area of circle, rectangle
        //Don't forget PI is a variable in the Math package
        Circle circle = new Circle(7.5);
        circle.calculateArea();
        circle.calculatePerimeter();

        Rectangle rectangle = new Rectangle(5.5, 8.5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        //Avg of 3 numbers
        avgOfThreeNumbers();

        //9. Print New line of flag
        printAmericanFlag();

        //10. Define multiple variables in one line and don't instantiate them
        long abc, abc2, abc3;

    }

    private static void printAmericanFlag() {
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }

    private static void avgOfThreeNumbers() {

        //TODO ---> in.close ---> closes the scanner, as well as the input stream!!!
        // releases any system resources associated with this stream. The general contract of close is that it closes the input stream. A closed stream cannot perform input operations and **cannot be reopened.**
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers ... ");

        int total = 0;
        for (int i = 0; i < 3; i++) {
            total += in.nextInt();
        }

        int average = total / 3;

        System.out.println("The average is: " + average);
        in.close();
    }


    private static void scannerLoop() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number to get it's multiplication of 10 in a table");

        int numberToMultiply = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberToMultiply * i);
        }

        in.close();
    }

    private static void callScannerAddition() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st nunber");
        int firstNumber = in.nextInt();

        System.out.println("Enter 2nd nunber");
        int secondNumber = in.nextInt();

        //Be wary of String concatenation ---> Bomdas
        System.out.println("The sum of both numbers is: " + (firstNumber + secondNumber));

        in.close();
    }

    //Handy approach for verifying if our DB connection is up and running
    public void setup() {
        //Connection conn = getConnection();
        //assert conn != null;
    }

}
