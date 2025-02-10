package LC;

import java.util.*;

public class Q2559 {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private boolean checkVowel(String str) {
        return isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] vowelStr = new int[words.length];
        vowelStr[0] = checkVowel(words[0]) ? 1 : 0;
        for (int i = 1; i < words.length; i++) {
            if (checkVowel(words[i])) {
                vowelStr[i] = vowelStr[i - 1] + 1;
            } else {
                vowelStr[i] = vowelStr[i - 1];
            }
        }
        int[] ans = new int[queries.length];
        int iterator = 0;
        for (int[] query : queries) {
            ans[iterator++] = vowelStr[query[1]] - vowelStr[query[0] - 1];
        }
        return ans;
    }
}