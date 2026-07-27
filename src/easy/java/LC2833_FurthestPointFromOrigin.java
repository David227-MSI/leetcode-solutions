// LeetCode CN #2833
// 題目名稱：離原點最遠的距離
// 題目連結：https://leetcode.cn/problems/furthest-point-from-origin/
// 題目類型：字串 / 計數 / 簡單

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lCount = 0;
        int rCount = 0;
        int blank = 0;
        for (char s : moves.toCharArray()) {
            if (s == 'L') {
                lCount++;
            } else if (s == 'R') {
                rCount++;
            } else {
                blank++;
            }
        }
        return Math.abs(lCount - rCount) + blank;
    }
}