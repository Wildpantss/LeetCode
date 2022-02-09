class Solution {
    public int countKDifference(int[] nums, int k) {
        // hashmap solution
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            cnt += map.getOrDefault(nums[i] + k, 0) + map.getOrDefault(nums[i] - k, 0);
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return cnt;
    }
}
