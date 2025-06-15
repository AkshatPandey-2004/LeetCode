# 🧩 88. Merge Sorted Array | LeetCode Easy

## 📘 Problem Statement

You are given two integer arrays `nums1` and `nums2`, both sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2`, respectively.

🔹 `nums1` has a length of `m + n` where the first `m` elements denote the elements to be merged, and the last `n` elements are `0` (placeholders).  
🔹 Merge `nums2` into `nums1` as one sorted array **in-place**.

The result should be stored inside `nums1`.

---

## 💡 Intuition

To merge two sorted arrays, we can compare elements from both arrays one-by-one and place the smallest one into a new array. After finishing both arrays, we copy the result back into `nums1`.

Although the problem asks for an in-place solution, this approach uses an auxiliary array for clarity and simplicity.

---

## 🧠 Approach

1. Use three pointers:
   - `i` to traverse `nums1` (up to `m`)
   - `j` to traverse `nums2`
   - `k` to build a merged array
2. Compare `nums1[i]` and `nums2[j]` and insert the smaller value into `arr[k]`.
3. Once one array is exhausted, copy the rest of the other array.
4. Copy the final merged result from `arr[]` back into `nums1`.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(m + n)$$  
  Every element from both arrays is visited once.

- **Space Complexity:** $$O(m + n)$$  
  An additional array is used to store the result before copying into `nums1`.

> 📝 *A follow-up asks to do this in-place with constant space. That can be achieved by filling from the end of `nums1` backward.*

---

## 🧪 Examples

### Example 1:
```java
Input: nums1 = [1,2,3,0,0,0], m = 3
       nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
