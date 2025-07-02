-- LeetCode CN #1757
-- 題目名稱：可回收且低脂的產品
-- 題目連結：https://leetcode.cn/problems/recyclable-and-low-fat-products/
-- 題目類型：SQL / 簡單

/* Write your T-SQL query statement below */
SELECT product_id FROM Products WHERE low_fats = 'Y' AND recyclable = 'Y' ;