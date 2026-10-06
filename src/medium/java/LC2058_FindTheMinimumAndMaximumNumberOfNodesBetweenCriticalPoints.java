// LeetCode CN #2058
// 題目名稱：找出臨界點之間的最短與最長距離 (Find the Minimum and Maximum Number of Nodes Between Critical Points)
// 題目連結：https://leetcode.cn/problems/find-the-minimum-and-maximum-number-of-nodes-between-critical-points/
// 題目類型：鏈表 / 雙指針 / 中等

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        // 標記臨界點位置
        int firstIndex = -1;
        int prevIndex = -1;
        int minDistance = Integer.MAX_VALUE;

        ListNode prev = head;
        ListNode curr = prev.next;
        int currIndex = 1;

        while (curr.next != null) {
            boolean isLocalMax = prev.val < curr.val && curr.next.val < curr.val;
            boolean isLocalMin = prev.val > curr.val && curr.next.val > curr.val;

            if (isLocalMax || isLocalMin) {
                if (firstIndex == -1) {
                    // 首次
                    firstIndex = currIndex;
                } else {
                    // 當有臨界點更新則更新距離
                    minDistance = Math.min(minDistance, currIndex - prevIndex);
                }
                // 更新臨界點下標
                prevIndex = currIndex;
            }
            // 移動
            prev = curr;
            curr = curr.next;
            // 計算下標更新
            currIndex++;
        }
        if (minDistance == Integer.MAX_VALUE) {
            return new int[]{-1, -1};
        }
        int maxDistance = prevIndex - firstIndex;
        return new int[]{minDistance, maxDistance};
    }
}