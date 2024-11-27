import java.util.Scanner;

class Sentence {
    public static void main(String[] args) {
        int count_vow = 0, count_con = 0, count_digit = 0, count_word = 0, count_space = 0, count_other = 0;

        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine(); // Read the entire line of input

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ext = str.charAt(i);

            if (Character.isDigit(ext)) {
                count_digit++;
            } else if (Character.isLetter(ext)) {
                if ("aeiouAEIOU".indexOf(ext) != -1) {
                    count_vow++;
                } else {
                    count_con++;
                }
            } else if (Character.isSpaceChar(ext)) {
                count_space++;
            } else {
                count_other++;
            }
        }

        // Calculate the word count (assuming words are separated by spaces)
        count_word = count_space + 1;

        // Print the results
        System.out.println("Vowel count = " + count_vow);
        System.out.println("Consonant count = " + count_con);
        System.out.println("Digit count = " + count_digit);
        System.out.println("Word count = " + count_word);
        System.out.println("Space count = " + count_space);
        System.out.println("Other character count = " + count_other);
    }
}
