class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 0;
        boolean expandFlag = false;

        digits[digits.length-1] += 1;
        if (digits[digits.length-1] >= 10) {
            digits[digits.length-1] -= 10;
            carry = 1;
            if (digits.length == 1) {
                int[] res = {1,0};
                return res;
            }
        }

        for (int i = digits.length-2; i >= 0; --i) {
            if (carry == 0) break;
            digits[i] += carry;
            if(digits[i] >= 10) {
                digits[i] -= 10;
                carry = 1;
                if(i == 0) expandFlag = true;
            }
            else {
                carry = 0;
            }
        }

        if (expandFlag == true) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            for (int i = 0; i < digits.length; ++i) {
                res[i+1] = digits[i];
            }
            return res;
        }
        return digits;
    }
}