class Solution {
    public String optimalDivision(int[] nums) {
        var sb = new StringBuilder();
        sb.append(nums[0]);
        if (nums.length == 1) return sb.toString();
        if (nums.length == 2) {
            sb.append('/');
            sb.append(nums[1]);
            return sb.toString();
        }
        sb.append("/(");
        for (int i = 1; i < nums.length - 1; ++i) {
            sb.append(nums[i]);
            sb.append('/');
        }
        sb.append(nums[nums.length - 1]);
        sb.append(')');
        return sb.toString();
    }
}
