package STEP4.BS_on_1D_Array;

public class count_occurrences_of_an_element {
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

    int countFreq(int[] arr, int target) {
        int index = search(arr, target);
        if (index == -1) {
            return 0; 
        }
        int left = findLeftBoundary(arr, target, index);
        int right = findRightBoundary(arr, target, index);
        return right-left+1;
    }
}
