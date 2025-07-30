// LeetCode CN #2962
// 題目名稱：Count Subarrays Where Max Element Appears at Least K Times
// 題目連結：https://leetcode.cn/problems/count-subarrays-where-max-element-appears-at-least-k-times/
// 題目類型：滑動窗口 / 中等

class Solution {
    public long countSubarrays(int[] nums, int k) {
        // 計算最大數字
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }
        long ans = 0;
        int contMax = 0, left = 0;
        // 最大數字個數
        for (int mx : nums) {
            if (mx == max) {
                contMax++;
            }
            // 縮小窗口，直到最大數字統計小於k ，此時left的左方為全部符合條件
            while (contMax == k) {
                if (nums[left] == max) {
                    contMax--;
                }
                left++;
            }
            // 右邊固定，數量為左到右所有數組
            ans += left;
        }
        return ans;
    }
}