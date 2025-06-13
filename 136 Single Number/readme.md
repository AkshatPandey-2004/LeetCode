# 🧠 XOR Trick to Find the Unique Number | LeetCode 136

## 🔍 Problem Statement
**LeetCode 136: Single Number**

Given a non-empty array of integers `nums`, every element appears **twice** except for one. Find that single one.

You must implement a solution with a **linear runtime complexity** and use only **constant extra space**.

---

## 💡 Intuition

The problem seems tricky at first, but becomes simple once we recall some properties of the XOR (`^`) operation:

- `x ^ x = 0` → XOR-ing a number with itself cancels it out.
- `x ^ 0 = x` → XOR-ing a number with 0 keeps it unchanged.

So, if we XOR all elements in the array, the duplicates cancel out and we’re left with the number that appears only once.

---

## 🧠 Approach

1. Initialize a variable `num1` as `0`.
2. Traverse the array.
3. For each number, apply XOR with `num1`.
4. After the loop, `num1` contains the single number.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
  We go through the array only once.

- **Space Complexity:** $$O(1)$$  
  We only use a single variable for computation.

---

## 🧪 Example

```java
Input: nums = [4, 1, 2, 1, 2]
Output: 4
Explanation: All numbers appear twice except 4.
