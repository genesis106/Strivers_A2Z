package STEP3.MEDIUM;
import java.util.*;
public class nextPermutation {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void nextPermutation(int[] nums) {
        if(nums.length==0){return;}
        boolean swap=false;
        int index=0;
        int pointer=nums.length-1;
        while(pointer>0){
            if(nums[pointer-1]<nums[pointer]){
                swap=true;
                index=pointer-1;
                break;
            }
            --pointer;
        }
        if(!swap){
            Arrays.sort(nums);
            return;
        }
        pointer=nums.length-1;
        while(pointer>0&&nums[pointer]<=nums[index]){
            --pointer;
        }
        swap(nums, index, pointer);
        minimize(nums,index+1);
    }
    static void minimize(int[] nums, int i){
        int start=i;
        int end=nums.length-1;
        while(start<end){
            swap(nums, start, end);
            ++start;--end;
        }
    }
    public static void main(String[] args) {
        nextPermutation(new int[]{1,2,3});
    }
}
