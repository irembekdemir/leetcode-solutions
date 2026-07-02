## 1431. Kids With the Greatest Number of Candies

### Difficulty
Easy

### Problem
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

### Approach
1. **Find the Maximum:** First, we iterate through the `candies` array to find the current maximum number of candies (`maxCandies`) that any single child possesses.
2. **Comparison with Extra Candies:** We then iterate through the array a second time. For each child, we check if their current candy count plus the `extraCandies` is greater than or equal to `maxCandies`.
3. **Result Compilation:** If the condition is met, we append `true` to our result list; otherwise, we append `false`.

### Complexity
- **Time:** $O(n)$ — Where $n$ is the number of kids (length of the `candies` array). We perform two independent, single-pass linear scans over the array.
- **Space:** $O(1)$ — Excluding the space required for the output list, the algorithm only uses a constant amount of extra space for the `maxCandies` variable.

### Notes
Good practice for:
- Avoiding nested loops by breaking the problem into two sequential linear steps ($O(n)$ instead of $O(n^2)$).
- Modifying logic without altering the original input array data.
- Understanding the difference between primitive arrays and dynamic `List` operations in Java.
