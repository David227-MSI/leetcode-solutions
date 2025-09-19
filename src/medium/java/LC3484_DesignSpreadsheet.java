// LeetCode CN #3484
// 題目名稱：設計電子表格 (Design Spreadsheet)
// 題目連結：https://leetcode.cn/problems/design-spreadsheet/
// 題目類型：設計 / 哈希表 / 模擬（中等）

class Spreadsheet {
    private final Map<String, Integer> data = new HashMap<>();

    public Spreadsheet(int rows) {

    }

    public void setCell(String cell, int value) {
        data.put(cell, value);
    }

    public void resetCell(String cell) {
        data.remove(cell);
    }

    public int getValue(String formula) {
        int ans = 0;
        for (String cell : formula.substring(1).split("\\+")) {
            if (Character.isUpperCase(cell.charAt(0))) {
                ans += data.getOrDefault(cell, 0);
            } else {
                ans += Integer.parseInt(cell);
            }
        }
        return ans;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */