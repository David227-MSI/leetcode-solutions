// LeetCode CN #2452
// 題目名稱：距離字典兩次編輯以內的單字
// 題目連結：https://leetcode.cn/problems/words-within-two-edits-of-dictionary/
// 題目類型：字串 / 陣列 / 中等

class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list = new ArrayList<>();

        for (String q1 : queries) {
            for (String d1 : dictionary) {
                // 找到相似的的字符串就跳出找下一輪
                if (getDiff(q1, d1) <= 2) {
                    list.add(q1);
                    break;
                }
            }
        }
        return list;
    }

    private int getDiff(String a, String b) {
        int dif = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                dif++;
            }
            if (dif > 2) {
                return dif;
            }
        }
        return dif;
    }
}