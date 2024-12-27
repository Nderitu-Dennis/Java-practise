package integer_to_roman;


import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

class Solution {
    private static final TreeMap<Integer, String> values = new TreeMap<>(Collections.reverseOrder());

    static {
        // Regular values
        values.put(1000, "M");
        values.put(500, "D");
        values.put(100, "C");
        values.put(50, "L");
        values.put(10, "X");
        values.put(5, "V");
        values.put(1, "I");

        // Subtractive cases
        values.put(900, "CM");
        values.put(400, "CD");
        values.put(90, "XC");
        values.put(40, "XL");
        values.put(9, "IX");
        values.put(4, "IV");
    }

    public String intToRoman(int num) {
        // Implement conversion logic here

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Integer, String> entry : values.entrySet()) {
            while (num >= entry.getKey()) {
                result.append(entry.getValue());
                num -= entry.getKey();
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.intToRoman(56));
    }
}