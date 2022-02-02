class Solution {
    public String reversePrefix(String word, char ch) {
        char[] charArray = word.toCharArray();
        int idx = -1; // -1 means not found
        for (int i = 0; i < charArray.length; ++i) {
            if (charArray[i] == ch) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return word; // not found, no operation
        for (int i = 0; i <= idx/2; ++i) {
            // swap charArray[i] and charArray[idx-i]
            char tmp = charArray[i];
            charArray[i] = charArray[idx-i];
            charArray[idx-i] = tmp;
        }
        return new String(charArray);
    }
}
