public class Even3 {
    public static void main(String[] args) {
        int number = 2; // Start with the first even number
        do {
            System.out.println(number); // Print the current even number
            number += 2; // Increment by 2 to get the next even number
        } while (number <= 100); // Continue until 100
    }
}
