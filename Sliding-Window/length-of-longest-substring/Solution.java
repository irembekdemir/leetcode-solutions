import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();

        //int right=0;
        int left=0;
        int maxLen = 0;

        for (int right=0; right<s.length(); right++){
            char currentChar = s.charAt(right);

            if (charMap.containsKey(currentChar)&&charMap.get(currentChar)>=left){
                left = charMap.get(currentChar) +1; //currentchar is already in the maap w different index we change that's index not current one's
            }

            charMap.put(currentChar, right); //update the memory

            maxLen = Math.max(maxLen, right-left + 1);
        }

        return maxLen;
    }
}