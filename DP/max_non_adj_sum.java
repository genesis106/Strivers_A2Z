package DP;

import java.util.*;

public class max_non_adj_sum {
    public static int maximumNonAdjacentSum1(ArrayList<Integer> nums) {
        int n = nums.size();
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums.get(0);
        } else if (n == 2) {
            return Math.max(nums.get(0), nums.get(1));
        }
        HashMap<Integer, Integer> map=new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, helper(nums, 0, i, n, map));
            map.put(i, max);
        }

        return max;
    }

    private static int helper(ArrayList<Integer> nums, int sum, int index, int n, HashMap<Integer,Integer> map) {
        if (n == 0 || index < 0) {
            return 0;
        } else if (n == 1) {
            return nums.get(0);
        } else if (n == 2) {
            return Math.max(nums.get(0), nums.get(1));
        }
        if(map.containsKey(index)){return map.get(index);}
        return Math.max(nums.get(index) + helper(nums, sum, index - 2, n,map), 0 + helper(nums, sum, index - 1, n,map));
    }
    public static int maximumNonAdjacentSum2(ArrayList<Integer> nums) {
        int n = nums.size();
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums.get(0);
        } else if (n == 2) {
            return Math.max(nums.get(0), nums.get(1));
        }
        int prev2 = 0;
        int prev1 = nums.get(0);
        for (int i = 1; i < n; i++) {
            int pick = nums.get(i) + prev2;
            int max = Math.max(pick, prev1);
            prev2 = prev1;
            prev1 = max;
        }
    
        return prev1;
    }
    public static int maximumNonAdjacentSum3(ArrayList<Integer> nums) {
        int n = nums.size();
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums.get(0);
        } else if (n == 2) {
            return Math.max(nums.get(0), nums.get(1));
        }
        
        int[] dp = new int[n];
        
        // Initialize the dp array
        dp[0] = nums.get(0);  // First element can only be taken alone
        dp[1] = Math.max(nums.get(0), nums.get(1));  // Max of first two elements
        
        // Fill the dp array
        for (int i = 2; i < n; i++) {
            int pick = nums.get(i) + dp[i - 2];  // Include the current element
            int notPick = dp[i - 1];  // Exclude the current element
            dp[i] = Math.max(pick, notPick);  // Take the maximum of both choices
        }
        
        return dp[n - 1];  // The result is stored in the last element of dp[]
    }
}    