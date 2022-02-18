class Solution {
    public int findCenter(int[][] edges) {
        // 任意两条边都有公共点，该点即为中心
        // O(1)
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) return edges[0][0];
        if (edges[0][1] == edges[1][0] || edges[0][1] == edges[1][1]) return edges[0][1];
        return 0;
    }
}
