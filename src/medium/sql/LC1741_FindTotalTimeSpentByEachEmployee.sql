-- LeetCode CN #1741
-- 題目名稱：Find Total Time Spent by Each Employee
-- 題目連結：https://leetcode.cn/problems/find-total-time-spent-by-each-employee/
-- 題目類型：SQL / Easy（簡單）

/* Write your T-SQL query statement below */
SELECT event_day AS day,emp_id,sum(out_time - in_time) AS total_time
FROM Employees
GROUP BY emp_id,event_day;