# 121. Best Time to Buy and Sell Stock 

## 📘 Problem Statement

You are given an array `prices` where `prices[i]` represents the price of a given stock on the *i-th* day.  

You want to maximize your profit by choosing:
1. A single day to **buy** one stock, and  
2. A different day in the future to **sell** that stock.  

Return the **maximum profit** you can achieve.  
If no profit is possible, return `0`.

---

## 💡 Intuition

To maximize profit, we need to **buy at the lowest price before selling at a higher price**.  
Thus, the task reduces to:
- Tracking the **minimum stock price so far** (`cur`), and  
- Calculating the maximum profit by comparing the current price with this minimum.

---

## 🧠 Approach

1. Initialize:
   - `cur` as the first price (minimum so far).  
   - `max` as `0` (maximum profit).  
2. Traverse the array:
   - If the current price is lower than `cur`, update `cur`.  
   - Otherwise, calculate profit `prices[i] - cur` and update `max`.  
3. Return `max`.

---

## ⏱️ Complexity

- **Time Complexity:** $$O(n)$$  
  Single pass through the array.  

- **Space Complexity:** $$O(1)$$  
  Only constant extra space used.

---

## 🧪 Examples

### Example 1
```java
Input:  prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6).
