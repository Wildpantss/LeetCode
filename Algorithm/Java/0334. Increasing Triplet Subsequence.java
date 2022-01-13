class Solution {
    public boolean increasingTriplet(int[] nums) {
        // maybe O(n)
        // find min and secondary_min ones
        int min = 2147483647;
        int secondary_min = 2147483647;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] <= min) { // min
                min = nums[i];
            } else if (nums[i] <= secondary_min) { // sec min after that min
                secondary_min = nums[i];
            } else { // tuple found
                return true;
            }
        }
        return false;
    }
}
