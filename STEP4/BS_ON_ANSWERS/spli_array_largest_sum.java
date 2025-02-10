package STEP4.BS_ON_ANSWERS;

public class spli_array_largest_sum {
    public int splitArray(int[] nums, int k) {
        int high = 0;
        int low = Integer.MIN_VALUE;
        for (int num : nums) {
            high += num;
            low = Math.max(num, low);
        }
        int current = 0;
        while (low <= high) {
            int pointer = 0;
            int mid = low + (high - low) / 2;
            int length = nums.length;
            int remainingK = k;
            while (pointer < nums.length && remainingK != 0) {
                int sum = 0;
                while (pointer < nums.length && sum < mid && length - pointer >= remainingK) {
                    sum += nums[pointer];
                    ++pointer;
                }
                current = Math.max(sum, current);
                --remainingK;
            }
            if (current < mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return current;
    }
}
