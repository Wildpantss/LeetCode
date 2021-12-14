class Solution {
    public int findLHS(int[] nums) {
        // use a map to store how many times the element appears
        Map<Integer, Integer> countMap = new HashMap<>(nums.length);
        int lhs = 0;

        for (int num : nums) { // init countMap
            countMap.put(num, countMap.getOrDefault(num, 0) + 1); // not contains key, put 0 + 1, otherwise put returnVal + 1;
        }

        for (int key : countMap.keySet()) {
            if (countMap.containsKey(key + 1)) {
                lhs = Math.max(lhs, countMap.get(key) + countMap.get(key + 1));
            }
        }
        return lhs;
    }
}