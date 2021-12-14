class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // traverse backward and compare
        int i = m - 1; // nums1's index
        int j = n - 1; // nums2's index
        int ptr = m + n - 1; // where to put

        // traverse
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) nums1[ptr--] = nums1[i--];
            if (i >= 0 && nums1[i] < nums2[j]) nums1[ptr--] = nums2[j--];
            System.out.println("i=" + i + "  j=" + j);
        }

        // handle tail
        while (j >= 0) nums1[ptr--] = nums2[j--];
    }
}