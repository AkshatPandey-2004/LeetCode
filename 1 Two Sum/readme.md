# 🔢 1. Two Sum | LeetCode Easy

## 📘 Problem Statement

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

You **may not** use the same element twice, and you can return the answer in **any order**.

🔒 Exactly one valid solution exists for each input.

---

## 💡 Intuition

The brute force way would be to check every pair and see if they add up to the target, but that would take $$O(n^2)$$ time.

Instead, we can reduce the time complexity to linear $$O(n)$$ by using a hash map to store elements and their indices as we iterate through the array.

---

## 🧠 Approach

1. Create a `HashMap` to store each number and its index.
2. For each number in the array:
   - Compute the complement: `target - current number`
   - If the complement exists in the map, return its index and the current index.
   - Otherwise, store the current number and its index in the map.
3. Return the result once a valid pair is found.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
  We iterate through the array only once.

- **Space Complexity:** $$O(n)$$  
  We use extra space for the hash map.

---

## 🧪 Examples

### Example 1:
```java
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] = 2 + 7 = 9
