package LC;

public class Q713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1;
        int ans=0;
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                ++ans;
            }
            product*=nums[i];
        }
    }

}
