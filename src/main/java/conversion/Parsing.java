package conversion;

public class Parsing {

    public static void main(String[] args) {
        String eight = "8";

        int actualEight = Integer.parseInt(eight);

        System.out.printf("The result of the parsing is %d and it is interesting!", actualEight);

        // Exercise practice
        int number = 565;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Sum is: " + sum);


        int minutes = 3456789;
        int numberOfDays = minutes / 1440;
        int numberOfYears = numberOfDays / 365;
        int numberOfRemainingDays = numberOfDays % 365;

        System.out.printf("\n Years are %d and days are %d", numberOfYears, numberOfRemainingDays);

    }

}
