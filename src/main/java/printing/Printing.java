package printing;

public class Printing {


    public static void main(String[] args) {
        System.out.println("this is a new line as System.out.prinln generates a new line anyway");
        System.out.println("\t this is a new line with a new tab");
        System.out.println("\nTwinkle, twinkle, little star, \n\tHow I wonder what you are! \n\t\tUp above the world so high, \n\t\tLike a diamond in the sky. \nTwinkle, twinkle, little star, \n\tHow I wonder what you are!\n\n");


        int n = 6;
        //TODO - Remember this note!
        //where %d represents an insertable value in the following parameters
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);

        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);

    }
}
