package LC;

import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int candy:candies){
            max=Math.max(candy, max);
        }
        List<Boolean> result=new ArrayList<>();
        for(int candy:candies){
            result.add(candy+extraCandies>=max?true:false);
        }
        return result;
    }
}
