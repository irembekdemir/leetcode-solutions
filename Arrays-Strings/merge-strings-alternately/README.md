# 1768. Merge Strings Alternately

### Difficulty
**Easy**

### Problem

https://leetcode.com/problems/merge-strings-alternately/

### Approach

- **Simultaneous Traversal:** We iterate through both strings up to the `maxLength` (the length of the longer string) using a single `for` loop.
- **Alternating Append:** In each iteration, we check if the current index `i` is within the bounds of `word1` and `word2`. If it is, we alternately append the characters to a `StringBuilder`.
- **Handling Unequal Lengths:** If one string is shorter, its bound check (`i < word.length()`) will naturally fail, and the algorithm will seamlessly continue appending only the remaining characters of the longer string.

### Complexity

- **Time:** $O(n)$ — Where $n$ is the length of the longer string. We perform a single loop that runs exactly `maxLength` times.
- **Space:** $O(n)$ — We use a `StringBuilder` to store the resulting merged string, which requires space proportional to the total number of characters in both strings ($n = \text{word1.length()} + \text{word2.length()}$).

### Notes

Good practice for:
- Efficient string manipulation using `StringBuilder` in Java (avoids unnecessary string allocations)
- Handling edge cases where input strings have unequal lengths
- Clean loop-bound condition checks inside a single traversal
