class Solution {
    public int dominantIndex(int[] nums) {
       int max = -0x3f3f3f3f;
       int sec = -0x3f3f3f3f;
       int index = -1;

        // traverse to find max and second
       for (int i = 0; i < nums.length; ++i) {
           if (nums[i] > max) {
               sec = max;
               max = nums[i];
               index = i;
           }
           else if (nums[i] > sec) {
               sec = nums[i];
           }
       }

        return (max >= 2*sec) ? index : -1;
    }
}
