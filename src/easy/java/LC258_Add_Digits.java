// LeetCode CN #258
// 題目名稱：各位相加
// 題目連結：https://leetcode.cn/problems/add-digits/
// 題目類型：Java / 簡單

class Solution {
    public int addDigits(int num) {
        while(num >= 10) {
            int nextNum = 0;
            while(num > 0) {
                nextNum += num%10;
                num /= 10;
            }
            num = nextNum;
        }
        return num;
    }
}