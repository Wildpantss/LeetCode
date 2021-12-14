class Solution {
    public int numOfPairs(String[] nums, String target) {
        int length = nums.length;
        int cnt = 0;
        for (int i = 0; i < length; ++i) {
            for (int j = 0; j < length; ++j) {
                if ((nums[i] + nums[j]).equals(target) && i != j) cnt ++;
            }
        }
        return cnt;
    }
}