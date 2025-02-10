package Arrays.MEDIUM;

public class rotate_image {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int len=matrix[i].length-1;
            for(int j=0;j<matrix[i].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][len-j];
                matrix[i][len-j]=temp;
            }
        }

    }
}
