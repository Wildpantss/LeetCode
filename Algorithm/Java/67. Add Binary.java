class Solution {
    public String addBinary(String a, String b) {

        // special case, return directly
        if (a == null || a.length()  == 0) return b;
        if (b == null || b.length()  == 0) return a;

        StringBuilder sb = new StringBuilder();

        int a_ptr = a.length() - 1; // traverse backward
        int b_ptr = b.length() - 1;

        int c = 0; // carrier

        while (a_ptr >= 0 || b_ptr >= 0) {
            if (a_ptr >= 0) c += a.charAt(a_ptr--) - '0'; // if a's traversal not finished, carrier += current digit
            if (b_ptr >= 0) c += b.charAt(b_ptr--) - '0'; // same for b
            
            sb.append(c % 2); // carry
            c >>= 1;
        }

        String res = sb.reverse().toString();
        return c == 0 ? res : '1' + res; // if carrier is not empty, carry 1 before return, otherwise do nothing.
    }
}
