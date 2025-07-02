// LeetCode CN #3285. Find Indices of Stable Mountains
// 題目連結：https://leetcode.cn/problems/find-indices-of-stable-mountains/
// 難度：中等（Medium）

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List <Integer> list = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i-1] > threshold) {
                list.add(i);
            }
        }
        return list;
    }
}