class Solution {
    public int[] findBall(int[][] grid) {
        int[] res = new int[grid[0].length];
        for (int i = 0; i < res.length; ++i) {
            res[i] = dfs(grid, 0, i);
        }
        return res;
    }

    private int dfs(int[][] grid,int i, int j) {
        if (grid[i][j] == 1) { // right
            // if current col is the most right col
            if (j == grid[0].length - 1) {
                return -1; // unable to reach to bottom
            }
            // right one in counter dir
            if (grid[i][j+1] == -1) { 
                return -1;
            }
            // if already at the bottom
            if (i == grid.length - 1)  return j + 1;
            // else
            return dfs(grid, i+1, j+1);
        }
        if (grid[i][j] == -1) { // left
            // if current col is the most left col
            if (j == 0) {
                return -1; // unable to reach to bottom
            }
            // left one in counter dir
            if (grid[i][j-1] == 1) { 
                return -1;
            }
            // if already at the bottom
            if (i == grid.length - 1)  return j - 1;
            // else
            return dfs(grid, i+1, j-1);
        }

        return -1;
    }
}
