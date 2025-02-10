package STEP3.MEDIUM;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int above = 0;
        int below = matrix.length - 1;
        while (above <= below && left <= right) {
            for (int col = left; col <= right; col++) {
                output.add(matrix[above][col]);
            }
            ++above;
            for (int row = above; row <= below; row++) {
                output.add(matrix[row][right]);
            }
            --right;
            if (above <= below) {
                for (int col = right; col >= left; col--) {
                    output.add(matrix[below][col]);
                }
            }
            --below;
            if (left <= right) {
            for (int row = below; row >= above; row--) {
                output.add(matrix[row][left]);
            }}
            ++left;
        }
        return output;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        spiralOrder(matrix);
    }
}
