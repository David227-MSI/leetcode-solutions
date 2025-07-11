// LeetCode CN #1052
// 題目名稱：愛生氣的書店老闆
// 題目連結：https://leetcode.cn/problems/grumpy-bookstore-owner/
// 題目類型：滑動窗口 / 中等

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        // 先定義一個新陣列下標為0為不生氣,1為記錄窗口內生氣時的顧客
        int[] s = new int[2];
        // 生氣時顧客最大值
        int maxS1 = 0;
        for (int i = 0; i < customers.length; i++) {
            // 計算s[0](不生氣)/s[1](生氣時)的總顧客數量
            s[grumpy[i]] += customers[i];
            // 窗口左側不能小於0
            if (i - minutes + 1 < 0) {
                continue;
            }
            maxS1 = Math.max(maxS1, s[1]);
            // 持續從左側移出，滑動窗口如果移出是生氣狀態扣除顧客數量，不計算未生氣時的顧客數量
            s[1] -= grumpy[i - minutes + 1] > 0 ? customers[i - minutes + 1] : 0;
        }
        return s[0] + maxS1;
    }
}