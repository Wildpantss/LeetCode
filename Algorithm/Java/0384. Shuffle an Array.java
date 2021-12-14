class Solution {
    List<Integer> init;
    int[] save;
    int[] change;
    public Solution(int[] nums) {
        init = new ArrayList<>();
        save = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            init.add(nums[i]);
            save[i] = nums[i];
        }
    }
    
    public int[] reset() {
        return save;
    }
    
    public int[] shuffle() {
        change = new int[save.length];
        Collections.shuffle(init);
        for(int i=0;i<save.length;i++){
            change[i] = init.get(i);
        }
        return change;
    }
}