class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // hashmap
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        
        for (int i = 0; i < nums.length; ++i) {
            int curVal = nums[i];
            if (!map.containsKey(curVal)) {
                map.put(curVal, i);
            } 
            else {
                int formerIdx = map.get(curVal);
                if (Math.abs(formerIdx - i) <= k) return true;
                else map.put(curVal, i); // refresh new hash
            }
        }
        return false;
    }
}
