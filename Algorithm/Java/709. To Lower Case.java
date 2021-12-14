class Solution {
    public String toLowerCase(String s) {
        char[] strCharArr = s.toCharArray();
        for (int i = 0; i < strCharArr.length; ++i) {
            if (strCharArr[i] >= 'A' && strCharArr[i] <= 'Z') {
                strCharArr[i] -= ('A' - 'a');
            }
        }
        return new String(strCharArr);
    }
}