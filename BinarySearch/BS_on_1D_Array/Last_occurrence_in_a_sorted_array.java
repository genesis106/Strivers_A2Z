package BinarySearch.BS_on_1D_Array;

public class Last_occurrence_in_a_sorted_array {
    private int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private int findLeftBoundary(int[] nums, int target, int index) {
        int start = 0;
        int end = index;
        int left = index;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                left = mid;
                end = mid - 1; 
            } else {
                start = mid + 1;
            }
        }
        return left;
    }

    private int findRightBoundary(int[] nums, int target, int index) {
        int start = index;
        int end = nums.length - 1;
        int right = index;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                right = mid;
                start = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        return right;
    }

    public int[] searchRange(int[] nums, int target) {
        int index = search(nums, target);
        if (index == -1) {
            return new int[] { -1, -1 }; 
        }
        int left = findLeftBoundary(nums, target, index);
        int right = findRightBoundary(nums, target, index);
        return new int[] { left, right };
    }
}
