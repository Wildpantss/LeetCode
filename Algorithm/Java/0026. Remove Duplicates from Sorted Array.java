class Solution {
    public int removeDuplicates(int[] nums) {
        
        // special case
        if (nums.length == 1) return 1;

        int cnt = 0; // offset counter

        // traverse nums
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] == nums[i-1]) cnt ++;
            nums[i - cnt] = nums[i];            
        }
        return nums.length - cnt;
    }
}