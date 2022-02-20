class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits[bits.length - 1] == 1) return false;

        int i = 0;
        while (i < bits.length) {
            if (i == bits.length - 1) return true;
            if (bits[i] == 0) ++i;
            else i += 2;
        }

        if (i == bits.length) return false; // double bit char
        else return true;
    }
}
