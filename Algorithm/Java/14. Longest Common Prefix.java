class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 1) return strs[0];

        StringBuilder sb = new StringBuilder("");
        int ptr = 0;
        
        for (int t = 0; t <= 205; ++t) {
            
            for (int i = 1; i < strs.length; ++i) {
                if (strs[i].length() <= ptr || strs[0].length() <= ptr) return sb.toString(); // one of the strings meet the end
                if (strs[i].charAt(ptr) != strs[0].charAt(ptr)) return sb.toString(); // not equal
            }
            sb.append(strs[0].charAt(ptr));
            ptr ++;
        }
        return sb.toString();
    }
}