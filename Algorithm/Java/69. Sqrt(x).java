class Solution {
    public int mySqrt(int x) {

        // be aware the situation of (i+1)^2 > INT_MAX

        // try binary-search

        if (x == 1 || x == 0) return x;

        int low = 0;
        int high = x;
        int mid = 0;
        
        while (low <= high) {
            mid = low + (high - low) / 2; //避免溢出的写法
            if (mid > x / mid) {  // 判断中采用除法也是为了避免溢出
                high = mid - 1;
            }
            else if (mid < x / mid) {
                low = mid + 1;
            }
            else return mid;
        }

        return high;
    }
}