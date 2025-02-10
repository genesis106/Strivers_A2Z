package STEP18;

public class shortest_Palindrome {
    public static String shortestPalindrome(String s) {
        StringBuffer ans=new StringBuffer();
        int pointer1=0, pointer2=s.length()-1;
        while(pointer1<s.length()&&pointer2<s.length()){
            if(s.charAt(pointer1)==s.charAt(pointer2)){
                ++pointer1;--pointer2;
            }else{
                ans.insert(pointer1, s.charAt(pointer2));
                ++pointer1;
                --pointer2;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("abcd"));
    }
}
