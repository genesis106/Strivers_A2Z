package Arrays.HARD;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeIntervalsH {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            @Override
            public int compare(int[] row1, int[] row2) {
                if (row1[0] != row2[0]) {
                    return Integer.compare(row1[0], row2[0]); 
                } else {
                    return Integer.compare(row1[1], row2[1]); 
                }
            }
        });

List<int[]> result = new ArrayList<>();
        int pointer = 0;
        int length = intervals.length;
        int iterator = 0;
        while (pointer < length) {
            int[] element = new int[2];
            element[0] = intervals[pointer][0];
            int lower = intervals[pointer][1];
            while (pointer < length - 1 && lower >= intervals[pointer + 1][0]) {
                ++pointer;
            }

            element[1] = Math.max(lower,intervals[pointer][1]);
            result[iterator] = element;
            ++pointer;
            ++iterator;
        }
        int[][] shortenedResult = Arrays.copyOfRange(result, 0, iterator);
        return shortenedResult;

    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 8, 10 }, { 15, 18 }, { 2, 6 } };
        merge(intervals);
    }
}
