package learnJavaInOneDay;

import java.util.Scanner;

public class IfDemoWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nPlease enter your age: ");
        int userAge = input.nextInt();
        if (0 > userAge || userAge > 100) {
            System.out.println("Invalid age.\nAge must be between 0 and 100");
        } else if (userAge < 18) {
            System.out.println("Sorry. You are underage");
        } else if (userAge < 21) {
            System.out.println("You need parental consent");
        } else {
            System.out.println("Congratulation!\nYou may sign up for this event!");
        }
    }
}
