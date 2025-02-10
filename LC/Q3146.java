package LC;

public class Q3146 {
    public int findPermutationDifference(String s, String t) {
        int[] differenceArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            differenceArray[ch - 'a'] = i;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            differenceArray[ch - 'a'] -= i;
        }
        int result=0;
        for (int i = 0; i < 26; i++) {
            result+=Math.abs(differenceArray[i]);
        }
        return result;
    }
}
