class Solution {
    public int removeElement(int[] nums, int val) {
        
        if (nums.length == 0) return 0;

        int cnt = 0; // offset counter

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == val) {
                cnt ++;
                continue;
            }
            nums[i-cnt] = nums[i];
        }
        return nums.length - cnt;
    }
}