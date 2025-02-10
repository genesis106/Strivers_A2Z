package STEP4.BS_on_1D_Array;

import java.util.Arrays;
import java.util.List;

public class findKthRotation {
    public static int findKRotation(List<Integer> arr) {
        // Code here
        int start = 0;
        int end = arr.size() - 1;
        if (arr.get(start) < arr.get(end)) {
            return 0;
        }
        while (start <= end) {
            int mid = start+(end-start) / 2;
            if (mid - 1 >= 0 && arr.get(mid - 1) > arr.get(mid)&&arr.get(mid)<arr.get(end)) {
                return mid;
            }
            if (arr.get(start) <= arr.get(mid)) {

                    start = mid + 1;
                
            } else { 
                
                    end = mid - 1;
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(findKRotation(Arrays.asList(5,6,7, 1, 2, 3, 4)));
    }
}
