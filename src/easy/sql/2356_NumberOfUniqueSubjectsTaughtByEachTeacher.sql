-- LeetCode CN #2356
-- 題目連結：https://leetcode.cn/problems/number-of-unique-subjects-taught-by-each-teacher/
-- 難度：簡單（Easy）

/* Write your T-SQL query statement below */
SELECT teacher_id , COUNT (DISTINCT subject_id) as cnt
FROM Teacher
GROUP BY teacher_id;