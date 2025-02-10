package DP;

import java.util.HashMap;

public class ninja_training {
    public static int ninjaTraining(int n, int points[][]) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return Math.max(points[0][0], Math.max(points[0][1], points[0][2]));
        }
        int[][] dp = new int[n][3];
        dp[n - 1][0] = points[n - 1][0];
        dp[n - 1][1] = points[n - 1][1];
        dp[n - 1][2] = points[n - 1][2];
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                int maxPoints = 0;

                // Pick the best activity from the next day, excluding the current activity
                for (int k = 0; k < 3; k++) {
                    if (k != j) {
                        maxPoints = Math.max(maxPoints, dp[i + 1][k]);
                    }
                }

                // Add the points for the current activity on the current day
                dp[i][j] = points[i][j] + maxPoints;
            }
        }

        // The answer is the maximum points from the first day
        return Math.max(dp[0][0], Math.max(dp[0][1], dp[0][2]));
    }

    

}
