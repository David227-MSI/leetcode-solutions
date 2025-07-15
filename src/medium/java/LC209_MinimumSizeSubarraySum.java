// LeetCode CN #209
// 題目名稱：長度最小的子陣列
// 題目連結：https://leetcode.cn/problems/minimum-size-subarray-sum/
// 題目類型：滑動視窗 / 中等難度

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int sum = 0, left = 0;
        int ans = n + 1; // 初始設為不可能值，表示尚未找到

        for (int right = 0; right < n; right++) {
            sum += nums[right]; // 將當前元素加入視窗

            // 當視窗總和達到目標，嘗試縮小左邊界
            while (sum >= target) {
                ans = Math.min(ans, right - left + 1); // 更新最短長度
                sum -= nums[left]; // 縮小視窗
                left++;
            }
        }

        return ans == n + 1 ? 0 : ans;
    }
}
