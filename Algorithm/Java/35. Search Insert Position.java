class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if (target == nums[0]) return 0;

        // binary-search
        int low = 0;
        int high = nums.length - 1;
        int mid = (low + high) / 2;

        while (low < high) {
            mid = (low + high) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            }
            if (target < nums[mid]) {
                high = mid;
            }
            if (target == nums[mid]) {
                return mid; // found
            }
        }
        
        // insert 
        if (target > nums[nums.length-1]) return nums.length;
        if (target < nums[0]) return 0;
        if (target > nums[mid]) return mid + 1;
        if (target < nums[mid]) return mid;
        return mid;
    }
}