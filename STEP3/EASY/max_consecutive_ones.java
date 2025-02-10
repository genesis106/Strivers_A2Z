package STEP3.EASY;

public class max_consecutive_ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(i<nums.length&&nums[i]==1){
                ++i;
                ++count;
            }
            max=Math.max(max, count);
        }return max;

    }
}
