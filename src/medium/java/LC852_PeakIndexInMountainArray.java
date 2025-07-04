// LeetCode CN #852
// 題目名稱：山脈陣列的峰頂索引
// 題目連結：https://leetcode.cn/problems/peak-index-in-a-mountain-array/
// 題目類型：二分搜尋 / 陣列 / Medium

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length -1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}