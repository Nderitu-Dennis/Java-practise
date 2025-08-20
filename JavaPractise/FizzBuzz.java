package JavaPractise;

import java.util.Scanner;

public class FizzBuzz {
    //print numbers from 1 to 100
    public void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

//    where user provides start and end numbers
    public void fizzBuzz2(int startNumber, int endNumber){

        for(int i = startNumber; i<=endNumber; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }


        }
    }

//    using scanner and checking if the user input is int
    public void fizzBuzz3() {
        Scanner sc = new Scanner(System.in);

        int startNumber, endNumber;

        while (true) {
            System.out.println("Enter the number to start: ");
            if (sc.hasNextInt()) {
                startNumber = sc.nextInt();
                break;
            } else {
                System.out.println("Error! enter an int");
                sc.next(); //consume invalid input and prevent infinite loop
            }
        }

        while (true) {
            System.out.println("Enter the number to end: ");
                if (sc.hasNextInt()) {
                    endNumber = sc.nextInt();
                    break; // break out of the loop if a valid input is read
                } else {
                    System.out.println("Error! enter an int");
                    sc.next();
                }
        }

            //        print the numbers btwn the user's input range
            for (int i = startNumber; i <= endNumber; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

    public static void main(String[] args) {
        FizzBuzz f= new FizzBuzz();
       // f.fizzBuzz();
//  f.fizzBuzz2(8,17);
        f.fizzBuzz3();
    }




}
