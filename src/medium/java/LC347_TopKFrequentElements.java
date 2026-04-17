// LeetCode CN #347
// 題目名稱：前 K 個高頻元素
// 題目連結：https://leetcode.cn/problems/top-k-frequent-elements/
// 題目類型：哈希表 / 優先隊列 (Priority Queue) / 中等

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // 少的會放前面
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        // 放入時自動排序
        for (int s : map.keySet()) {
            pq.add(s);
            if (pq.size() > k) {
                // 丟出最小的
                pq.poll();
            }
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}