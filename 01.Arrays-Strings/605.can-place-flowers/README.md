# 605. Can Place Flowers

**Difficulty:** Easy

**Problem:** [https://leetcode.com/problems/can-place-flowers/](https://leetcode.com/problems/can-place-flowers/)

### Approach
* **Greedy Single-Pass:** We scan the `flowerbed` array from left to right. Whenever we find an empty plot (`0`), we check if we can place a flower there without violating the adjacent-flower rule.
* **Boundary and Neighborhood Checks:** For any index `i` to be valid for planting, three conditions must be met:
  1. The current plot itself must be empty (`flowerbed[i] == 0`).
  2. The left plot must be empty or `i` must be the first plot (`i == 0 || flowerbed[i - 1] == 0`).
  3. The right plot must be empty or `i` must be the last plot (`i == flowerbed.length - 1 || flowerbed[i + 1] == 0`).
* **Early Exit Optimization:** If all conditions are satisfied, we plant a flower by setting `flowerbed[i] = 1` and decrementing `n`. If `n` reaches `0` at any point during the loop, we immediately return `true` without scanning the rest of the array.

### Complexity
* **Time:** $O(N)$ — Where $N$ is the length of the `flowerbed` array. We iterate through the array at most once.
* **Space:** $O(1)$ — We modify the input array in-place and only use a few primitive variables for state checking, consuming constant extra memory.

### Notes
Good practice for:
* **Boundary Handling:** Managing edge cases seamlessly (like the very first and very last elements) without throwing `ArrayIndexOutOfBoundsException`.
* **Greedy Algorithm:** Making the locally optimal choice at each stage (planting a flower at the earliest possible valid spot) to find the global solution.
* **Early Termination:** Optimizing runtime by stopping execution the exact moment the problem's goal ($n = 0$) is satisfied.