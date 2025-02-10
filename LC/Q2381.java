package LC;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q2381 {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] shiftTotal=new int[s.length()+1];
        char[] Chars = s.toCharArray();
        for (int[] shift : shifts) {
            if(shift[2]==0){
                --shiftTotal[shift[0]];
                ++shiftTotal[shift[1]+1];
            }
            if(shift[2]==1){
                ++shiftTotal[shift[0]];
                --shiftTotal[shift[1]+1];
            }
        }
        int cumulative_shift=0;
        for(int i=0;i<s.length();i++){
            cumulative_shift+=shiftTotal[i];
            cumulative_shift%=26;
            Chars[i]=(char)(((int)Chars[i]+cumulative_shift)%26);
        }
        return new String(Chars);
    }
}
