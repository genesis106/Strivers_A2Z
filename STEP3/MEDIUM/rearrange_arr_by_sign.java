package STEP3.MEDIUM;

public class rearrange_arr_by_sign {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = nums[i];
    }

    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int positive = 0;
        int negative = 1;
        int checker = 0;
        while (checker < nums.length) {
            if (nums[checker] < 0) {
                ans[negative] = nums[checker++];
                negative+=2;
            } else {
                nums[positive] = nums[checker++];
                positive+=2;
            }
        }
        return ans;
    }
}
