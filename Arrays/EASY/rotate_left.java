package Arrays.EASY;

public class rotate_left {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) {
            return;
        }

        int[] extra = new int[k];
        for (int i = nums.length - k; i < nums.length; i++) {
            extra[i - nums.length + k] = nums[i];
        }
        for (int i = nums.length-1 ; i >=k ; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = extra[i];
        }
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7};
        rotate(ar, 3);
        for(int n:ar){
            System.out.print(n+" ");
        }
    }
}

