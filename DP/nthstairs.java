package DP;
public class nthstairs{
    static final int MOD = 1000000007;

    public static long countDistinctWayToClimbStair(int nStairs) {
        if (nStairs == 0) { // Base case for 0 stairs
            return 1;
        }
        if (nStairs == 1) { // Base case for 1 stair
            return 1;
        }
        if (nStairs == 2) { // Base case for 2 stairs
            return 2;
        }
        long[] dp = new long[nStairs + 1];
        dp[0] = 1; // 1 way to stay at the ground
        dp[1] = 1; // 1 way to climb 1 step
        dp[2] = 2; // 2 ways to climb 2 steps
        for (int i = 3; i <= nStairs; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
        return dp[nStairs];
    }
}