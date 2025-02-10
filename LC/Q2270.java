package LC;

public class Q2270 {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        int[] prefix_sum = new int[n];
        prefix_sum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix_sum[i] = prefix_sum[i - 1] + nums[i];
        }
        int valid_splits=0;
        for(int i=0;i<n-1;i++){
            if(prefix_sum[i]>=prefix_sum[n-1]-prefix_sum[i]){
                ++valid_splits;
            }
        }
        return valid_splits;
    }
}
