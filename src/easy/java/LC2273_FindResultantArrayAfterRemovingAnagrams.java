// LeetCode CN #2273
// 題目名稱：移除字母異位詞後的結果數組
// 題目連結：https://leetcode.cn/problems/find-resultant-array-after-removing-anagrams/
// 題目類型：字串 / 陣列 / 簡單

class Solution {
    public List<String> removeAnagrams(String[] words) {
        // 先抓取第一個字串
        char[] base = words[0].toCharArray();
        Arrays.sort(base);
        // 當有不是字母異位詞，一一替換
        int k = 1;
        for (int i = 1; i < words.length; i++) {
            char[] s = words[i].toCharArray();
            Arrays.sort(s);
            // 不同時取出，從下標k開始替換
            if (!Arrays.equals(s, base)) {
                base = s;
                words[k++] = words[i];
            }
        }
        // 利用copyOf方法配合k，返回長度為k的新列表
        return Arrays.asList(Arrays.copyOf(words, k));
    }
}