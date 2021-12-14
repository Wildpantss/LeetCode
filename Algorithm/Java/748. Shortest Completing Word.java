class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] counter = new int[26]; // supposed to be all-zero by default
        int[] currentCounter = new int[26];
        String res = null;
        int minLength = 0x3f3f3f3f;

        // scan licensePlate
        for (int i = 0; i < licensePlate.length(); ++i) {
            char currentChar = licensePlate.charAt(i);
            if (currentChar >= 'a' && currentChar <= 'z') {
                counter[currentChar - 'a'] ++;
            }
            else if (currentChar >= 'A' && currentChar <= 'Z') {
                currentChar -= ('A' - 'a'); // transpose into less-case
                counter[currentChar - 'a'] ++;
            }
            // other char, do nothing
        }

        // scan words
        for (int i = 0; i < words.length; ++i) {
            // traverse each word
            boolean flag = true;

            System.arraycopy(counter, 0, currentCounter, 0, 26);

            for (int j = 0; j < words[i].length(); ++j) {
                char currentCharInWord = words[i].charAt(j);
                currentCounter[currentCharInWord - 'a'] --;
            }
            
            // check whether currentCounter all below, hit if true
            for (int j = 0; j < 26; ++j) {
                if (currentCounter[j] > 0) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                int currentWordLength = words[i].length();
                if (currentWordLength < minLength) {
                    res = words[i];
                    minLength = currentWordLength;
                }
            }
        }
        return res;
    }
}