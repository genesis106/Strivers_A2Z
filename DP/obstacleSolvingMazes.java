package DP;

import java.util.*;

public class obstacleSolvingMazes {
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        if (n == 0 || m == 0) {
            return 0;
        }
        int[][] dp = new int[n + 1][m + 1];
        for(int i=2;i<=n;i++){
            for(int j=2;j<=m;j++){
                dp[i][j]=mat.get(i-1).get(j-1)==-1?0:dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat=new ArrayList<>();
        mat.add(new ArrayList<>(Arrays.asList(0,0)));
        mat.add(new ArrayList<>(Arrays.asList(0,0)));
        System.out.println(mazeObstacles(2, 2, null));
    }
}
