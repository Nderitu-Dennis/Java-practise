package saf;

public class BrickBalancerClaude {
    public static int solution(int[] A) {
        int N = A.length;
        int totalBricks = 0;

        // Calculate total number of bricks
        for (int bricks : A) {
            totalBricks += bricks;
        }

        // If total bricks are not exactly 10*N, return -1
        if (totalBricks != 10 * N) {
            return -1;
        }

        int moves = 0;
        int[] B = A.clone(); // Create a copy to work with

        // First pass: move excess bricks to the right
        for (int i = 0; i < N - 1; i++) {
            if (B[i] > 10) {
                // Move excess to the right
                int excess = B[i] - 10;
                B[i] = 10;
                B[i + 1] += excess;
                moves += excess;
            }
        }

        // Second pass: move bricks from right to left where needed
        for (int i = N - 1; i > 0; i--) {
            if (B[i] > 10) {
                // Move excess to the left
                int excess = B[i] - 10;
                B[i] = 10;
                B[i - 1] += excess;
                moves += excess;
            }
        }

        // Verify solution
        for (int bricks : B) {
            if (bricks != 10) {
                return -1;
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        // Test cases
        int[] A1 = {7, 15, 10, 8};
        int[] A2 = {11, 10, 8, 12, 8, 10, 11};
        int[] A3 = {7, 14, 10};

        System.out.println(solution(A1)); // Should output: 7
        System.out.println(solution(A2)); // Should output: 6
        System.out.println(solution(A3)); // Should output: -1
    }
}