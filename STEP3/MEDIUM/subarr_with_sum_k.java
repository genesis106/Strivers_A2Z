package STEP3.MEDIUM;

import java.util.*;

public class subarr_with_sum_k {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int num : nums) {
            sum += num;
            
        }
        return count;
    }
}
