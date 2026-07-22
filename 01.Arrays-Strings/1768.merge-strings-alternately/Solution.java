/*
Problem: 1768. Merge Strings Alternately
Difficulty: Easy

Approach:
- Traverse both strings simultaneously
- Append chars alternately

Time Complexity: O(n)
Space Complexity: O(n)
*/
class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        String max = "";
        String min = "";

        if (word1.length() >= word2.length()) {
            max = word1;
            min = word2; 
        } else {
            max = word2;
            min = word1;
        }

       for (int i = 0; i < min.length() ; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            count += 1 ;
       }

       if (count < max.length() ) {
            for (int j = count; j < max.length(); j++){
                sb.append(max.charAt(j));
            }
       }

        return sb.toString();
    }
}
    
