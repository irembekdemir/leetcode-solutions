import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer, Integer> check = new HashMap <Integer, Integer>();

        for (int i=0; i< nums.length; i++){
            int current = nums[i];
            int wanted = target - current;

            if(check.containsKey(wanted)){
                return new int[] {check.get(wanted), i};

            }

            check.put(current, i);

        }

        return new int[] {};

    }
}
