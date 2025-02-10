package LC;
import java.util.*;


public class Q1408 {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String curr = words[i];
            if (isSubstringOfOther(words, curr, i)) {
                result.add(curr);
            }
        }

        return result;
    }

    private boolean isSubstringOfOther(String[] words, String curr, int excludeIndex) {
        for (int j = 0; j < words.length; j++) {
            if (j == excludeIndex) continue;
            if (words[j].contains(curr)) {  
                return true;
            }
        }
        return false;
    }    
}
