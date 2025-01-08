import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[10];

        System.out.println("Enter 10 numbers:");

        // Input loop
        for (int i = 0; i < 10; i++) {
            data[i] = sc.nextInt();
        }

        // Finding the largest number
        int max = data[0];
        for (int i = 1; i < 10; i++) {  // Start from index 1
            if (data[i] > max) {
                max = data[i];
            }
        }

        // Output the largest number
        System.out.println("The largest number is: " + max);

        // Close the scanner
        sc.close();
    }
}
