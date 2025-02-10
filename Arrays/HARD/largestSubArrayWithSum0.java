package Arrays.HARD;

import java.util.HashMap;
import java.util.Map;

public class largestSubArrayWithSum0 {
    public static int longestZeroSumSubarray(int[] arr) {
        Map<Integer, Integer> prefixSumMap = new HashMap<>(); 
        int maxLength = 0; // Maximum length of zero-sum subarray
        int prefixSum = 0; // Running prefix sum

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                maxLength = i + 1; // Update maxLength
            }

            // If prefix sum exists in the map, calculate the subarray length
            if (prefixSumMap.containsKey(prefixSum)) {
                int length = i - prefixSumMap.get(prefixSum);
                maxLength = Math.max(maxLength, length);
            } else {
                // Otherwise, store the first occurrence of this prefix sum
                prefixSumMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        int[] a = { 65, -4, 0, -43, 79, 46, -33, -23 ,6, -4, 21, -29, -20, -5, 37, -47, 80, -79, -68, 42 };
        System.out.println(longestZeroSumSubarray(a));
    }
}
