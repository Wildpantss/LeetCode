class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (nums.length < k) return 0;
        
        Arrays.sort(nums);
        // sliding window(constantly, window size = k)
        int left = 0, right = k - 1;
        int res = Integer.MAX_VALUE;
        while (left < nums.length && right < nums.length) {
            res = Math.min(res, nums[right] - nums[left]);
            ++left;
            ++right;
        }

        return res;
    }
}
