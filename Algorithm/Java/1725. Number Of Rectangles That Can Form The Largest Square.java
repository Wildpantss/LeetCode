class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        // find max square length, traverse only once
        int maxLength = 0;
        int cnt = 0;
        for (int i = 0; i < rectangles.length; ++i) {
            int currentSqrLength = Math.min(rectangles[i][0], rectangles[i][1]);
            if (currentSqrLength > maxLength) {
                cnt = 1;
                maxLength = currentSqrLength;
            }
            else if (currentSqrLength == maxLength) {
                ++cnt;
            }
        }
        return cnt;
    }
}
