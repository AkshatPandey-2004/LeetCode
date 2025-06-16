# 🔁 350. Intersection of Two Arrays II | LeetCode Easy

## 📘 Problem Statement

Given two integer arrays `nums1` and `nums2`, return an array of their **intersection**.  
Each element in the result must appear **as many times as it shows in both arrays**.  
The result can be returned in **any order**.

---

## 💡 Intuition

The key is to count the frequency of elements in one array and then iterate through the second array to find matches while managing frequency.

---

## 🧠 Approach

- Use a `HashMap` to store the frequency of each number in `nums1`.
- Iterate through `nums2`:
  - If the number exists in the map, add it to the result and decrement its count.
  - Remove the number from the map when its count reaches zero.
- Finally, convert the resulting list to an array.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n + m)$$  
  Where `n` is the size of `nums1` and `m` is the size of `nums2`.

- **Space Complexity:** $$O(min(n, m))$$  
  For the frequency map and result list.

---

## 🧪 Examples

### Example 1
```java
Input:  nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
