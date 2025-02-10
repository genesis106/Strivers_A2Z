package STEP10;

import java.util.*;

public class longest_substring_without_repeating_chars {
    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Iterate through the string using the right pointer
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);  
            }
            // Update the map with the current character's index
            map.put(s.charAt(right), right);
            // Update the result with the maximum length of the substring
            ans = Math.max(ans, right - left + 1);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
