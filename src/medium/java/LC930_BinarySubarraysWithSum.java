// LeetCode CN #930
// 題目名稱：和相同的二元子數組
// 題目連結：https://leetcode.cn/problems/binary-subarrays-with-sum/
// 題目類型：陣列、前綴和、哈希表 / 中等

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return windows(nums, goal) - windows(nums, goal - 1);
    }

    private int windows(int[] nums, int k) {
        int sum = 0, left = 0, ans = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }
            ans += (right - left + 1);
        }
        return ans;
    }

}