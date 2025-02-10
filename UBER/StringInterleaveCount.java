
package UBER;
import java.util.*;

public class StringInterleaveCount {
    private static final int MOD = 1_000_000_007;
    
    public static int countInterleavings(String p, String q, String r) {
        int m = p.length();
        int n = q.length();
        
        if (m + n != r.length()) {
            return 0;
        }
        long[][][] dp = new long[m + 1][n + 1][4];
        
        // Base case
        dp[0][0][0] = 1;
        
        // Fill dp table
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                int pos = i + j;
                if (pos == 0) continue;
                
                if (i > 0 && p.charAt(i - 1) == r.charAt(pos - 1)) {
                    dp[i][j][1] = (dp[i][j][1] + dp[i - 1][j][0]) % MOD;
                    dp[i][j][1] = (dp[i][j][1] + dp[i - 1][j][1]) % MOD;
                    dp[i][j][3] = (dp[i][j][3] + dp[i - 1][j][2]) % MOD;
                    dp[i][j][3] = (dp[i][j][3] + dp[i - 1][j][3]) % MOD;
                }
                
                if (j > 0 && q.charAt(j - 1) == r.charAt(pos - 1)) {
                    dp[i][j][2] = (dp[i][j][2] + dp[i][j - 1][0]) % MOD;
                    dp[i][j][2] = (dp[i][j][2] + dp[i][j - 1][2]) % MOD;
                    dp[i][j][3] = (dp[i][j][3] + dp[i][j - 1][1]) % MOD;
                    dp[i][j][3] = (dp[i][j][3] + dp[i][j - 1][3]) % MOD;
                }
            }
        }
        
        return (int) dp[m][n][3];
    }
    
    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
            {"ab", "cd", "abcd"},
            {"ab", "cd", "acbd"},
            {"xyz", "abc", "xaybzc"},
            {"aaa", "bbb", "ababab"},
            {"a", "b", "ab"},
            {"abc", "def", "adbecf"}
        };
        
        for (String[] test : testCases) {
            String p = test[0];
            String q = test[1];
            String r = test[2];
            System.out.printf("p='%s', q='%s', r='%s'\n", p, q, r);
            System.out.println("Number of ways: " + countInterleavings(p, q, r));
            System.out.println();
        }
    }
}