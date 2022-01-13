class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustWhoCounter = new int[n+1];
        int[] beingTrustedCounter = new int[n+1];
        for (int i = 0; i < trust.length; ++i) {
            ++trustWhoCounter[trust[i][0]];
            ++beingTrustedCounter[trust[i][1]];
        }
            
        for (int i = 1; i < n+1; ++i) {
            if (trustWhoCounter[i] == 0 && beingTrustedCounter[i] == n-1) {
                return i;
            }
        }
        return -1;
    }
}
