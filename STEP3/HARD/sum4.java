package STEP3.HARD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum4 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return ans; 
        }

        Arrays.sort(nums); 

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num = { 1, 0, -1, 0, -2, 2 };
        List<List<Integer>> ans = fourSum(num, 0);
        for (List<Integer> a : ans) {
            System.out.println(a.get(0) + " : " + a.get(1) + " : " + a.get(2) + " : " + a.get(3));
        }
    }

}
