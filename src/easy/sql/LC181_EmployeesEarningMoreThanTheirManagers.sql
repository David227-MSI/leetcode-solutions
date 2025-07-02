-- LeetCode CN #181
-- 題目連結：https://leetcode.cn/problems/employees-earning-more-than-their-managers/
-- 難度：簡單（Easy）

SELECT
    a.NAME as Employee
FROM Employee as a
         LEFT JOIN Employee as b on a.managerId = b.id
WHERE a.salary > b.salary;