# 📈 643. Maximum Average Subarray I | LeetCode Easy

## 📘 Problem Statement

You are given an integer array `nums` consisting of `n` elements and an integer `k`.  
Find a **contiguous subarray** whose length is equal to `k` that has the **maximum average value**, and return this value.  

Any answer with a **calculation error less than 10⁻⁵** will be accepted.

---

## 💡 Intuition

To find the maximum average of a subarray of length `k`, we can maintain a **sliding window** of size `k` and update the sum as the window slides across the array.

---

## 🧠 Approach

1. Compute the sum of the first `k` elements.
2. Slide the window one element at a time:
   - Subtract the element that’s sliding out of the window.
   - Add the element that’s sliding into the window.
3. Update the maximum average found so far.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
  Only one pass through the array using a sliding window.

- **Space Complexity:** $$O(1)$$  
  Only variables for tracking sum and max are used.

---

## 🧪 Examples

### Example 1
```java
Input:  nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
