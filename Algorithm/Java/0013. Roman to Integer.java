class Solution {
    public int romanToInt(String s) {
        
        int res = 0;
        char last = s.charAt(0);

        // traverse
        for (int i = 1; i < s.length(); ++i) {
            
            char cur = s.charAt(i);
            
            if (getVal(cur) > getVal(last)) res -= getVal(last);
            else res += getVal(last);
        
            last = cur; // move forward
        }

        // process the last one
        res += getVal(last);

        return res;
    }

    private int getVal(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
}