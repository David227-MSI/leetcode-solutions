// LeetCode CN #3484
// 題目名稱：設計電子表格 (Design Spreadsheet)
// 題目連結：https://leetcode.cn/problems/design-spreadsheet/
// 題目類型：設計 / 哈希表 / 模擬（中等）

class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");
        // 長度
        int n = a.length;
        int m = b.length;
        for (int i = 0; i < n || i < m; i++) {
            int ver1 = i < n ? Integer.parseInt(a[i]) : 0;
            int ver2 = i < m ? Integer.parseInt(b[i]) : 0;
            if (ver1 != ver2) {
                return ver1 < ver2 ? -1 : 1;
            }
        }
        return 0;
    }
}