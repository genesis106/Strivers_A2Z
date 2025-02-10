package LC;

import java.util.*;

public class Q2657 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        HashSet<Integer> seenElements = new HashSet<>();
        int[] prefixCommon = new int[n];
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            if (seenElements.contains(A[i])) {
                commonCount++;
            } else {
                seenElements.add(A[i]);
            }

            if (seenElements.contains(B[i])) {
                commonCount++;
            } else {
                seenElements.add(B[i]);
            }

            prefixCommon[i] = commonCount;
        }

        return prefixCommon;
    }
}
