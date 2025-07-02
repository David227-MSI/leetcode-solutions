-- LeetCode CN #1068
-- 題目連結：https://leetcode.cn/problems/product-sales-analysis-i/
-- 難度：簡單（Easy）

SELECT p.product_name as product_name, s.year as year, s.price as price
FROM PRODUCT AS p
    JOIN Sales AS s on p.product_id = s.product_id;