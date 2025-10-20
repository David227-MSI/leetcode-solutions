// LeetCode CN #2011
// 題目名稱：操作後變得更大的變數值
// 題目連結：https://leetcode.cn/problems/final-value-of-variable-after-performing-operations/
// 題目類型：簡單（Easy）

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String i : operations) {
            ans += i.charAt(1) == '+' ? 1 : -1;
        }
        return ans;
    }
}