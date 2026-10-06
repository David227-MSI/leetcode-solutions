// LeetCode CN #42
// 題目名稱：接雨水
// 題目連結：https://leetcode.cn/problems/trapping-rain-water/
// 題目類型：雙指針 / 陣列 / 動態規劃 / 困難

class Solution {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;

        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        // 兩邊指針相遇為止
        while (left < right) {
            leftMax = Math.max(height[left], leftMax);
            rightMax = Math.max(height[right], rightMax);

            // 依照左高還是右低來選擇移動左邊還是右邊
            if (leftMax < rightMax) {
                totalWater += leftMax - height[left];
                left++;
            } else {
                totalWater += rightMax - height[right];
                right--;
            }
        }
        return totalWater;
    }
}