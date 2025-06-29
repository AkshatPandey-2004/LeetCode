# 🔁 206. Reverse Linked List | LeetCode Easy

## 📘 Problem Statement

Given the `head` of a **singly linked list**, reverse the list and return the reversed list.

---

## 💡 Intuition

The problem asks us to **invert the direction** of the links in a singly linked list.  
This can be done efficiently using an iterative approach by maintaining three pointers to reverse the list in-place.

---

## 🧠 Approach

- Start with two pointers:
  - `head`: Tracks the reversed list.
  - `p`: Tracks the remaining list to be processed.
- Loop through the list:
  - Store the next node.
  - Reverse the current node’s pointer.
  - Move the head and processing pointer forward.
- Return the new head of the reversed list.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
  Each node is visited once.

- **Space Complexity:** $$O(1)$$  
  The list is reversed in-place without extra memory.

---

## 🧪 Examples

### Example 1
```java
Input:  head = [1,2,3,4,5]
Output: [5,4,3,2,1]
