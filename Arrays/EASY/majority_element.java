package Arrays.EASY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majority_element {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n;) {
            int count = 1;
            while (i + 1 < n && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
            if (count > n / 3) {
                result.add(nums[i]);
            }
            i++; 
        }
        return result;
    }
}
