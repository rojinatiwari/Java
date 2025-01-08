import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declare a 3x3 matrix
        int[][] mat = new int[3][3];
        int sum = 0; // To store the sum of diagonal elements

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Calculate the sum of the diagonal elements
        for (int i = 0; i < 3; i++) {
            sum += mat[i][i]; // Add primary diagonal elements
        }

        // Display the matrix
        System.out.println("The entered matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // Display the sum of diagonal elements
        System.out.println("The sum of the diagonal elements is: " + sum);

        sc.close(); // Close the scanner
    }
}
