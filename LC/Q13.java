package LC;

import java.util.HashMap;

public class Q13 {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(' ', Integer.MIN_VALUE);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ans = 0;
        int i = s.length() - 1;
        char previous = ' ';
        while (i != -1) {
            char temp = s.charAt(i);
            int value = map.get(temp);
            if (ans <= value || previous == temp) {
                ans += value;
            } else {
                ans -= value;
            }
            previous = temp;

            --i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
