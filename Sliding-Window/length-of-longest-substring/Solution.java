/*
Problem: 3. Longest Substring Without Repeating Characters
Difficulty: Medium

Approach:
- Sliding Window & HashMap approach.
- Use 'right' pointer to expand the window and scan characters.
- Use a HashMap to store the latest index of each character.
- If a duplicate character is found inside the current window, instantly
  shrink the window by moving the 'left' pointer to 'index + 1'.
- Calculate and update the maximum length at each step.

Time Complexity: O(n) - Single pass over the string.
Space Complexity: O(min(m, n)) - Size of the character map.
*/

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
