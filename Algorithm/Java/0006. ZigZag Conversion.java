class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        StringBuilder[] sb = new StringBuilder[numRows];
        char[] charArr = s.toCharArray();

        for (int i = 0; i < numRows; ++i) sb[i] = new StringBuilder();

        // traverse and add into stringbuilders
        int builderIdx = 0;
        boolean dir = true; // ture means downward, false upward
        
        for (int i = 0; i < charArr.length; ++i) {
            // process builderIdx and dir
            if (dir && builderIdx != numRows - 1) { // downward and not the last one
                sb[builderIdx++].append(charArr[i]);
            }
            else if (dir && builderIdx == numRows - 1) { // downward and the last one
                sb[builderIdx--].append(charArr[i]);
                dir = false;
            }
            else if (!dir && builderIdx != 0) { // upward and not the first one
                sb[builderIdx--].append(charArr[i]);
            }
            else if (!dir && builderIdx == 0) { // upward and the first one
                sb[builderIdx++].append(charArr[i]);
                dir = true;
            }
        }

        // cat all lines
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < numRows; ++i) res.append(sb[i]);
        return res.toString();
    }
}
