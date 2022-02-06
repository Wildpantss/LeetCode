class Solution {
    public int sumOfUnique(int[] nums) {
        int[] hash = new int[102]; // init with full-zero
        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            int currentNum = nums[i]; 
            if (hash[currentNum] == 0) { // first appearance
                sum += currentNum;
            }
            else if (hash[currentNum] == 1) { // second appearance 
                sum -= currentNum;
            }
            ++hash[currentNum]; // update hash counter
        }
        return sum;
    }
}
