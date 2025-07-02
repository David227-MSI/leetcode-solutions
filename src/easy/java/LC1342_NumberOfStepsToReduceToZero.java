// LeetCode CN #1342
// 題目名稱：Number of Steps to Reduce a Number to Zero
// 題目連結：https://leetcode.cn/problems/number-of-steps-to-reduce-a-number-to-zero/
// 題目類型：Bit Manipulation / Math / Easy（簡單）

class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num != 0) {
            if(num % 2 == 0){
                num /= 2;
            }
            else {
                num -= 1;
            }
            count ++;
        }
        return count;
    }
}