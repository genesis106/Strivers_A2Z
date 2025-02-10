package STEP3.HARD;

import java.util.ArrayList;
import java.util.List;

public class Pascal_triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0) {
            return ans;
        }
        ans.add(new ArrayList<>(List.of(1)));
        if (numRows == 1) {
            return ans;
        }
        int j = 0;
        for (int i = 1; i < numRows; i++) {
            List<Integer> element = new ArrayList<>();
            element.add(1);
            int l = 0;
            for (int k = 0; k < j; k++) {
                element.add(ans.get(i - 1).get(l) + ans.get(i - 1).get(l + 1));
                ++l;
            }
            element.add(1);
            ans.add(element);++j;
        }
        return ans;
    }
}
