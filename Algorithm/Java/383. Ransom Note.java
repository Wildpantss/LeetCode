class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] appreanceTag = new int[26];
        for (int i = 0; i < magazine.length(); ++i) appreanceTag[magazine.charAt(i) - 'a'] ++;
        for (int i = 0; i < ransomNote.length(); ++i) {
            if (appreanceTag[ransomNote.charAt(i) - 'a'] == 0) return false;
            appreanceTag[ransomNote.charAt(i) - 'a'] --;
        }
        return true;
    }
}