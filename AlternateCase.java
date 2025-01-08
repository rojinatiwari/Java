import java.util.Scanner;

public class AlternateCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Convert to alternate case
        String result = alternateCase(sentence);

        // Display the result
        System.out.println("Sentence in alternate case: " + result);

        scanner.close();
    }

    public static String alternateCase(String sentence) {
        StringBuilder result = new StringBuilder();
        int toggle = 0;

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (toggle % 2 == 0) {
                    result.append(Character.toUpperCase(ch));
                } else {
                    result.append(Character.toLowerCase(ch));
                }
                toggle++;
            } else {
                result.append(ch); // Keep non-alphabetic characters as is
            }
        }

        return result.toString();
    }
}
