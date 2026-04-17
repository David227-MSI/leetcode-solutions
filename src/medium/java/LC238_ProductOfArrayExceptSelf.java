// LeetCode CN #238
// 題目名稱：除自身以外陣列的乘積
// 題目連結：https://leetcode.cn/problems/product-of-array-except-self/
// 題目類型：陣列 / 前綴綴和 / 中等

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 建立一個新的陣列
        int n = nums.length;
        int[] ans = new int[n];

        // 左側乘積
        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        // 右邊乘積
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * nums[i];
        }
        return ans;
    }
}