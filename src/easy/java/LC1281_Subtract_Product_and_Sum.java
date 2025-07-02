// LeetCode CN #1281
// 題目名稱：整數的各位積和差
// 題目連結：https://leetcode.cn/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
// 題目類型：Java / 簡單

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int prod = 1;
        while (n > 0) {
            prod *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return prod - sum;
    }
}