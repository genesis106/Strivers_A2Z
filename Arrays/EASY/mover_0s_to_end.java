package Arrays.EASY;

public class mover_0s_to_end {
    public void moveZeroes(int[] nums) {
        int pointerAt0=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[pointerAt0];
                nums[pointerAt0++]=nums[i];
                nums[i]=temp;
            }
        }
    }
}
