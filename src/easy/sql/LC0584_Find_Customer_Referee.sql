-- LeetCode CN #584
-- 題目名稱：找到獲得推薦的客戶
-- 題目連結：https://leetcode.cn/problems/find-customer-referee/
-- 題目類型：SQL / 簡單

/* Write your T-SQL query statement below */
select name
from Customer
where referee_id<>2 or referee_id is null