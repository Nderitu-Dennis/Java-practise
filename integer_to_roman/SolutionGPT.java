package integer_to_roman;

public class SolutionGPT {
    public static String intToRoman(int num) {
        // Define the Roman numeral values and their symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        // Iterate through the values and symbols
        System.out.println("the length of the values is : " + values.length);
        for (int i = 0; i < values.length; i++) {

            // Subtract the value from num as many times as possible
            while (num >= values[i]) {
                roman.append(numerals[i]);  // Append the Roman numeral
                num -= values[i];  // Subtract the value from num. This line subtracts values[i] from num. It essentially
                                    // reduces num by the value of the Roman numeral you just appended.
            }
        }

        return roman.toString();  // Return the final Roman numeral string
    }

    public static void main(String[] args) {
        int num = 3059;
        System.out.println(intToRoman(num));  // Output: LIX
    }
}