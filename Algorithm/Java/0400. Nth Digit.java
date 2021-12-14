class Solution {
    public int findNthDigit(int n) {
        long base = 1, digitCnt = 1;
        // 1-9 / 10-90 / 100-900 / 1000-9000...
        // find class
        while (n > base * 9 * digitCnt) { // exit when the n left is less than 1 round
            n -= (base * 9 * digitCnt); // base * 9 * digitCnt means how many digits has been removed in this round.
            base *= 10;
            ++digitCnt;
        }
        
        // find which num
        --n; // now n means the index in current class
        long numLocated = base + n / digitCnt;
        long digitInNumLocated = n % digitCnt;

        // find which digit
        return getKthDigit(numLocated, digitInNumLocated);
    }

    private int getKthDigit(long num, long k) {
        return String.valueOf(num).charAt((int) k) - '0';
    }
}