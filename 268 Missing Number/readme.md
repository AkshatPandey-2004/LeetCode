# ❓ 268. Missing Number | LeetCode Easy

## 📘 Problem Statement

You are given an array `nums` containing `n` **distinct** numbers in the range `[0, n]`.  
Your task is to return the **only number** in this range that is **missing** from the array.

---

## 💡 Intuition

The complete range from `0` to `n` contains `n + 1` numbers.  
If we compute the **expected sum** of the full range and subtract the **actual sum** of the given array, we get the missing number.

---

## 🧠 Approach

- Use the formula for sum of first `n` natural numbers:  
  `Sum = n * (n + 1) / 2`
- Calculate the sum of the array.
- Subtract the array sum from the expected sum to get the missing number.

✅ The solution uses **O(1) space** and **O(n) time**.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
- **Space Complexity:** $$O(1)$$

---

## 🧪 Examples

### Example 1:
```java
Input:  nums = [3,0,1]
Output: 2
Explanation: Full range is [0,1,2,3]. 2 is missing.
