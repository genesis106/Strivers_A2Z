package STEP3.MEDIUM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intervalListIntersections {
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) {
            return new int[][] {};
        }

        int firstListPOINTER = 0;
        int secondListPOINTER = 0;
        List<int[]> result = new ArrayList<>();

        while (firstListPOINTER < firstList.length && secondListPOINTER < secondList.length) {
            int start = Math.max(firstList[firstListPOINTER][0], secondList[secondListPOINTER][0]);
            int end = Math.min(firstList[firstListPOINTER][1], secondList[secondListPOINTER][1]);

            if (start <= end) {
                result.add(new int[] { start, end });
            }

            if (firstList[firstListPOINTER][1] < secondList[secondListPOINTER][1]) {
                firstListPOINTER++;
            } else {
                secondListPOINTER++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] firstList = { { 0, 2 }, { 5, 10 }, { 13, 23 }, { 24, 25 } };
        int[][] secondList = { { 1, 5 }, { 8, 12 }, { 15, 24 }, { 25, 26 } };
        intervalIntersection(firstList, secondList);
    }
}
