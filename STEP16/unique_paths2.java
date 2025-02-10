package STEP16;

public class unique_paths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1){return 0;}
        int[][] dp=new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        for(int i=0;i<)
for(int i=0;i<obstacleGrid.length;i++){
    dp[]
}

        return helper(0,0,obstacleGrid);
    }
    public int helper(int start, int end, int[][] obstacleGrid){
        if(start==obstacleGrid.length-1&&end==obstacleGrid[0].length-1){return 1;}
        if(start==obstacleGrid.length||end==obstacleGrid[0].length||obstacleGrid[start][end]==1){
            return 0;
        }
        return helper(start+1, end, obstacleGrid)+helper(start, end+1, obstacleGrid);
    }
}
