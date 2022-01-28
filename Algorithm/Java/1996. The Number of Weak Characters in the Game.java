class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        int cnt = 0;
        int max = -1; // max defense before current character
        // Sort by attack(high 2 low), then compare defense O(NlogN)
        Arrays.sort(properties, (c1, c2) -> c1[0]==c2[0]?c1[1]-c2[1]:c2[0]-c1[0]);
        // Now traverse and compare, if defense < max_before, then it's a weak character
        for (int i = 0; i < properties.length; ++i) {
            int currentDefense = properties[i][1];
            if (max > currentDefense) ++cnt; // if max > current defense, weak
            max = Math.max(max, currentDefense); // set new max val
        }
        return cnt;
    }
}
