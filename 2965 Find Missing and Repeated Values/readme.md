# 🔍 2965. Find Missing and Repeated Values | LeetCode Easy

## 🧠 Problem Statement

You are given a `0-indexed` 2D integer matrix `grid` of size `n * n` with values in the range `[1, n^2]`.  
Each integer appears exactly once **except**:
- One number `a` that appears **twice** (repeated)
- One number `b` that is **missing**

Your task is to find both `a` and `b`.

### ✨ Return:
A 0-indexed integer array `ans` of size 2 where:
- `ans[0]` = repeated number `a`
- `ans[1]` = missing number `b`

---

## 💡 Intuition

If every number from `1` to `n^2` appeared once, then their **sum** would be `n^2 * (n^2 + 1) / 2`.

Since one number is **repeated** and another is **missing**, the total sum of `grid` will be slightly off.  
We can use a `HashSet` to track duplicates and calculate the difference between the expected and actual sums to find the missing number.

---

## 🧠 Approach

1. Use a `HashSet` to track numbers seen.
2. Track the **expected sum** using a counter from `1` to `n^2`.
3. Track the **actual sum** of numbers in the grid.
4. If a number is already in the set, it's the **repeated** number.
5. The **missing** number = `expected sum - actual sum`.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n^2)$$  
  We visit every cell in the grid once.

- **Space Complexity:** $$O(n^2)$$  
  Due to the use of a `HashSet` to store up to `n^2 - 1` elements.

---

## 🧪 Examples

### Example 1:
```java
Input: grid = [[1, 3], [2, 2]]
Output: [2, 4]
