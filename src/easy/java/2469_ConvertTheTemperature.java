// LeetCode CN #2469
// 題目名稱：Convert the Temperature
// 題目連結：https://leetcode.cn/problems/convert-the-temperature/
// 題目類型：Java / 簡單

class Solution {
    public double[] convertTemperature(double celsius) {
        return new double[]{ celsius + 273.15, celsius*1.80 + 32.00 };
    }
}