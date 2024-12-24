import java.time.LocalTime;
import java.time.Duration;

class Solution {
    public int solution(String E, String L) {
        // Parse the input times
        LocalTime entryTime = LocalTime.parse(E);
        LocalTime exitTime = LocalTime.parse(L);

        // Calculate the total duration in minutes
        Duration duration = Duration.between(entryTime, exitTime);
        long totalMinutes = duration.toMinutes();
        System.out.println("total minutes: " + totalMinutes);

        // Entrance fee
        int cost = 2;

        // Compute hours parked
        int fullHours = (int) totalMinutes / 60;
        System.out.println("full hrs: " + fullHours);
        int remainingMinutes = (int) totalMinutes % 60;
        System.out.println("minutes: " + remainingMinutes);

        // First hour costs 3
        if (fullHours >= 1 || remainingMinutes > 0) {
            cost += 3;
            fullHours--; // Deduct the first hour
        }

        // Each additional hour (full or partial) costs 4
        cost += fullHours * 4;
        if (remainingMinutes > 0) {
            cost += 4; // Add cost for the partial hour
        }

        return cost;
    }
}
