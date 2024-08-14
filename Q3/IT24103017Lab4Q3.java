import java.util.Scanner;

public class IT24103017Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive, negative, or zero using the ternary operator
        String result = (number > 0) ? "The number is positive." : (number < 0) ? "The number is negative." : "The number is zero.";

        System.out.println(result);

        scanner.close();
    }
}