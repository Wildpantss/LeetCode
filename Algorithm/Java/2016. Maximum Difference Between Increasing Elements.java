class Solution {
    public int maximumDifference(int[] nums) {
        int res = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length ; ++i){
            min = Math.min(min,nums[i]); // current min
            res = Math.max(res,nums[i]-min);
        }
        return res == 0 ? -1 : res;
    }
}
