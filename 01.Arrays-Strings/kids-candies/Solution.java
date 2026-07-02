import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        
        int maxCandy = 0;
        for (int candy : candies){
            if(candy> maxCandy){
                maxCandy = candy;
            }
        }

        for (int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies >= maxCandy){
                result.add(true);
            }else{
                result.add(false);
            }
        }

        return result;
    }
}