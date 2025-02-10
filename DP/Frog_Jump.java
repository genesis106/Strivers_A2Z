package DP;

public class Frog_Jump {
    public static int frogJump(int n, int heights[]) {
        // (i+1)th' stair or to '(i+2
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1]=Math.abs(heights[0] - heights[1]);
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(Math.abs(heights[i] - heights[i - 1])+dp[i-1],Math.abs(heights[i] - heights[i - 2])+dp[i-2]);
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        System.out.println(frogJump(4, new int[]{10 ,20 ,30 ,10}));
    }

}
