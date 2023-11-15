//Java program to check if the input string is a pangram or not:

import java.util.Scanner;

public class StringIsAPangramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a pangram:");
        String input = scanner.nextLine();

        // Function calling
        containAllLetters(input);

        scanner.close();
    }

    // Function to check if a string contains all the letters (a to z)
    public static void containAllLetters(String string) {
        // Converts the given string to lowercase
        string = string.toLowerCase();
        boolean allLetterPresent = true;

        // Loop iterates over each character from 'a' to 'z'
        for (char ch = 'a'; ch <= 'z'; ch++) {
            // Checks if the string does not contain the current letter
            if (string.indexOf(ch) == -1) {
                allLetterPresent = false;
                break;
            }
        }

        // Checks if all the letters are presented or not
        if (allLetterPresent)
            System.out.println("Pangram String");
        else
            System.out.println("Not a Pangram String");
    }
}

