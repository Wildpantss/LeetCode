class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length == 0 || nums == null) return;
        int length = nums.length;
        int p1 = -1, p2 = 0;

        for (int i = length - 1; i > 0; --i) {
            if (nums[i] > nums[i-1]) {
                p1 = i - 1;
                break;
            }
        }

        if (p1 == -1) { // if not found, no larger possibility, sort to min
            reverse(nums, 0, length);
            return;
        }
        else { // find next
            for (int i = length - 1; i > p1; --i) {
                if (nums[i] > nums[p1]) {
                    p2 = i;
                    break;
                }
            }
            int t = nums[p1]; nums[p1] = nums[p2]; nums[p2] = t; //swap p1, p2
            reverse(nums, p1 + 1, length);
        }
    }

    private void reverse(int[] nums, int start, int end) {
        for (int i = start,j = end - 1; i < j; i++,j--) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
    
}