class Solution {
    public int findMinFibonacciNumbers(int k) {
        //greed
        int[] fib = new int[50]; // literally less than 45
        // init items
        fib[0] = 1;
        fib[1] = 1;
        int fibMaxIdx = 0; // last idx of fib array least than 1e9
        // calc fib array
        for (int i = 2; i < 50; ++i) {
            int curItem = fib[i-1] + fib[i-2]; 
            if (curItem > (int)1e9) {
                fibMaxIdx = i - 1; // record last idx of fib before 1e9
                break;
            }
            fib[i] = curItem;
        }

        // traverse to find target
        int cnt = 0;
        for (int i = fibMaxIdx; i > 0; --i) {
            int curNum = fib[i];
            cnt += k / curNum; // if cnt could be divided, add
            k %= curNum;
        }
        return cnt;
    }
}
