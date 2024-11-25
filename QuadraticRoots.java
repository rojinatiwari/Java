import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        // Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask user for the coefficients a, b, and c
        System.out.println("Enter the coefficient a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter the coefficient c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double discriminant = (b * b) - (4 * a * c);

        // Check if discriminant is positive, zero, or negative
        if (discriminant > 0) {
            // Two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real root (repeated)
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal.");
            System.out.println("Root: " + root);
        } else {
            // No real roots
            System.out.println("The equation has no real roots.");
        }

        // Close the scanner
        sc.close();
    }
}
