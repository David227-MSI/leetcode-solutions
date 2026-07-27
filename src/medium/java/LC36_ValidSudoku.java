// LeetCode CN #36
// 題目名稱：有效的數獨
// 題目連結：https://leetcode.cn/problems/valid-sudoku/
// 題目類型：哈希表 / 陣列 / 中等

class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][][] box = new int[3][3][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char v = board[i][j];
                if (v == '.')
                    continue;
                int index = v - '1';
                rows[i][index]++;
                cols[j][index]++;
                box[i / 3][j / 3][index]++;
                if (rows[i][index] > 1 || cols[j][index] > 1 || box[i / 3][j / 3][index] > 1)
                    return false;
            }
        }
        return true;
    }
}