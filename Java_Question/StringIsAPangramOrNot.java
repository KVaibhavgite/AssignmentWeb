*//Java program to check if the input string is a pangram or not:

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class StringIsAPangramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    // Function to check if the input is a pangram
    private static boolean checkPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();

        // Add all lowercase letters to the set
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabetSet.add(ch);
        }

        // Iterate through the input and remove letters from the set
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetSet.remove(ch);
            }
        }

        // If the set is empty, it's a pangram
        return alphabetSet.isEmpty();
    }
}
