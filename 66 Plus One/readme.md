# ➕ 66. Plus One | LeetCode Easy

## 📘 Problem Statement

You are given a large integer represented as an integer array `digits`, where each `digits[i]` is the *i-th* digit of the integer.  
The digits are ordered from **most significant to least significant** in left-to-right order.  
There are **no leading zeros**.

🔧 Task: Increment the large integer by **one** and return the resulting array of digits.

---

## 💡 Intuition

We need to simulate how we add `+1` to a number from the **least significant digit**, carrying over if needed.  
If a digit is less than 9, just add 1 and return.  
If it's a 9, make it 0 and carry the 1 to the left.

---

## 🧠 Approach

1. Traverse the digits array from the end.
2. If the current digit is not 9:
   - Add 1 and return the array.
3. If the current digit is 9:
   - Set it to 0 and continue the loop.
4. If the loop completes, all digits were 9.
   - Return a new array with a leading 1 followed by zeros.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
  Where `n` is the length of the digits array.

- **Space Complexity:** $$O(n)$$  
  In the worst case (e.g., `[9,9,9]`), a new array of size `n+1` is returned.

---

## 🧪 Examples

### Example 1:
```java
Input:  digits = [1,2,3]
Output: [1,2,4]
Explanation: 123 + 1 = 124
