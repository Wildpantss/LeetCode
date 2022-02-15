class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int[] rowMin = new int[matrix.length];
        int[] colMax = new int[matrix[0].length];

        // traverse to find row min and col max
        for (int i = 0; i < matrix.length; ++i) { // row min
            int min = Integer.MAX_VALUE;
            for (int j = 0; j <matrix[0].length; ++j) {
                min = Math.min(min, matrix[i][j]);
            }
            rowMin[i] = min;
        }

        for (int i = 0; i < matrix[0].length; ++i) { // col max
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; ++j) {
                max = Math.max(max, matrix[j][i]);
            }
            colMax[i] = max;
        }

        // find lucky numbers
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j <matrix[0].length; ++j) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j])
                    res.add(matrix[i][j]);
            }
        }

        return res;
    }
}
