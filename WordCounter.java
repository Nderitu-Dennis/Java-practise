public class WordCounter {
    public static void main(String[] args) {
        String paragraph = "Machine learning is transforming various industries. It allows" +
                " computers to recognize patterns and make decisions. Algorithms like decision trees and neural networks play a crucial role in this field";

        //splitting by space
        String[] words = paragraph.trim().split("\\s+");

        //count the words
        int wordCount = words.length;;
        System.out.println("no of words: "+ wordCount);

    }
}
