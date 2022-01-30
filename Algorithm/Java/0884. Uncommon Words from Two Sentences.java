class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = getWordFreq(s1);
        Map<String, Integer> map2 = getWordFreq(s2);
        String ans[] = new String[map1.size() + map2.size()];
        int i = 0;
        for (String s : map1.keySet()) {
            if (map1.get(s) == 1 && !map2.containsKey(s)) {
                ans[i++] = s;
            }
        }
        for (String s : map2.keySet()) {
            if (map2.get(s) == 1 && !map1.containsKey(s)) {
                ans[i++]=s;
            }
        }
        return Arrays.copyOfRange(ans, 0, i); // cut null vals in array
    }

    public Map<String,Integer> getWordFreq(String s) { // get freq map
        String[] words = s.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        return map;
    }
}
