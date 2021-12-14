class Solution {
    public String[] findRelativeRanks(int[] score) {
        int length = score.length;
        String[] res = new String[length];
        
        int[][] tmp = new int[length][2]; // tmp[i][0] = val; tmp[i][1] = original index
        for (int i = 0; i < length; ++i) {
            tmp[i][0] = score[i];
            tmp[i][1] = i; 
        }

        // sort by tmp[i][0]
        Arrays.sort(tmp, (int[] o1, int[] o2) -> {return o2[0]-o1[0];});
        
        for (int i = 0; i < length; ++i) {
            switch (i) {
                case 0: res[tmp[i][1]] = "Gold Medal"; break;
                case 1: res[tmp[i][1]] = "Silver Medal"; break;
                case 2: res[tmp[i][1]] = "Bronze Medal"; break;
                default: res[tmp[i][1]] = Integer.toString(i+1);
            }
        }
        return res;
    }
}