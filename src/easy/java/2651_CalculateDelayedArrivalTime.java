// LeetCode CN #2651
// 題目名稱：Calculate Delayed Arrival Time
// 題目連結：https://leetcode.cn/problems/calculate-delayed-arrival-time/
// 題目類型：Java / Easy（簡單）

class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) %24;
    }
}