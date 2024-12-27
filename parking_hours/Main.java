package parking_hours;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare the string variables
        //prompt user to enter start time and end time
        //parse the String to time using local time
        //calculate the difference using Duration and between
        //convert to hrs and mins .mins is modulo 60
        //display the result

        Scanner scanner = new Scanner(System.in);
        String startTime,endTime;

        System.out.println("Enter start time: ");
        startTime=scanner.nextLine();
        System.out.println("Enter end time: ");
        endTime=scanner.nextLine();

            LocalTime localTime = LocalTime.parse(startTime); //shld be less
            LocalTime localTime1 = LocalTime.parse(endTime); //more

            Duration duration = Duration.between(localTime, localTime1);

            long hours = duration.toHours();
            long mins = duration.toMinutes() % 60;

            if(localTime.isAfter(localTime1)){
            System.out.println("error! start time cant be greater than end time");
        } else {

                System.out.println("The difference is " + hours + " hours " + "and " + mins + " minutes");
            }



    }

}
