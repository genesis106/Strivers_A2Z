package Arrays.EASY;

public class Remove_Duplicates_in_place_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int insertion = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[insertion-1] != nums[i]) {
                nums[insertion] = nums[i];
                ++insertion;
            }
        }return insertion;
    }
}
