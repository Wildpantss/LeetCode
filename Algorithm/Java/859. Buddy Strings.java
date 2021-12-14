class Solution {
    public boolean buddyStrings(String s, String goal) {
        int length = s.length();
        if (length != goal.length()) return false;
        int diffCounter = 0;

        int[] s_counter = new int[256];
        int[] goal_counter = new int[256];
        for (int i = 0; i < length; ++i) {
            char sChar = s.charAt(i);
            char gChar = goal.charAt(i);
            if (sChar != gChar) diffCounter++; // 2 strings not equal
            s_counter[sChar] ++;
            goal_counter[gChar] ++;
        }

        // compare counter
        boolean counterEqual = true;
        boolean sameDup = false;
        for(int i = 0; i < 256; ++i) {
            int sCounter = s_counter[i];
            int gCounter = goal_counter[i];
            if (sCounter >=2 && sCounter == gCounter) sameDup = true;
            if (sCounter != gCounter) {
                counterEqual = false;
                break;
            }
        }

        if (diffCounter == 0) return sameDup;
        else return counterEqual && diffCounter == 2;
    }
}