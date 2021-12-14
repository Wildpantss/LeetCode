class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int x = m, y = n;
        for (int[] vec : ops) {
            int vec_x = vec[0];
            int vec_y = vec[1];
            x = Math.min(vec_x, x);
            y = Math.min(vec_y, y);
        }
        return x * y;
    }
}