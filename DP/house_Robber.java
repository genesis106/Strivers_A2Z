package DP;

import java.util.HashMap;

public class house_Robber {
    public static long houseRobber1(int[] valueInHouse) {
        int n = valueInHouse.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return valueInHouse[0];
        } else if (n == 2) {
            return Math.max(valueInHouse[0], valueInHouse[1]);
        }
        long max = Integer.MIN_VALUE;
        HashMap<Integer, Long> map = new HashMap<>();
        for (int i = 0; i < valueInHouse.length; i++) {
            max = Math.max(max, helper1(valueInHouse, i, i == 0, i == n - 1, n, map));
            map.put(i, max);
        }
        return max;
    }

    private static long helper1(int[] valueInHouse, int index, boolean i0, boolean i_last, int n,
            HashMap<Integer, Long> map) {
        if (index < 0) {
            return 0;
        }
        if (i0 && index == n - 1) {
            return 0;
        }
        if (i_last && index == 0) {
            return 0;
        }
        if (index == 0) {
            return valueInHouse[0];
        }
        if (map.containsKey(index)) {
            return map.get(index);
        }
        long pick = valueInHouse[index] + helper1(valueInHouse, index - 2, i0, i_last, n, map);
        long not_pick = helper1(valueInHouse, index - 1, i0, i_last, n, map);
        return Math.max(pick, not_pick);
    }

    public static long houseRobberDP(int[] valueInHouse) {
        int n = valueInHouse.length;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return valueInHouse[0];
        } else if (n == 2) {
            return Math.max(valueInHouse[0], valueInHouse[1]);
        }
        int prev2 = valueInHouse[0];
        int prev1 = Math.max(valueInHouse[0], valueInHouse[1]);
        for (int i = 2; i < n - 1; i++) {
            int curr = valueInHouse[i] + prev2;
            curr=Math.max(prev1, curr);
            prev2=prev1;
            prev1=curr;
        }
        int c1=prev1;
        prev2 = valueInHouse[1];
        prev1 = Math.max(valueInHouse[1], valueInHouse[2]);
        for (int i = 3; i < n; i++) {
            int curr = valueInHouse[i] + prev2;
            Math.max(prev1, curr);
            prev2=prev1;
            prev1=curr;
        }

        return Math.max(c1,prev1);
    }

}
