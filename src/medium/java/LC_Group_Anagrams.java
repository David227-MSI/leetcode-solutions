// LeetCode CN #49
// 題目名稱：字母異位詞分組
// 題目連結：https://leetcode.cn/problems/group-anagrams/
// 題目類型：哈希表 / 字串 / 中等

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 判斷strs是否為空
        if (strs == null || strs.length == 0)
            return new ArrayList<>();
        // 建立ArrayList
        Map<String, List<String>> map = new HashMap<>();
        // 拆解strs
        for (String s : strs) {
            char[] c = s.toCharArray();
            // 排序string當key
            Arrays.sort(c);
            String ca = String.valueOf(c);
            if (!map.containsKey(ca)) {
                map.put(ca, new ArrayList<>());
            }
            // 放入values (List)
            map.get(ca).add(s);
        }
        return new ArrayList<>(map.values());
    }
}