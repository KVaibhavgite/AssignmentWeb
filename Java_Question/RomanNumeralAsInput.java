//B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 

import java.util.HashMap;
import java.util.Scanner;

class RomanNumeralAsInput  {
    public static void main(String[] args) {
        // Define the Roman numeral symbols and their corresponding values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Read Roman numeral input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.next().toUpperCase();

        // Convert Roman numeral to integer
        int result = romanToInt(romanNumeral, romanMap);
        System.out.println("Equivalent Integer: " + result);
    }

    // Function to convert Roman numeral to integer
    private static int romanToInt(String romanNumeral, HashMap<Character, Integer> romanMap) {
        int result = 0;
        int prevValue = 0;

        // Traverse the Roman numeral from right to left
        for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(romanNumeral.charAt(i));

            // If current value is greater or equal to previous value, add it to the result
            if (currValue >= prevValue) {
                result += currValue;
            } else {
                // If current value is smaller than previous value, subtract it from the result
                result -= currValue;
            }
            prevValue = currValue;
        }
        return result;
    }
}