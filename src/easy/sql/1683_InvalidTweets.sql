-- LeetCode CN #1683
-- 題目連結：https://leetcode.cn/problems/invalid-tweets/
-- 難度：簡單（Easy）

/* Write your T-SQL query statement below */
SELECT  tweet_id
FROM Tweets
WHERE len(content)>15;