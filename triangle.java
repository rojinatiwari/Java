import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle:");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        // Create an instance of the Area class
        Area areaCalculator = new Area();
        double area = areaCalculator.calculateArea(side1, side2, side3);

        if (area == -1) {
            System.out.println("The sides do not form a valid triangle.");
        } else {
            System.out.println("The area of the triangle is: " + area);
        }
    }
}

class Area {
    public double calculateArea(int side1, int side2, int side3) {
        // Check if the sides form a valid triangle
        if (!isValidTriangle(side1, side2, side3)) {
            return -1; // Invalid triangle
        }

        // Calculate the semi-perimeter
        double semiPerimeter = (side1 + side2 + side3) / 2.0;

        // Calculate the area using Heron's formula
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1) *
                         (semiPerimeter - side2) * (semiPerimeter - side3));
    }

    private boolean isValidTriangle(int a, int b, int c) {
        // Check the triangle inequality theorem
        return a + b > c && a + c > b && b + c > a;
    }
}
