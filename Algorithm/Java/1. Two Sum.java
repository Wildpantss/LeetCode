class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
        
        if (nums == null && nums.length == 0) return res; //special case

        // map (k-v : elementVal-index)
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; ++i) {
            // try to find complement
            if (map.containsKey(target - nums[i])) {
                // if found
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                return res;
            }
            // add into map
            map.put(nums[i], i);
        }
        return res;
    }
}