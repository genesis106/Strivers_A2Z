package STEP4.BS_on_1D_Array;

public class single_Element_In_A_Sorted_Array {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){return nums[0];}
        int start=0;
        int end=nums.length-1;
        if(nums[start]!=nums[start+1]){return nums[start];}
        if(nums[end]!=nums[end-1]){return nums[end];}
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0&&mid<nums.length&&nums[mid]!=nums[mid+1]&&nums[mid-1]!=nums[mid]){
                return nums[mid];
            }
            else if(mid-start+1)%2==0&&

        }
    }
}
