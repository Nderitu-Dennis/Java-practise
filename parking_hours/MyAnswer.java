package parking_hours;

import java.time.Duration;
import java.time.LocalTime;

public class MyAnswer {
    public int solution (String A, String B){
        //parse the times using LocalTime
         LocalTime localTimeA = LocalTime.parse(A);
         LocalTime localTimeB = LocalTime.parse(B);

         if(localTimeA.isAfter(localTimeB)){
             System.out.println("Error ! " + localTimeA + " cannot be after " + localTimeB);
             System.exit(1);  //non zero indicates an error

         }

         //find the difference in the times using Duration
        Duration duration = Duration.between(localTimeA,localTimeB);

        //convert the duration to mins
        long allMins = duration.toMinutes();
        System.out.println("the total minutes were: " + allMins);

        //start computing fees with the entry fee being 2
        int cost = 2;

        //convert allMins into hrs and mins
        int totalHrs = (int)allMins / 60;
        System.out.println("the hours were: " + totalHrs);
        int minsLeft = (int)allMins % 60;
        System.out.println("the total mins were: " + minsLeft);

//        compute the first hr and add to the cost
        if ( allMins > 0 ){
            totalHrs--;
            System.out.println("now total hrs are " + totalHrs);
            cost+=3;
        }

        // so the remaining hrs * 4;
        int costOfRemainingHrs = totalHrs * 4 + (minsLeft > 0 ? 4 : 0);
        cost+=costOfRemainingHrs;
         return cost;

    }
}
