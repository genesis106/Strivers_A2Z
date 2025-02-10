package BinarySearch.BS_on_1D_Array;

public class Search_Element_in_Rotated_Sorted_Array_I {
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else { 
                    start = mid + 1;
                }
            } else { 
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else { 
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,5,1};
        System.out.println(search(arr, 3));
    }

}
