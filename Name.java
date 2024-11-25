
import java.util.*;

class Name {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter full name
        System.out.println("Enter your full name (First Middle Last):");
        String fullName = sc.nextLine();

        // Trim the full name to remove any extra spaces at the start or end
        fullName = fullName.trim();

        // Find the index of the first space (between first name and middle name)
        int firstSpaceIndex = fullName.indexOf(' ');

        // Find the index of the last space (between middle name and last name)
        int lastSpaceIndex = fullName.lastIndexOf(' ');

        // Extract first name (substring from the start to the first space)
        String firstName = fullName.substring(0, firstSpaceIndex);

        // Extract last name (substring from the last space to the end)
        String lastName = fullName.substring(lastSpaceIndex + 1);

        // Extract middle name (substring between the first and last space)
        String middleName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);

        // Display the names separately
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);

        // Close the scanner
        sc.close();
    }

}
