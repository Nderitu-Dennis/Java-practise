package integer_to_roman;

import java.util.Scanner;

public class MySolution {
    public void intToRoman(){
        Scanner scanner = new Scanner(System.in);
        //declare an array of integers and the roman numerals

        int numbers[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String romanNumeral[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int decimalNumber; //stores the user's input
        System.out.print("Enter a decimal number: ");
        decimalNumber= scanner.nextInt();

        StringBuilder roman = new StringBuilder();

        for(int i=0; i<numbers.length; i++) {
            while (decimalNumber >= numbers[i]) {
                //append the roman number
                roman.append(romanNumeral[i]);

                //reduce the decimal number by the appended number
                decimalNumber -= numbers[i];
            }}

                //finally convert the roman to a String
                String romanNumber = roman.toString();
                System.out.println("the roman numeral equivalent is : " + romanNumber);


    }

    public static void main(String[] args) {
        MySolution sol = new MySolution();
        sol.intToRoman();
    }
}
