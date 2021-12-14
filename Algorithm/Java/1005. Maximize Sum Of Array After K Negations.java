class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        int i = 0;
        for (; i < length; ++i) {
            if (nums[i] >= 0 || k == 0) break;
            nums[i] = -nums[i];
            --k;
        }

        if (k >= 0 && k % 2 != 0) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }

        int sum = 0;
        for (i = 0; i < length; ++i) {
            sum += nums[i];
        }
        return sum;
    }
}
