package LC;

import java.util.HashSet;

public class Q1930 {
    public static int countPalindromicSubsequence(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<)
        int start = 0;
        int len=s.length();
        int end = s.charAt(len - 1);
        while (end-start>=1) {
            if(!set.contains(s.charAt(start))&&s.charAt(start)==s.charAt(end)){
                count+=end-start-1;
                ++start;
                end=len-1;
                set.add(s.charAt(start));
            }else{
                ++end;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("aabca"));
    }
}
