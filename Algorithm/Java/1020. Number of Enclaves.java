class Solution {
    
    boolean[][] visited;
    int[][] grid;

    public int numEnclaves(int[][] grid) {
        // init global var
        this.visited = new boolean[grid.length][grid[0].length];
        this.grid = grid;

        int cnt = 0;
        for (int row = 0; row < grid.length; ++row) {
            for (int col = 0; col < grid[0].length; ++col) {
                DfsRes curRes = dfs(row, col);
                if (curRes.area > 0 && curRes.border == false) cnt += curRes.area;
            }
        }
        return cnt;
    }

    private DfsRes dfs(int row, int col) {
        if (this.grid[row][col] == 0 || visited[row][col] == true) return new DfsRes(0, false); //visited
        // if current point is land and not visited
        DfsRes res = new DfsRes(1, false);
        visited[row][col] = true;
        
        // recursive dfs
        if (row > 0) {
            DfsRes curRes = dfs(row-1, col);
            res.area += curRes.area;
            res.border = res.border || curRes.border;
        }
        if (row < this.grid.length-1) {
            DfsRes curRes = dfs(row+1, col);
            res.area += curRes.area;
            res.border = res.border || curRes.border;
        }
        if (col > 0) {
            DfsRes curRes = dfs(row, col- 1);
            res.area += curRes.area;
            res.border = res.border || curRes.border;
        }
        if (col < this.grid[0].length-1) {
            DfsRes curRes = dfs(row, col+1);
            res.area += curRes.area;
            res.border = res.border || curRes.border;
        }
        if (row == 0 || col == 0 || row == this.grid.length-1 || col == this.grid[0].length-1) res.border = true;

        return res;
    }

    class DfsRes {
        int area;
        boolean border;
        DfsRes(int area, boolean border) {
            this.area = area;
            this.border = border;
        }
    }
}
