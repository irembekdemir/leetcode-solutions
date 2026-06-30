# 3. Longest Substring Without Repeating Characters

### Difficulty
**Medium**

### Problem

https://leetcode.com/problems/longest-substring-without-repeating-characters/

### Approach

- **Sliding Window & HashMap:** We use a sliding window defined by two pointers, `left` and `right`, to track the current substring without duplicate characters.
- **Memory Tracking:** A `HashMap` stores the characters we have seen as keys and their most recent indices as values.
- **Window Shrinking:** As the `right` pointer expands the window, if we encounter a character that is already inside the current window (`charMap.get(currentChar) >= left`), we instantly shrink/shift the `left` pointer to `index + 1` of that repeated character.
- **Updating Max Length:** At each step, we update the maximum length found so far using `Math.max(maxLen, right - left + 1)`.

### Complexity

- **Time:** $O(n)$ — We iterate through the string of length $n$ exactly once using the `right` pointer. Hash map lookups and updates take $O(1)$ time.
- **Space:** $O(min(m, n))$ — In the worst case, the size of the HashMap is bounded by the size of the string ($n$) or the size of the alphabet/character set ($m$).

### Notes

Good practice for:
- Sliding Window technique (Dynamic size)
- Two pointers strategy
- Using HashMap to optimize window shrinking from $O(2n)$ to $O(n)$
- Handling string manipulation edge cases (e.g., empty strings, all unique characters)
