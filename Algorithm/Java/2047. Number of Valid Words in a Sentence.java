class Solution {
    public int countValidWords(String sentence) {
        String[] words = sentence.split(" ");
        int cnt = 0;
        for (String word : words) {
            if (word.equals("")) continue;
            if (judgeValidity(word)) ++cnt;
        }
        return cnt;
    }

    private boolean judgeValidity(String word) {
        boolean slashOccurence = false;
        int length = word.length();
        if (word.charAt(0) == '-' || word.charAt(length-1) == '-') return false; // '-' at head or tail
        for (int i = 0; i < length-1; ++i) {
           if (isNum(word.charAt(i))) return false; // num occurence
           if (word.charAt(i) == '-') { // judge '-' repeatition
                if (slashOccurence == false) {
                    slashOccurence = true;
                    if (!(isAlphabet(word.charAt(i-1)) && isAlphabet(word.charAt(i+1))))
                        return false;
                }
                else return false;
            }
            if (word.charAt(i) == '!' || word.charAt(i) == '.' || word.charAt(i) == ',')
                return false;
        }
        if (isNum(word.charAt(length-1))) return false; // if last char is num
        return true;
    }

    private boolean isAlphabet(char c) {
        if (c >= 'a' && c <= 'z') return true;
        return false;
    }

    private boolean isNum(char c) {
        if (c >= '0' && c <= '9') return true;
        return false;
    }
}
