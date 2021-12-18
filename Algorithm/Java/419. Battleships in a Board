class Solution {
    
    boolean[][] visited;
    int yRange, xRange;

    public int countBattleships(char[][] board) {
        // init 
        yRange = board.length;
        xRange = board[0].length;
        visited = new boolean[yRange][xRange];
        int cnt = 0;

        // traverse board
        for (int i = 0; i < yRange; ++i) {
            for(int j = 0; j < xRange; ++j) {
                int dfsCounter = dfs(board, j, i);
                if (dfsCounter > 0) cnt++;
            }
        }

        return cnt;
    }

    private int dfs(char[][] board, int x, int y) {
        // out of bounds, . or visited, return directly.
        if (x < 0 || x >= xRange || y < 0 || y >= yRange) return 0;
        else if (board[y][x] == '.') {
            visited[y][x] = true;
            return 0;
        } else if (visited[y][x]) return 0;
        // current item is 'X'
        visited[y][x] = true; // tag visited
        int up = dfs(board, x, y-1);
        int down = dfs(board, x, y+1);
        int left = dfs(board, x-1, y);
        int right = dfs(board, x+1, y);
        return up + down + left + right + 1;
    }
}
