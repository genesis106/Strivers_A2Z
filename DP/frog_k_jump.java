package DP;

public class frog_k_jump {
    public static int frogJump(int k, int heights[], int n) {
        if(n==1){return 0;}
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= k&&j<=i; j++) {
                min = Math.min(Math.abs(heights[i] - heights[i - j]) + dp[i - j], min);
            }
            dp[i]=min;
        }
        return dp[n - 1];
    }
}
