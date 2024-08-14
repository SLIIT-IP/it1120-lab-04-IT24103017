import java.util.Scanner;

public class IT24103017Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter exam mark (out of 100): ");
        double examMark = scanner.nextDouble();
        System.out.print("Enter lab submission mark (out of 100): ");
        double labMark = scanner.nextDouble();
        System.out.print("Enter exam percentage: ");
        double examPercentage = scanner.nextDouble();
        System.out.print("Enter lab percentage: ");
        double labPercentage = scanner.nextDouble();

        // Validate input
        if (examMark < 0 || examMark > 100 || labMark < 0 || labMark > 100 || examPercentage < 0 || labPercentage < 0 || (examPercentage + labPercentage) != 100) {
            System.out.println("Invalid input. Please check the marks and percentages.");
        } else {
            // Calculate final mark
            double finalMark = (examMark * examPercentage / 100) + (labMark * labPercentage / 100);
            System.out.printf("The final mark is: %.2f%n", finalMark);
        }

        scanner.close();
    }
}
