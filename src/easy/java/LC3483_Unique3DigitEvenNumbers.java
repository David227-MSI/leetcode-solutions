// LeetCode CN #3483
// 題目名稱：不同三位偶數的數目 (Unique 3-Digit Even Numbers)
// 題目連結：https://leetcode.cn/problems/unique-3-digit-even-numbers/
// 題目類型：陣列 / 雜湊表 / 枚舉 / 簡單

class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int n = digits.length;

        // 枚舉百位數
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) {
                continue;
            }

            // 枚舉十位數
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }

                // 枚舉個位數
                for (int k = 0; k < n; k++) {
                    if (k == j || k == i) {
                        continue;
                    }

                    if (digits[k] % 2 != 0) {
                        continue;
                    }

                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    set.add(number);
                }
            }
        }
        return set.size();
    }
}