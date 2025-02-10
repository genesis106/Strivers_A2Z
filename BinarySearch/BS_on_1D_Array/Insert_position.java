package BinarySearch.BS_on_1D_Array;

public class Insert_position {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        if (nums[0] > target) {
            return 0;
        }
        if(nums[nums.length-1]<=target){
            return nums.length;
        }
        while (start <= end) {
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}
