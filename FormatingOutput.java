package learnJavaInOneDay;

public class FormatingOutput {

    public static void main(String[] args) {
        System.out.println("The answer for 4.45 divided by 3 is " + (5.45/3));
        System.out.printf("The answer for %.3f divided by %d is %.2f.\n", 5.45, 3, 5.45/3);
        System.out.printf("%.3f\n", 234.656765D);
        System.out.printf("%d%n%d%n", 34_433L, 222); // %n
        System.out.printf("%d\n%d%n", 45_678L, 111); // \n
        System.out.printf("%8d\n",12); // specify the total width, 6 spaces + 2 under 12 give us total 8 spaces.
        System.out.printf("%8.2f\n", 12.4 );
        System.out.printf("%,.2f\n", 123456789.36789); // , - comma is a thousands separator

        String str = "%,.2f\n";
        System.out.printf(str, 123456789.36789);
        System.out.println(str);
    }
}
