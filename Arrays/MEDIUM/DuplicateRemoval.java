package Arrays.MEDIUM;

public class DuplicateRemoval {
    void swap(int index1, int index2, int[] nums) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public int removeDuplicates(int[] nums) {
        int iterator = 1;
        int count = 1;
        int element = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (element == nums[i]) {
                ++count;
                if (count <= 2) {
                    swap(iterator, i, nums);
                    ++iterator;
                }
            } else {
                element = nums[i];
                count = 1;
                swap(iterator, i, nums);
                ++iterator;
            }
        }
        return iterator;
    }
}
