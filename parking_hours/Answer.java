package parking_hours;

public class Answer {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        //Solution solution = new Solution();
        MyAnswer myAnswer = new MyAnswer();

        // Call the solution method with parameters
        String entryTime = "10:00";
        String exitTime = "13:21";

        String localTimeA = "13:23";
        String localTimeB = "13:22";

     //  int cost1 = solution.solution(entryTime, exitTime);

        int cost = myAnswer.solution(localTimeA,localTimeB);

        // Print the result
      //  System.out.println("The parking cost is: " + cost1);
        System.out.println("The parking cost is: " + cost);

    }
}
