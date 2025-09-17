// LeetCode CN #2349
// 題目名稱：設計數位容器系統
// 題目連結：https://leetcode.cn/problems/design-a-number-container-system/
// 題目類型：設計 / 哈希表 / 資料結構（中等）

class NumberContainers {
    private final Map<Integer, Integer> indexToNumber = new HashMap<>();
    private final Map<Integer, TreeSet<Integer>> numberToIndices = new HashMap<>();

    public NumberContainers() {

    }

    public void change(int index, int number) {
        Integer oldNumber = indexToNumber.get(index);
        if (oldNumber != null) {
            numberToIndices.get(oldNumber).remove(index);
        }

        indexToNumber.put(index, number);
        numberToIndices.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }

    public int find(int number) {
        TreeSet<Integer> indices = numberToIndices.get(number);
        return indices == null || indices.isEmpty() ? -1 : indices.first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */