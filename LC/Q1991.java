package LC;

public class Q1991 {
    public int findMiddleIndex(int[] nums) {
        int len=nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        int sumPrefix=0;
        for(int i=0;i<len;i++){
            if(sumPrefix==sum-sumPrefix-nums[i]){
                return i;
            }sumPrefix+=nums[i];
        }
        return -1;
    }
}
