class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDist = 0x3f3f3f3f;
        int index = -1;
        //  traverse points
        for (int i = 0; i < points.length; ++i) {
            int currentX = points[i][0]; 
            int currentY = points[i][1];
            if (currentX == x || currentY == y) {
                int dist = Math.abs(x-currentX) + Math.abs(y-currentY);
                if (dist < minDist) {
                    minDist = dist;
                    index = i;
                }
            }
        }
        return index;
    }
}