// LeetCode CN #3345
// 題目名稱：最小可整除數位乘積 I
// 題目連結：https://leetcode.cn/problems/smallest-divisible-digit-product-i/
// 題目類型：模擬 / 簡單

class Solution {
    public int smallestNumber(int n, int t) {
        int curr = n;
        while (true) {
            int product = 1;
            int temp = curr;
            while (temp > 0) {
                product *= temp % 10;
                temp = temp / 10;
            }
            if (product % t == 0) {
                return curr;
            }
            curr++;
        }
    }
}