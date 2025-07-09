// LeetCode CN #1343
// 題目名稱：大小為 K 且平均值大於等於閾值的子數組數量
// 題目連結：https://leetcode.cn/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i < k - 1) {
                continue;
            }
            if (sum >= k * threshold) {
                ans++;
            }
            sum -= arr[i - k + 1];
        }
        return ans;
    }