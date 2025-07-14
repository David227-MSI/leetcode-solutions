// LeetCode CN #2958
// 題目名稱：最長交替子序列
// 題目連結：https://leetcode.cn/problems/length-of-longest-subarray-with-at-most-k-frequency/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            map.merge(nums[right], 1, Integer::sum);
            while (map.get(nums[right]) > k) {
                map.merge(nums[left], -1, Integer::sum);
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}