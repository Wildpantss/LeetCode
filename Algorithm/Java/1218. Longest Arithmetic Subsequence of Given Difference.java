class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int[] hash = new int[200005];
        int res = 0;
        for(int i : arr) {
            int cnt = hash[i - difference + 100001] + 1;
            res = Math.max(cnt, res);
            hash[i + 100001] = cnt;
        }
        return res;
    }
}