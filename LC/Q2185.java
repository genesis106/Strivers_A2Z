package LC;

public class Q2185 {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int prefLen=pref.length();
        for(String word:words){
            if(word.length()>=prefLen){
                count+=word.startsWith(pref)?1:0;
            }
        }return count;
    }
}
