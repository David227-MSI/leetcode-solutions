// LeetCode CN #2461
// 題目名稱：最大和分割 II
// 題目連結：https://leetcode.cn/problems/maximum-sum-of-distinct-subarrays-with-length-k/
// 題目類型：滑動窗口 / 哈希表 / 中等

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long sum = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            count.merge(nums[i], 1, Integer::sum);
            int left = i - k + 1;
            // 窗口最左需符合
            if (left < 0) {
                continue;
            }
            // update 答案
            if (count.size() == k) {
                ans = Math.max(ans, sum);
            }
            int out = nums[left];
            int val = count.get(out);
            sum -= out;
            if (count.get(out) > 1) {
                count.put(out, val - 1);
            } else {
                count.remove(out);
            }
        }
        return ans;
    }
}