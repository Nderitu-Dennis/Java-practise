package JavaPractise;

public class ReverseString {

    //reversing a String

    public String reverseString( String word){
        System.out.println("the original word is\n " + word);
        String reversedword = new StringBuilder(word).reverse().toString();
        return reversedword;
    }

    //splitting and counting words in a sentence
    public int wordCounter(String sentence){
        String[] words= sentence.split("\\s+"); //using regex

        //print them
        for(String word : words){
            System.out.print("\t" + word);
        }

        //displaying their count
        int numberOfWords = words.length;
        System.out.println("\nword Count: " + numberOfWords);
        return numberOfWords;
    }

//    checking whether a name is reversed and fixing it
    public String fixName(String name){
        String fixedName = name;

//        retrieve the first character
        if(Character.isLowerCase(name.charAt(0))){
            fixedName = new StringBuilder(name).reverse().toString();
            System.out.println(name + " Fixed to: " + fixedName);

        }
         else{
            System.out.println(name + " is spelled correctly");
        }
          return fixedName;
    }


    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        //System.out.println(r.reverseString("dennis nderitu"));
       // r.wordCounter("I love the man I am becoming(7)");
        r.fixName("sinneD");
    }
}
