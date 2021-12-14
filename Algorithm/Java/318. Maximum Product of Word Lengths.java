class Solution {
    public int maxProduct(String[] words) {
        int length = words.length;
        int max = 0;
        int[] hash = new int[length];

        for(int i = 0; i < length; ++i) { //traverse string array
            for(char c : words[i].toCharArray()) { // scan each string
                hash[i] |= (1 << c - 'a'); // set correspond bit 1 if the alphabet appeared
            }
        }
        
        for (int i = 0; i < length; ++i) {
            for(int j = i+1; j < length; ++j) {
                int current_product = words[i].length() * words[j].length();
                if ((hash[i] & hash[j]) == 0) {
                    max = Math.max(current_product, max);
                }
            }
        }

        return max;
    }
}