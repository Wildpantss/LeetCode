class Solution {
    public int maxSubArray(int[] nums) {
        
        // special case: only 1 element
        if (nums.length == 0) return 0;

        // dp: f(n) = max(f(n-1) + A[n], A[n]), return max val of dp array.
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        
        int max = dp[0];

        for (int i = 1; i< nums.length; ++i) {
            dp[i] = dp[i-1] > 0 ? dp[i-1] + nums[i] : nums[i];
            if (dp[i] > max) max = dp[i];
        }
        
        return max;
    }
}