package LC;

import java.util.HashMap;

public class Q724 {
    public int pivotIndex(int[] nums) {
        int len=nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        int sumPrefix=0;
        for(int i=0;i<len;i++){
            if(sumPrefix==sum-sumPrefix-nums[i]){
                return i;
            }sumPrefix+=nums[i];
        }
        return -1;
    }

}
