package STEP3.EASY;

public class rotate_leftOPTIMIZED {
    private static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;

        }
    }
    public static void rotate(int[] nums, int k) {
        k%=nums.length;
        if(k==0){return;}
        int len=nums.length-1;
        reverse(nums, 0, len-k);
        reverse(nums, len-k+1, len);
        reverse(nums, 0, len);
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7};
        rotate(ar, 3);
        for(int n:ar){
            System.out.print(n+" ");
        }
    }

}
