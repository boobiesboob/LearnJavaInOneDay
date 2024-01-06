package learnJavaInOneDay;
import java.util.Scanner;
public class UserInputThroughScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n", myInt);
        System.out.println("Enter a double: ");
        double myDouble = input.nextDouble();
        System.out.printf("You entered: %.2f%n", myDouble);
        System.out.println("Enter a string: ");
        /*
        nextDouble() method reads a double number after you hit Enter.
        Enter create a new lane. Without an extra nextLine() methode
        you'll read this empty lane.
         */
        input.nextLine();
        String myString = input.nextLine();
        System.out.printf("You entered: \"%s\"%n", myString); // x2 \s  to print output string in double quotes
    }
}
