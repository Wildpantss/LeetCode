class Solution {
    public int addDigits(int num) {
        // x = 100*a + 10*b + c = 99*a + 9*b + (a + b + c)
        if (num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
    }
}
