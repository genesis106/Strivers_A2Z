package BinarySearch.BS_on_1D_Array;

public class Search_Element_in_Rotated_Sorted_Array_II {
    public static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            if(nums[start]==target||nums[end]==target){return true;}
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            while (nums[start]==nums[end]&&end > start && nums[end] == nums[end - 1]) {
                --end;
            }
            
            while (nums[start]==nums[end]&&start < end && nums[start] == nums[start + 1]) {
                ++start;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                    while (end > 1 && nums[end] == nums[end - 1]) {
                        --end;
                    }
                } 
                else {
                    start = mid + 1;
                    while (start < nums.length-1 && nums[start] == nums[start + 1]) {
                        ++start;
                    }
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                    while (start < nums.length-1 && nums[start] == nums[start + 1]) {
                        ++start;
                    }
                } else {
                    end = mid - 1;
                    while (end > 1 && nums[end] == nums[end - 1]) {
                        --end;
                    }
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,0,1,1,1}, 0));
    }
}
