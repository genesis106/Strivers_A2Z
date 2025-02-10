package STEP3.EASY;

public class Check_if_an_Array_is_Sorted {
    public boolean check(int[] nums) {
        int lastHighest = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[lastHighest] <= nums[i]) {
                ++lastHighest;
            } else {
                break;
            }
        }
        if (lastHighest == nums.length - 1) {
            return true;
        }
        for (int i = lastHighest + 2; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        int start1 = nums[0];
        int end2 = nums[nums.length - 1];

        return start1 >= end2;
    }
}
