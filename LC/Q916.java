package LC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q916 {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> result = new ArrayList<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (String toCheck : words2) {
            HashMap<Character, Integer> map3 = new HashMap<>();
            for (int i = 0; i < toCheck.length(); i++) {
                map3.put(toCheck.charAt(i), map2.getOrDefault(toCheck.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
                if (map3.containsKey(entry.getKey())) {
                    if (map3.get(entry.getKey()) < entry.getValue()) {
                        map3.put(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        for (String word : words1) {
            boolean containsAll = true;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                map.put(word.charAt(i), map.getOrDefault(word.charAt(i), 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
                if (map.containsKey(entry.getKey())) {
                    if (map.get(entry.getKey()) < entry.getValue()) {
                        containsAll = false;
                        break;
                    }
                }
            }
            if (containsAll) {
                result.add(word);
            }
        }
        return result;
    }
}
