package ContestsLC;

public class MAX_ADJ_DIFF {
    public int maxAdjacentDistance(int[] nums) {
        
        int max=Math.abs(nums[0]-nums[nums.length-1]);
        for(int i=1;i<nums.length;i++){
            max=Math.max(Math.abs(nums[i-1]-nums[i]),max);
        }
        return max;
    }
}
