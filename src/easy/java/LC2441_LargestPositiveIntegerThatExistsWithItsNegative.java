// LeetCode CN #2441
// 題目名稱：找出同時存在正負值的最大正整數
// 題目連結：https://leetcode.cn/problems/largest-positive-integer-that-exists-with-its-negative/
// 題目類型：簡單

class Solution {
    public int findMaxK(int[] nums) {
        // 預設答案
        int ans = -1;
        // 利用HashSet不重複特性 逐一取出nums 並比對是否已放入正負相反的同數字
        // 如有則更新答案
        var s = new HashSet<Integer>();
        for (int x : nums) {
            if (s.contains(-x))
                ans = Math.max(ans, Math.abs(x));
            s.add(x);
        }
        return ans;
    }
}