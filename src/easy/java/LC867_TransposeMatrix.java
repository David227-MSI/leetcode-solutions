// LeetCode CN #867
// 題目名稱：轉置矩陣
// 題目連結：https://leetcode.cn/problems/transpose-matrix/
// 題目類型：二維陣列 / 模擬 / Easy

class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}