package STEP4.BS_on_1D_Array;

public class Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int min=nums[nums.length];
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<min){
                min=nums[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return min;
    }
}
