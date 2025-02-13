package Arrays.HARD;

import java.util.HashMap;

public class max_product_sub_arr {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int currMax = nums[0];
        int currMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(num, currMax * num);
            currMin = Math.min(num, currMin * num);

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}