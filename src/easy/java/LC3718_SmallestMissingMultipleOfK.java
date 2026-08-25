// LeetCode CN #3718
// 題目名稱：缺失的最小正整數 k 的倍數
// 題目連結：https://leetcode.cn/problems/find-the-smallest-missing-multiple-of-k/
// 題目類型：陣列 / 雜湊表 / 簡單

class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int ans = k;
        while (set.contains(ans)) {
            ans += k;
        }

        return ans;
    }
}