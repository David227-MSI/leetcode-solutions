// LeetCode CN #11
// 題目名稱：盛最多水的容器
// 題目連結：https://leetcode.cn/problems/container-with-most-water/
// 題目類型：雙指針 / 陣列 / 中等

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;

        while (left < right) {
            int width = right - left;
            // 最高高度為兩邊短的那一邊
            int waterHeight = Math.min(height[left], height[right]);
            int currentWater = width * waterHeight;
            water = Math.max(water, currentWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return water;
    }
}