class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int range = grid.length;
        int maxSum = 0;

        int[] rowMax = new int[range];
        int[] colMax = new int[range];

        // calc colMax and rowMax
        for (int i = 0; i < range; ++i) {
            for (int j = 0; j < range; ++j) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        
        // final traverse
        for (int i = 0; i < range; ++i) {
            for (int j = 0; j < range; ++j) {
                maxSum += (Math.min(rowMax[i], colMax[j]) - grid[i][j]);
            }
        }

        return maxSum;
    }
}