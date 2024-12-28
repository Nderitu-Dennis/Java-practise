package counting_last_words_in_a_sentence;

public class Solution {
    /*Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring
consisting of non-space characters only.*/

    public int lengthOfLastWord(String s) {
        //trim the String to get rid of extra spaces in the beginning & end
        s = s.trim();

        //find the index of the last blank space
        int lastSpaceIndex = s.lastIndexOf(" ");


        //get the word after the last space and its length
        String lastWord = s.substring(lastSpaceIndex + 1);
        System.out.println("The last word is: " + lastWord);

        return lastWord.length();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String word = "dont worry about a thing";
        System.out.println("length: " + sol.lengthOfLastWord(word));

        // Test cases
        String sentence1 = "dont worry about a thing ";
        System.out.println("Length: " + sol.lengthOfLastWord(sentence1)); // Output: 5

        String sentence2 = "hello";
        System.out.println("Length: " + sol.lengthOfLastWord(sentence2)); // Output: 5

        String sentence3 = "     ";
        System.out.println("Length: " + sol.lengthOfLastWord(sentence3)); // Output: 0

    }
}





