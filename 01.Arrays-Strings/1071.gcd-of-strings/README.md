# 1071. Greatest Common Divisor of Strings
### Difficulty
Easy

### Problem
https://leetcode.com/problems/greatest-common-divisor-of-strings/

### Approach
* **Base Root Check:** We first verify if both strings share a common periodic base by checking if `(str1 + str2).equals(str2 + str1)`. If they don't match, it's mathematically impossible for them to share a common divisor, so we immediately return `""`.
* **Mathematical GCD Connection:** If the base check passes, the length of the largest common divisor string must be equal to the Greatest Common Divisor (GCD) of the lengths of both strings.
* **Efficient Slicing:** We compute the GCD length using the Euclidean Algorithm and then simply extract that prefix from `str1` using `substring(0, gcdLength)`.

### Complexity
* **Time:** $\mathcal{O}(n + m)$ — Where $n$ and $m$ are the lengths of `str1` and `str2`. The string concatenation and `.equals()` check take linear time. The helper GCD method runs in logarithmic time $\mathcal{O}(\log(\min(n, m)))$, which is negligible.
* **Space:** $\mathcal{O}(n + m)$ — Due to the creation of new temporary string instances during the concatenation step in the heap memory.

### Notes
Good practice for:
* **Mathematical Intuition:** Reducing a complex string pattern-matching problem down to a simple numerical GCD calculation.
* **Defensive Checking:** Using a fast concatenation check at the very beginning to eliminate invalid inputs immediately.
* **Euclidean Algorithm:** Implementing a classic, efficient mathematical algorithm (`gcd`) manually within Java.
