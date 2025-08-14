// LeetCode CN #744
// 題目名稱：寻找比目标字母大的最小字母
// 題目連結：https://leetcode.cn/problems/find-smallest-letter-greater-than-target/
// 題目類型：二分查找 / 簡單

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // 初始化
        int left = 0, right = letters.length - 1, ans = 0;
        // while
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 比較對象
            char m = letters[mid];
            // 如果 mid 對應的字母大於目標字母，則更新 ans 並向左移動右邊界
            if (m > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return letters[ans];
    }
}
