// LeetCode CN #3870
// 題目名稱：統計範圍內的逗號 (Count Commas in Range)
// 題目連結：https://leetcode.cn/problems/count-commas-in-range/
// 題目類型：數學 / 簡單

class Solution {
    public int countCommas(int n) {
        return Math.max(0, n - 999);
    }
}