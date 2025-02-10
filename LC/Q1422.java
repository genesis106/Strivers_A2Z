package LC;

public class Q1422 {
    public static int maxScore(String s) {
        int leftCurrent0 = 0;
        int rightCurrent1 = 0;
        int total0 = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '1') {
                ++rightCurrent1;
            } else {
                ++total0;
            }
        }
        if(total0==0||rightCurrent1==0){
            return total0==0?--rightCurrent1:--total0;
        }
        int i = 0;
        while (leftCurrent0 < total0&&i<s.length()-1) {
            if (s.charAt(i) == '0') {
                ++leftCurrent0;
            }else{--rightCurrent1;}
            sum=Math.max(sum, leftCurrent0+rightCurrent1);
            ++i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(maxScore("0100"));
    }
}
