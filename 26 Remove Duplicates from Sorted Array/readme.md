# 🔁 26. Remove Duplicates from Sorted Array | LeetCode Easy

## 📘 Problem Statement

Given an **integer array `nums` sorted in non-decreasing order**, remove the duplicates **in-place** such that each unique element appears **only once**. The relative order of the elements should be preserved.

Then return the number of unique elements `k`.  
Your task is to:

- Modify the input array `nums` in-place to hold the `k` unique elements in the first `k` positions.
- Return `k`.

📌 The values beyond `k` in `nums` do not matter.

---

## 💡 Intuition

Since the array is already sorted, duplicates will be **adjacent**.  
We can use the **two-pointer technique**:

- `i` keeps track of the position to place the next unique element.
- `j` traverses through the array to find unique values.

---

## 🧠 Approach

1. Initialize two pointers `i = 0`, `j = 0`.
2. Iterate through the array with `j`.
3. Whenever a new value different from `nums[i]` is found:
   - Increment `i` and copy `nums[j]` to `nums[i]`.
4. Return `i + 1`, which represents the count of unique elements.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
  We traverse the array once.

- **Space Complexity:** $$O(1)$$  
  We use only constant extra space.

---

## 🧪 Examples

### Example 1:

```java
Input: nums = [1,1,2]
Output: 2
Modified nums: [1,2,_]
