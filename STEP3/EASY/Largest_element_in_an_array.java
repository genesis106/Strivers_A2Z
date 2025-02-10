package STEP3.EASY;
public class Largest_element_in_an_array{
    public static int largest(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            max=Math.max(num,max);
        }
        return max;
    }
}