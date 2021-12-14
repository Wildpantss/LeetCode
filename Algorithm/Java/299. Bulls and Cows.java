class Solution {
    public String getHint(String secret, String guess) {
        char[] resCharArr = new char[4];
        int xCnt = 0, yCnt = 0;

        // init hash (0-9)
        char[] hash = new char[10];
        for (int i = 0; i < secret.length(); ++i)
            hash[secret.charAt(i) - '0'] ++;

        // traverse
        for (int i = 0; i < secret.length(); ++i) {
            // if A (right value and pos)
            if (secret.charAt(i) == guess.charAt(i)) {
                xCnt ++;
                hash[secret.charAt(i) - '0'] --;
            }
        }
        for (int i = 0; i < secret.length(); ++i) {
            // if not completely matched
            if (secret.charAt(i) != guess.charAt(i) && hash[guess.charAt(i) - '0'] > 0) {
                yCnt ++;
                hash[guess.charAt(i) - '0'] --;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(xCnt).append('A').append(yCnt).append('B');
        return new String(sb);
    }
}