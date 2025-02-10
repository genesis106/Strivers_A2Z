package LC;

import java.util.ArrayList;

public class Q1769 {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        int balls = 0;
        int sum = 0;
        for (int i = 0; i < boxes.length(); i++) {
            ans[i] += sum + balls;
            sum += balls;
            if (boxes.charAt(i) == '1') {
                balls += 1;
            }
        }
        balls = 0;sum = 0;
        for (int i = boxes.length()-1; i >=0 ; i--) {
            ans[i] += sum + balls;
            sum += balls;
            if (boxes.charAt(i) == '1') {
                balls += 1;
            }
        }
        return ans;
    }
}