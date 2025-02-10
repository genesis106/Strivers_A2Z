package Arrays.EASY;

import java.util.*;

public class sub_arr_with_sum_k {
    public int lenOfLongestSubarr(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum==k){
                max=i+1;
            }

            map.putIfAbsent(i, sum);
            if(map.containsKey(sum-k)){
                max=Math.max(max,i-map.get(sum-k));
            }
        }return max;
    }
}
