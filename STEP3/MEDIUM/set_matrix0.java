package STEP3.MEDIUM;

public class set_matrix0 {
    public void setZeroes(int[][] matrix) {
        int col0=0;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==0){
                    matrix[row][0]=-1;
                    matrix[0][col]=-1;
                    if(col==0){col0=-1;}
                }
            }
        }
        for (int i = matrix.length - 1; i >= 0; i--) {  
            for (int j = matrix[0].length - 1; j >= 0; j--) { 
                if (matrix[i][0] == -1 || matrix[0][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(col0==-1){
            for (int j = matrix.length - 1; j >= 0; j--) { 
                matrix[0][j]=0;
            }
        }
    }
}
