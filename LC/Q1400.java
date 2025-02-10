package LC;

import java.util.HashMap;
import java.util.Map;

public class Q1400 {
    public boolean canConstruct(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
        int count=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            count+=entry.getValue()%k==0?0:1;
        }
        return count<=k;
    }
}
