class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        
        char[] chArr = word.toCharArray();
        
        // length >= 2
        if (chArr[0] >= 'A' && chArr[0] <= 'Z') {
            if (chArr[1] >= 'A' && chArr[1] <= 'Z') { // supposed to be all upper-level after the first one
                for (int i = 1; i < chArr.length; ++i) {
                    if (chArr[i] >= 'a' && chArr[i] <= 'z') return false;   
                }
            } else {
                for (int i = 1; i < chArr.length; ++i) { // supposed to be all lesser-level after the first one
                    if (chArr[i] >= 'A' && chArr[i] <= 'Z') return false;   
                }
            }
        }
        else if (chArr[0] >= 'a' && chArr[0] <= 'z') { // supposed to be all lesser-level
            for (int i = 0; i < chArr.length; ++i) {
                if (chArr[i] >= 'A' && chArr[i] <= 'Z') return false;   
            }
        }
        return true;
    }
}