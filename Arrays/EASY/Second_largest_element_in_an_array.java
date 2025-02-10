package Arrays.EASY;

public class Second_largest_element_in_an_array {
    public int getSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > max) {
                second_max = max;
                max = num;
            } else if (num > second_max && num < max) {
                second_max = num;
            }
        }
        
        return second_max == Integer.MIN_VALUE ? -1 : second_max;
    }
}
