class Solution {
    public int maxArea(int[] height) {
        // double-pointer, O(N)
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int area = (right - left) * Math.min(leftHeight, rightHeight);
            if (area > max) max = area;
            if (leftHeight <= rightHeight) ++left;
            else --right;
        }
        return max;
    }
}
