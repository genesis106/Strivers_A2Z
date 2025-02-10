package Arrays.HARD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Sort the array to apply two-pointer technique
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i];
            int left = i + 1, right = n - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate elements for the second element
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicate elements for the third element
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++; // Increase the left pointer
                } else {
                    right--; // Decrease the right pointer
                }
            }
        }

        return ans;
    }


    public static void main(String[] args) {
        int[] arr={0,0,0,0};
        List<List<Integer>> ans=threeSum(arr);
        for(List<Integer> a:ans){
            System.out.println(a.get(0)+" : "+a.get(1)+" : "+a.get(2));
        }
    }
}
