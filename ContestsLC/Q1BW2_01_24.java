package ContestsLC;

import java.util.*;

public class Q1BW2_01_24 {
    public static boolean hasMatch(String s, String p) {
        String[] str = p.split("\\*");
        int last_index = -1;
        
        for (String sub : str) {
            int index = s.indexOf(sub, last_index + 1); 
            if (index == -1) {
                return false; 
            }
            last_index = index + sub.length() - 1; 
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(hasMatch("tokk", "t*t"));
    }
}
