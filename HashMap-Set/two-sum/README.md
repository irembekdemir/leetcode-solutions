# 1. Two Sum

### Difficulty
**Easy**

### Problem

https://leetcode.com/problems/two-sum/

### Approach

- **Hash Map for Tracking:** We use a `HashMap` named `check` to store the numbers we have already iterated through as keys, and their corresponding array indices as values.
- **Complement Lookup:** For each element (`current`), we calculate the required number (`wanted`) to reach the target: `wanted = target - current`.
- **Instant Match Check:** We use `check.containsKey(wanted)` to see if this complementary number already exists in our map.
  - **If found:** We immediately return a new array containing the index of the stored number `check.get(wanted)` and the current index `i`.
  - **If not found:** We add the `current` number and its index `i` to the map using `check.put(current, i)` and move forward.

### Complexity

- **Time:** $O(n)$ — We traverse the array containing $n$ elements exactly once. Inside the loop, `containsKey`, `get`, and `put` operations on the `HashMap` take $O(1)$ constant time on average.
- **Space:** $O(n)$ — In the worst-case scenario (e.g., the matching pair is at the very end of the array), we will store up to $n$ elements in the hash map.

### Notes

Good practice for:
- Learning the fundamentals of `HashMap` (`containsKey`, `get`, `put`)
- Optimizing brute-force $O(n^2)$ time complexity to linear $O(n)$ time using extra memory
- Handling exact single-solution constraints without reusing the same element
