// LeetCode CN #1695
// 題目名稱：刪除子陣列的最大得分
// 題目連結：https://leetcode.cn/problems/maximum-erasure-value/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0, sum = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}