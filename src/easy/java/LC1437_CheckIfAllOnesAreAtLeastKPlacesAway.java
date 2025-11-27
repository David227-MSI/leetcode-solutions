// LeetCode #1437
// 題目名稱：是否所有 1 都至少相隔 k 個元素
// 題目連結：https://leetcode.cn/problems/check-if-all-1s-are-at-least-k-places-away/
// 題目類型：陣列 / 簡單

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int last1 = -k - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                continue;
            }
            if (i - last1 <= k) {
                return false;
            }
            last1 = i;
        }
        return true;
    }
}