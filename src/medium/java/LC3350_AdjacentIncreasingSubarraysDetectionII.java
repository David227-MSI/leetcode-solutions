// LeetCode CN #3350
// 題目名稱：检测相邻递增子数组 II / Adjacent Increasing Subarrays Detection II
// 題目連結：https://leetcode.cn/problems/adjacent-increasing-subarrays-detection-ii/
// 題目類型：Array / Greedy / Sliding Window（實作為O(n)一遍掃描） 中等

class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int ans = 0, preCnt = 0, cnt = 0;
        for (int i = 0; i < nums.size(); i++) {
            cnt++;
            if (i == nums.size() - 1 || nums.get(i) >= nums.get(i + 1)) {
                ans = Math.max(ans, Math.max(cnt / 2, Math.min(cnt, preCnt)));
                preCnt = cnt;
                cnt = 0;
            }
        }
        return ans;
    }
}