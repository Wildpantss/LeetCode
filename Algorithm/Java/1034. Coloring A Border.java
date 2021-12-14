class Solution {
    boolean[][] visited;
    int yRange, xRange;
    int[][] gridCopied;

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        // init works
        this.yRange = grid.length;
        this.xRange = grid[0].length;
        this.visited = new boolean[yRange][xRange];
        int componentColor = grid[row][col];
        this.gridCopied = new int[yRange][xRange];
        for (int i = 0; i < yRange; ++i)
            for (int j = 0; j < xRange; ++j)
                gridCopied[i][j] = grid[i][j];

        //dfs
        dfs(grid, row, col, componentColor, color);
        return grid;
    }

    private void dfs(int[][] grid, int row, int col, int componentColor, int color) {
        // if out of bound or visited or not belong to current component, do nothing
        if (row < 0 || row >= yRange || col < 0 || col >= xRange) return;
        if (visited[row][col] == true) return;
        if (grid[row][col] != componentColor) return;

        // do sth for current 
        if (row == 0 || row == yRange-1 || col == 0 || col == xRange-1) { // grid border
            grid[row][col] = color; // grid border is also component border
        } 
        else if (gridCopied[row-1][col] != componentColor || gridCopied[row+1][col] != componentColor || 
                gridCopied[row][col+1] != componentColor || gridCopied[row][col-1] != componentColor) { // border
            grid[row][col] = color; // component border
        }

        visited[row][col] = true;

        dfs(grid, row + 1, col, componentColor, color);
        dfs(grid, row - 1, col, componentColor, color);
        dfs(grid, row, col + 1, componentColor, color);
        dfs(grid, row, col - 1, componentColor, color);
    }
}