class Solution {
    public int totalMoney(int n) {
        int[] lessThan7 = {1,2,3,4,5,6,7};
        int sum = 0;
        if (n <= 7) {
            for (int i = 0; i < n; ++i) sum += lessThan7[i];
            return sum;
        }

        int[] increasement = new int[n];
        for (int i = 0; i < 7; ++i) {
            increasement[i] = lessThan7[i];
        }
        // calc increasement
        for (int i = 7; i < n; ++i) {
            if (i % 7 == 0) {
                increasement[i] = increasement[i-7] + 1;
            }
            else {
                increasement[i] = increasement[i-1] + 1;
            }
        }
        // calc sum
        for (int i = 0; i < n; ++i) {
            sum += increasement[i];
        }
        return sum;
    }
}
