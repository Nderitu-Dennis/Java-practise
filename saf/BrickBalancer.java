package saf;

public class BrickBalancer {
    public static int solution(int[] A) {
        int N = A.length;
        int totalBricks = 0;

        // Calculate total number of bricks
        for (int bricks : A) {
            totalBricks += bricks;
        }

        // If total bricks are not exactly 10*N, return -1 (impossible case)
        if (totalBricks != 10 * N) {
            return -1;
        }

        int balance = 0;
        int moves = 0;

        // Traverse from left to right, balancing bricks
        for (int i = 0; i < N; i++) {
            balance += A[i] - 10;  // Difference from target
            moves += Math.abs(balance);  // Count how far bricks are shifted
        }

        return moves;
    }

    public static void main(String[] args) {
        // Test cases
        int[] A1 = {7, 15, 10, 8};
        int[] A2 = {11, 10, 8, 12, 8, 10, 11};
        int[] A3 = {7, 14, 10};

        System.out.println(solution(A1)); // Output: 7
        System.out.println(solution(A2)); // Output: 6
        System.out.println(solution(A3)); // Output: -1
    }
}

