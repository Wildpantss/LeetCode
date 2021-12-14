class Solution {
    public int reverse(int x) {
        
        long tmp = x;
        long res = 0;
        boolean possitive;

        if (tmp >= 0) 
            possitive = true;
        else {
            possitive = false;
            tmp = - tmp;
        }

        while (tmp >= 1) {
            long lastDigit = tmp % 10;
            long prefix = tmp / 10;
            
            res = res * 10 + lastDigit;
            tmp = prefix;
        }
        
        if (res >= Integer.MAX_VALUE || res <= Integer.MIN_VALUE) return 0;
        
        return possitive?(int)res:-(int)res;
    }
}