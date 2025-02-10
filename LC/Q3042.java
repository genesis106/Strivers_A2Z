package LC;

public class Q3042 {
    public static int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                    count += isPrefixAndSuffix(words[i], words[j]) == true ? 1 : 0;
            }

        }return count;
    }

    private static boolean isPrefixAndSuffix(String toCheck,String word) {
        if (word.length() < toCheck.length()) {
            return false;
        }
        
        return word.startsWith(toCheck)&&word.endsWith(toCheck);
    }
    public static void main(String[] args) {
        String[] str={"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(str));
    }
}
