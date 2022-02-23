class Solution {
    public String reverseOnlyLetters(String s) {
        int length = s.length();
        char[] res = s.toCharArray();

        int l = 0;
        int r = length - 1;

        while (l < r) {
            if (!isAlphabet(res[l])) ++l;
            if (!isAlphabet(res[r])) --r;
            if (l < length && r >= 0 && isAlphabet(res[l]) && isAlphabet(res[r])) {
                // swap
                char tmp = res[l];
                res[l] = res[r];
                res[r] = tmp;
                
                ++l;
                --r;
            }
        }

        return new String(res);
    }

    boolean isAlphabet(char c) {
        if (c >= 'a' && c <=  'z') return true;
        else if (c >= 'A' && c <= 'Z') return true;
        else return false;
    }
}
