class Solution {
    public int maxPower(String s) {
        if (s.length() == 1) return 1;
        
        int length = s.length();
        int max = 1;
        int counter = 1;

        char currentTmp = s.charAt(0);
        for (int i = 1; i < length; ++i) {
            while ((i < length) && s.charAt(i) == currentTmp) {
                counter ++;
                i++;
            }
            max = Math.max(max, counter);
            counter = 1;
            if (i >= length) break;
            currentTmp = s.charAt(i);
        }

        return max;
    }
}