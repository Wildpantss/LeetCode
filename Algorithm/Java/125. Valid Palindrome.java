class Solution {
    public boolean isPalindrome(String s) {
        
        char[] charArr = new char[s.length()];
        int idx = 0;

        // transfer to array manually
        for (int i = 0; i < s.length(); ++i) {
            char currentChar = s.charAt(i);
            if (!((currentChar >= 'a' && currentChar <= 'z') || (currentChar >= 'A' && currentChar <= 'Z'))) continue;
            if (currentChar >= 'A' && currentChar <= 'Z') currentChar -= ('A' - 'a');
            charArr[idx++] = currentChar;
        }

        if (idx == 0) return true;

        for (char c : charArr) System.out.print(c);

        // judge palidrome (last index = idx -1 )
        for (int i = 0; i < idx/2 + 1; ++i) {
            if (charArr[i] != charArr[idx-1-i]) return false;
        }
        return true;
    }
}