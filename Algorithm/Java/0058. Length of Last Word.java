class Solution {
    public int lengthOfLastWord(String s) {
        
        int counter = 0;
        boolean flag = false;

        // traverse backward
        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) != ' ') {
                flag = true;
                counter ++;
            }
            if (s.charAt(i) == ' ' && flag == true) return counter;
        }
        return counter;
    }
}